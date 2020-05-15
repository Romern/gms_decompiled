package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.identifier.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0270b extends Thread {

    /* renamed from: a */
    final CountDownLatch f7981a = new CountDownLatch(1);

    /* renamed from: b */
    public boolean f7982b = false;

    /* renamed from: c */
    private final WeakReference f7983c;

    /* renamed from: d */
    private final long f7984d;

    public C0270b(C0272d dVar, long j) {
        this.f7983c = new WeakReference(dVar);
        this.f7984d = j;
        start();
    }

    /* renamed from: a */
    private final void m5149a() {
        C0272d dVar = (C0272d) this.f7983c.get();
        if (dVar != null) {
            dVar.mo6491d();
            this.f7982b = true;
        }
    }

    public final void run() {
        try {
            if (!this.f7981a.await(this.f7984d, TimeUnit.MILLISECONDS)) {
                m5149a();
            }
        } catch (InterruptedException e) {
            m5149a();
        }
    }
}
