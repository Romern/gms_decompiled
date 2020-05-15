package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gjb extends dck implements gjc {
    public gjb() {
        super("com.google.android.gms.auth.account.IWorkAccountService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        giz giz = null;
        grh grh = null;
        giz giz2 = null;
        switch (i) {
            case 1:
                mo11931a(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
                    giz = queryLocalInterface instanceof giz ? (giz) queryLocalInterface : new giz(readStrongBinder);
                }
                mo11929a(giz, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
                    if (queryLocalInterface2 instanceof giz) {
                        giz2 = (giz) queryLocalInterface2;
                    } else {
                        giz2 = new giz(readStrongBinder2);
                    }
                }
                mo11928a(giz2, (Account) dcl.m8163a(parcel, Account.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean a = mo11933a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 5:
                boolean a2 = mo11932a();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a2);
                return true;
            case 6:
                mo11934c();
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
                    if (queryLocalInterface3 instanceof grh) {
                        grh = (grh) queryLocalInterface3;
                    } else {
                        grh = new grf(readStrongBinder3);
                    }
                }
                mo11930a(readString, grh);
                return true;
            default:
                return false;
        }
    }
}
