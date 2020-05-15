package p000;

import android.transition.Transition;

/* renamed from: id */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1071id implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f20754a;

    public C1071id(Runnable runnable) {
        this.f20754a = runnable;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        this.f20754a.run();
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
