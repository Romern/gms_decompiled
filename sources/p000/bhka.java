package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: bhka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhka {

    /* renamed from: a */
    public final ArrayList f118888a = new ArrayList();

    /* renamed from: b */
    public bhjz f118889b = null;

    /* renamed from: c */
    public ValueAnimator f118890c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f118891d = new bhjy(this);

    /* renamed from: a */
    public final void mo63893a(int[] iArr, ValueAnimator valueAnimator) {
        bhjz bhjz = new bhjz(iArr, valueAnimator);
        valueAnimator.addListener(this.f118891d);
        this.f118888a.add(bhjz);
    }
}
