package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: mol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mol extends dck implements mom {
    public mol() {
        super("com.google.android.gms.backup.internal.IG1RestoreService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        mot mot = null;
        mou mou = null;
        switch (i) {
            case 1:
                mo20205a(dcl.m8167a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 2:
                mo20209b(dcl.m8167a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, mo20208a());
                return true;
            case 4:
                boolean b = mo20211b();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                return true;
            case 5:
                mo20203a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo20207a(dcl.m8167a(parcel), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                mo20210b(dcl.m8167a(parcel), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.backup.internal.IRestoreDataCallback");
                    if (queryLocalInterface instanceof mot) {
                        mot = (mot) queryLocalInterface;
                    } else {
                        mot = new mot(readStrongBinder);
                    }
                }
                mo20204a(mot, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 9:
                boolean a = dcl.m8167a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.backup.internal.IRestoreNowCallbacks");
                    if (queryLocalInterface2 instanceof mou) {
                        mou = (mou) queryLocalInterface2;
                    } else {
                        mou = new mou(readStrongBinder2);
                    }
                }
                mo20206a(a, mou);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
