package p000;

import android.graphics.drawable.Drawable;

/* renamed from: sot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sot implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ sox f44877a;

    public sot(sox sox) {
        this.f44877a = sox;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f44877a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f44877a.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f44877a.unscheduleSelf(runnable);
    }
}
