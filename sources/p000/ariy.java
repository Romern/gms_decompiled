package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: ariy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ariy extends dck implements ariz {

    /* renamed from: a */
    public final ardt f87785a;

    /* renamed from: b */
    protected final Handler f87786b;

    public ariy() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
    }

    /* renamed from: a */
    public final void mo48586a() {
        this.f87786b.sendEmptyMessage(0);
    }

    /* renamed from: b */
    public final void mo48589b(D2DDevice d2DDevice) {
        Handler handler = this.f87786b;
        handler.sendMessage(handler.obtainMessage(3, d2DDevice));
    }

    /* renamed from: a */
    public final void mo48587a(int i) {
        Handler handler = this.f87786b;
        handler.sendMessage(handler.obtainMessage(2, Integer.valueOf(i)));
    }

    public ariy(ardt ardt) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
        this.f87786b = new arjo(this, Looper.getMainLooper());
        sdo.checkIfNull(ardt, "listener cannot be null.");
        this.f87785a = ardt;
    }

    /* renamed from: a */
    public final void mo48588a(D2DDevice d2DDevice) {
        Handler handler = this.f87786b;
        handler.sendMessage(handler.obtainMessage(1, d2DDevice));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo48588a((D2DDevice) dcl.m8163a(parcel, D2DDevice.CREATOR));
        } else if (i == 2) {
            mo48586a();
        } else if (i == 3) {
            mo48587a(parcel.readInt());
        } else if (i != 4) {
            return false;
        } else {
            mo48589b((D2DDevice) dcl.m8163a(parcel, D2DDevice.CREATOR));
        }
        return true;
    }
}
