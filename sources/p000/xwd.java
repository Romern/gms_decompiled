package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: xwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xwd extends Animatable2.AnimationCallback {

    /* renamed from: a */
    final /* synthetic */ xwe f53268a;

    public xwd(xwe xwe) {
        this.f53268a = xwe;
    }

    public final void onAnimationEnd(Drawable drawable) {
        if (drawable != null && drawable.isVisible()) {
            Handler handler = this.f53268a.f53269a;
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            animatedVectorDrawable.getClass();
            handler.post(new xwc(animatedVectorDrawable));
        }
    }
}
