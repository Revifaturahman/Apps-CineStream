package com.example.cinestream.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CastPagerAdapter(
    activity: AppCompatActivity,
    private val fragments: List<Fragment>
) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = fragments.size
    override fun createFragment(position: Int): Fragment = fragments[position]
}