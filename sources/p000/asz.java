package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: asz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asz extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1223np f2148a;

    /* renamed from: b */
    final /* synthetic */ atf f2149b;

    public asz(atf atf, C1223np npVar) {
        this.f2149b = atf;
        this.f2148a = npVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2148a.remove(animator);
        this.f2149b.f2189q.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f2149b.f2189q.add(animator);
    }
}
