package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class pww extends dck implements pwx {
    public pww() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        pwv pwv;
        pwv pwv2;
        pwy pwy;
        pwv pwv3;
        pwy pwy2 = null;
        pwv pwv4 = null;
        pwy pwy3 = null;
        pwv pwv5 = null;
        pwv pwv6 = null;
        switch (i) {
            case 2:
                mo23793b();
                return true;
            case 3:
                mo23787a();
                return true;
            case 4:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    pwv = queryLocalInterface instanceof pwv ? (pwv) queryLocalInterface : new pwv(readStrongBinder);
                } else {
                    pwv = null;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    if (queryLocalInterface2 instanceof pwy) {
                        pwy2 = (pwy) queryLocalInterface2;
                    } else {
                        pwy2 = new pwy(readStrongBinder2);
                    }
                }
                mo23791a(pwv, pwy2, parcel.readString(), parcel.readString());
                return true;
            case 5:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    if (queryLocalInterface3 instanceof pwv) {
                        pwv6 = (pwv) queryLocalInterface3;
                    } else {
                        pwv6 = new pwv(readStrongBinder3);
                    }
                }
                mo23789a(pwv6, parcel.readInt());
                return true;
            case 6:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    if (queryLocalInterface4 instanceof pwv) {
                        pwv5 = (pwv) queryLocalInterface4;
                    } else {
                        pwv5 = new pwv(readStrongBinder4);
                    }
                }
                mo23788a(pwv5);
                return true;
            case 7:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    pwv2 = queryLocalInterface5 instanceof pwv ? (pwv) queryLocalInterface5 : new pwv(readStrongBinder5);
                } else {
                    pwv2 = null;
                }
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    if (queryLocalInterface6 instanceof pwy) {
                        pwy = (pwy) queryLocalInterface6;
                        mo23792a(pwv2, pwy, parcel.readString(), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                        return true;
                    }
                    pwy3 = new pwy(readStrongBinder6);
                }
                pwy = pwy3;
                mo23792a(pwv2, pwy, parcel.readString(), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    if (queryLocalInterface7 instanceof pwv) {
                        pwv3 = (pwv) queryLocalInterface7;
                        mo23790a(pwv3, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), parcel.readString(), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                        return true;
                    }
                    pwv4 = new pwv(readStrongBinder7);
                }
                pwv3 = pwv4;
                mo23790a(pwv3, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), parcel.readString(), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
