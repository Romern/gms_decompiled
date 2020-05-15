package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: emm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emm extends dcj implements IInterface {
    public emm(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.services.IPlayGearheadService");
    }

    /* renamed from: a */
    public final Bundle mo10277a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(1, bj);
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }
}
