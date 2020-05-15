package p000;

import android.animation.Animator;

/* renamed from: ajvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajvk extends ajvi {

    /* renamed from: a */
    final /* synthetic */ ajvl f71355a;

    public ajvk(ajvl ajvl) {
        this.f71355a = ajvl;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akiu.a(android.view.ViewGroup, boolean):void
     arg types: [android.view.ViewGroup, int]
     candidates:
      akiu.a(android.view.View, float):void
      akiu.a(android.view.View, android.view.View):void
      akiu.a(android.view.ViewGroup, boolean):void */
    public final void onAnimationEnd(Animator animator) {
        akiu.m59858a(this.f71355a.f71357b, false);
        this.f71355a.f71357b.requestLayout();
        this.f71355a.f71357b.invalidate();
        this.f71355a.f71358c = null;
    }
}
