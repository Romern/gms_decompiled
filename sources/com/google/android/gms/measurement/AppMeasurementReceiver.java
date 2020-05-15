package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppMeasurementReceiver extends C1146ku implements agiu {

    /* renamed from: a */
    private agiv f80086a;

    /* renamed from: b */
    public final void mo35474b(Context context, Intent intent) {
        C1146ku.m18578a(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f80086a == null) {
            this.f80086a = new agiv(this);
        }
        this.f80086a.mo35475a(context, intent);
    }
}
