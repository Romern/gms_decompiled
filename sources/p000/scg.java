package p000;

import android.os.Parcel;

/* renamed from: scg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class scg extends dck implements sch {
    public scg() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            vzr b = mo24595b();
            parcel2.writeNoException();
            dcl.m8164a(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int c = mo24596c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
