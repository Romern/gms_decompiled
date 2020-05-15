package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qbx extends dcj implements IInterface {
    public qbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
    }

    /* renamed from: a */
    public final void mo23896a() {
        mo8530c(1, mo8529bj());
    }

    /* renamed from: c */
    public final void mo23898c() {
        mo8530c(3, mo8529bj());
    }

    /* renamed from: a */
    public final void mo23897a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(2, bj);
    }
}
