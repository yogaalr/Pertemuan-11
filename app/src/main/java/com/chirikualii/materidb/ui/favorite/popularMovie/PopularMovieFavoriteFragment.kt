package com.chirikualii.materidb.ui.favorite.popularMovie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chirikualii.materidb.R
import com.chirikualii.materidb.data.dummy.DataDummy
import com.chirikualii.materidb.databinding.FragmentPopularMovieFavoriteBinding
import com.chirikualii.materidb.ui.adapter.MovieListAdapter


class PopularMovieFavoriteFragment : Fragment() {

    private lateinit var binding : FragmentPopularMovieFavoriteBinding
    private lateinit var adapter: MovieListAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentPopularMovieFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //setup adapter
        adapter = MovieListAdapter()
        binding.rvMovie.adapter = adapter

        observeView()
    }

    private fun observeView() {
    }


}