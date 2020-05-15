package com.google.android.gms.fido.common.api.controller;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.u2f.api.view.BleViewOptions;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothBroadcastReceiver extends aacn {

    /* renamed from: b */
    private static final sek f31676b = new sek(new String[]{"BluetoothReceiver"}, (short[]) null);

    /* renamed from: a */
    private final xyr f31677a;

    public BluetoothBroadcastReceiver(xyr xyr) {
        super("fido");
        bmxy.m108581a(xyr);
        this.f31677a = xyr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action;
        char c;
        sek sek = f31676b;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("onReceive intent: ");
        sb.append(valueOf);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                c = 0;
            } else {
                c = 65535;
            }
            if (c == 0) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                if (intExtra == 10) {
                    f31676b.mo25414c("Received STATE_OFF for ACTION_STATE_CHANGED", new Object[0]);
                    this.f31677a.mo29768d();
                } else if (intExtra == 12) {
                    f31676b.mo25414c("Received STATE_ON for ACTION_STATE_CHANGED", new Object[0]);
                    xyr xyr = this.f31677a;
                    xyr.f53383h = true;
                    xyr.f53380e.mo30186a(xyr.f53376a, xag.TYPE_BLUETOOTH_PROGRAMMATICALLY_ADAPTER_ENABLED);
                    if (xyr.f53378c.mo29737a()) {
                        xyr.f53385j = false;
                        xyr.f53379d.mo30295a(2, new BleViewOptions(true));
                    } else {
                        xyr.f53385j = true;
                        xyr.f53379d.mo30295a(2, new BleViewOptions(false));
                    }
                    xyr.mo30274f();
                }
            }
        }
    }
}
