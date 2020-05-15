package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ats */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ats extends AnimatorListenerAdapter implements ate {

    /* renamed from: a */
    private final View f2222a;

    /* renamed from: b */
    private final View f2223b;

    /* renamed from: c */
    private final int f2224c;

    /* renamed from: d */
    private final int f2225d;

    /* renamed from: e */
    private int[] f2226e;

    /* renamed from: f */
    private float f2227f;

    /* renamed from: g */
    private float f2228g;

    /* renamed from: h */
    private final float f2229h;

    /* renamed from: i */
    private final float f2230i;

    public ats(View view, View view2, int i, int i2, float f, float f2) {
        this.f2223b = view;
        this.f2222a = view2;
        this.f2224c = i - Math.round(view.getTranslationX());
        this.f2225d = i2 - Math.round(this.f2223b.getTranslationY());
        this.f2229h = f;
        this.f2230i = f2;
        int[] iArr = (int[]) this.f2222a.getTag(C0126R.C0129id.transition_position);
        this.f2226e = iArr;
        if (iArr != null) {
            this.f2222a.setTag(C0126R.C0129id.transition_position, null);
        }
    }

    /* renamed from: a */
    public final void mo2371a() {
    }

    /* renamed from: b */
    public final void mo2373b() {
    }

    /* renamed from: b */
    public final void mo2388b(atf atf) {
    }

    /* renamed from: c */
    public final void mo2374c() {
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f2226e == null) {
            this.f2226e = new int[2];
        }
        this.f2226e[0] = Math.round(((float) this.f2224c) + this.f2223b.getTranslationX());
        this.f2226e[1] = Math.round(((float) this.f2225d) + this.f2223b.getTranslationY());
        this.f2222a.setTag(C0126R.C0129id.transition_position, this.f2226e);
    }

    public final void onAnimationPause(Animator animator) {
        this.f2227f = this.f2223b.getTranslationX();
        this.f2228g = this.f2223b.getTranslationY();
        this.f2223b.setTranslationX(this.f2229h);
        this.f2223b.setTranslationY(this.f2230i);
    }

    public final void onAnimationResume(Animator animator) {
        this.f2223b.setTranslationX(this.f2227f);
        this.f2223b.setTranslationY(this.f2228g);
    }

    /* renamed from: a */
    public final void mo2372a(atf atf) {
        this.f2223b.setTranslationX(this.f2229h);
        this.f2223b.setTranslationY(this.f2230i);
        atf.mo2473b(this);
    }
}
