package p000;

import android.animation.Animator;
import com.google.android.chimera.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: hee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hee implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ Fragment f19579a;

    /* renamed from: b */
    final /* synthetic */ heg f19580b;

    public hee(heg heg, Fragment fragment) {
        this.f19580b = heg;
        this.f19579a = fragment;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f19579a != null && !this.f19580b.f19583a.isDestroyed()) {
            this.f19580b.f19583a.beginTransaction().remove(this.f19579a).commitNow();
        }
        heg heg = this.f19580b;
        BottomSheetBehavior bottomSheetBehavior = heg.f19584b;
        if (bottomSheetBehavior != null) {
            heg.f19586d = bottomSheetBehavior.mo71032b();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
