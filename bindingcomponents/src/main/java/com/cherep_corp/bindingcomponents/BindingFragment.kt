package com.cherep_corp.bindingcomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BindingFragment<Binding : ViewBinding> : Fragment() {

    lateinit var binding: Binding

    abstract fun inflate(inflater: LayoutInflater,
                         parent: ViewGroup?,
                         attachToParent: Boolean): Binding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflate(inflater, container, false).run {
            binding = this
            root
        }
    }

}