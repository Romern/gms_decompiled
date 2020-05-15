package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnj extends dcj implements IInterface {
    public bnj(IBinder iBinder) {
        super(iBinder, "com.android.vending.contentfilters.IContentFiltersService");
    }

    /* renamed from: a */
    public final Bundle mo3299a(int[] iArr) {
        Parcel bj = mo8529bj();
        bj.writeIntArray(iArr);
        Parcel a = mo8526a(1, bj);
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }
}
