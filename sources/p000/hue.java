package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hue extends dck implements huf {
    public hue() {
        super("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        hud hud = null;
        rnt rnt = null;
        rnt rnt2 = null;
        rnt rnt3 = null;
        hud hud2 = null;
        hud hud3 = null;
        hud hud4 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
                    if (queryLocalInterface instanceof hud) {
                        hud = (hud) queryLocalInterface;
                    } else {
                        hud = new hud(readStrongBinder);
                    }
                }
                mo12718a(hud);
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
                    hud4 = queryLocalInterface2 instanceof hud ? (hud) queryLocalInterface2 : new hud(readStrongBinder2);
                }
                mo12721b(hud4);
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
                    if (queryLocalInterface3 instanceof hud) {
                        hud3 = (hud) queryLocalInterface3;
                    } else {
                        hud3 = new hud(readStrongBinder3);
                    }
                }
                mo12723c(hud3);
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
                    if (queryLocalInterface4 instanceof hud) {
                        hud2 = (hud) queryLocalInterface4;
                    } else {
                        hud2 = new hud(readStrongBinder4);
                    }
                }
                mo12724d(hud2);
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface5 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface5;
                    } else {
                        rnt3 = new rnr(readStrongBinder5);
                    }
                }
                mo12720a(rnt3, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
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
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                mo12722b(rnt2);
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface7 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface7;
                    } else {
                        rnt = new rnr(readStrongBinder7);
                    }
                }
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                mo12719a(rnt);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
