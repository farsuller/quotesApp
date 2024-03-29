package com.quotesapp.quotesko.data

import com.quotesapp.quotesko.model.QuotesV2
import com.quotesapp.quotesko.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApi {
    @GET(Constants.END_POINT_QUOTES)
    suspend fun getRandomQuote(): Response<QuotesV2>
}
