package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bhin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhin extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ bhiv f118731a;

    public bhin(bhiv bhiv) {
        this.f118731a = bhiv;
    }

    public final void onAnimationEnd(Animator animator) {
        bhiv bhiv = this.f118731a;
        int i = bhiv.f118742E;
        bhiv.f118776u = 0;
        bhiv.f118770o = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhko.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(int, int):int
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton, android.graphics.drawable.Drawable):void
      bhko.a(int, boolean):void */
    public final void onAnimationStart(Animator animator) {
        this.f118731a.f118749B.mo63901a(0, false);
        bhiv bhiv = this.f118731a;
        int i = bhiv.f118742E;
        bhiv.f118776u = 2;
        bhiv.f118770o = animator;
    }
}
