package com.geekbrains.tests.view.search

import com.geekbrains.tests.model.SearchResult
import com.geekbrains.tests.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}
