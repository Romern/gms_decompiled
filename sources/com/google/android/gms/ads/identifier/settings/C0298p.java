package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.identifier.settings.p */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0298p implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f8039a;

    /* renamed from: b */
    final /* synthetic */ Context f8040b;

    public C0298p(String str, Context context) {
        this.f8039a = str;
        this.f8040b = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        hashMap.put("pke", this.f8039a);
        return vvp.m41461a(this.f8040b, "ad-event-attest-token", hashMap);
    }
}
