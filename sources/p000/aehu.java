package p000;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: aehu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehu extends dcj implements aehw {
    public aehu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public final void mo34160a(Location location) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, location);
        mo8530c(1, bj);
    }
}
