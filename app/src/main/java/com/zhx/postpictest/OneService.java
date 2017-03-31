package com.zhx.postpictest;

import java.util.Map;
import okhttp3.RequestBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import rx.Observable;


public interface OneService {
     @Multipart
     @POST("certificates/query.php")
     Observable<Person>uploadFile(@PartMap Map<String,RequestBody> params);
}
