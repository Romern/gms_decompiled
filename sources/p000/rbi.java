package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;

/* renamed from: rbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rbi extends dck implements rbj {
    public rbi() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rbg rbg = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface instanceof rbg) {
                        rbg = (rbg) queryLocalInterface;
                    } else {
                        rbg = new rbe(readStrongBinder);
                    }
                }
                mo24429a(rbg, (LogEventParcelable) dcl.m8163a(parcel, LogEventParcelable.CREATOR));
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    rbg = queryLocalInterface2 instanceof rbg ? (rbg) queryLocalInterface2 : new rbe(readStrongBinder2);
                }
                mo24427a(rbg);
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface3 instanceof rbg) {
                        rbg = (rbg) queryLocalInterface3;
                    } else {
                        rbg = new rbe(readStrongBinder3);
                    }
                }
                mo24431b(rbg);
                return true;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface4 instanceof rbg) {
                        rbg = (rbg) queryLocalInterface4;
                    } else {
                        rbg = new rbe(readStrongBinder4);
                    }
                }
                mo24433c(rbg);
                return true;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface5 instanceof rbg) {
                        rbg = (rbg) queryLocalInterface5;
                    } else {
                        rbg = new rbe(readStrongBinder5);
                    }
                }
                mo24434d(rbg);
                return true;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface6 instanceof rbg) {
                        rbg = (rbg) queryLocalInterface6;
                    } else {
                        rbg = new rbe(readStrongBinder6);
                    }
                }
                mo24430a(rbg, parcel.readString());
                return true;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface7 instanceof rbg) {
                        rbg = (rbg) queryLocalInterface7;
                    } else {
                        rbg = new rbe(readStrongBinder7);
                    }
                }
                mo24432b(rbg, parcel.readString());
                return true;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface8 instanceof rbg) {
                        rbg = (rbg) queryLocalInterface8;
                    } else {
                        rbg = new rbe(readStrongBinder8);
                    }
                }
                mo24428a(rbg, (CollectForDebugParcelable) dcl.m8163a(parcel, CollectForDebugParcelable.CREATOR));
                return true;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface9 instanceof rbg) {
                        rbg = (rbg) queryLocalInterface9;
                    } else {
                        rbg = new rbe(readStrongBinder9);
                    }
                }
                mo24435e(rbg);
                return true;
            default:
                return false;
        }
    }
}
