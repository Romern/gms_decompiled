package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C0343j;
import com.google.android.gms.ads.internal.client.C0344k;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.mediation.client.C0511b;
import com.google.android.gms.ads.internal.util.C0640e;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdLoaderBuilderCreatorImpl extends C0343j {
    public IBinder newAdLoaderBuilder(vzr vzr, String str, C0511b bVar, int i) {
        C0344k asInterface;
        Context context = (Context) vzs.m41641a(vzr);
        C0371o.m5339a(context);
        if (((Boolean) C0371o.f8250c.mo6621a()).booleanValue() && (asInterface = C0343j.asInterface((IBinder) fhs.m11712a(context).mo10839a("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl"))) != null) {
            try {
                return asInterface.newAdLoaderBuilder(vzr, str, bVar, i);
            } catch (RemoteException e) {
                if (C0640e.m5680a()) {
                    C0633h.m5665a("Failed to create using dynamite package", e);
                }
            }
        }
        C0633h.m5664a("Chimera is not available or disabled.");
        return null;
    }
}
