package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.overlay.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0518a {
    /* renamed from: a */
    public static final void m5516a(Context context, Intent intent, C0529g gVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            if (valueOf.length() == 0) {
                new String("Launching an intent: ");
            } else {
                "Launching an intent: ".concat(valueOf);
            }
            C0387d.m5363a().mo6850a(context, intent);
            if (gVar != null) {
                gVar.mo6706a();
            }
        } catch (ActivityNotFoundException e) {
            C0633h.m5672d(e.getMessage());
        }
    }
}
