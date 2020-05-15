package p000;

import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: aqxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqxu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ D2DDevice f87048a;

    /* renamed from: b */
    final /* synthetic */ aqxv f87049b;

    public aqxu(aqxv aqxv, D2DDevice d2DDevice) {
        this.f87049b = aqxv;
        this.f87048a = d2DDevice;
    }

    public final void run() {
        arym arym = this.f87049b.f87050a.f87053c;
        D2DDevice d2DDevice = this.f87048a;
        aryp.f88459a.mo25412b("Auto connecting to %s", d2DDevice.f107874c);
        aryp aryp = arym.f88457a;
        aryn aryn = aryp.f88460b;
        if (aryn != null) {
            aryp.f88467i = true;
            aryp.f88468j = false;
            aryn.mo48936a(d2DDevice, 1, true);
            return;
        }
        aryp.f88459a.mo25416d("Listener not attached", new Object[0]);
    }
}
