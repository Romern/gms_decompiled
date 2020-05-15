package p000;

import android.view.View;

/* renamed from: bhkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhkk implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        C1280ps.m19937s(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
