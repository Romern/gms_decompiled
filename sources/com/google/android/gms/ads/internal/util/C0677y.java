package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.httpcache.C0441n;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.ads.internal.util.y */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0677y extends BasicNetwork {

    /* renamed from: a */
    private final Context f9027a;

    public C0677y(Context context, BaseHttpStack baseHttpStack) {
        super(baseHttpStack);
        this.f9027a = context;
    }

    /* renamed from: a */
    public static RequestQueue m5746a(Context context, Network network) {
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new File(context.getCacheDir(), "admob_volley"), 20971520), network);
        requestQueue.start();
        return requestQueue;
    }

    public final NetworkResponse performRequest(Request request) {
        if (request.shouldCache() && request.getMethod() == 0 && m5747a(request.getUrl()) && C0341h.m5274a().mo6808c(this.f9027a)) {
            NetworkResponse performRequest = new C0441n(this.f9027a).performRequest(request);
            if (performRequest != null) {
                String valueOf = String.valueOf(request.getUrl());
                if (valueOf.length() == 0) {
                    new String("Got gmscore asset response: ");
                } else {
                    "Got gmscore asset response: ".concat(valueOf);
                }
                return performRequest;
            }
            String valueOf2 = String.valueOf(request.getUrl());
            if (valueOf2.length() == 0) {
                new String("Failed to get gmscore asset response: ");
            } else {
                "Failed to get gmscore asset response: ".concat(valueOf2);
            }
        }
        return super.performRequest(request);
    }

    /* renamed from: a */
    public static boolean m5747a(String str) {
        return Pattern.matches((String) C0371o.f8232aj.mo6604a(), str);
    }
}
