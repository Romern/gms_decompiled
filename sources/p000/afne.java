package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: afne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afne extends dck implements afnf {
    public afne() {
        super("com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnr rnr;
        afmu afmu;
        rnr rnr2;
        afms afms;
        rnr rnr3;
        afnj afnj;
        rnr rnr4;
        afnj afnj2;
        rnt rnt;
        rnt rnt2;
        afms afms2 = null;
        afmr afmr = null;
        afmr afmr2 = null;
        afnj afnj3 = null;
        afnj afnj4 = null;
        afms afms3 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnr = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(readStrongBinder);
                } else {
                    rnr = null;
                }
                Account account = (Account) dcl.m8163a(parcel, Account.CREATOR);
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                LatestFootprintFilter latestFootprintFilter = (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.mdh.internal.ILatestFootprintListener");
                    if (queryLocalInterface2 instanceof afmu) {
                        afmu = (afmu) queryLocalInterface2;
                        mo32821a(rnr, account, readInt, readInt2, latestFootprintFilter, afmu);
                        break;
                    } else {
                        afms2 = new afms(readStrongBinder2);
                    }
                }
                afmu = afms2;
                mo32821a(rnr, account, readInt, readInt2, latestFootprintFilter, afmu);
            case 2:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnr2 = queryLocalInterface3 instanceof rnt ? (rnt) queryLocalInterface3 : new rnr(readStrongBinder3);
                } else {
                    rnr2 = null;
                }
                Account account2 = (Account) dcl.m8163a(parcel, Account.CREATOR);
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.mdh.internal.ILatestFootprintListener");
                    if (queryLocalInterface4 instanceof afmu) {
                        afms = (afmu) queryLocalInterface4;
                        mo32819a(rnr2, account2, readInt3, readInt4, afms);
                        break;
                    } else {
                        afms3 = new afms(readStrongBinder4);
                    }
                }
                afms = afms3;
                mo32819a(rnr2, account2, readInt3, readInt4, afms);
            case 3:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnr3 = queryLocalInterface5 instanceof rnt ? (rnt) queryLocalInterface5 : new rnr(readStrongBinder5);
                } else {
                    rnr3 = null;
                }
                Account account3 = (Account) dcl.m8163a(parcel, Account.CREATOR);
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
                    if (queryLocalInterface6 instanceof afnj) {
                        afnj = (afnj) queryLocalInterface6;
                        mo32820a(rnr3, account3, readInt5, readInt6, afnj);
                        break;
                    } else {
                        afnj4 = new afnj(readStrongBinder6);
                    }
                }
                afnj = afnj4;
                mo32820a(rnr3, account3, readInt5, readInt6, afnj);
            case 4:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnr4 = queryLocalInterface7 instanceof rnt ? (rnt) queryLocalInterface7 : new rnr(readStrongBinder7);
                } else {
                    rnr4 = null;
                }
                Account account4 = (Account) dcl.m8163a(parcel, Account.CREATOR);
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
                    if (queryLocalInterface8 instanceof afnj) {
                        afnj2 = (afnj) queryLocalInterface8;
                        mo32824b(rnr4, account4, readInt7, readInt8, afnj2);
                        break;
                    } else {
                        afnj3 = new afnj(readStrongBinder8);
                    }
                }
                afnj2 = afnj3;
                mo32824b(rnr4, account4, readInt7, readInt8, afnj2);
            case 5:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt = queryLocalInterface9 instanceof rnt ? (rnt) queryLocalInterface9 : new rnr(readStrongBinder9);
                } else {
                    rnt = null;
                }
                Account account5 = (Account) dcl.m8163a(parcel, Account.CREATOR);
                int readInt9 = parcel.readInt();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.mdh.internal.IFootprintsRecordingSettingsListener");
                    if (queryLocalInterface10 instanceof afmr) {
                        afmr2 = (afmr) queryLocalInterface10;
                    } else {
                        afmr2 = new afmr(readStrongBinder10);
                    }
                }
                mo32822a(rnt, account5, readInt9, afmr2);
                break;
            case 6:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt2 = queryLocalInterface11 instanceof rnt ? (rnt) queryLocalInterface11 : new rnr(readStrongBinder11);
                } else {
                    rnt2 = null;
                }
                Account account6 = (Account) dcl.m8163a(parcel, Account.CREATOR);
                parcel.readInt();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.mdh.internal.IFootprintsRecordingSettingsListener");
                    if (queryLocalInterface12 instanceof afmr) {
                        afmr = (afmr) queryLocalInterface12;
                    } else {
                        afmr = new afmr(readStrongBinder12);
                    }
                }
                mo32823a(rnt2, account6, afmr);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
