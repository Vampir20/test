package com.geekbrains.tests.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("total_count")
    @Expose
    val totalCount: Int?,
    @SerializedName("items")
    @Expose
    val searchResults: List<SearchResult>?
)
