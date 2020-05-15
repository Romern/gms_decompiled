package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C0349p;
import com.google.android.gms.ads.internal.client.C0350q;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.C0640e;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MobileAdsSettingManagerCreatorImpl extends C0349p {
    public IBinder getMobileAdsSettingManager(vzr vzr, int i) {
        C0350q asInterface;
        Context context = (Context) vzs.m41641a(vzr);
        C0371o.m5339a(context);
        if (((Boolean) C0371o.f8250c.mo6621a()).booleanValue() && (asInterface = C0349p.asInterface((IBinder) fhs.m11712a(context).mo10839a("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl"))) != null) {
            try {
                return asInterface.getMobileAdsSettingManager(vzr, i);
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
