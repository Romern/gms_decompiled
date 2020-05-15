package com.google.android.gms.ads.internal.util;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.google.android.gms.ads.internal.util.client.C0632g;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.ad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0606ad extends StringRequest {

    /* renamed from: e */
    final /* synthetic */ Map f8915e;

    /* renamed from: f */
    final /* synthetic */ C0632g f8916f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0606ad(String str, Response.Listener listener, Response.ErrorListener errorListener, Map map, C0632g gVar) {
        super(0, str, listener, errorListener);
        this.f8915e = map;
        this.f8916f = gVar;
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        deliverResponse((String) obj);
    }

    public final Map getHeaders() {
        Map map = this.f8915e;
        return map == null ? super.getHeaders() : map;
    }

    /* access modifiers changed from: protected */
    public final void deliverResponse(String str) {
        this.f8916f.mo6810a(str);
        super.deliverResponse(str);
    }
}
