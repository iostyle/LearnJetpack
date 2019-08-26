package com.iostyle.jetpack.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.iostyle.jetpack.R
import com.iostyle.jetpack.ui.activity.MainActivity

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: LoginFragmentArgs by navArgs()
        view.findViewById<EditText>(R.id.phoneEt).hint = args.phone

        view.findViewById<Button>(R.id.loginBtn).setOnClickListener {
            startActivity(Intent(context, MainActivity::class.java))
            activity?.finish()
        }
    }
}