package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: akpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class akpi extends dck implements akpj {
    public akpi() {
        super("com.google.android.gms.ocr.ICreditCardOcrFragmentDelegate");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        vzr vzr2;
        vzr vzr3;
        vzr vzr4;
        akpg akpg = null;
        vzr vzr5 = null;
        vzr vzr6 = null;
        vzr vzr7 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
                } else {
                    vzr = null;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr2 = queryLocalInterface2 instanceof vzr ? (vzr) queryLocalInterface2 : new vzp(readStrongBinder2);
                } else {
                    vzr2 = null;
                }
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ocr.ICreditCardOcrFragmentCallback");
                    if (queryLocalInterface3 instanceof akpg) {
                        akpg = (akpg) queryLocalInterface3;
                    } else {
                        akpg = new akpe(readStrongBinder3);
                    }
                }
                mo39647a(vzr, vzr2, bundle, akpg);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr3 = queryLocalInterface4 instanceof vzr ? (vzr) queryLocalInterface4 : new vzp(readStrongBinder4);
                } else {
                    vzr3 = null;
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr7 = queryLocalInterface5 instanceof vzr ? (vzr) queryLocalInterface5 : new vzp(readStrongBinder5);
                }
                mo39646a(vzr3, vzr7, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                mo39644a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr4 = queryLocalInterface6 instanceof vzr ? (vzr) queryLocalInterface6 : new vzp(readStrongBinder6);
                } else {
                    vzr4 = null;
                }
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface7 instanceof vzr) {
                        vzr6 = (vzr) queryLocalInterface7;
                    } else {
                        vzr6 = new vzp(readStrongBinder7);
                    }
                }
                vzr b = mo39648b(vzr4, vzr6, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8164a(parcel2, b);
                return true;
            case 5:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface8 instanceof vzr) {
                        vzr5 = (vzr) queryLocalInterface8;
                    } else {
                        vzr5 = new vzp(readStrongBinder8);
                    }
                }
                mo39645a(vzr5);
                parcel2.writeNoException();
                return true;
            case 6:
                mo39649b((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                mo39643a();
                parcel2.writeNoException();
                return true;
            case 8:
                mo39650c();
                parcel2.writeNoException();
                return true;
            case 9:
                mo39652d();
                parcel2.writeNoException();
                return true;
            case 10:
                mo39653e();
                parcel2.writeNoException();
                return true;
            case 11:
                mo39654f();
                parcel2.writeNoException();
                return true;
            case 12:
                mo39655g();
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                mo39651c(bundle2);
                parcel2.writeNoException();
                dcl.m8169b(parcel2, bundle2);
                return true;
            default:
                return false;
        }
    }
}
