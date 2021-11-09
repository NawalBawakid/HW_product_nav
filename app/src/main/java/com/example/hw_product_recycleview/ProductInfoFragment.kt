package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.adapter.itemadapter
import com.example.hw_product_recycleview.databinding.FragmentProductInfoBinding
import com.example.hw_product_recycleview.datsource.data
import com.example.hw_product_recycleview.modul.datamodule

const val NAME_ARG="name"
class ProductInfoFragment : Fragment() {

    // (main activity last)
    //val name = intent.extras?.getString("name")
    //val image = intent.extras?.getInt("image")

    //binding.finalimage.setImageResource(image!!)
    //binding.iphonename.text = name

    private var _binding: FragmentProductInfoBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            binding.finalimage.setImageResource(it?.getInt("image"))
            binding.iphonename.setText(it?.getString("name"))
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}