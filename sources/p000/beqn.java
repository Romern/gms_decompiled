package p000;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: beqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqn {

    /* renamed from: a */
    private final ObjectAnimator f112057a;

    public beqn(View view, long j, long j2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) j);
        this.f112057a = ofFloat;
        ofFloat.setDuration(j2);
        this.f112057a.setInterpolator(new beql());
    }

    /* renamed from: a */
    public final void mo60937a() {
        this.f112057a.start();
    }
}
