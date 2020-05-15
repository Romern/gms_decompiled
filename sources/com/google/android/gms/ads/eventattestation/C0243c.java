package com.google.android.gms.ads.eventattestation;

import android.content.Context;
import com.google.android.gms.ads.eventattestation.internal.C0261r;

/* renamed from: com.google.android.gms.ads.eventattestation.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0243c {

    /* renamed from: a */
    private static C0241a f7952a;

    /* renamed from: a */
    public static synchronized C0241a m5113a(Context context) {
        C0241a aVar;
        synchronized (C0243c.class) {
            if (f7952a == null) {
                f7952a = new C0261r(context.getApplicationContext());
            }
            aVar = f7952a;
        }
        return aVar;
    }
}
