package com.google.android.gms.ads.httpcache;

import com.android.volley.NetworkResponse;
import com.google.android.gms.ads.internal.httpcache.HttpResponseParcel;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.httpcache.b */
final /* synthetic */ class C0263b implements bmxj {

    /* renamed from: a */
    static final bmxj f7970a = new C0263b();

    private C0263b() {
    }

    public final Object apply(Object obj) {
        NetworkResponse networkResponse = (NetworkResponse) obj;
        int size = networkResponse.headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : networkResponse.headers.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new HttpResponseParcel(false, null, networkResponse.statusCode, networkResponse.data, strArr, strArr2, networkResponse.notModified, networkResponse.networkTimeMs);
    }
}
