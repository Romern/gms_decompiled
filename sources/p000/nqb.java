package p000;

import android.view.SurfaceHolder;

/* renamed from: nqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nqb implements SurfaceHolder.Callback {

    /* renamed from: a */
    final /* synthetic */ nqc f36384a;

    public nqb(nqc nqc) {
        this.f36384a = nqc;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4 = nqe.f36392b;
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        int i = nqe.f36392b;
        this.f36384a.f36386b.release();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i = nqe.f36392b;
    }
}
