package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import com.google.android.gms.ads.adinfo.C0191i;
import com.google.android.gms.ads.cache.C0212k;
import com.google.android.gms.ads.config.C0236e;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.p012js.C0492j;
import com.google.android.gms.ads.location.C0737f;
import com.google.android.gms.ads.play.GmsCachingPlayStoreParentalControlProvider;
import com.google.android.gms.ads.social.GmsDoritosProvider;

/* renamed from: com.google.android.gms.ads.internal.request.service.q */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0567q {
    /* renamed from: a */
    public static C0552b m5569a(Context context) {
        Context context2;
        C0371o.m5339a(context);
        C0492j jVar = C0387d.f8300a.f8303d;
        if (jVar.f8487a == null) {
            if (context.getApplicationContext() != null) {
                context2 = context.getApplicationContext();
            } else {
                context2 = context;
            }
            jVar.f8487a = context2;
        }
        C0572v vVar = new C0572v(context);
        return new C0552b(new C0568r(), new C0212k(), GmsDoritosProvider.m6089a(context), new C0236e(context), new C0571u(context, vVar.f8861b), new C0737f(context), GmsCachingPlayStoreParentalControlProvider.m6054a(), new C0191i(context), vVar);
    }
}
