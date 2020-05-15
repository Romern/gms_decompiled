package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bkcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkcc extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Runnable f123980a;

    /* renamed from: b */
    final /* synthetic */ View f123981b;

    /* renamed from: c */
    final /* synthetic */ long f123982c;

    /* renamed from: d */
    final /* synthetic */ long f123983d;

    public bkcc(Runnable runnable, View view, long j, long j2) {
        this.f123980a = runnable;
        this.f123981b = view;
        this.f123982c = j;
        this.f123983d = j2;
    }

    /* renamed from: a */
    private final void m105302a() {
        ViewPropertyAnimator listener = this.f123981b.animate().setListener(null);
        if (this.f123982c >= 0) {
            listener.setDuration(this.f123983d);
        }
        this.f123981b.setTag(C0126R.C0129id.view_is_animating_downwards, null);
    }

    public final void onAnimationCancel(Animator animator) {
        m105302a();
    }

    public final void onAnimationEnd(Animator animator) {
        View findFocus;
        Runnable runnable = this.f123980a;
        if (runnable != null) {
            runnable.run();
        }
        if (Boolean.TRUE == this.f123981b.getTag(C0126R.C0129id.view_is_animating_downwards) && (findFocus = this.f123981b.findFocus()) != null) {
            Rect rect = new Rect();
            findFocus.getDrawingRect(rect);
            findFocus.requestRectangleOnScreen(rect);
        }
        m105302a();
    }
}
