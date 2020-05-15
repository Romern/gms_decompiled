package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: jgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jgb extends dck implements jgc {
    public jgb() {
        super("com.google.android.gms.auth.managed.internal.IEmmService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        jfz jfz = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.managed.internal.IEmmCallbacks");
                if (queryLocalInterface instanceof jfz) {
                    jfz = (jfz) queryLocalInterface;
                } else {
                    jfz = new jfx(readStrongBinder);
                }
            }
            mo13710a(jfz, parcel.readString(), parcel.readString());
        } else if (i != 9) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.managed.internal.IEmmCallbacks");
                if (queryLocalInterface2 instanceof jfz) {
                    jfz = (jfz) queryLocalInterface2;
                } else {
                    jfz = new jfx(readStrongBinder2);
                }
            }
            mo13709a(jfz, parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
