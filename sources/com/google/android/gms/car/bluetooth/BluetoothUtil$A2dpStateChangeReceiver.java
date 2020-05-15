package com.google.android.gms.car.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothUtil$A2dpStateChangeReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ nyr f29467a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothUtil$A2dpStateChangeReceiver(nyr nyr) {
        super("car");
        this.f29467a = nyr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        boolean z;
        bnsn bnsn = nyr.f36964a;
        intent.getAction();
        if ("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            bnsi c = nyr.f36964a.mo68388c();
            c.mo68432a("com.google.android.gms.car.bluetooth.BluetoothUtil$A2dpStateChangeReceiver", "a", 868, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68411a("A2DP playing state change, old:%d new:%d", intExtra, intExtra2);
            nyp nyp = this.f29467a.f36969f;
            if (intExtra2 == 10) {
                z = true;
            } else {
                z = false;
            }
            nyp.mo20947a(z);
        } else if (this.f29467a.f36977n != 0) {
        } else {
            if (!"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                bnsi b = nyr.f36964a.mo68387b();
                b.mo68432a("com.google.android.gms.car.bluetooth.BluetoothUtil$A2dpStateChangeReceiver", "a", 878, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("A2dpStateChangeReceiver: Wrong intent. This shouldn't happen");
                return;
            }
            if (this.f29467a.mo21858a((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) && intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 2) {
                this.f29467a.f36969f.mo20955g();
            }
        }
    }
}
