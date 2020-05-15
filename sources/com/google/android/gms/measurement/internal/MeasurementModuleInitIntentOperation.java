package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MeasurementModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final String[] f80136a = {"com.google.android.gms.measurement.PackageMeasurementTaskService", "com.google.android.gms.measurement.PackageMeasurementReceiver"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.measurement.internal.MeasurementModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = i & 8;
        int i3 = i & 2;
        if ((i & 4) != 0 || i2 != 0 || i3 != 0) {
            for (String str : f80136a) {
                spn.m35856a((Context) this, str, true);
            }
            agmn a = agmn.m54505a(this);
            a.mo35498F().mo35492a(new aghw(a));
        }
    }
}
