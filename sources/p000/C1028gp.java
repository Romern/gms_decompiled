package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: gp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1028gp extends AnimationSet implements Runnable {

    /* renamed from: a */
    private final ViewGroup f18781a;

    /* renamed from: b */
    private final View f18782b;

    /* renamed from: c */
    private boolean f18783c;

    /* renamed from: d */
    private boolean f18784d;

    /* renamed from: e */
    private boolean f18785e = true;

    public C1028gp(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f18781a = viewGroup;
        this.f18782b = view;
        addAnimation(animation);
        this.f18781a.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation) {
        this.f18785e = true;
        if (this.f18783c) {
            return !this.f18784d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f18783c = true;
            C1271pj.m19857a(this.f18781a, this);
        }
        return true;
    }

    public final void run() {
        if (!this.f18783c && this.f18785e) {
            this.f18785e = false;
            this.f18781a.post(this);
            return;
        }
        this.f18781a.endViewTransition(this.f18782b);
        this.f18784d = true;
    }

    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f18785e = true;
        if (this.f18783c) {
            return !this.f18784d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f18783c = true;
            C1271pj.m19857a(this.f18781a, this);
        }
        return true;
    }
}
