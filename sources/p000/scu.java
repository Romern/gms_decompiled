package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: scu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class scu extends dcj implements scw {
    public scu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISharedPreferencesService");
    }

    /* renamed from: a */
    public final Bundle mo25388a(String str, int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeInt(0);
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(1, bj);
        Bundle bundle2 = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
