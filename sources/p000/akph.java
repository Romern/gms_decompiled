package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: akph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akph extends dcj implements akpj {
    public akph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ocr.ICreditCardOcrFragmentDelegate");
    }

    /* renamed from: a */
    public final void mo39643a() {
        mo8528b(7, mo8529bj());
    }

    /* renamed from: b */
    public final vzr mo39648b(vzr vzr, vzr vzr2, Bundle bundle) {
        vzr vzr3;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, vzr2);
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(4, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr3 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr3 = null;
        }
        a.recycle();
        return vzr3;
    }

    /* renamed from: c */
    public final void mo39650c() {
        mo8528b(8, mo8529bj());
    }

    /* renamed from: d */
    public final void mo39652d() {
        mo8528b(9, mo8529bj());
    }

    /* renamed from: e */
    public final void mo39653e() {
        mo8528b(10, mo8529bj());
    }

    /* renamed from: f */
    public final void mo39654f() {
        throw null;
    }

    /* renamed from: g */
    public final void mo39655g() {
        throw null;
    }

    /* renamed from: a */
    public final void mo39644a(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        mo8528b(3, bj);
    }

    /* renamed from: c */
    public final void mo39651c(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(13, bj);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    /* renamed from: a */
    public final void mo39645a(vzr vzr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo39646a(vzr vzr, vzr vzr2, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, vzr2);
        dcl.m8165a(bj, bundle);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo39647a(vzr vzr, vzr vzr2, Bundle bundle, akpg akpg) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, vzr2);
        dcl.m8165a(bj, bundle);
        dcl.m8164a(bj, akpg);
        mo8528b(1, bj);
    }

    /* renamed from: b */
    public final void mo39649b(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        mo8528b(6, bj);
    }
}
