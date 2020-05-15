package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: afnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afnh extends dck implements afni {
    public afnh() {
        super("com.google.android.gms.mdh.internal.IMobileDataHubService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        afmv afmv;
        rnr rnr;
        rnr rnr2;
        rnr rnr3;
        afmv afmv2;
        rnr rnr4;
        afmy afmy;
        afmy afmy2;
        afnc afnc;
        rnr rnr5;
        rnr rnr6;
        afmq afmq = null;
        rnt rnt = null;
        rnt rnt2 = null;
        rnr rnr7 = null;
        rnr rnr8 = null;
        rnt rnt3 = null;
        rnt rnt4 = null;
        afnc afnc2 = null;
        afmy afmy3 = null;
        afmy afmy4 = null;
        afnb afnb = null;
        rnt rnt5 = null;
        rnr rnr9 = null;
        afmv afmv3 = null;
        rnr rnr10 = null;
        rnr rnr11 = null;
        rnr rnr12 = null;
        afmv afmv4 = null;
        rnt rnt6 = null;
        afmq afmq2 = null;
        rnt rnt7 = null;
        rnt rnt8 = null;
        rnt rnt9 = null;
        rnt rnt10 = null;
        afnk afnk = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IByteArrayCallback");
                    if (queryLocalInterface instanceof afmq) {
                        afmq = (afmq) queryLocalInterface;
                    } else {
                        afmq = new afmq(readStrongBinder);
                    }
                }
                parcel.readString();
                parcel.createByteArray();
                parcel.createByteArray();
                mo32814b(afmq);
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.mdh.internal.ITrivialBigtableKeyValueCallback");
                    afnk = queryLocalInterface2 instanceof afnk ? (afnk) queryLocalInterface2 : new afnk(readStrongBinder2);
                }
                parcel.readString();
                parcel.createByteArray();
                parcel.createByteArray();
                parcel.createByteArray();
                mo32801a(afnk);
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt10 = (rnt) queryLocalInterface3;
                    } else {
                        rnt10 = new rnr(readStrongBinder3);
                    }
                }
                parcel.readString();
                parcel.createByteArray();
                parcel.createByteArray();
                parcel.createByteArray();
                mo32818e(rnt10);
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface4 instanceof rnt) {
                        rnt9 = (rnt) queryLocalInterface4;
                    } else {
                        rnt9 = new rnr(readStrongBinder4);
                    }
                }
                parcel.readString();
                parcel.createByteArray();
                parcel.createByteArray();
                mo32817d(rnt9);
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface5 instanceof rnt) {
                        rnt8 = (rnt) queryLocalInterface5;
                    } else {
                        rnt8 = new rnr(readStrongBinder5);
                    }
                }
                mo32802a(rnt8);
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface6 instanceof rnt) {
                        rnt7 = (rnt) queryLocalInterface6;
                    } else {
                        rnt7 = new rnr(readStrongBinder6);
                    }
                }
                mo32813a(rnt7, parcel.createByteArray());
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.mdh.internal.IByteArrayCallback");
                    if (queryLocalInterface7 instanceof afmq) {
                        afmq2 = (afmq) queryLocalInterface7;
                    } else {
                        afmq2 = new afmq(readStrongBinder7);
                    }
                }
                mo32794a(afmq2);
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface8 instanceof rnt) {
                        rnt6 = (rnt) queryLocalInterface8;
                    } else {
                        rnt6 = new rnr(readStrongBinder8);
                    }
                }
                mo32816c(rnt6);
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
                    if (queryLocalInterface9 instanceof afmx) {
                        afmv = (afmx) queryLocalInterface9;
                        mo32795a(afmv, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR));
                        break;
                    } else {
                        afmv4 = new afmv(readStrongBinder9);
                    }
                }
                afmv = afmv4;
                mo32795a(afmv, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR));
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface10 instanceof rnt) {
                        rnr = (rnt) queryLocalInterface10;
                        mo32808a(rnr, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), (ByteArraySafeParcelable) dcl.m8163a(parcel, ByteArraySafeParcelable.CREATOR));
                        break;
                    } else {
                        rnr12 = new rnr(readStrongBinder10);
                    }
                }
                rnr = rnr12;
                mo32808a(rnr, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), (ByteArraySafeParcelable) dcl.m8163a(parcel, ByteArraySafeParcelable.CREATOR));
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface11 instanceof rnt) {
                        rnr2 = (rnt) queryLocalInterface11;
                        mo32804a(rnr2, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (SyncPolicy) dcl.m8163a(parcel, SyncPolicy.CREATOR), (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR));
                        break;
                    } else {
                        rnr11 = new rnr(readStrongBinder11);
                    }
                }
                rnr2 = rnr11;
                mo32804a(rnr2, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (SyncPolicy) dcl.m8163a(parcel, SyncPolicy.CREATOR), (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR));
            case 12:
            case 13:
            default:
                return false;
            case 14:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface12 instanceof rnt) {
                        rnr3 = (rnt) queryLocalInterface12;
                        mo32805a(rnr3, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (SyncPolicy) dcl.m8163a(parcel, SyncPolicy.CREATOR), (TimeSeriesFootprintsSubscriptionFilter) dcl.m8163a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR));
                        break;
                    } else {
                        rnr10 = new rnr(readStrongBinder12);
                    }
                }
                rnr3 = rnr10;
                mo32805a(rnr3, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (SyncPolicy) dcl.m8163a(parcel, SyncPolicy.CREATOR), (TimeSeriesFootprintsSubscriptionFilter) dcl.m8163a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR));
            case 15:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
                    if (queryLocalInterface13 instanceof afmx) {
                        afmv2 = (afmx) queryLocalInterface13;
                        mo32796a(afmv2, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (TimeSeriesFootprintsReadFilter) dcl.m8163a(parcel, TimeSeriesFootprintsReadFilter.CREATOR));
                        break;
                    } else {
                        afmv3 = new afmv(readStrongBinder13);
                    }
                }
                afmv2 = afmv3;
                mo32796a(afmv2, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (TimeSeriesFootprintsReadFilter) dcl.m8163a(parcel, TimeSeriesFootprintsReadFilter.CREATOR));
            case 16:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface14 instanceof rnt) {
                        rnr4 = (rnt) queryLocalInterface14;
                        mo32807a(rnr4, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (MdhFootprintListSafeParcelable) dcl.m8163a(parcel, MdhFootprintListSafeParcelable.CREATOR));
                        break;
                    } else {
                        rnr9 = new rnr(readStrongBinder14);
                    }
                }
                rnr4 = rnr9;
                mo32807a(rnr4, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (MdhFootprintListSafeParcelable) dcl.m8163a(parcel, MdhFootprintListSafeParcelable.CREATOR));
            case 17:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface15 instanceof rnt) {
                        rnt5 = (rnt) queryLocalInterface15;
                    } else {
                        rnt5 = new rnr(readStrongBinder15);
                    }
                }
                mo32809a(rnt5, (Account) dcl.m8163a(parcel, Account.CREATOR), dcl.m8168b(parcel), (SyncPolicy) dcl.m8163a(parcel, SyncPolicy.CREATOR));
                break;
            case 18:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
                    if (queryLocalInterface16 instanceof afnb) {
                        afnb = (afnb) queryLocalInterface16;
                    } else {
                        afnb = new afnb(readStrongBinder16);
                    }
                }
                mo32799a(afnb, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt());
                break;
            case 19:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
                    if (queryLocalInterface17 instanceof afna) {
                        afmy = (afna) queryLocalInterface17;
                        mo32797a(afmy, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR));
                        break;
                    } else {
                        afmy4 = new afmy(readStrongBinder17);
                    }
                }
                afmy = afmy4;
                mo32797a(afmy, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR));
            case 20:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
                    if (queryLocalInterface18 instanceof afna) {
                        afmy2 = (afna) queryLocalInterface18;
                        mo32798a(afmy2, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (TimeSeriesFootprintsReadFilter) dcl.m8163a(parcel, TimeSeriesFootprintsReadFilter.CREATOR));
                        break;
                    } else {
                        afmy3 = new afmy(readStrongBinder18);
                    }
                }
                afmy2 = afmy3;
                mo32798a(afmy2, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (TimeSeriesFootprintsReadFilter) dcl.m8163a(parcel, TimeSeriesFootprintsReadFilter.CREATOR));
            case 21:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback");
                    if (queryLocalInterface19 instanceof afnc) {
                        afnc = (afnc) queryLocalInterface19;
                        mo32800a(afnc, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (ByteArraySafeParcelable) dcl.m8163a(parcel, ByteArraySafeParcelable.CREATOR));
                        break;
                    } else {
                        afnc2 = new afnc(readStrongBinder19);
                    }
                }
                afnc = afnc2;
                mo32800a(afnc, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (ByteArraySafeParcelable) dcl.m8163a(parcel, ByteArraySafeParcelable.CREATOR));
            case 22:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface20 instanceof rnt) {
                        rnt4 = (rnt) queryLocalInterface20;
                    } else {
                        rnt4 = new rnr(readStrongBinder20);
                    }
                }
                mo32811a(rnt4, (MdhBroadcastListenerKey) dcl.m8163a(parcel, MdhBroadcastListenerKey.CREATOR), (MdhBroadcastListenerParams) dcl.m8163a(parcel, MdhBroadcastListenerParams.CREATOR));
                break;
            case 23:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface21 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface21;
                    } else {
                        rnt3 = new rnr(readStrongBinder21);
                    }
                }
                mo32810a(rnt3, (MdhBroadcastListenerKey) dcl.m8163a(parcel, MdhBroadcastListenerKey.CREATOR));
                break;
            case 24:
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface22 instanceof rnt) {
                        rnr5 = (rnt) queryLocalInterface22;
                        mo32806a(rnr5, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (TimeSeriesFootprintsSubscriptionFilter) dcl.m8163a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR), (SyncStatus) dcl.m8163a(parcel, SyncStatus.CREATOR));
                        break;
                    } else {
                        rnr8 = new rnr(readStrongBinder22);
                    }
                }
                rnr5 = rnr8;
                mo32806a(rnr5, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (TimeSeriesFootprintsSubscriptionFilter) dcl.m8163a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR), (SyncStatus) dcl.m8163a(parcel, SyncStatus.CREATOR));
            case 25:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface23 instanceof rnt) {
                        rnr6 = (rnt) queryLocalInterface23;
                        mo32803a(rnr6, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR), (SyncStatus) dcl.m8163a(parcel, SyncStatus.CREATOR));
                        break;
                    } else {
                        rnr7 = new rnr(readStrongBinder23);
                    }
                }
                rnr6 = rnr7;
                mo32803a(rnr6, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt(), (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR), (SyncStatus) dcl.m8163a(parcel, SyncStatus.CREATOR));
            case 26:
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface24 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface24;
                    } else {
                        rnt2 = new rnr(readStrongBinder24);
                    }
                }
                mo32812a(rnt2, parcel.readString());
                break;
            case 27:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface25 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface25;
                    } else {
                        rnt = new rnr(readStrongBinder25);
                    }
                }
                mo32815b(rnt);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
