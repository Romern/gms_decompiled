package p000;

import android.graphics.drawable.Drawable;

/* renamed from: agh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agh implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ agi f502a;

    public agh(agi agi) {
        this.f502a = agi;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f502a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
