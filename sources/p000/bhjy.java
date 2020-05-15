package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bhjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhjy extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ bhka f118885a;

    public bhjy(bhka bhka) {
        this.f118885a = bhka;
    }

    public final void onAnimationEnd(Animator animator) {
        bhka bhka = this.f118885a;
        if (bhka.f118890c == animator) {
            bhka.f118890c = null;
        }
    }
}
