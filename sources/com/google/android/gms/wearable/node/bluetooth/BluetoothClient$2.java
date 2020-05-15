package com.google.android.gms.wearable.node.bluetooth;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothClient$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aycm f110993a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothClient$2(aycm aycm, String str) {
        super(str);
        this.f110993a = aycm;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("BluetoothStateChangeReceiver onReceive ");
        sb.append(valueOf);
        aycm.m83822a(sb.toString());
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            aycm aycm = this.f110993a;
            sdo.m34967a("onBluetoothAdapterStateChanged");
            if (intExtra == 12) {
                for (ConnectionConfiguration connectionConfiguration : aycm.f97143a.values()) {
                    String str = connectionConfiguration.f110865b;
                    if (((aycn) aycm.f97144b.get(str)) == null) {
                        aycm.f97144b.put(str, new aycn(aycm.f97145c, connectionConfiguration));
                        ayha.m83996b().mo53962a();
                    }
                }
            } else if (intExtra == 10) {
                for (aycn aycn : aycm.f97144b.values()) {
                    aycn.close();
                }
                aycm.f97144b.clear();
                ayha.m83996b().mo53964b();
            }
        }
    }
}
