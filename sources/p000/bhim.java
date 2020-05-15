package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bhim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhim extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ bhiv f118729a;

    /* renamed from: b */
    private boolean f118730b;

    public bhim(bhiv bhiv) {
        this.f118729a = bhiv;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f118730b = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhko.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(int, int):int
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton, android.graphics.drawable.Drawable):void
      bhko.a(int, boolean):void */
    public final void onAnimationEnd(Animator animator) {
        bhiv bhiv = this.f118729a;
        int i = bhiv.f118742E;
        bhiv.f118776u = 0;
        bhiv.f118770o = null;
        if (!this.f118730b) {
            bhiv.f118749B.mo63901a(4, false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhko.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(int, int):int
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton, android.graphics.drawable.Drawable):void
      bhko.a(int, boolean):void */
    public final void onAnimationStart(Animator animator) {
        this.f118729a.f118749B.mo63901a(0, false);
        bhiv bhiv = this.f118729a;
        int i = bhiv.f118742E;
        bhiv.f118776u = 1;
        bhiv.f118770o = animator;
        this.f118730b = false;
    }
}
