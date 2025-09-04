package com.pedro.trabalho.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pedro.trabalho.R
import com.pedro.trabalho.Subject

class SubjectAdapter(
    private val context: Context,
    private val subjects: List<Subject>
) : RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>() {

    inner class SubjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.subject_title)
        val progressBar: ProgressBar = itemView.findViewById(R.id.progress_bar)
        val progressText: TextView = itemView.findViewById(R.id.progress_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_subject, parent, false)
        return SubjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        val subject = subjects[position]

        holder.title.text = subject.title
        holder.progressBar.progress = subject.progress
        holder.progressText.text = "${subject.progress}%"

        holder.itemView.setBackgroundResource(subject.backgroundImage)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, subject.destinationClass)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = subjects.size
}