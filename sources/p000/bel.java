package p000;

import android.animation.Animator;
import android.view.Choreographer;

/* renamed from: bel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bel extends beh implements Choreographer.FrameCallback {

    /* renamed from: b */
    public float f3086b = 1.0f;

    /* renamed from: c */
    public long f3087c = 0;

    /* renamed from: d */
    public float f3088d = 0.0f;

    /* renamed from: e */
    public int f3089e = 0;

    /* renamed from: f */
    public float f3090f = -2.14748365E9f;

    /* renamed from: g */
    public float f3091g = 2.14748365E9f;

    /* renamed from: h */
    public axw f3092h;

    /* renamed from: i */
    public boolean f3093i = false;

    /* renamed from: j */
    private boolean f3094j = false;

    /* renamed from: a */
    public final void mo3050a(float f) {
        if (this.f3088d != f) {
            this.f3088d = bem.m2826b(f, mo3059f(), mo3060g());
            this.f3087c = 0;
            mo3038a();
        }
    }

    /* renamed from: b */
    public final float mo3052b() {
        axw axw = this.f3092h;
        if (axw == null) {
            return 0.0f;
        }
        float f = this.f3088d;
        float f2 = axw.f2514h;
        return (f - f2) / (axw.f2515i - f2);
    }

    /* renamed from: c */
    public final void mo3054c() {
        this.f3086b = -this.f3086b;
    }

    public final void cancel() {
        for (Animator.AnimatorListener animatorListener : this.f3081a) {
            animatorListener.onAnimationCancel(this);
        }
        mo3065i();
    }

    /* renamed from: d */
    public final void mo3056d() {
        mo3065i();
        mo3039a(mo3058e());
    }

    public final void doFrame(long j) {
        mo3064h();
        axw axw = this.f3092h;
        if (axw != null && this.f3093i) {
            long j2 = this.f3087c;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float abs = ((float) j3) / ((1.0E9f / axw.f2516j) / Math.abs(this.f3086b));
            float f = this.f3088d;
            if (mo3058e()) {
                abs = -abs;
            }
            float f2 = f + abs;
            this.f3088d = f2;
            boolean c = bem.m2827c(f2, mo3059f(), mo3060g());
            this.f3088d = bem.m2826b(this.f3088d, mo3059f(), mo3060g());
            this.f3087c = j;
            mo3038a();
            if (!c) {
                if (getRepeatCount() == -1 || this.f3089e < getRepeatCount()) {
                    for (Animator.AnimatorListener animatorListener : this.f3081a) {
                        animatorListener.onAnimationRepeat(this);
                    }
                    this.f3089e++;
                    if (getRepeatMode() == 2) {
                        this.f3094j = !this.f3094j;
                        mo3054c();
                    } else {
                        this.f3088d = !mo3058e() ? mo3059f() : mo3060g();
                    }
                    this.f3087c = j;
                } else {
                    this.f3088d = this.f3086b >= 0.0f ? mo3060g() : mo3059f();
                    mo3065i();
                    mo3039a(mo3058e());
                }
            }
            if (this.f3092h != null) {
                float f3 = this.f3088d;
                float f4 = this.f3090f;
                if (f3 < f4 || f3 > this.f3091g) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f4), Float.valueOf(this.f3091g), Float.valueOf(this.f3088d)));
                }
            }
            axq.m2409a();
        }
    }

    /* renamed from: e */
    public final boolean mo3058e() {
        return this.f3086b < 0.0f;
    }

    /* renamed from: f */
    public final float mo3059f() {
        axw axw = this.f3092h;
        if (axw == null) {
            return 0.0f;
        }
        float f = this.f3090f;
        return f == -2.14748365E9f ? axw.f2514h : f;
    }

    /* renamed from: g */
    public final float mo3060g() {
        axw axw = this.f3092h;
        if (axw == null) {
            return 0.0f;
        }
        float f = this.f3091g;
        return f == 2.14748365E9f ? axw.f2515i : f;
    }

    public final float getAnimatedFraction() {
        if (this.f3092h == null) {
            return 0.0f;
        }
        if (mo3058e()) {
            return (mo3060g() - this.f3088d) / (mo3060g() - mo3059f());
        }
        return (this.f3088d - mo3059f()) / (mo3060g() - mo3059f());
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(mo3052b());
    }

    public final long getDuration() {
        axw axw = this.f3092h;
        if (axw != null) {
            return (long) axw.mo2856a();
        }
        return 0;
    }

    /* renamed from: h */
    public final void mo3064h() {
        if (this.f3093i) {
            mo3053b(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: i */
    public final void mo3065i() {
        mo3053b(true);
    }

    public final boolean isRunning() {
        return this.f3093i;
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f3094j) {
            this.f3094j = false;
            mo3054c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3053b(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f3093i = false;
        }
    }

    /* renamed from: a */
    public final void mo3051a(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            axw axw = this.f3092h;
            if (axw != null) {
                f3 = axw.f2514h;
            } else {
                f3 = -3.4028235E38f;
            }
            if (axw != null) {
                f4 = axw.f2515i;
            } else {
                f4 = Float.MAX_VALUE;
            }
            this.f3090f = bem.m2826b(f, f3, f4);
            this.f3091g = bem.m2826b(f2, f3, f4);
            mo3050a((float) ((int) bem.m2826b(this.f3088d, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }
}
