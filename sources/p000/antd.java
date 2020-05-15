package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: antd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class antd extends dck implements ante {
    public antd() {
        super("com.google.android.gms.plus.dynamite.IAddToCirclesButton");
    }

    public static ante asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.dynamite.IAddToCirclesButton");
        if (queryLocalInterface instanceof ante) {
            return (ante) queryLocalInterface;
        }
        return new antc(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        vzr vzr2;
        antf antf;
        vzr vzr3 = null;
        antf antf2 = null;
        switch (i) {
            case 2:
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
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof vzr) {
                        vzr3 = (vzr) queryLocalInterface3;
                    } else {
                        vzr3 = new vzp(readStrongBinder3);
                    }
                }
                initialize(vzr, vzr2, vzr3);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AudienceMember audienceMember = (AudienceMember) dcl.m8163a(parcel, AudienceMember.CREATOR);
                String readString3 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.plus.dynamite.IAddToCirclesCallbacks");
                    if (queryLocalInterface4 instanceof antg) {
                        antf = (antg) queryLocalInterface4;
                        configure(readString, readString2, audienceMember, readString3, antf);
                        parcel2.writeNoException();
                        return true;
                    }
                    antf2 = new antf(readStrongBinder4);
                }
                antf = antf2;
                configure(readString, readString2, audienceMember, readString3, antf);
                parcel2.writeNoException();
                return true;
            case 4:
                vzr view = getView();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, view);
                return true;
            case 5:
                setSize(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                setType(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                refreshButton();
                parcel2.writeNoException();
                return true;
            case 8:
                setShowProgressIndicator(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 9:
                setAnalyticsStartView(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
