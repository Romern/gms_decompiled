package p000;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: binh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class binh {
    /* renamed from: a */
    public static void m102604a(Animation animation, View view, int i) {
        Animation animation2 = view.getAnimation();
        if ((view.getVisibility() != i || animation2 != null) && animation2 != animation) {
            animation.setAnimationListener(new bing(view, i));
            view.setTag(Integer.valueOf(i));
            view.startAnimation(animation);
        }
    }
}
