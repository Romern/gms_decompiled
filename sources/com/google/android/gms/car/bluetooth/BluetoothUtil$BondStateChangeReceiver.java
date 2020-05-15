package com.google.android.gms.car.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothUtil$BondStateChangeReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ nyr f29469a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothUtil$BondStateChangeReceiver(nyr nyr) {
        super("car");
        this.f29469a = nyr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        bnsn bnsn = nyr.f36964a;
        intent.getAction();
        if (this.f29469a.f36977n != 0) {
            return;
        }
        if (!"android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
            bnsi b = nyr.f36964a.mo68387b();
            b.mo68432a("com.google.android.gms.car.bluetooth.BluetoothUtil$BondStateChangeReceiver", "a", 748, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("BondStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (this.f29469a.mo21858a(bluetoothDevice)) {
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
            if (intExtra == 12) {
                this.f29469a.f36969f.mo20951c();
                nyr nyr = this.f29469a;
                if (!nyr.f36971h) {
                    if (nyr.f36970g) {
                        nxz nxz = nyr.f36968e;
                        bnsi d = nyr.f36964a.mo68390d();
                        d.mo68432a("nyr", "b", 701, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68420a("attemptEnablePhoneBookAccessWithState, shouldEnablePbap=%b", Boolean.valueOf(nyr.f36982s));
                        if (nxz == null) {
                            bnsi d2 = nyr.f36964a.mo68390d();
                            d2.mo68432a("nyr", "b", 713, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d2.mo68405a("attemptEnablePhoneBookAccessWithState failed due to null device");
                        } else if (!nyr.f36982s) {
                            nxz.mo21827e();
                        } else {
                            nxz.mo21826d();
                        }
                        nyr.mo21856a(nxz, nyr.f36982s);
                        return;
                    }
                    nxz nxz2 = nyr.f36968e;
                    bnsi d3 = nyr.f36964a.mo68390d();
                    d3.mo68432a("nyr", "a", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68405a("enablePhoneBookAccess");
                    if (nxz2 != null) {
                        nxz2.mo21826d();
                    }
                    nyr.mo21856a(nxz2, nyr.f36982s);
                } else if (bluetoothDevice != null) {
                    new nxz(bluetoothDevice).mo21826d();
                }
            } else if (intExtra == 10) {
                this.f29469a.f36969f.mo20952d();
            }
        }
    }
}
