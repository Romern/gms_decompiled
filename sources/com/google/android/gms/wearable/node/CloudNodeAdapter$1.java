package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CloudNodeAdapter$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ axwi f110973a;

    /* renamed from: b */
    private boolean f110974b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloudNodeAdapter$1(axwi axwi, String str) {
        super(str);
        this.f110973a = axwi;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        boolean z = this.f110974b;
        if (Log.isLoggable("CloudNode", 2)) {
            StringBuilder sb = new StringBuilder(49);
            sb.append("received a Connectivity event: wasConnected=");
            sb.append(z);
            Log.v("CloudNode", sb.toString());
        }
        this.f110974b = this.f110973a.mo53685f();
        if (Log.isLoggable("CloudNode", 2)) {
            boolean z2 = this.f110974b;
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("received a Connectivity event: now connected=");
            sb2.append(z2);
            Log.v("CloudNode", sb2.toString());
        }
        if (this.f110974b && !z) {
            axwi axwi = this.f110973a;
            int i = axwi.f96566A;
            if (Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "onConnectivityEstablished: kicking sync");
            }
            axwi.f96595t.mo54035a();
            axwi.f96585j.mo53669a(2);
        }
    }
}
