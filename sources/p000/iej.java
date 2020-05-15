package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: iej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iej extends dcj implements iel {
    public iej(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.appcert.IAppCertService");
    }

    /* renamed from: a */
    public final String getSpatulaHeader(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(2, bj);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final boolean mo12954a() {
        Parcel a = mo8526a(1, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
