package com.alanmxll.nybooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alanmxll.nybooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = createFakeBooks()
    }

    fun createFakeBooks(): List<Book> {
        return listOf(
            Book("Lord Of The Rings", "J.R.R Tolkien"),
            Book("Harry Potter", "J.K Rowling"),
            Book("The Chronicles Of Narnia", "C.S Lewis"),
        )
    }
}