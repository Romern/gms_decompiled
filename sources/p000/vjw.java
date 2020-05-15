package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: vjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjw extends dcj implements IInterface {
    public vjw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.ISuccessCallback");
    }

    /* renamed from: a */
    public final void mo28505a() {
        mo8528b(1, mo8529bj());
    }

    /* renamed from: a */
    public final void mo28506a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(2, bj);
    }
}
