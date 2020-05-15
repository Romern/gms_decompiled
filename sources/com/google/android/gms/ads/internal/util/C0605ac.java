package com.google.android.gms.ads.internal.util;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.util.ac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0605ac implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ String f8913a;

    /* renamed from: b */
    final /* synthetic */ C0607ae f8914b;

    public C0605ac(String str, C0607ae aeVar) {
        this.f8913a = str;
        this.f8914b = aeVar;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        String str = this.f8913a;
        String exc = volleyError.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        C0633h.m5672d(sb.toString());
        this.f8914b.onResponse(null);
    }
}
