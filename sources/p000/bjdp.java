package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: bjdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjdp extends dck implements bjdq {
    public bjdp() {
        super("com.google.android.vending.verifier.IVerifyAppsDataCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo47613a(dcl.m8167a(parcel), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        return true;
    }
}
