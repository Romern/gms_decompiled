package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CloudNodeAdapter$GcmRegistrationReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ axwi f110977a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloudNodeAdapter$GcmRegistrationReceiver(axwi axwi) {
        super("wearable");
        this.f110977a = axwi;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "Got Gcm Registration id update, scheduling resync to cloud");
        }
        axwi axwi = this.f110977a;
        int i = axwi.f96566A;
        axwi.f96578c.mo53799a();
        this.f110977a.f96596u.set(true);
        this.f110977a.f96585j.mo53669a(1);
    }
}
