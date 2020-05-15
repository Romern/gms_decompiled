package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SchedulerChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final bqgj f107333b = snp.m35704b(10);

    public final void onReceive(Context context, Intent intent) {
        f107333b.execute(new aphu(context, intent));
    }
}
