package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hyt extends dck implements hyu {
    public hyt() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        hyy hyy = null;
        rnt rnt = null;
        hyr hyr = null;
        hyo hyo = null;
        rnt rnt2 = null;
        hyy hyy2 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                    hyy = queryLocalInterface instanceof hyy ? (hyy) queryLocalInterface : new hyy(readStrongBinder);
                }
                mo12818a(hyy);
                break;
            case 2:
                String readString = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                    if (queryLocalInterface2 instanceof hyy) {
                        hyy2 = (hyy) queryLocalInterface2;
                    } else {
                        hyy2 = new hyy(readStrongBinder2);
                    }
                }
                mo12820a(readString, hyy2);
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface3;
                    } else {
                        rnt2 = new rnr(readStrongBinder3);
                    }
                }
                mo12821a(rnt2);
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
                    if (queryLocalInterface4 instanceof hyo) {
                        hyo = (hyo) queryLocalInterface4;
                    } else {
                        hyo = new hym(readStrongBinder4);
                    }
                }
                mo12817a(hyo);
                break;
            case 5:
                String readString2 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
                    if (queryLocalInterface5 instanceof hyr) {
                        hyr = (hyr) queryLocalInterface5;
                    } else {
                        hyr = new hyp(readStrongBinder5);
                    }
                }
                mo12819a(readString2, hyr);
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface6 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface6;
                    } else {
                        rnt = new rnr(readStrongBinder6);
                    }
                }
                mo12822b(rnt);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
