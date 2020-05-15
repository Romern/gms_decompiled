package com.google.android.gms.fido.client.transport;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.fido2.api.view.NfcViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NfcBroadcastReceiver extends aacn {

    /* renamed from: a */
    private final xha f31664a;

    public NfcBroadcastReceiver(xha xha) {
        super("fido");
        this.f31664a = xha;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int intExtra;
        if (intent != null && "android.nfc.action.ADAPTER_STATE_CHANGED".equals(intent.getAction()) && (intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", -1)) != -1) {
            xha xha = this.f31664a;
            if (intExtra == 1) {
                xha.mo29742h();
            } else if (intExtra == 3) {
                xha.f52263g = true;
                bmxv a = xha.f52261e.mo29745a(2, new NfcViewOptions());
                if (a.mo66813a()) {
                    xha.f52262f.mo14261a(((ViewOptions) a.mo66814b()).toString());
                }
                xha.mo29741g();
            }
        }
    }
}
