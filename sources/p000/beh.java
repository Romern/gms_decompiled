package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: beh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class beh extends ValueAnimator {

    /* renamed from: a */
    public final Set f3081a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set f3082b = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3038a() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f3082b) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f3081a.add(animatorListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f3082b.add(animatorUpdateListener);
    }

    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void removeAllListeners() {
        this.f3081a.clear();
    }

    public final void removeAllUpdateListeners() {
        this.f3082b.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f3081a.remove(animatorListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f3082b.remove(animatorUpdateListener);
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3039a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f3081a) {
            int i = Build.VERSION.SDK_INT;
            animatorListener.onAnimationEnd(this, z);
        }
    }

    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
