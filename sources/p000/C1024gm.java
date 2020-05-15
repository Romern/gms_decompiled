package p000;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: gm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1024gm implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f18614a;

    /* renamed from: b */
    final /* synthetic */ C1018gh f18615b;

    /* renamed from: c */
    final /* synthetic */ C1187mg f18616c;

    /* renamed from: d */
    final /* synthetic */ C1038gz f18617d;

    public C1024gm(ViewGroup viewGroup, C1018gh ghVar, C1038gz gzVar, C1187mg mgVar) {
        this.f18614a = viewGroup;
        this.f18615b = ghVar;
        this.f18617d = gzVar;
        this.f18616c = mgVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f18614a.post(new C1023gl(this));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
