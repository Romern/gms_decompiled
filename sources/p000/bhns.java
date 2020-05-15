package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bhns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhns extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f119149a;

    /* renamed from: b */
    final /* synthetic */ bhnt f119150b;

    public bhns(bhnt bhnt, int i) {
        this.f119150b = bhnt;
        this.f119149a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        bhnt bhnt = this.f119150b;
        bhnt.f119153c = this.f119149a;
        bhnt.f119154d = 0.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.f119150b.f119153c = this.f119149a;
    }
}
