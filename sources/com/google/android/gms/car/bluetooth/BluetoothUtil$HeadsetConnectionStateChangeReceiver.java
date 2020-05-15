package com.google.android.gms.car.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothUtil$HeadsetConnectionStateChangeReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ nyr f29470a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothUtil$HeadsetConnectionStateChangeReceiver(nyr nyr) {
        super("car");
        this.f29470a = nyr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        bnsn bnsn = nyr.f36964a;
        intent.getAction();
        if (this.f29470a.f36977n != 0) {
            return;
        }
        if (!"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            bnsi b = nyr.f36964a.mo68387b();
            b.mo68432a("com.google.android.gms.car.bluetooth.BluetoothUtil$HeadsetConnectionStateChangeReceiver", "a", 806, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("HeadsetConnectionStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        if (this.f29470a.mo21858a((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"))) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            if (intExtra == 2) {
                nyr nyr = this.f29470a;
                if (nyr.f36967d != null) {
                    bmxy.m108581a(nyr.f36966c);
                    nyr nyr2 = this.f29470a;
                    nyr2.f36968e = nyr2.f36966c.mo21819a(nyr2.f36967d);
                } else {
                    nyr.f36968e = null;
                }
                nyr nyr3 = this.f29470a;
                if (nyr3.f36978o != null) {
                    bmxy.m108581a(nyr3.f36968e);
                    nyr nyr4 = this.f29470a;
                    nyr4.f36978o.f36955d = nyr4.f36968e.f36910a;
                    nyr4.f36969f.mo20953e();
                }
            } else if (intExtra == 0) {
                this.f29470a.f36969f.mo20954f();
            }
        }
    }
}
