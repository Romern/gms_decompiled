package com.google.android.gms.ads.internal.request.service;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.request.service.s */
final /* synthetic */ class C0569s implements bmxj {

    /* renamed from: a */
    private final C0571u f8855a;

    public C0569s(C0571u uVar) {
        this.f8855a = uVar;
    }

    public final Object apply(Object obj) {
        C0571u uVar = this.f8855a;
        C0371o.m5340a(uVar.f8856a, (JSONObject) obj);
        uVar.f8857b.edit().putLong("js_last_update", C0387d.m5368f().mo20505a()).apply();
        return null;
    }
}
