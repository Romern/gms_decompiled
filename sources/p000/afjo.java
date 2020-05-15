package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: afjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afjo extends dck implements afjp {
    public afjo() {
        super("com.google.android.gms.mdd.IMobileDataDownloadService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        afjj afjj = null;
        rnt rnt = null;
        rnt rnt2 = null;
        afjm afjm = null;
        rnt rnt3 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        rnt rnt6 = null;
        rnt rnt7 = null;
        rnt rnt8 = null;
        rnt rnt9 = null;
        rnt rnt10 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.mdd.IMddFileGroupCallback");
                    if (queryLocalInterface instanceof afjj) {
                        afjj = (afjj) queryLocalInterface;
                    } else {
                        afjj = new afjh(readStrongBinder);
                    }
                }
                mo34905a(afjj, (FileGroupRequest) dcl.m8163a(parcel, FileGroupRequest.CREATOR));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt10 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
                }
                mo34907a(rnt10);
                break;
            case 3:
                boolean a = dcl.m8167a(parcel);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt9 = (rnt) queryLocalInterface3;
                    } else {
                        rnt9 = new rnr(readStrongBinder3);
                    }
                }
                mo34910a(a, rnt9);
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface4 instanceof rnt) {
                        rnt8 = (rnt) queryLocalInterface4;
                    } else {
                        rnt8 = new rnr(readStrongBinder4);
                    }
                }
                mo34913c(rnt8);
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface5 instanceof rnt) {
                        rnt7 = (rnt) queryLocalInterface5;
                    } else {
                        rnt7 = new rnr(readStrongBinder5);
                    }
                }
                mo34916f(rnt7);
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface6 instanceof rnt) {
                        rnt6 = (rnt) queryLocalInterface6;
                    } else {
                        rnt6 = new rnr(readStrongBinder6);
                    }
                }
                mo34909a(rnt6, (OverrideFileGroupRequest) dcl.m8163a(parcel, OverrideFileGroupRequest.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface7 instanceof rnt) {
                        rnt5 = (rnt) queryLocalInterface7;
                    } else {
                        rnt5 = new rnr(readStrongBinder7);
                    }
                }
                mo34914d(rnt5);
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface8 instanceof rnt) {
                        rnt4 = (rnt) queryLocalInterface8;
                    } else {
                        rnt4 = new rnr(readStrongBinder8);
                    }
                }
                mo34915e(rnt4);
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface9 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface9;
                    } else {
                        rnt3 = new rnr(readStrongBinder9);
                    }
                }
                mo34911b(rnt3);
                break;
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
                    if (queryLocalInterface10 instanceof afjm) {
                        afjm = (afjm) queryLocalInterface10;
                    } else {
                        afjm = new afjk(readStrongBinder10);
                    }
                }
                mo34906a(afjm);
                break;
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.mdd.IMddFileGroupCallback");
                    if (queryLocalInterface11 instanceof afjj) {
                        afjj afjj2 = (afjj) queryLocalInterface11;
                    } else {
                        new afjh(readStrongBinder11);
                    }
                }
                FileGroupRequest fileGroupRequest = (FileGroupRequest) dcl.m8163a(parcel, FileGroupRequest.CREATOR);
                break;
            case 12:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface12 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface12;
                    } else {
                        rnt2 = new rnr(readStrongBinder12);
                    }
                }
                mo34908a(rnt2, (FileGroupRequest) dcl.m8163a(parcel, FileGroupRequest.CREATOR));
                break;
            case 13:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface13 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface13;
                    } else {
                        rnt = new rnr(readStrongBinder13);
                    }
                }
                mo34912b(rnt, (FileGroupRequest) dcl.m8163a(parcel, FileGroupRequest.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
