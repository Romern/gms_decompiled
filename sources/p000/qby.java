package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.view.Surface;

/* renamed from: qby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qby extends dck implements qbz {
    public qby() {
        super("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        qbx qbx;
        qca qca = null;
        qbx qbx2 = null;
        qbx qbx3 = null;
        qbx qbx4 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface instanceof qbx) {
                        qbx qbx5 = (qbx) queryLocalInterface;
                    } else {
                        new qbx(readStrongBinder);
                    }
                }
                dcl.m8167a(parcel);
                parcel.readString();
                Surface surface = (Surface) dcl.m8163a(parcel, Surface.CREATOR);
                parcel.readInt();
                mo23893c();
                return true;
            case 2:
                mo23887a();
                return true;
            case 3:
                mo23891b();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    qbx = queryLocalInterface2 instanceof qbx ? (qbx) queryLocalInterface2 : new qbx(readStrongBinder2);
                } else {
                    qbx = null;
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
                    if (queryLocalInterface3 instanceof qca) {
                        qca = (qca) queryLocalInterface3;
                    } else {
                        qca = new qca(readStrongBinder3);
                    }
                }
                mo23890a(qbx, qca, parcel.readString(), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                return true;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface4 instanceof qbx) {
                        qbx4 = (qbx) queryLocalInterface4;
                    } else {
                        qbx4 = new qbx(readStrongBinder4);
                    }
                }
                mo23888a(qbx4);
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface5 instanceof qbx) {
                        qbx3 = (qbx) queryLocalInterface5;
                    } else {
                        qbx3 = new qbx(readStrongBinder5);
                    }
                }
                mo23892b(qbx3);
                return true;
            case 7:
                dcl.m8167a(parcel);
                parcel.readString();
                mo23894d();
                return true;
            case 8:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
                    if (queryLocalInterface6 instanceof qbx) {
                        qbx2 = (qbx) queryLocalInterface6;
                    } else {
                        qbx2 = new qbx(readStrongBinder6);
                    }
                }
                mo23889a(qbx2, (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
