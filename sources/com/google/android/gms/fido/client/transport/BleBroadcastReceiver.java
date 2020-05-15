package com.google.android.gms.fido.client.transport;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleBroadcastReceiver extends aacn {

    /* renamed from: a */
    private final xgi f31663a;

    public BleBroadcastReceiver(xgi xgi) {
        super("fido");
        this.f31663a = xgi;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int intExtra;
        if (intent != null && "android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && (intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1)) != -1) {
            xgi xgi = this.f31663a;
            if (intExtra == 10) {
                xgi.f52197i.mo29717b();
                xgi.mo29729a(xgl.m42884a(xgi.f52189a, xgi.f52194f, xgi.f52195g));
            } else if (intExtra == 12 && xgi.f52197i.mo29718c().intValue() == 1) {
                ((xgl) xgi.f52197i).mo29735e();
            }
        }
    }
}
