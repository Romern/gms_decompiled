package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;

/* renamed from: jsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jsq extends dck implements jsr {
    public jsq() {
        super("com.google.android.gms.auth.proximity.internal.ISecureChannelService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt;
        rnt rnt2;
        rnt rnt3 = null;
        jsm jsm = null;
        jsm jsm2 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface instanceof rnt) {
                    rnt3 = (rnt) queryLocalInterface;
                } else {
                    rnt3 = new rnr(readStrongBinder);
                }
            }
            mo13984a(rnt3, (Role) dcl.m8163a(parcel, Role.CREATOR), parcel.createTypedArrayList(RemoteDevice.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt5 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
            }
            mo13988b(rnt5, (Role) dcl.m8163a(parcel, Role.CREATOR), parcel.createTypedArrayList(RemoteDevice.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
        } else if (i == 4) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface3 instanceof rnt) {
                    rnt4 = (rnt) queryLocalInterface3;
                } else {
                    rnt4 = new rnr(readStrongBinder3);
                }
            }
            mo13986a(rnt4, parcel.readString(), (Role) dcl.m8163a(parcel, Role.CREATOR), parcel.createByteArray());
        } else if (i == 5) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt = queryLocalInterface4 instanceof rnt ? (rnt) queryLocalInterface4 : new rnr(readStrongBinder4);
            } else {
                rnt = null;
            }
            String readString = parcel.readString();
            Role role = (Role) dcl.m8163a(parcel, Role.CREATOR);
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
                if (queryLocalInterface5 instanceof jsm) {
                    jsm2 = (jsm) queryLocalInterface5;
                } else {
                    jsm2 = new jsk(readStrongBinder5);
                }
            }
            mo13985a(rnt, readString, role, jsm2);
        } else if (i != 6) {
            return false;
        } else {
            IBinder readStrongBinder6 = parcel.readStrongBinder();
            if (readStrongBinder6 != null) {
                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt2 = queryLocalInterface6 instanceof rnt ? (rnt) queryLocalInterface6 : new rnr(readStrongBinder6);
            } else {
                rnt2 = null;
            }
            IBinder readStrongBinder7 = parcel.readStrongBinder();
            if (readStrongBinder7 != null) {
                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
                if (queryLocalInterface7 instanceof jsm) {
                    jsm = (jsm) queryLocalInterface7;
                } else {
                    jsm = new jsk(readStrongBinder7);
                }
            }
            mo13987a(rnt2, jsm);
        }
        parcel2.writeNoException();
        return true;
    }
}
