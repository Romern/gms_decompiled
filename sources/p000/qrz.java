package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: qrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qrz extends dck implements qsa {
    public qrz() {
        super("com.google.android.gms.chromesync.internal.IChromeSyncApiService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        qrx qrx = null;
        qrx qrx2 = null;
        qrx qrx3 = null;
        qrx qrx4 = null;
        rnt rnt = null;
        rnt rnt2 = null;
        rnt rnt3 = null;
        qrx qrx5 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        rnt rnt6 = null;
        rnt rnt7 = null;
        rnt rnt8 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.chromesync.internal.IBundleCallback");
                if (queryLocalInterface instanceof qrx) {
                    qrx = (qrx) queryLocalInterface;
                } else {
                    qrx = new qrv(readStrongBinder);
                }
            }
            mo24235a(qrx, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt8 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
            }
            mo24243a(rnt8, parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface3 instanceof rnt) {
                    rnt7 = (rnt) queryLocalInterface3;
                } else {
                    rnt7 = new rnr(readStrongBinder3);
                }
            }
            Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
            mo24242a(rnt7, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i != 4) {
            switch (i) {
                case 101:
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                        if (queryLocalInterface4 instanceof rnt) {
                            rnt5 = (rnt) queryLocalInterface4;
                        } else {
                            rnt5 = new rnr(readStrongBinder4);
                        }
                    }
                    mo24241a(rnt5, parcel.readInt(), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    break;
                case 102:
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                        if (queryLocalInterface5 instanceof rnt) {
                            rnt4 = (rnt) queryLocalInterface5;
                        } else {
                            rnt4 = new rnr(readStrongBinder5);
                        }
                    }
                    mo24246b(rnt4, parcel.readInt(), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    break;
                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.chromesync.internal.IBundleCallback");
                        if (queryLocalInterface6 instanceof qrx) {
                            qrx5 = (qrx) queryLocalInterface6;
                        } else {
                            qrx5 = new qrv(readStrongBinder6);
                        }
                    }
                    mo24234a(qrx5, parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    break;
                case ErrorInfo.TYPE_SDU_FAILED:
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                        if (queryLocalInterface7 instanceof rnt) {
                            rnt3 = (rnt) queryLocalInterface7;
                        } else {
                            rnt3 = new rnr(readStrongBinder7);
                        }
                    }
                    mo24240a(rnt3, parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    break;
                case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                        if (queryLocalInterface8 instanceof rnt) {
                            rnt2 = (rnt) queryLocalInterface8;
                        } else {
                            rnt2 = new rnr(readStrongBinder8);
                        }
                    }
                    mo24245b(rnt2, parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    break;
                case 106:
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                        if (queryLocalInterface9 instanceof rnt) {
                            rnt = (rnt) queryLocalInterface9;
                        } else {
                            rnt = new rnr(readStrongBinder9);
                        }
                    }
                    mo24239a(rnt, parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    break;
                default:
                    switch (i) {
                        case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                            IBinder readStrongBinder10 = parcel.readStrongBinder();
                            if (readStrongBinder10 != null) {
                                IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.chromesync.internal.IBundleCallback");
                                if (queryLocalInterface10 instanceof qrx) {
                                    qrx4 = (qrx) queryLocalInterface10;
                                } else {
                                    qrx4 = new qrv(readStrongBinder10);
                                }
                            }
                            String readString = parcel.readString();
                            Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                            mo24236a(qrx4, readString);
                            break;
                        case 202:
                            IBinder readStrongBinder11 = parcel.readStrongBinder();
                            if (readStrongBinder11 != null) {
                                IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.chromesync.internal.IBundleCallback");
                                if (queryLocalInterface11 instanceof qrx) {
                                    qrx3 = (qrx) queryLocalInterface11;
                                } else {
                                    qrx3 = new qrv(readStrongBinder11);
                                }
                            }
                            mo24237a(qrx3, parcel.createStringArrayList(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                            break;
                        case 203:
                            IBinder readStrongBinder12 = parcel.readStrongBinder();
                            if (readStrongBinder12 != null) {
                                IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.chromesync.internal.IBundleCallback");
                                if (queryLocalInterface12 instanceof qrx) {
                                    qrx2 = (qrx) queryLocalInterface12;
                                } else {
                                    qrx2 = new qrv(readStrongBinder12);
                                }
                            }
                            mo24244b(qrx2, parcel.createStringArrayList(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                            break;
                        default:
                            return false;
                    }
            }
        } else {
            IBinder readStrongBinder13 = parcel.readStrongBinder();
            if (readStrongBinder13 != null) {
                IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface13 instanceof rnt) {
                    rnt6 = (rnt) queryLocalInterface13;
                } else {
                    rnt6 = new rnr(readStrongBinder13);
                }
            }
            mo24238a(rnt6);
        }
        parcel2.writeNoException();
        return true;
    }
}
