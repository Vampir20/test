package com.geekbrains.tests.presenter

import com.geekbrains.tests.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}
