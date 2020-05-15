package com.google.android.gms.ads.httpcache;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HurlStack;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.httpcache.C0433f;
import com.google.android.gms.ads.internal.httpcache.HttpRequestParcel;
import com.google.android.gms.ads.internal.util.C0609ag;
import com.google.android.gms.ads.internal.util.C0677y;
import com.google.android.gms.ads.internal.util.future.C0648g;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.httpcache.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0268g {

    /* renamed from: a */
    public static final Executor f7976a = snp.m35702a(9);

    /* renamed from: b */
    private static C0268g f7977b;

    /* renamed from: c */
    private static final ScheduledExecutorService f7978c = snp.m35703a(5, 9);

    /* renamed from: d */
    private final RequestQueue f7979d;

    private C0268g(Context context) {
        this.f7979d = C0677y.m5746a(context, new BasicNetwork((BaseHttpStack) new HurlStack()));
    }

    /* renamed from: a */
    public static C0268g m5146a(Context context) {
        C0268g gVar;
        synchronized (C0268g.class) {
            C0371o.m5339a(context);
            if (f7977b == null) {
                f7977b = new C0268g(context);
            }
            gVar = f7977b;
        }
        return gVar;
    }

    /* renamed from: a */
    public final bqgg mo6482a(HttpRequestParcel httpRequestParcel) {
        C0609ag agVar;
        C0648g a = C0648g.m5689a();
        if (httpRequestParcel.f8385b.length == httpRequestParcel.f8386c.length) {
            HashMap hashMap = new HashMap();
            int i = 0;
            while (true) {
                String[] strArr = httpRequestParcel.f8385b;
                if (i >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i], httpRequestParcel.f8386c[i]);
                i++;
            }
            agVar = new C0609ag(httpRequestParcel.f8384a, hashMap, a);
        } else {
            agVar = new C0609ag(httpRequestParcel.f8384a, null, a);
        }
        String valueOf = String.valueOf(agVar.getUrl());
        if (valueOf.length() == 0) {
            new String("Making gmscore request: ");
        } else {
            "Making gmscore request: ".concat(valueOf);
        }
        this.f7979d.add(agVar);
        return bqdf.m112620a(bqga.m112773a(bqdx.m112673a(bqdf.m112620a(bqdx.m112673a(a, C0263b.f7970a, f7976a), VolleyError.class, C0264c.f7971a, f7976a), C0265d.f7972a, f7976a), (long) ((Integer) C0371o.f8233ak.mo6604a()).intValue(), TimeUnit.MILLISECONDS, f7978c), Throwable.class, C0266e.f7973a, f7976a);
    }

    /* renamed from: a */
    public final void mo6483a(C0433f fVar, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            fVar.mo6633a(parcelFileDescriptor);
        } catch (Throwable th) {
        }
    }
}
