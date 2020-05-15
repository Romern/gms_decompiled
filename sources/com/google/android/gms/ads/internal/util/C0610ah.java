package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.ah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0610ah {

    /* renamed from: a */
    private static RequestQueue f8921a;

    /* renamed from: b */
    private static final Object f8922b = new Object();

    public C0610ah(Context context) {
        RequestQueue requestQueue;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f8922b) {
            if (f8921a == null) {
                C0371o.m5339a(context);
                if (sqr.m35998a() || !((Boolean) C0371o.f8231ai.mo6604a()).booleanValue()) {
                    requestQueue = Volley.newRequestQueue(context);
                } else {
                    requestQueue = C0677y.m5746a(context, new C0677y(context, new HurlStack()));
                }
                f8921a = requestQueue;
            }
        }
    }

    /* renamed from: a */
    public static final bqgg m5613a(String str, Map map) {
        C0607ae aeVar = new C0607ae();
        C0605ac acVar = new C0605ac(str, aeVar);
        C0632g gVar = new C0632g(null);
        C0606ad adVar = new C0606ad(str, aeVar, acVar, map, gVar);
        if (C0632g.m5653a()) {
            try {
                gVar.mo6811a(str, "GET", adVar.getHeaders(), adVar.getBody());
            } catch (AuthFailureError e) {
                C0633h.m5672d(e.getMessage());
            }
        }
        f8921a.add(adVar);
        return aeVar;
    }
}
