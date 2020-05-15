package com.google.android.gms.ads.internal.util;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.future.C0648g;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.ag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0609ag extends Request {

    /* renamed from: d */
    private final C0648g f8918d;

    /* renamed from: e */
    private final Map f8919e;

    /* renamed from: f */
    private final C0632g f8920f;

    public C0609ag(String str, Map map, C0648g gVar) {
        super(0, str, new C0608af(gVar));
        this.f8919e = map;
        this.f8918d = gVar;
        C0632g gVar2 = new C0632g();
        this.f8920f = gVar2;
        gVar2.mo6811a(str, "GET", map, null);
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        NetworkResponse networkResponse = (NetworkResponse) obj;
        C0632g gVar = this.f8920f;
        Map map = networkResponse.headers;
        int i = networkResponse.statusCode;
        if (C0632g.m5653a()) {
            gVar.mo6814a(map, i);
            if (i < 200 || i >= 300) {
                gVar.mo6816b(null);
            }
        }
        C0632g gVar2 = this.f8920f;
        byte[] bArr = networkResponse.data;
        if (C0632g.m5653a() && bArr != null) {
            gVar2.mo6815a(bArr);
        }
        this.f8918d.mo6830a(networkResponse);
    }

    public final Map getHeaders() {
        Map map = this.f8919e;
        return map == null ? super.getHeaders() : map;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(networkResponse, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }
}
