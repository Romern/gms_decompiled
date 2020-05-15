package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: vva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vva extends dcj implements vvc {
    public vva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drivingmode.internal.IDrivingModeService");
    }

    /* renamed from: a */
    public final void mo28895a(rnt rnt) {
        throw null;
    }

    /* renamed from: a */
    public final void mo28897a(rnt rnt, int i, boolean z) {
        throw null;
    }

    /* renamed from: b */
    public final void mo28898b(rnt rnt, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeInt(1);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo28896a(rnt rnt, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeInt(1);
        mo8528b(1, bj);
    }
}
