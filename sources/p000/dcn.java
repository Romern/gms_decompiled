package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcn extends dcj implements IInterface {
    public dcn(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gcs.service.IGcsStateService");
    }

    /* renamed from: a */
    public final Bundle mo8534a() {
        Parcel a = mo8526a(1, mo8529bj());
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }
}
