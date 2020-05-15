package p000;

import android.os.Parcel;

/* renamed from: ovc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ovc extends dck implements ovd {
    public ovc() {
        super("com.google.android.gms.carsetup.IZeroPartyCheckerCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo22660a();
        parcel2.writeNoException();
        return true;
    }
}
