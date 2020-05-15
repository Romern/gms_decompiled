package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: eml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eml extends dcj implements IInterface {
    public eml(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.installapi.IPlayInstallService");
    }

    /* renamed from: a */
    public final Bundle mo10276a(String str, String str2, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(1, bj);
        Bundle bundle2 = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
