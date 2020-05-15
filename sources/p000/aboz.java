package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: aboz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aboz extends dcj implements abpb {
    public aboz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.http.IGoogleHttpService");
    }

    /* renamed from: a */
    public final Bundle mo32274a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(1, bj);
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo32275a(String str, int i) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeInt(i);
        mo8528b(2, bj);
    }
}
