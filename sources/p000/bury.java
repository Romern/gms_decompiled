package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bury */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bury extends dcj implements busa {
    public bury(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.common.fastpair.IDiscoveryService");
    }

    /* renamed from: a */
    public final void mo73074a(busd busd) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, busd);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo73075b(busd busd) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, busd);
        mo8530c(2, bj);
    }
}
