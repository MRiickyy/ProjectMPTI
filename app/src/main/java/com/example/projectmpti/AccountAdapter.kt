package com.example.projectmpti

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AccountAdapter(private val accountList: List<Account>) : RecyclerView.Adapter<AccountAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvPassword: TextView = itemView.findViewById(R.id.tvPassword)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_akun, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val account = accountList[position]
        holder.tvName.text = account.name
        holder.tvPassword.text = account.password
    }

    override fun getItemCount(): Int = accountList.size
}
