package com.google.android.gms.ads.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.flag.C0411x;

/* renamed from: com.google.android.gms.ads.internal.config.n */
final /* synthetic */ class C0370n implements bmzi {

    /* renamed from: a */
    private final Context f8186a;

    public C0370n(Context context) {
        this.f8186a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[Catch:{ all -> 0x008b }] */
    /* renamed from: a */
    public final Object mo6606a() {
        Context context;
        Context context2 = this.f8186a;
        C0362f fVar = C0371o.f8213a;
        C0369m c = C0341h.m5276c();
        if (c.f8180c) {
            return null;
        }
        synchronized (c.f8178a) {
            if (c.f8180c) {
                return null;
            }
            if (!c.f8181d) {
                c.f8181d = true;
            }
            if (context2.getApplicationContext() != null) {
                context = context2.getApplicationContext();
            } else {
                context = context2;
            }
            c.f8184g = context;
            try {
                c.f8183f = svr.m36484b(c.f8184g).mo26172a(c.f8184g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            }
            try {
                Context i = rfy.m33552i(context2);
                if (i == null) {
                    if (context2 != null) {
                        Context applicationContext = context2.getApplicationContext();
                        if (applicationContext != null) {
                            context2 = applicationContext;
                        }
                        if (context2 == null) {
                            C0341h.m5278e();
                            c.f8182e = C0365i.m5332a(context2);
                            SharedPreferences sharedPreferences = c.f8182e;
                            if (sharedPreferences != null) {
                                sharedPreferences.registerOnSharedPreferenceChangeListener(c);
                            }
                            C0411x.f8371a.set(new C0368l(c));
                            c.mo6607a();
                            c.f8180c = true;
                            return null;
                        }
                        c.f8181d = false;
                        c.f8179b.open();
                        return null;
                    }
                }
                context2 = i;
                if (context2 == null) {
                }
            } finally {
                c.f8181d = false;
                c.f8179b.open();
            }
        }
    }
}
