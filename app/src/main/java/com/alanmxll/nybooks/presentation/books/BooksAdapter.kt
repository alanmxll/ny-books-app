package com.alanmxll.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alanmxll.nybooks.R
import com.alanmxll.nybooks.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*


class BooksAdapter(private val books: List<Book>) :
    RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)

        return BooksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bindView(books[position])
    }

    override fun getItemCount() = books.count()

    class BooksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title = itemView.text_title
        private val author = itemView.text_author

        fun bindView(book: Book) {
            title.text = book.title
            author.text = book.author
        }
    }
}