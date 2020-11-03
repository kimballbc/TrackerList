package com.example.trackerlist

import android.os.Bundle
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.fragment.app.Fragment

class WorkFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_work, container, false)

        // Initialize the array lists and the adapter
        val itemList = arrayListOf<String>()
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_multiple_choice, itemList)
        val add = view.findViewById<Button>(R.id.workAddButton)
        val clear = view.findViewById<Button>(R.id.workClearButton)
        val delete = view.findViewById<Button>(R.id.workDeleteButton)
        val editText = view.findViewById<EditText>(R.id.workAddItemEditText)
        val listView = view.findViewById<ListView>(R.id.workTrackerListView)

        // Add items to list when "add" button is tapped
        add.setOnClickListener {

            itemList.add(editText.text.toString())
            listView.adapter = adapter
            adapter.notifyDataSetChanged()

            //clear editText after adding new item
            editText.text.clear()
        }

        // Clear all items using Clear button
        clear.setOnClickListener {
            itemList.clear()
            adapter.notifyDataSetChanged()
        }

        // Setting and deleting the items from list
        delete.setOnClickListener{
            val position: SparseBooleanArray = listView.checkedItemPositions
            val count = listView.count
            var item = count - 1
            while (item >= 0) {
                if (position.get(item))
                {
                    adapter.remove(itemList.get(item))
                }
                item --
            }
            position.clear()
            adapter.notifyDataSetChanged()
        }

        return view
    }
}