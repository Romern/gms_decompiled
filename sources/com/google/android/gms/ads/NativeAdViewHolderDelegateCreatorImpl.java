package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.formats.client.C0418e;
import com.google.android.gms.ads.internal.formats.client.C0419f;
import com.google.android.gms.ads.internal.util.C0640e;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NativeAdViewHolderDelegateCreatorImpl extends C0418e {
    public IBinder newNativeAdViewHolderDelegate(vzr vzr, vzr vzr2, vzr vzr3) {
        C0419f asInterface;
        Context context = ((View) vzs.m41641a(vzr)).getContext();
        C0371o.m5339a(context);
        if (((Boolean) C0371o.f8250c.mo6621a()).booleanValue() && (asInterface = C0418e.asInterface((IBinder) fhs.m11712a(context).mo10839a("com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl"))) != null) {
            try {
                return asInterface.newNativeAdViewHolderDelegate(vzr, vzr2, vzr3);
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
