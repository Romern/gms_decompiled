package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import com.google.android.gms.ads.internal.appcontent.C0314e;
import com.google.android.gms.ads.internal.flag.C0394g;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.util.i */
final /* synthetic */ class C0651i implements Runnable {

    /* renamed from: a */
    private final C0652j f8983a;

    public C0651i(C0652j jVar) {
        this.f8983a = jVar;
    }

    public final void run() {
        boolean z;
        boolean z2;
        C0652j jVar = this.f8983a;
        if (jVar.f8985b) {
            jVar.mo6839a();
            synchronized (jVar.f8984a) {
                z = jVar.f9002s;
            }
            if (z) {
                jVar.mo6839a();
                synchronized (jVar.f8984a) {
                    z2 = jVar.f9003t;
                }
                if (z2) {
                    return;
                }
            }
            if (((Boolean) C0394g.f8329b.mo6621a()).booleanValue()) {
                synchronized (jVar.f8984a) {
                    if (Looper.getMainLooper() != null) {
                        if (jVar.f8987d == null) {
                            jVar.f8987d = new C0314e();
                        }
                        C0314e eVar = jVar.f8987d;
                        synchronized (eVar.f8077b) {
                            if (eVar.f8076a) {
                                C0633h.m5664a("Content hash thread already started, quiting...");
                            } else {
                                eVar.f8076a = true;
                                eVar.start();
                            }
                        }
                        C0633h.m5670c("start fetching content...");
                    }
                }
            }
        }
    }
}
