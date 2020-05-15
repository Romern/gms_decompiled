package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChimeraPackageMeasurementReceiver extends WakefulBroadcastReceiver implements agiu {

    /* renamed from: b */
    private agiv f80088b;

    /* renamed from: b */
    public final void mo35474b(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f80088b == null) {
            this.f80088b = new agiv(this);
        }
        this.f80088b.mo35475a(context, intent);
    }
}
