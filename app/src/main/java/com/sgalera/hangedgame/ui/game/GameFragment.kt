package com.sgalera.hangedgame.ui.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.sgalera.hangedgame.R
import com.sgalera.hangedgame.databinding.FragmentGameBinding
import com.sgalera.hangedgame.ui.provider.RandomStringProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class GameFragment : Fragment() {

    private var _binding: FragmentGameBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var randomStringProvider: RandomStringProvider

    private lateinit var hiddenWord: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initComponents()
        initWord()
    }

    private fun initComponents() {
        hiddenWord = binding.llLetters
    }

    private fun initWord() {
        val currentWord = randomStringProvider.getRandomString().toString()
        showHiddenWord(currentWord)
    }

    private fun showHiddenWord(currentWord: String) {
        for (letter in currentWord) {
            val hiddenLetter = layoutInflater.inflate(R.layout.item_custom_underscore_letter, hiddenWord, false) as RelativeLayout
            val tvHiddenLetter = hiddenLetter.findViewById<TextView>(R.id.textLetter)
            tvHiddenLetter.visibility = View.INVISIBLE
            tvHiddenLetter.text = letter.toString().uppercase()
            hiddenWord.addView(hiddenLetter)
        }
    }


}
