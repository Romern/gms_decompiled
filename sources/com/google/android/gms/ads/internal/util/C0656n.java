package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.util.n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0656n extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        synchronized (C0632g.f8963a) {
            C0632g.f8964b = false;
            C0632g.f8965c = false;
            C0633h.m5672d("Ad debug logging enablement is out of date.");
        }
        C0639d.m5679a(context);
    }
}
