package p000;

import android.os.Parcel;

/* renamed from: bjdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjdm extends dck implements bjdn {
    public bjdm() {
        super("com.google.android.vending.verifier.IListHarmfulAppsCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo47611a(dcl.m8167a(parcel), parcel.createByteArray());
        return true;
    }
}
