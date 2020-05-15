package p000;

import android.graphics.drawable.Drawable;
import androidx.wear.widget.CircledImageView;

/* renamed from: avy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avy implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ CircledImageView f2401a;

    public avy(CircledImageView circledImageView) {
        this.f2401a = circledImageView;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f2401a.invalidate();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
