package p000;

import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arxm implements ardt {

    /* renamed from: a */
    final /* synthetic */ arxy f88412a;

    /* renamed from: b */
    private boolean f88413b = false;

    public arxm(arxy arxy) {
        this.f88412a = arxy;
    }

    /* renamed from: a */
    public final void mo48217a() {
        if (!this.f88413b) {
            sek sek = arxy.f88430a;
            D2DDevice d2DDevice = this.f88412a.f88433d;
            sek.mo25416d(String.format("Scan timed out while searching for device: %s, %s", d2DDevice.f107875d, d2DDevice.f107874c), new Object[0]);
            this.f88412a.f88431b.mo48908c(6);
        }
    }

    /* renamed from: b */
    public final void mo48220b(D2DDevice d2DDevice) {
    }

    /* renamed from: a */
    public final void mo48218a(int i) {
        sek sek = arxy.f88430a;
        String valueOf = String.valueOf(araj.m72321a(i));
        sek.mo25418e(valueOf.length() == 0 ? new String("Error: ") : "Error: ".concat(valueOf), new Object[0]);
        this.f88412a.f88431b.mo48908c(5);
    }

    /* renamed from: a */
    public final void mo48219a(D2DDevice d2DDevice) {
        arxy.f88430a.mo25409a(String.format("Found device: %s, %s", d2DDevice.f107875d, d2DDevice.f107874c), new Object[0]);
        if (!TextUtils.isEmpty(d2DDevice.f107875d) && bmwb.m108443a(d2DDevice.f107875d, this.f88412a.f88433d.f107875d) && !this.f88413b) {
            this.f88412a.f88432c.mo48363b();
            this.f88412a.mo48922a();
            this.f88413b = true;
        }
    }
}
