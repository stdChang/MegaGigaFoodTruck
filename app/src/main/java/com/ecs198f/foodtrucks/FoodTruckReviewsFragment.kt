package com.ecs198f.foodtrucks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ecs198f.foodtrucks.databinding.FragmentFoodTruckMenuBinding
import com.ecs198f.foodtrucks.databinding.FragmentFoodTruckReviewsBinding

class FoodTruckReviewsFragment(val recyclerViewAdapter: FoodTruckReviewRecyclerAdapter) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFoodTruckReviewsBinding.inflate(inflater, container, false)
        binding.reviewRecycler.apply {
            adapter = recyclerViewAdapter
            layoutManager = LinearLayoutManager(context)
        }

        return binding.root
    }

}