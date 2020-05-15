package com.google.android.gms.ads.identifier.settings;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: com.google.android.gms.ads.identifier.settings.n */
final /* synthetic */ class C0296n implements Response.ErrorListener {

    /* renamed from: a */
    private final bqgy f8036a;

    public C0296n(bqgy bqgy) {
        this.f8036a = bqgy;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f8036a.mo69136a((Throwable) volleyError);
    }
}
