package p000;

import android.os.Parcel;

/* renamed from: omk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class omk extends dck implements oml {
    public omk() {
        super("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo21167a(parcel.readInt(), parcel.createByteArray());
        } else if (i == 2) {
            mo21166a();
        } else if (i != 3) {
            return false;
        } else {
            mo21168b();
        }
        parcel2.writeNoException();
        return true;
    }
}
