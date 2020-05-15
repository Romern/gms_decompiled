package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qfk extends dck implements qfl {
    public qfk() {
        super("com.google.android.gms.checkin.internal.ICheckinApiService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt = null;
        rnt rnt2 = null;
        qfi qfi = null;
        rnt rnt3 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface instanceof rnt) {
                        rnt = (rnt) queryLocalInterface;
                    } else {
                        rnt = new rnr(readStrongBinder);
                    }
                }
                mo23916a(rnt, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt5 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
                }
                mo23918b(rnt5, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt4 = (rnt) queryLocalInterface3;
                    } else {
                        rnt4 = new rnr(readStrongBinder3);
                    }
                }
                mo23914a(rnt4);
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface4 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface4;
                    } else {
                        rnt3 = new rnr(readStrongBinder4);
                    }
                }
                mo23917b(rnt3);
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinApiCallbacks");
                    if (queryLocalInterface5 instanceof qfi) {
                        qfi = (qfi) queryLocalInterface5;
                    } else {
                        qfi = new qfg(readStrongBinder5);
                    }
                }
                mo23913a(qfi);
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface6 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface6;
                    } else {
                        rnt2 = new rnr(readStrongBinder6);
                    }
                }
                mo23915a(rnt2, (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
