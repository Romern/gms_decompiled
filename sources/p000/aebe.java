package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: aebe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aebe extends dcj implements aebg {
    public aebe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.libs.scheduler.IGmsTaskCallback");
    }

    /* renamed from: a */
    public final void mo24458a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(2, bj);
    }
}
