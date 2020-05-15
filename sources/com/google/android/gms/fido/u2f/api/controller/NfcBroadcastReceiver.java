package com.google.android.gms.fido.u2f.api.controller;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NfcBroadcastReceiver extends aacn {

    /* renamed from: b */
    private static final sek f31949b = new sek(new String[]{"NfcBroadcastReceiver"}, (short[]) null);

    /* renamed from: a */
    private final xzg f31950a;

    public NfcBroadcastReceiver(xzg xzg) {
        super("fido");
        bmxy.m108581a(xzg);
        this.f31950a = xzg;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action;
        char c;
        sek sek = f31949b;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("onReceive intent: ");
        sb.append(valueOf);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.hashCode() == 1943044864 && action.equals("android.nfc.action.ADAPTER_STATE_CHANGED")) {
                c = 0;
            } else {
                c = 65535;
            }
            if (c == 0) {
                int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", -1);
                if (intExtra == 1) {
                    f31949b.mo25414c("Received STATE_OFF for ACTION_ADAPTER_STATE_CHANGED", new Object[0]);
                    this.f31950a.mo29768d();
                } else if (intExtra == 3) {
                    f31949b.mo25414c("Received STATE_ON for ACTION_ADAPTER_STATE_CHANGED", new Object[0]);
                    xzg xzg = this.f31950a;
                    xzg.f53439l = true;
                    xzg.f53436i.mo30186a(xzg.f53431d, xag.TYPE_NFC_ADAPTER_PROGRAMMATICALLY_ENABLED);
                    xzg.f53433f.mo30295a(2, new NfcViewOptions());
                    xzg.mo29766b();
                }
            }
        }
    }
}
