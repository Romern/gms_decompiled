package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.frp.FrpSnapshot;

/* renamed from: jdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdx extends dcj implements jdz {
    public jdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.frp.IFrpService");
    }

    /* renamed from: a */
    public final boolean mo13612a() {
        Parcel a = mo8526a(1, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final boolean mo13613c() {
        Parcel a = mo8526a(2, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final FrpSnapshot mo13614d() {
        Parcel a = mo8526a(5, mo8529bj());
        FrpSnapshot frpSnapshot = (FrpSnapshot) dcl.m8163a(a, FrpSnapshot.CREATOR);
        a.recycle();
        return frpSnapshot;
    }
}
