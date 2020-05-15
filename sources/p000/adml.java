package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: adml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adml {

    /* renamed from: a */
    public static final bnic f62159a = bnic.m109490a((Object) 3, (Object) 4);

    /* renamed from: b */
    public final Activity f62160b;

    /* renamed from: c */
    public final View f62161c;

    /* renamed from: d */
    public final View f62162d;

    /* renamed from: e */
    public final View f62163e;

    /* renamed from: f */
    public int f62164f = 0;

    /* renamed from: g */
    private final int f62165g;

    public adml(Activity activity, View view, View view2) {
        this.f62160b = activity;
        View findViewById = activity.findViewById(16908290);
        this.f62161c = findViewById;
        findViewById.setVisibility(4);
        this.f62162d = view;
        this.f62163e = view2;
        this.f62165g = activity.getResources().getInteger(17694721);
    }

    /* renamed from: a */
    public final void mo33651a(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimator).with(objectAnimator2);
        animatorSet.setInterpolator(new akc());
        animatorSet.setDuration((long) this.f62165g);
        animatorSet.addListener(animatorListener);
        animatorSet.start();
    }
}
