package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: asy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asy extends auc {

    /* renamed from: v */
    private static final TimeInterpolator f2144v = new DecelerateInterpolator();

    /* renamed from: w */
    private static final TimeInterpolator f2145w = new AccelerateInterpolator();

    /* renamed from: y */
    private static final asx f2146y = new asx();

    /* renamed from: x */
    private asx f2147x = f2146y;

    public asy() {
        mo2440b();
    }

    /* renamed from: e */
    private static final void m1983e(atq atq) {
        int[] iArr = new int[2];
        atq.f2216b.getLocationOnScreen(iArr);
        atq.f2215a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: a */
    public final Animator mo2385a(ViewGroup viewGroup, View view, atq atq) {
        int[] iArr = (int[]) atq.f2215a.get("android:slide:screenPosition");
        return att.m2094a(view, atq, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), view.getTranslationX(), asx.m1982a(viewGroup, view), f2145w, this);
    }

    /* renamed from: b */
    public final void mo2440b() {
        this.f2147x = f2146y;
        aud aud = new aud(null);
        aud.f2257c = 80;
        this.f2190r = aud;
    }

    /* renamed from: b */
    public final void mo2379b(atq atq) {
        auc.m2118d(atq);
        m1983e(atq);
    }

    public asy(byte[] bArr) {
        mo2440b();
    }

    /* renamed from: a */
    public final Animator mo2386a(ViewGroup viewGroup, View view, atq atq, atq atq2) {
        int[] iArr = (int[]) atq2.f2215a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return att.m2094a(view, atq2, iArr[0], iArr[1], view.getTranslationX(), asx.m1982a(viewGroup, view), translationX, translationY, f2144v, this);
    }

    /* renamed from: a */
    public final void mo2377a(atq atq) {
        auc.m2118d(atq);
        m1983e(atq);
    }
}
