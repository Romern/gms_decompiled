package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ajyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyu extends dcj implements ajyw {
    public ajyu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IStringResultListener");
    }

    /* renamed from: a */
    public final void mo39085a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(1, bj);
    }
}
