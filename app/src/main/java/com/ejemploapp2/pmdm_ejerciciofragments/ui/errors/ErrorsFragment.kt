package com.ejemploapp2.pmdm_ejerciciofragments.ui.errors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ejemploapp2.pmdm_ejerciciofragments.R

//clase del fragment "Errors"
class ErrorsFragment : Fragment() {

    private lateinit var errorsViewModel: ErrorsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        //Aquí indicamos a la view qué layout coger y su texto
    ): View? {
        errorsViewModel =
            ViewModelProviders.of(this).get(ErrorsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_errors, container, false)
        val textView: TextView = root.findViewById(R.id.text_errors)
        errorsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}