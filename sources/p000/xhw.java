package p000;

import android.nfc.Tag;
import android.os.Parcel;

/* renamed from: xhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xhw extends dck implements xhx {
    public xhw() {
        super("com.google.android.gms.fido.common.nfc.INfcReaderCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo29740a((Tag) dcl.m8163a(parcel, Tag.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
