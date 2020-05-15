package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bhmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhmi extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f119078a;

    /* renamed from: b */
    final /* synthetic */ bhnd f119079b;

    public bhmi(bhnd bhnd, int i) {
        this.f119079b = bhnd;
        this.f119078a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f119079b.mo64028k();
    }
}
