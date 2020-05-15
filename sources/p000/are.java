package p000;

import android.animation.Animator;

/* renamed from: are */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class are implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ arf f2054a;

    /* renamed from: b */
    final /* synthetic */ arg f2055b;

    public are(arg arg, arf arf) {
        this.f2055b = arg;
        this.f2054a = arf;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f2055b.mo2330a(1.0f, this.f2054a, true);
        this.f2054a.mo2326c();
        arf arf = this.f2054a;
        arf.mo2322a(arf.mo2320a());
        arg arg = this.f2055b;
        if (arg.f2082c) {
            arg.f2082c = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.f2054a.mo2323a(false);
            return;
        }
        arg.f2081b += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.f2055b.f2081b = 0.0f;
    }
}
