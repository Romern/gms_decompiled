package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: azwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class azwq extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final C1245ok f100129a = new C1245ok();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo55336a(Animator animator) {
        return this.f100129a.containsKey(animator) && ((Boolean) this.f100129a.get(animator)).booleanValue();
    }

    public final void onAnimationCancel(Animator animator) {
        this.f100129a.put(animator, true);
    }

    public final void onAnimationStart(Animator animator) {
        this.f100129a.put(animator, false);
    }
}
