package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: aua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aua extends AnimatorListenerAdapter implements ate {

    /* renamed from: a */
    boolean f2241a = false;

    /* renamed from: b */
    private final View f2242b;

    /* renamed from: c */
    private final int f2243c;

    /* renamed from: d */
    private final ViewGroup f2244d;

    /* renamed from: e */
    private final boolean f2245e;

    /* renamed from: f */
    private boolean f2246f;

    public aua(View view, int i) {
        this.f2242b = view;
        this.f2243c = i;
        this.f2244d = (ViewGroup) view.getParent();
        this.f2245e = true;
        m2110a(true);
    }

    /* renamed from: a */
    private final void m2110a(boolean z) {
        ViewGroup viewGroup;
        if (this.f2245e && this.f2246f != z && (viewGroup = this.f2244d) != null) {
            this.f2246f = z;
            atv.m2098a(viewGroup, z);
        }
    }

    /* renamed from: d */
    private final void m2111d() {
        if (!this.f2241a) {
            aty.m2101a(this.f2242b, this.f2243c);
            ViewGroup viewGroup = this.f2244d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2110a(false);
    }

    /* renamed from: a */
    public final void mo2371a() {
    }

    /* renamed from: b */
    public final void mo2373b() {
        m2110a(false);
    }

    /* renamed from: b */
    public final void mo2388b(atf atf) {
    }

    /* renamed from: c */
    public final void mo2374c() {
        m2110a(true);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2241a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        m2111d();
    }

    public final void onAnimationPause(Animator animator) {
        if (!this.f2241a) {
            aty.m2101a(this.f2242b, this.f2243c);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationResume(Animator animator) {
        if (!this.f2241a) {
            aty.m2101a(this.f2242b, 0);
        }
    }

    public final void onAnimationStart(Animator animator) {
    }

    /* renamed from: a */
    public final void mo2372a(atf atf) {
        m2111d();
        atf.mo2473b(this);
    }
}
