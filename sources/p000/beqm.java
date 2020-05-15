package p000;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* renamed from: beqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqm {

    /* renamed from: a */
    private final ObjectAnimator f112055a;

    /* renamed from: b */
    private final ObjectAnimator f112056b;

    public beqm(View view, long j, long j2) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("translationY", (float) j, 0.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat);
        this.f112055a = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(j2);
        this.f112055a.setInterpolator(new OvershootInterpolator(4.0f));
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat2);
        this.f112056b = ofPropertyValuesHolder2;
        ofPropertyValuesHolder2.setDuration(j2);
    }

    /* renamed from: a */
    public final void mo60936a() {
        this.f112055a.start();
        this.f112056b.start();
    }
}
