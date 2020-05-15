package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.purchase.client.C0532b;
import com.google.android.gms.ads.internal.purchase.client.C0533c;
import com.google.android.gms.ads.internal.util.C0640e;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InAppPurchaseManagerCreatorImpl extends C0532b {

    /* renamed from: a */
    private static final boolean f7824a = C0640e.m5680a();

    public IBinder newInAppPurchaseManager(vzr vzr) {
        C0533c asInterface;
        Context context = (Context) vzs.m41641a(vzr);
        C0371o.m5339a(context);
        if (((Boolean) C0371o.f8250c.mo6621a()).booleanValue() && (asInterface = C0532b.asInterface((IBinder) fhs.m11712a(context).mo10839a("com.google.android.gms.ads.ChimeraInAppPurchaseManagerCreatorImpl"))) != null) {
            try {
                return asInterface.newInAppPurchaseManager(vzr);
            } catch (RemoteException e) {
                if (f7824a) {
                    C0633h.m5665a("Failed to create using dynamite package", e);
                }
            }
        }
        C0633h.m5664a("Chimera is not available or disabled.");
        return null;
    }
}
