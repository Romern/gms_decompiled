package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: gn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1026gn extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f18650a;

    /* renamed from: b */
    final /* synthetic */ View f18651b;

    /* renamed from: c */
    final /* synthetic */ C1018gh f18652c;

    /* renamed from: d */
    final /* synthetic */ C1187mg f18653d;

    /* renamed from: e */
    final /* synthetic */ C1038gz f18654e;

    public C1026gn(ViewGroup viewGroup, View view, C1018gh ghVar, C1038gz gzVar, C1187mg mgVar) {
        this.f18650a = viewGroup;
        this.f18651b = view;
        this.f18652c = ghVar;
        this.f18654e = gzVar;
        this.f18653d = mgVar;
    }

    public final void onAnimationEnd(Animator animator) {
        Animator animator2;
        this.f18650a.endViewTransition(this.f18651b);
        C1018gh ghVar = this.f18652c;
        C1015ge geVar = ghVar.f18177N;
        if (geVar != null) {
            animator2 = geVar.f17993b;
        } else {
            animator2 = null;
        }
        ghVar.mo11812a((Animator) null);
        if (animator2 != null && this.f18650a.indexOfChild(this.f18651b) < 0) {
            this.f18654e.mo12339b(this.f18652c, this.f18653d);
        }
    }
}
