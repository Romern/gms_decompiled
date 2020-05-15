package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: vjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjv extends dcj implements IInterface {
    public vjv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IStringCallback");
    }

    /* renamed from: a */
    public final void mo28504a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(1, bj);
    }
}
