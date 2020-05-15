package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: atnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atnc extends atf {
    /* renamed from: d */
    private static final void m76207d(atq atq) {
        atq.f2215a.put("com.google.android.gms.tapandpay.tap2:changeElevation:translationZ", Float.valueOf(C1280ps.m19934p(atq.f2216b)));
    }

    /* renamed from: a */
    public final Animator mo2376a(ViewGroup viewGroup, atq atq, atq atq2) {
        if (atq == null || atq2 == null) {
            return null;
        }
        Float f = (Float) atq.f2215a.get("com.google.android.gms.tapandpay.tap2:changeElevation:translationZ");
        Float f2 = (Float) atq2.f2215a.get("com.google.android.gms.tapandpay.tap2:changeElevation:translationZ");
        if (f.equals(f2)) {
            return null;
        }
        View view = atq.f2216b;
        view.setTranslationZ(f.floatValue());
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Z, f.floatValue(), f2.floatValue());
    }

    /* renamed from: b */
    public final void mo2379b(atq atq) {
        m76207d(atq);
    }

    /* renamed from: a */
    public final void mo2377a(atq atq) {
        m76207d(atq);
    }
}
