package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: fyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fyv extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ fza f17666a;

    public fyv(fza fza) {
        this.f17666a = fza;
    }

    public final void onAnimationEnd(Animator animator) {
        fza fza = this.f17666a;
        int i = fza.f17672j;
        fza.f17705c = !fza.f17705c;
    }
}
