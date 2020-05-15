package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* renamed from: ddl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddl extends dcj implements IInterface {
    public ddl(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback");
    }

    /* renamed from: a */
    public final void mo8543a(Map map) {
        Parcel bj = mo8529bj();
        bj.writeMap(map);
        mo8530c(1, bj);
    }
}
