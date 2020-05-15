package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;

/* renamed from: jrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jrw extends dck implements jrx {
    public jrw() {
        super("com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        jsj jsj = null;
        rnt rnt = null;
        jsa jsa = null;
        rnt rnt2 = null;
        rnt rnt3 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        jsg jsg = null;
        jsd jsd = null;
        rnt rnt6 = null;
        rnt rnt7 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
                    if (queryLocalInterface instanceof jsj) {
                        jsj = (jsj) queryLocalInterface;
                    } else {
                        jsj = new jsh(readStrongBinder);
                    }
                }
                mo13952a(jsj);
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt7 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
                }
                mo13953a(rnt7, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), (DeviceFilter) dcl.m8163a(parcel, DeviceFilter.CREATOR));
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt6 = (rnt) queryLocalInterface3;
                    } else {
                        rnt6 = new rnr(readStrongBinder3);
                    }
                }
                mo13957b(rnt6, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), (DeviceFilter) dcl.m8163a(parcel, DeviceFilter.CREATOR));
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
                    if (queryLocalInterface4 instanceof jsd) {
                        jsd = (jsd) queryLocalInterface4;
                    } else {
                        jsd = new jsb(readStrongBinder4);
                    }
                }
                parcel.readString();
                mo13950a(jsd);
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback");
                    if (queryLocalInterface5 instanceof jsg) {
                        jsg = (jsg) queryLocalInterface5;
                    } else {
                        jsg = new jse(readStrongBinder5);
                    }
                }
                mo13951a(jsg, parcel.readString());
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface6 instanceof rnt) {
                        rnt5 = (rnt) queryLocalInterface6;
                    } else {
                        rnt5 = new rnr(readStrongBinder6);
                    }
                }
                mo13956a(rnt5, parcel.readString(), dcl.m8167a(parcel), parcel.readString());
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface7 instanceof rnt) {
                        rnt4 = (rnt) queryLocalInterface7;
                    } else {
                        rnt4 = new rnr(readStrongBinder7);
                    }
                }
                mo13959b(rnt4, parcel.readString(), dcl.m8167a(parcel), parcel.readString());
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface8 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface8;
                    } else {
                        rnt3 = new rnr(readStrongBinder8);
                    }
                }
                mo13954a(rnt3, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), parcel.readString());
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface9 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface9;
                    } else {
                        rnt2 = new rnr(readStrongBinder9);
                    }
                }
                mo13958b(rnt2, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), parcel.readString());
                break;
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
                    if (queryLocalInterface10 instanceof jsa) {
                        jsa = (jsa) queryLocalInterface10;
                    } else {
                        jsa = new jry(readStrongBinder10);
                    }
                }
                mo13949a(jsa, parcel.readString(), parcel.readString());
                break;
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface11 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface11;
                    } else {
                        rnt = new rnr(readStrongBinder11);
                    }
                }
                mo13955a(rnt, parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
