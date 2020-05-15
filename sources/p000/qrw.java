package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: qrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qrw extends dck implements qrx {
    public qrw() {
        super("com.google.android.gms.chromesync.internal.IBundleCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo24233a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        return true;
    }
}
