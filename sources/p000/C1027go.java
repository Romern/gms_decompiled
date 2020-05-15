package p000;

import android.animation.Animator;
import android.view.animation.Animation;

/* renamed from: go */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1027go {

    /* renamed from: a */
    public final Animation f18757a;

    /* renamed from: b */
    public final Animator f18758b;

    public C1027go(Animator animator) {
        this.f18757a = null;
        this.f18758b = animator;
    }

    public C1027go(Animation animation) {
        this.f18757a = animation;
        this.f18758b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }
}
