package com.example.cardstation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.SearchView
import androidx.fragment.app.Fragment

class SearchFragment : Fragment() {
    private lateinit var searchView: SearchView
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    private lateinit var imageView4: ImageView
    private lateinit var Ituns5: ImageView
    private lateinit var xbox1: ImageView
    private lateinit var xbox2: ImageView
    private lateinit var xbox3: ImageView
    private lateinit var xbox4: ImageView




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        searchView = view.findViewById(R.id.searchView)
        imageView1 = view.findViewById(R.id.imageView1)
        imageView2 = view.findViewById(R.id.imageView2)
        imageView3 = view.findViewById(R.id.imageView3)
        imageView4 = view.findViewById(R.id.imageView4)
        Ituns5 = view.findViewById(R.id.iTuns5)
        xbox1 = view.findViewById(R.id.xbox1)
        xbox2 = view.findViewById(R.id.xbox2)
        xbox3 = view.findViewById(R.id.xbox3)
        xbox4 = view.findViewById(R.id.xbox4)


        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                updateCardImages(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                updateCardImages(newText)
                return true
            }
        })

        return view
    }

    private fun updateCardImages(query: String) {
        if (query == "Google play") {
            imageView1.visibility = View.VISIBLE
            imageView2.visibility = View.VISIBLE
            imageView3.visibility = View.VISIBLE
            imageView4.visibility = View.VISIBLE

        }
        else if (query == "iTunes"){
            Ituns5.visibility = View.VISIBLE

        }
            else if (query == "Xbox"){
                xbox1.visibility = View.VISIBLE
            xbox2.visibility = View.VISIBLE
            xbox3.visibility = View.VISIBLE
            xbox4.visibility = View.VISIBLE


        }
            else {
            imageView1.visibility = View.GONE
            imageView2.visibility = View.GONE
            imageView3.visibility = View.GONE
            imageView4.visibility = View.GONE
            Ituns5.visibility = View.GONE
            xbox1.visibility = View.GONE
            xbox2.visibility = View.GONE
            xbox3.visibility = View.GONE
            xbox4.visibility = View.GONE




        }
    }
}