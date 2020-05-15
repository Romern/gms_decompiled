package com.google.android.gms.ads.httpcache;

import com.android.volley.VolleyError;
import com.google.android.gms.ads.internal.httpcache.HttpResponseParcel;

/* renamed from: com.google.android.gms.ads.httpcache.c */
final /* synthetic */ class C0264c implements bqeh {

    /* renamed from: a */
    static final bqeh f7971a = new C0264c();

    private C0264c() {
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        return bqga.m112775a(new HttpResponseParcel(true, ((VolleyError) obj).getMessage(), 0, null, null, null, false, 0));
    }
}
