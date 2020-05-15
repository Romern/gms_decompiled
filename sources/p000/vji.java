package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: vji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vji extends dcj implements IInterface {
    public vji(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IBooleanCallback");
    }

    /* renamed from: a */
    public final void mo28500a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(1, bj);
    }
}
