package com.google.android.gms.ads.adshield;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.adshield.internal.C0193b;
import com.google.android.gms.ads.adshield.internal.C0194c;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdShieldCreatorImpl extends C0193b {
    public IBinder newAdShieldClient(String str, vzr vzr) {
        C0194c asInterface = C0193b.asInterface((IBinder) fhs.m11712a((Context) vzs.m41641a(vzr)).mo10839a("com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newAdShieldClient(str, vzr);
            } catch (RemoteException e) {
                C0633h.m5665a("Failed to create using dynamite package", e);
            }
        }
        C0633h.m5664a("Chimera is not available.");
        return null;
    }

    public IBinder newAdShieldClientWithoutAdvertisingId(String str, vzr vzr) {
        C0194c asInterface = C0193b.asInterface((IBinder) fhs.m11712a((Context) vzs.m41641a(vzr)).mo10839a("com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newAdShieldClientWithoutAdvertisingId(str, vzr);
            } catch (RemoteException e) {
                C0633h.m5665a("Failed to create using dynamite package", e);
            }
        }
        C0633h.m5664a("Chimera is not available.");
        return null;
    }
}
