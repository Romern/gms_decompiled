package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjw extends dcj implements bjx {
    public bjw(IBinder iBinder) {
        super(iBinder, "com.android.facelock.ITrustedFaceInterface");
    }

    /* renamed from: a */
    public final void mo3210a() {
        mo8528b(1, mo8529bj());
    }

    /* renamed from: b */
    public final void mo3212b(bjv bjv) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, bjv);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo3211a(bjv bjv) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, bjv);
        mo8528b(2, bj);
    }
}
