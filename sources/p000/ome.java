package p000;

import android.os.Parcel;

/* renamed from: ome */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ome extends dck implements omf {
    public ome() {
        super("com.google.android.gms.car.startup.ICarServiceCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo22284a();
        } else if (i == 2) {
            mo22285a(dcl.m8167a(parcel));
        } else if (i != 3) {
            return false;
        } else {
            mo22286b(dcl.m8167a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
