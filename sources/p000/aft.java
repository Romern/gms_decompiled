package p000;

import android.graphics.drawable.Drawable;
import android.support.wearable.view.CircledImageView;

/* renamed from: aft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aft implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ CircledImageView f470a;

    public aft(CircledImageView circledImageView) {
        this.f470a = circledImageView;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f470a.invalidate();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
