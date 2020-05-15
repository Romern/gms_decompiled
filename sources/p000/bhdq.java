package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: bhdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdq {

    /* renamed from: a */
    public int f118338a = 0;

    /* renamed from: b */
    public int f118339b = 1;

    /* renamed from: c */
    private final long f118340c;

    /* renamed from: d */
    private final long f118341d;

    /* renamed from: e */
    private final TimeInterpolator f118342e;

    public bhdq(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f118340c = j;
        this.f118341d = j2;
        this.f118342e = timeInterpolator;
    }

    /* renamed from: a */
    public final TimeInterpolator mo63576a() {
        TimeInterpolator timeInterpolator = this.f118342e;
        return timeInterpolator == null ? bhdl.f118328b : timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhdq) {
            bhdq bhdq = (bhdq) obj;
            if (this.f118340c == bhdq.f118340c && this.f118341d == bhdq.f118341d && this.f118338a == bhdq.f118338a && this.f118339b == bhdq.f118339b) {
                return mo63576a().getClass().equals(bhdq.mo63576a().getClass());
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f118340c;
        long j2 = this.f118341d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + mo63576a().getClass().hashCode()) * 31) + this.f118338a) * 31) + this.f118339b;
    }

    public final String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f118340c + " duration: " + this.f118341d + " interpolator: " + mo63576a().getClass() + " repeatCount: " + this.f118338a + " repeatMode: " + this.f118339b + "}\n";
    }

    /* renamed from: a */
    public final void mo63577a(Animator animator) {
        animator.setStartDelay(this.f118340c);
        animator.setDuration(this.f118341d);
        animator.setInterpolator(mo63576a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f118338a);
            valueAnimator.setRepeatMode(this.f118339b);
        }
    }
}
