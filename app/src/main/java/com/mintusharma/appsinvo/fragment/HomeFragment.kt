package com.mintusharma.appsinvo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.mintusharma.appsinvo.R
import com.mintusharma.appsinvo.adapter.CategoryAdapter
import com.mintusharma.appsinvo.adapter.ImageSlideAdapter
import com.mintusharma.appsinvo.databinding.FragmentHomeBinding
import com.mintusharma.appsinvo.models.CategoryModel
import com.mintusharma.appsinvo.models.ImagesModel
import me.relex.circleindicator.CircleIndicator


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        setupRecyclerView()

        val images = arrayListOf(R.drawable.offer, R.drawable.offer, R.drawable.offer)
        val adapter = ImageSlideAdapter(requireContext(), images as ArrayList<Int>)
        _binding!!.viewpager.adapter = adapter

        _binding!!.indicator.setViewPager(_binding!!.viewpager)

        return _binding!!.root
    }

    private fun setupRecyclerView() {
        _binding?.categoryRec?.apply {
            layoutManager = GridLayoutManager(context, 3)
            adapter = context?.let { CategoryAdapter(it,createActressList()) }
        }
    }

    private fun createActressList(): ArrayList<CategoryModel> {
        return arrayListOf<CategoryModel>(
            CategoryModel(
                R.drawable.saloon,
                "Saloon"
            ),
            CategoryModel(
                R.drawable.ic_retail,
                "Retail"
            ),
            CategoryModel(
                R.drawable.mall,
                "Malls"
            ),
            CategoryModel(
                R.drawable.vector_smart_object_1_2,
                "Gym"
            ),
            CategoryModel(
                R.drawable.vector_smart_object_copy_3,
                "Restaurant"
            ),
            CategoryModel(
                R.drawable.vector_smart_object_4,
                "Grocery"
            ),
            CategoryModel(
                R.drawable.saloon,
                "Saloon"
            ),
            CategoryModel(
                R.drawable.ic_retail,
                "Retail"
            ),
            CategoryModel(
                R.drawable.mall,
                "Malls"
            )
        )
    }
}