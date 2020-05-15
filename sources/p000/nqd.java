package p000;

import android.view.SurfaceView;
import android.view.WindowManager;

/* renamed from: nqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nqd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SurfaceView f36390a;

    /* renamed from: b */
    final /* synthetic */ nqe f36391b;

    public nqd(nqe nqe, SurfaceView surfaceView) {
        this.f36391b = nqe;
        this.f36390a = surfaceView;
    }

    public final void run() {
        ((WindowManager) this.f36391b.f36395a.getSystemService("window")).removeViewImmediate(this.f36390a);
    }
}
