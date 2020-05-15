package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: iih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class iih extends dck implements iii {
    public iih() {
        super("com.google.android.gms.auth.authzen.internal.ICryptauthKeyService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        iie iie = null;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBundleCallback");
                if (queryLocalInterface instanceof iie) {
                    iie = (iie) queryLocalInterface;
                } else {
                    iie = new iie(readStrongBinder);
                }
            }
            Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
            mo12986a(iie);
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBundleCallback");
                if (queryLocalInterface2 instanceof iie) {
                    iie = (iie) queryLocalInterface2;
                } else {
                    iie = new iie(readStrongBinder2);
                }
            }
            int readInt = parcel.readInt();
            byte[] createByteArray = parcel.createByteArray();
            Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
            mo12987a(iie, (Account) dcl.m8163a(parcel, Account.CREATOR), readInt, createByteArray);
        }
        parcel2.writeNoException();
        return true;
    }
}
