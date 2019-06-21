package com.example.webapisample

import retrofit2.http.GET
import retrofit2.http.Query
import com.example.webapisample.ZipApiData
import retrofit2.Call

//適当な名称にインターフェースでいい
interface ZipCodeWebApiInterface {

    //http://zipcloud.ibsnet.co.jp/api/search?zipcode=1000001のドメイン名以下の部分を記述する
    //FQDNは別のところで指定する
    @GET("api/search")

    //@Queryが?zipcode=ZipCideを生成してくれる ZipCodeは関数の引数として与えられる
    //返値としてWebAPIを叩きにいくサービスが生成される
    //ジェネリクスには返値としてさきほど作成したデータの型を指定しておく
    fun apiDemo(@Query("zipcode") ZipCode: String): Call<ZipApiData>
}