package com.google.android.gms.ads.internal.util;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.ads.internal.util.future.C0648g;

/* renamed from: com.google.android.gms.ads.internal.util.af */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0608af implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ C0648g f8917a;

    public C0608af(C0648g gVar) {
        this.f8917a = gVar;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f8917a.mo6831a((Throwable) volleyError);
    }
}
