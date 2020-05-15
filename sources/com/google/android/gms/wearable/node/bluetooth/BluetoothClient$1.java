package com.google.android.gms.wearable.node.bluetooth;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothClient$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aycm f110992a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothClient$1(aycm aycm, String str) {
        super(str);
        this.f110992a = aycm;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("ConnectionRetryReceiver onReceive ");
        sb.append(valueOf);
        aycm.m83822a(sb.toString());
        if (intent.getAction().equals("com.google.android.gms.wearable.node.bluetooth.RETRY_CONNECTION")) {
            aycn aycn = (aycn) this.f110992a.f97144b.get(intent.getData().getAuthority());
            if (aycn != null) {
                sdo.m34967a("retryConnection");
                aycn.f97150a.mo53904a();
            }
        }
    }
}
