package p000;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: busb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busb extends dcj implements busd {
    public busb(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
    }

    /* renamed from: a */
    public final void mo73079a(int i, List list) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeTypedList(list);
        mo8530c(1, bj);
    }
}
