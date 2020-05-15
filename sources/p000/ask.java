package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ask */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ask extends auc {
    public ask() {
    }

    /* renamed from: a */
    private static float m1937a(atq atq, float f) {
        Float f2;
        return (atq == null || (f2 = (Float) atq.f2215a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    public ask(int i) {
        this.f2254u = i;
    }

    /* renamed from: a */
    private final Animator m1938a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        aty.m2100a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, aty.f2232a, f2);
        ofFloat.addListener(new asj(view));
        mo2463a(new asi(view));
        return ofFloat;
    }

    /* renamed from: a */
    public final Animator mo2385a(ViewGroup viewGroup, View view, atq atq) {
        int i = aty.f2233b;
        return m1938a(view, m1937a(atq, 1.0f), 0.0f);
    }

    /* renamed from: a */
    public final Animator mo2386a(ViewGroup viewGroup, View view, atq atq, atq atq2) {
        float f = 0.0f;
        float a = m1937a(atq, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m1938a(view, f, 1.0f);
    }

    /* renamed from: a */
    public final void mo2377a(atq atq) {
        auc.m2118d(atq);
        atq.f2215a.put("android:fade:transitionAlpha", Float.valueOf(aty.m2099a(atq.f2216b)));
    }
}
