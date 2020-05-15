package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: bvav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvav extends dcj implements bvax {
    public bvav(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.direct.client.internal.INearbyDirectCallback");
    }

    /* renamed from: a */
    public final void mo73262a(OperationStatus operationStatus) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, operationStatus);
        mo8530c(1, bj);
    }
}
