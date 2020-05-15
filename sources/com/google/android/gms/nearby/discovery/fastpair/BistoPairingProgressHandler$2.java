package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BistoPairingProgressHandler$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ ahtn f80491a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BistoPairingProgressHandler$2(ahtn ahtn, String str) {
        super(str);
        this.f80491a = ahtn;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.nearby.discovery.ACTION_CANCEL_BISTO_SETUP") || intent.getAction().equals("com.google.android.gms.nearby.discovery.ACTION_SUCCESS_BISTO_SETUP")) {
            srn srn = ahsd.f67925a;
            intent.setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
            context.startService(intent);
            try {
                if (this.f80491a.f68008a) {
                    context.unregisterReceiver(this);
                    this.f80491a.f68008a = false;
                }
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
