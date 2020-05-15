package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: vjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjr extends dcj implements IInterface {
    public vjr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IIntCallback");
    }

    /* renamed from: a */
    public final void mo28503a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(1, bj);
    }
}
