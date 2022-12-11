package ru.rut.permissiondemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.rut.permissiondemo.model.Character

class CharacterAdapter(private val baseContext: Context, private val characterList: MutableList<Character>): RecyclerView.Adapter<CharacterAdapter.CharacterHolder>() {
    class CharacterHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {
        var url: TextView = itemView.findViewById(R.id.url)
        var name: TextView = itemView.findViewById(R.id.tv_name)
        var culture: TextView = itemView.findViewById(R.id.tv_culture)
        var born : TextView = itemView.findViewById(R.id.tv_born)
        var titles: TextView = itemView.findViewById(R.id.tv_titles)
        var aliases: TextView = itemView.findViewById(R.id.tv_aliases)
        var playedBy: TextView = itemView.findViewById(R.id.tv_playedBy)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return CharacterHolder(itemView)
    }
    override fun onBindViewHolder(holder: CharacterHolder, position: Int) {
        holder.setIsRecyclable(false)
        holder.url.text = characterList.get(position).url
        holder.name.text = characterList.get(position).name
        holder.culture.text = characterList.get(position).culture
        holder.born.text = characterList.get(position).born
        holder.titles.text = characterList.get(position).titles.toString() ?: "None"
        holder.aliases.text = characterList.get(position).aliases.toString() ?: "None"
        holder.playedBy.text = characterList.get(position).playedBy.toString() ?: "None"

        println(characterList.get(position).name)
        println(characterList.get(position).culture)
        println(characterList.get(position).born)
        println(characterList.get(position).titles)
        println(characterList.get(position).aliases)
        println(characterList.get(position).playedBy)
    }
    override fun getItemCount() = characterList.size
}