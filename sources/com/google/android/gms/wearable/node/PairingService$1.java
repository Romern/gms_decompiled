package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PairingService$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ axzq f110984a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingService$1(axzq axzq, String str) {
        super(str);
        this.f110984a = axzq;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (Log.isLoggable("pairingservice", 2)) {
            Log.v("pairingservice", "cloud sync alarm has fired, scheduling wakeup.");
        }
        new axzp(this.f110984a).execute(new Void[0]);
    }
}
