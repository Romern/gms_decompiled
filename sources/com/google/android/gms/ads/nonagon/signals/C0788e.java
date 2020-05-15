package com.google.android.gms.ads.nonagon.signals;

import com.google.android.gms.ads.internal.C0387d;

/* renamed from: com.google.android.gms.ads.nonagon.signals.e */
final /* synthetic */ class C0788e implements Runnable {

    /* renamed from: a */
    private final C0787d f9220a;

    /* renamed from: b */
    private final long f9221b;

    public C0788e(C0787d dVar, long j) {
        this.f9220a = dVar;
        this.f9221b = j;
    }

    public final void run() {
        C0787d dVar = this.f9220a;
        long j = this.f9221b;
        String canonicalName = dVar.getClass().getCanonicalName();
        long b = C0387d.m5368f().mo20506b();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(b - j);
        sb.toString();
    }
}
