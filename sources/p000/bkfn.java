package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: bkfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkfn extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f124152a;

    /* renamed from: b */
    final /* synthetic */ int f124153b;

    /* renamed from: c */
    final /* synthetic */ Runnable f124154c;

    public bkfn(View view, int i, Runnable runnable) {
        this.f124152a = view;
        this.f124153b = i;
        this.f124154c = runnable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.c(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      bkfr.c(android.content.Context, int):android.content.res.ColorStateList
      bkfr.c(android.view.View, boolean):void */
    public final void onAnimationEnd(Animator animator) {
        bkfr.m105603c(this.f124152a, true);
        this.f124152a.setVisibility(this.f124153b);
        this.f124152a.setAlpha(1.0f);
        this.f124152a.animate().setListener(null);
        Runnable runnable = this.f124154c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
