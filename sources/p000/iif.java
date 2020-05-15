package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.authzen.AuthzenPublicKey;

/* renamed from: iif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class iif extends dck implements iig {
    public iif() {
        super("com.google.android.gms.auth.authzen.internal.ICryptauthInternalDataService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        iie iie = null;
        C1077iid iid = null;
        C1077iid iid2 = null;
        C1077iid iid3 = null;
        iie iie2 = null;
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
            mo12985a(iie, (AuthzenPublicKey) dcl.m8163a(parcel, AuthzenPublicKey.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBundleCallback");
                iie2 = queryLocalInterface2 instanceof iie ? (iie) queryLocalInterface2 : new iie(readStrongBinder2);
            }
            Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
            mo12984a(iie2);
        } else if (i == 4) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBooleanCallback");
                if (queryLocalInterface3 instanceof C1077iid) {
                    iid3 = (C1077iid) queryLocalInterface3;
                } else {
                    iid3 = new C1077iid(readStrongBinder3);
                }
            }
            boolean a = dcl.m8167a(parcel);
            int readInt = parcel.readInt();
            Bundle bundle3 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
            mo12983a(iid3, (Account) dcl.m8163a(parcel, Account.CREATOR), a, readInt);
        } else if (i == 5) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBooleanCallback");
                if (queryLocalInterface4 instanceof C1077iid) {
                    iid2 = (C1077iid) queryLocalInterface4;
                } else {
                    iid2 = new C1077iid(readStrongBinder4);
                }
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            Bundle bundle4 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
            mo12981a(iid2, (Account) dcl.m8163a(parcel, Account.CREATOR), readInt2, readInt3);
        } else if (i != 6) {
            return false;
        } else {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBooleanCallback");
                if (queryLocalInterface5 instanceof C1077iid) {
                    iid = (C1077iid) queryLocalInterface5;
                } else {
                    iid = new C1077iid(readStrongBinder5);
                }
            }
            boolean a2 = dcl.m8167a(parcel);
            Bundle bundle5 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
            mo12982a(iid, (Account) dcl.m8163a(parcel, Account.CREATOR), a2);
        }
        parcel2.writeNoException();
        return true;
    }
}
