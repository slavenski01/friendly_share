package com.example.friendlyshare.models.data.server

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class ApiProvider {

    companion object {
        private const val BASE_URL = ""
    }
    private var api: FriendlyShareApi? = null

    private val client = OkHttpClient.Builder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        //.addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    fun getApi(): FriendlyShareApi =
        if(api == null) { val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addCallAdapterFactory(CoroutineCallAdapterFactory.invoke())
            //.addConverterFactory(MoshiConverterFactory.create())
            .build()
            api!!
        } else api!!
}