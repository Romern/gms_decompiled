package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arix extends dcj implements ariz {
    public arix(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
    }

    /* renamed from: a */
    public final void mo48586a() {
        mo8530c(2, mo8529bj());
    }

    /* renamed from: b */
    public final void mo48589b(D2DDevice d2DDevice) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, d2DDevice);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo48587a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo48588a(D2DDevice d2DDevice) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, d2DDevice);
        mo8530c(1, bj);
    }
}
