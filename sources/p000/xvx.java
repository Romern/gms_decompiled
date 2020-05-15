package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: xvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xvx extends Animatable2.AnimationCallback {
    public final void onAnimationEnd(Drawable drawable) {
        if (drawable != null && drawable.isVisible()) {
            ((AnimatedVectorDrawable) drawable).start();
        }
    }
}
