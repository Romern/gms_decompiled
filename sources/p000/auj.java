package p000;

import android.graphics.drawable.Drawable;

/* renamed from: auj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auj implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ aun f2267a;

    public auj(aun aun) {
        this.f2267a = aun;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f2267a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f2267a.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f2267a.unscheduleSelf(runnable);
    }
}
