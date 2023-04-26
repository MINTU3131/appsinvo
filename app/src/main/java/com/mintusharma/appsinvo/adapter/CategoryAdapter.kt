package com.mintusharma.appsinvo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mintusharma.appsinvo.databinding.RowLayoutForCategoryBinding
import com.mintusharma.appsinvo.models.CategoryModel


class CategoryAdapter (private var context : Context, private var detail: List<CategoryModel>) :
        RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = RowLayoutForCategoryBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun getItemCount() = detail.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

        val data = detail[position]

        holder.binding.name.text = data.name.toString()

        with(Glide.with(context)) {
            load(data.icon)
                    .into(holder.binding.logo)
        }
    }

    class CategoryViewHolder (val binding: RowLayoutForCategoryBinding)
        : RecyclerView.ViewHolder(binding.root)

}