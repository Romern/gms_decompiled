package com.google.android.location.reporting.collectors;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationHistorianDataRetriever$LogDataReceiver extends aacn {

    /* renamed from: a */
    public bgtp f150862a;

    /* renamed from: b */
    public bqgj f150863b = new soc(1, 10);

    public LocationHistorianDataRetriever$LogDataReceiver() {
        super("location");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (this.f150863b != null) {
            this.f150863b.execute(new bgtq(this, context, intent));
            return;
        }
        bgur.m100025c("GCoreUlr", "LogReceiptExecutor is null");
    }
}
