package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: asj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asj extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f2126a;

    /* renamed from: b */
    private boolean f2127b = false;

    public asj(View view) {
        this.f2126a = view;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aty.a(android.view.View, float):void
     arg types: [android.view.View, int]
     candidates:
      aty.a(android.view.View, int):void
      aty.a(android.view.View, float):void */
    public final void onAnimationEnd(Animator animator) {
        aty.m2100a(this.f2126a, 1.0f);
        if (this.f2127b) {
            this.f2126a.setLayerType(0, null);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (C1280ps.m19940v(this.f2126a) && this.f2126a.getLayerType() == 0) {
            this.f2127b = true;
            this.f2126a.setLayerType(2, null);
        }
    }
}
