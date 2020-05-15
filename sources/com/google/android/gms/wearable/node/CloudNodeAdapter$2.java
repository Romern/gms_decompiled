package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CloudNodeAdapter$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ axwi f110975a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloudNodeAdapter$2(axwi axwi, String str) {
        super(str);
        this.f110975a = axwi;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "cloud sync alarm has fired, scheduling wakeup.");
        }
        this.f110975a.f96585j.mo53669a(3);
    }
}
