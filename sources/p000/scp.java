package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.GoogleCertificatesQuery;

/* renamed from: scp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class scp extends dck implements scq {
    public scp() {
        super("com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public static scq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof scq) {
            return (scq) queryLocalInterface;
        }
        return new sco(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            vzr googleCertificates = getGoogleCertificates();
            parcel2.writeNoException();
            dcl.m8164a(parcel2, googleCertificates);
        } else if (i != 2) {
            vzr vzr = null;
            if (i == 3) {
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof vzr) {
                        vzr = (vzr) queryLocalInterface;
                    } else {
                        vzr = new vzp(readStrongBinder);
                    }
                }
                boolean isGoogleReleaseSigned = isGoogleReleaseSigned(readString, vzr);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, isGoogleReleaseSigned);
            } else if (i == 4) {
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface2;
                    } else {
                        vzr = new vzp(readStrongBinder2);
                    }
                }
                boolean isGoogleSigned = isGoogleSigned(readString2, vzr);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, isGoogleSigned);
            } else if (i != 5) {
                return false;
            } else {
                GoogleCertificatesQuery googleCertificatesQuery = (GoogleCertificatesQuery) dcl.m8163a(parcel, GoogleCertificatesQuery.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof vzr) {
                        vzr = (vzr) queryLocalInterface3;
                    } else {
                        vzr = new vzp(readStrongBinder3);
                    }
                }
                boolean isGoogleOrPlatformSigned = isGoogleOrPlatformSigned(googleCertificatesQuery, vzr);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, isGoogleOrPlatformSigned);
            }
        } else {
            vzr googleReleaseCertificates = getGoogleReleaseCertificates();
            parcel2.writeNoException();
            dcl.m8164a(parcel2, googleReleaseCertificates);
        }
        return true;
    }
}
