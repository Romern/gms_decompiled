package p000;

import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.Surface;

/* renamed from: nwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nwv {

    /* renamed from: a */
    public final VirtualDisplay f36842a;

    /* renamed from: b */
    private Surface f36843b;

    /* renamed from: c */
    private final nqk f36844c;

    public nwv(DisplayManager displayManager, String str, int i, int i2, int i3, Surface surface, nqk nqk) {
        this.f36843b = surface;
        this.f36844c = nqk;
        try {
            VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(str, i, i2, i3, surface, 10);
            if (createVirtualDisplay != null) {
                this.f36842a = createVirtualDisplay;
                return;
            }
            throw new RuntimeException("Failed to create virtual display");
        } catch (SecurityException e) {
            throw new RuntimeException("Failed to create virtual display", e);
        }
    }

    /* renamed from: a */
    public final synchronized void mo21768a() {
        this.f36842a.release();
        Surface surface = this.f36843b;
        if (surface != null) {
            surface.release();
            nqk nqk = this.f36844c;
            if (nqk != null) {
                nqk.f36419a.f36421v.mo22459x();
            }
            this.f36843b = null;
        }
    }
}
