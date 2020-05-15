package p000;

import android.os.Parcel;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: utq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class utq extends dck implements utr {
    public utq() {
        super("com.google.android.gms.drive.internal.IEventCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo27248a((OnEventResponse) dcl.m8163a(parcel, OnEventResponse.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
