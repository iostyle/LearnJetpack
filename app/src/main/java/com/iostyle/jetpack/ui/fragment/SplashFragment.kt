package com.iostyle.jetpack.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.iostyle.jetpack.R

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.splash_fragment, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        view.findViewById<Button>(R.id.loginBtn)?.setOnClickListener {
            val action =
                SplashFragmentDirections.actionSplashFragmentToLoginFragment().setPhone("请输入电话号码")
            findNavController().navigate(action)
        }
    }
}