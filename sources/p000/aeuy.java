package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: aeuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeuy extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f63875a;

    /* renamed from: b */
    final /* synthetic */ View f63876b;

    public aeuy(View view, View view2) {
        this.f63875a = view;
        this.f63876b = view2;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f63875a.getVisibility() == 0) {
            this.f63876b.setVisibility(8);
        }
        this.f63876b.setAlpha(1.0f);
    }
}
