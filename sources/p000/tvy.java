package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: tvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tvy extends dcj implements twa {
    public tvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
    }

    /* renamed from: a */
    public final void mo26832a(tvx tvx) {
        throw null;
    }

    /* renamed from: a */
    public final void mo26833a(tvx tvx, String[] strArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, tvx);
        bj.writeStringArray(strArr);
        mo8528b(1001, bj);
    }
}
