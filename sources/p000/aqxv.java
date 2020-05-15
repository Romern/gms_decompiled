package p000;

import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: aqxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqxv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aqxw f87050a;

    public aqxv(aqxw aqxw) {
        this.f87050a = aqxw;
    }

    public final void run() {
        aqxw aqxw = this.f87050a;
        D2DDevice d2DDevice = aqxw.f87052b;
        if (d2DDevice != null) {
            aqxw.f87051a.post(new aqxu(this, d2DDevice));
        }
    }
}
