package p000;

import android.os.Parcel;

/* renamed from: jsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jsl extends dck implements jsm {
    public jsl() {
        super("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13884a(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        } else if (i != 2) {
            return false;
        } else {
            mo13885a(parcel.readString(), parcel.readString(), parcel.createByteArray());
        }
        return true;
    }
}
