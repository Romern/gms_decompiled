package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: awgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awgx extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ awhb f94319a;

    public awgx(awhb awhb) {
        this.f94319a = awhb;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        awhb awhb = this.f94319a;
        awhb.f94334c = true;
        int i = awhb.f94326n;
        awgr awgr = awhb.f94332a.f110100f;
        if (awgr != null) {
            awgr.mo52135u();
        }
    }
}
