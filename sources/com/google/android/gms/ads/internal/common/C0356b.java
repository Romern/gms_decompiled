package com.google.android.gms.ads.internal.common;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.ads.internal.common.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0356b {

    /* renamed from: a */
    public final Context f8165a;

    public C0356b(Context context) {
        sdo.checkIfNull(context, "Context can not be null");
        this.f8165a = context;
    }

    /* renamed from: a */
    public final boolean mo6597a(Intent intent) {
        sdo.checkIfNull(intent, "Intent can not be null");
        return !this.f8165a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
