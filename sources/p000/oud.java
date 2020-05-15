package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.carsetup.CarInfoInternal;

/* renamed from: oud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oud extends dcj implements ouf {
    public oud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IConnectionTransfer");
    }

    /* renamed from: a */
    public final int mo17427a() {
        throw null;
    }

    /* renamed from: b */
    public final CarInfoInternal mo17429b() {
        Parcel a = mo8526a(3, mo8529bj());
        CarInfoInternal carInfoInternal = (CarInfoInternal) dcl.m8163a(a, CarInfoInternal.CREATOR);
        a.recycle();
        return carInfoInternal;
    }

    /* renamed from: c */
    public final int mo17430c() {
        Parcel a = mo8526a(4, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: d */
    public final boolean mo17431d() {
        Parcel a = mo8526a(5, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final ParcelFileDescriptor mo17432e() {
        Parcel a = mo8526a(6, mo8529bj());
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) dcl.m8163a(a, ParcelFileDescriptor.CREATOR);
        a.recycle();
        return parcelFileDescriptor;
    }

    /* renamed from: f */
    public final boolean mo17433f() {
        Parcel a = mo8526a(7, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: g */
    public final boolean mo17434g() {
        throw null;
    }

    /* renamed from: h */
    public final int mo17435h() {
        Parcel a = mo8526a(9, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: i */
    public final int mo17436i() {
        Parcel a = mo8526a(10, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: j */
    public final omi mo17437j() {
        omi omi;
        Parcel a = mo8526a(11, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPoint");
            omi = queryLocalInterface instanceof omi ? (omi) queryLocalInterface : new omg(readStrongBinder);
        } else {
            omi = null;
        }
        a.recycle();
        return omi;
    }

    /* renamed from: a */
    public final void mo17428a(oui oui) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, oui);
        mo8528b(2, bj);
    }
}
