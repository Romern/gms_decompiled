package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmMessageReceiver extends aacn {

    /* renamed from: a */
    private final ayak f110981a;

    /* renamed from: b */
    private final axwi f110982b;

    public GcmMessageReceiver(ayak ayak, axwi axwi) {
        super("wearable");
        this.f110981a = ayak;
        this.f110982b = axwi;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        try {
            if ("gcm".equals(aakz.m21424a(context).mo16960a(intent))) {
                String stringExtra = intent.getStringExtra("type");
                if ("rpc".equals(stringExtra)) {
                    ayak ayak = this.f110981a;
                    Bundle extras = intent.getExtras();
                    axty.m83203a(7, extras.getString("pkgName"));
                    ayak.f96931l.post(new ayaj(ayak, extras));
                } else if ("tickle".equals(stringExtra)) {
                    axwi axwi = this.f110982b;
                    Bundle extras2 = intent.getExtras();
                    if (Log.isLoggable("CloudNode", 2)) {
                        extras2.size();
                        String valueOf = String.valueOf(extras2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
                        sb.append("Received message from the cloud, yay, scheduling fetch");
                        sb.append(valueOf);
                        Log.v("CloudNode", sb.toString());
                    }
                    axty.m83203a(2, (String) null);
                    axwi.f96594s = true;
                    axwi.f96585j.mo53669a(1);
                }
            }
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (Throwable th) {
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
            throw th;
        }
    }
}
