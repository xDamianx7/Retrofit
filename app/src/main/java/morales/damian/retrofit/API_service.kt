package morales.damian.retrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface API_service {
    @GET
    suspend fun getDogsBYBreeds(@Url url:String): Response<Dog_response>
}