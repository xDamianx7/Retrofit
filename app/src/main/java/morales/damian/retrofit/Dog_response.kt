package morales.damian.retrofit

import com.google.gson.annotations.SerializedName

class Dog_response (@SerializedName("status") var status:String, @SerializedName("message") var image:List<String>){
}