package p000;

import android.os.Parcel;

/* renamed from: aigq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aigq extends dck implements aigr {
    public aigq() {
        super("com.google.android.gms.nearby.internal.connection.IResultListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo36548a(parcel.readInt());
        return true;
    }
}
