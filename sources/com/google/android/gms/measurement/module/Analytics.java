package com.google.android.gms.measurement.module;

import android.content.Context;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Analytics {

    /* renamed from: a */
    private static volatile Analytics f80145a;

    /* renamed from: b */
    private final agje f80146b;

    public Analytics(agje agje) {
        sdo.m34959a(agje);
        this.f80146b = agje;
    }

    public static Analytics getInstance(Context context) {
        if (f80145a == null) {
            synchronized (Analytics.class) {
                if (f80145a == null) {
                    f80145a = new Analytics(agje.m54353a(context));
                }
            }
        }
        return f80145a;
    }

    /* renamed from: a */
    public final void mo44018a(String str, String str2, Bundle bundle, String str3) {
        sdo.m34977c(str3);
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f80146b.mo35501e().mo35571a(str, str2, bundle, str3);
    }
}
