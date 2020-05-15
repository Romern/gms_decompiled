package com.google.android.gms.ads.internal.scionintegration;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.scionintegration.f */
final /* synthetic */ class C0586f implements Callable {

    /* renamed from: a */
    private final C0590j f8878a;

    /* renamed from: b */
    private final Context f8879b;

    public C0586f(C0590j jVar, Context context) {
        this.f8878a = jVar;
        this.f8879b = context;
    }

    public final Object call() {
        return (String) this.f8878a.mo6769a("getAppInstanceId", this.f8879b);
    }
}
