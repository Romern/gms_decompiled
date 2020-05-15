package com.google.android.gms.ads.internal.httpcache;

import com.google.android.gms.ads.internal.util.future.C0648g;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.ads.internal.httpcache.m */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0440m implements sad {

    /* renamed from: a */
    final /* synthetic */ C0648g f8400a;

    public C0440m(C0648g gVar) {
        this.f8400a = gVar;
    }

    /* renamed from: a */
    public final void mo6637a(ConnectionResult connectionResult) {
        this.f8400a.mo6831a((Throwable) new RuntimeException("Connection failed."));
    }
}
