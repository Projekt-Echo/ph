import client.OkhttpClient.okhttpClient
import okhttp3.Request

class User {
    fun login(id: String, pwd: String): String? {
        val request = Request.Builder()
            .url("https://ncm.supaku.cn/login/cellphone?phone=$id&password=$pwd")
            .get()
            .build()
        val response = okhttpClient.newCall(request).execute()
        return response.body?.string()
    }
    fun logout(){
        val request = Request.Builder()
            .url("https://ncm.supaku.cn/logout")
            .get()
            .build()
        val response = okhttpClient.newCall(request).execute()
    }
}