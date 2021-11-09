package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.adapter.itemadapter
import com.example.hw_product_recycleview.databinding.FragmentProductListBinding
import com.example.hw_product_recycleview.datsource.data
import com.example.hw_product_recycleview.modul.datamodule


class ProductListFragment : Fragment() {

    private var _binding: FragmentProductListBinding? = null
    private val binding get() = _binding!!
    private lateinit var products: List<datamodule>
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        products = data().loadingData()
        recyclerView.adapter = itemadapter(products)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}