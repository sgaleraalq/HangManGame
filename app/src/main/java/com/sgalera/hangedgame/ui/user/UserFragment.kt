package com.sgalera.hangedgame.ui.user

import android.graphics.Paint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.sgalera.hangedgame.R
import com.sgalera.hangedgame.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    private lateinit var tvSignUp: TextView
    private lateinit var ivNotSigned: ImageView


    private var _binding: FragmentUserBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI(){
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        tvSignUp = binding.tvSignUp
        tvSignUp.paintFlags = tvSignUp.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        ivNotSigned = binding.ivNotSigned
        ivNotSigned.setColorFilter(ContextCompat.getColor(this.requireContext(), R.color.white))
    }

    private fun initListeners() {
        tvSignUp.setOnClickListener{
            showSignUpView()
        }
    }

    private fun showSignUpView() {
        binding.clLogInScreen.visibility = View.GONE
        binding.clSignUp.visibility = View.VISIBLE
    }



}