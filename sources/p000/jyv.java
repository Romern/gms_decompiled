package p000;

import android.animation.Animator;
import android.view.ViewGroup;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: jyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jyv implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ jyw f23550a;

    public jyv(jyw jyw) {
        this.f23550a = jyw;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        ((ViewGroup) this.f23550a.f23551a.f11562r.getParent()).removeView(this.f23550a.f23551a.f11562r);
        MinuteMaidChimeraActivity minuteMaidChimeraActivity = this.f23550a.f23551a;
        minuteMaidChimeraActivity.mo7905a(0, minuteMaidChimeraActivity.f11565u);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
