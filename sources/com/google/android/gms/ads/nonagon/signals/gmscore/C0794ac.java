package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.social.C0592a;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.util.future.C0648g;
import com.google.android.gms.ads.nonagon.signals.C0787d;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0794ac implements C0787d {

    /* renamed from: a */
    final C0592a f9230a;

    /* renamed from: b */
    final String f9231b;

    public C0794ac(C0592a aVar, String str) {
        this.f9230a = aVar;
        this.f9231b = str;
    }

    /* renamed from: a */
    public final bqgg mo7055a() {
        C0648g.m5689a();
        bqgg a = bqga.m112775a((Object) null);
        if (((Boolean) C0371o.f8214aA.mo6604a()).booleanValue()) {
            a = this.f9230a.getDoritosCookieAsynchronously(this.f9231b);
        }
        bqgg doritosCookiesAsynchronously = this.f9230a.getDoritosCookiesAsynchronously(this.f9231b);
        return bqga.m112786c(a, doritosCookiesAsynchronously).mo69216a(new C0793ab(a, doritosCookiesAsynchronously), C0645d.f8973a);
    }
}
