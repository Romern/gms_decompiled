package com.google.android.gms.beacon.scan.manager;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleStateReceiver$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ ngn f29277a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleStateReceiver$1(ngn ngn, String str) {
        super(str);
        this.f29277a = ngn;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        ngn ngn = this.f29277a;
        String action = intent.getAction();
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action) || "android.bluetooth.adapter.action.BLE_STATE_CHANGED".equals(action)) {
            int f = ngn.mo20608f();
            StringBuilder sb = new StringBuilder(25);
            sb.append("current state ");
            sb.append(f);
            sb.toString();
            if (f == 10) {
                if (ngn.f35523c != null && ngn.mo20607e()) {
                    boolean enableBLE = ngn.f35523c.enableBLE();
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("enableBLE() returned ");
                    sb2.append(enableBLE);
                    sb2.toString();
                    if (enableBLE) {
                        return;
                    }
                }
                for (ngm ngm : ngn.f35524d) {
                    ngm.mo20582c();
                }
            } else if (f == 12) {
                for (ngm ngm2 : ngn.f35524d) {
                    ngm2.mo20580a();
                }
            } else if (f == 15 && ngn.mo20607e()) {
                for (ngm ngm3 : ngn.f35524d) {
                    ngm3.mo20581b();
                }
            }
        }
    }
}
