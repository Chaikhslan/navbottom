package com.example.myapplication.menu_ui

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentStartBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val mBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return mBinding.root

//        image_view.setOnClickListener {
//            val message = edit_text_translator.text.toString()
//            if (message.isEmpty()){
//                Toast.makeText(activity, "Введите сообщения", Toast.LENGTH_LONG).show()
//            } else sendMessage(message)
//        }
    }

//    private fun sendMessage(message: String) {
//        val str = message.toLowerCase()
//        val uniArr = mutableListOf<String>()
//        for (i in str.indices) {
//            if (str[i] == 'ә') {
//                uniArr.add("aʼ")
//            }
//            if (str[i] == 'л') {
//                uniArr.add("l")
//            }
//            if (str[i] == 'е') {
//                uniArr.add("e")
//            }
//            if (str[i] == 'м') {
//                uniArr.add("m")
//            }
//            if (str[i] == ',') {
//                uniArr.add(",")
//            }
//            if (str[i] == 'қ') {
//                uniArr.add("q")
//            }
//            if (str[i] == ' ') {
//                uniArr.add(" ")
//            }
//            if (str[i] == 'а') {
//                uniArr.add("a")
//            }
//            if (str[i] == 'й') {
//                uniArr.add("iʼ")
//            }
//            if (str[i] == 'с') {
//                uniArr.add("s")
//            }
//            if (str[i] == 'ы') {
//                uniArr.add("y")
//            }
//            if (str[i] == 'ң') {
//                uniArr.add("ń")
//            }
//            if (str[i] == '?') {
//                uniArr.add("?")
//            }
//            val text1 = uniArr.joinToString(separator = "")
//            text_view.text = text1.capitalize()
//        }
//
//    }

}