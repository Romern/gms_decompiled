package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: iik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class iik extends dck implements iil {
    public iik() {
        super("com.google.android.gms.auth.authzen.legacy.internal.IAuthZenSecretProviderService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        iim iim;
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.authzen.legacy.internal.IGetSecretCallback");
            iim = queryLocalInterface instanceof iim ? (iim) queryLocalInterface : new iim(readStrongBinder);
        } else {
            iim = null;
        }
        mo13042a(readString, iim);
        parcel2.writeNoException();
        return true;
    }
}
