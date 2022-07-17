import client.OkhttpClient.okhttpClient
import okhttp3.Request
import okhttp3.Response

class PlayList {
    fun getPlaylistInfoById(id:Int): String? {
        val request = Request.Builder()
            .get()
            .url("https://ncm.supaku.cn/playlist/track/all?id=$id")
            .build()
        val response = okhttpClient.newCall(request).execute()
        return response.body?.string()
    }
}