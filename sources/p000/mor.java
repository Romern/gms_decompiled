package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: mor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mor extends dck implements mos {
    public mor() {
        super("com.google.android.gms.backup.internal.IGmsRestoreService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        mop mop = null;
        mop mop2 = null;
        rnt rnt = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.backup.internal.IGmsRestoreCallback");
                if (queryLocalInterface instanceof mop) {
                    mop = (mop) queryLocalInterface;
                } else {
                    mop = new mon(readStrongBinder);
                }
            }
            mo19621a(mop);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface2 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface2;
                } else {
                    rnt = new rnr(readStrongBinder2);
                }
            }
            mo19623a(rnt, parcel.readLong(), parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.backup.internal.IGmsRestoreCallback");
                if (queryLocalInterface3 instanceof mop) {
                    mop2 = (mop) queryLocalInterface3;
                } else {
                    mop2 = new mon(readStrongBinder3);
                }
            }
            mo19622a(mop2, (Account) dcl.m8163a(parcel, Account.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
