package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: afie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afie extends dcj implements afig {
    public afie(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: a */
    public final void mo34887a() {
        mo8528b(1, mo8529bj());
    }

    /* renamed from: c */
    public final String mo34889c() {
        Parcel a = mo8526a(2, mo8529bj());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final int mo34890d() {
        Parcel a = mo8526a(17, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final boolean mo34888a(afig afig) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afig);
        Parcel a = mo8526a(16, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
