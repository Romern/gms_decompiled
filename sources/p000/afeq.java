package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: afeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afeq extends dcj implements afes {
    public afeq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* renamed from: a */
    public final void mo34816a() {
        mo8528b(3, mo8529bj());
    }

    /* renamed from: b */
    public final void mo34819b(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(7, bj);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    /* renamed from: c */
    public final void mo34820c() {
        mo8528b(4, mo8529bj());
    }

    /* renamed from: d */
    public final void mo34821d() {
        mo8528b(5, mo8529bj());
    }

    /* renamed from: e */
    public final void mo34822e() {
        mo8528b(6, mo8529bj());
    }

    /* renamed from: f */
    public final vzr mo34823f() {
        vzr vzr;
        Parcel a = mo8526a(8, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        a.recycle();
        return vzr;
    }

    /* renamed from: a */
    public final void mo34817a(affs affs) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, affs);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo34818a(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        mo8528b(2, bj);
    }
}
