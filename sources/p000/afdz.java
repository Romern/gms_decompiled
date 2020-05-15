package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: afdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afdz extends dcj implements afeb {
    public afdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: a */
    public final vzr mo34777a() {
        vzr vzr;
        Parcel a = mo8526a(1, mo8529bj());
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

    /* renamed from: b */
    public final vzr mo34786b(float f) {
        vzr vzr;
        Parcel bj = mo8529bj();
        bj.writeFloat(f);
        Parcel a = mo8526a(5, bj);
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

    /* renamed from: c */
    public final vzr mo34787c() {
        vzr vzr;
        Parcel a = mo8526a(2, mo8529bj());
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
    public final vzr mo34778a(float f) {
        vzr vzr;
        Parcel bj = mo8529bj();
        bj.writeFloat(f);
        Parcel a = mo8526a(4, bj);
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
    public final vzr mo34779a(float f, float f2) {
        vzr vzr;
        Parcel bj = mo8529bj();
        bj.writeFloat(f);
        bj.writeFloat(f2);
        Parcel a = mo8526a(3, bj);
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
    public final vzr mo34780a(float f, int i, int i2) {
        vzr vzr;
        Parcel bj = mo8529bj();
        bj.writeFloat(f);
        bj.writeInt(i);
        bj.writeInt(i2);
        Parcel a = mo8526a(6, bj);
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
    public final vzr mo34781a(CameraPosition cameraPosition) {
        vzr vzr;
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, cameraPosition);
        Parcel a = mo8526a(7, bj);
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
    public final vzr mo34782a(LatLng latLng) {
        vzr vzr;
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, latLng);
        Parcel a = mo8526a(8, bj);
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
    public final vzr mo34783a(LatLng latLng, float f) {
        vzr vzr;
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, latLng);
        bj.writeFloat(f);
        Parcel a = mo8526a(9, bj);
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
    public final vzr mo34784a(LatLngBounds latLngBounds, int i) {
        vzr vzr;
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, latLngBounds);
        bj.writeInt(i);
        Parcel a = mo8526a(10, bj);
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
    public final vzr mo34785a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        vzr vzr;
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, latLngBounds);
        bj.writeInt(i);
        bj.writeInt(i2);
        bj.writeInt(i3);
        Parcel a = mo8526a(11, bj);
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
}
