package p000;

import android.os.Parcel;

/* renamed from: aebf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aebf extends dck implements aebg {
    public aebf() {
        super("com.google.android.gms.libs.scheduler.IGmsTaskCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo24458a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
