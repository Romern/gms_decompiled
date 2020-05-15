package p000;

import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;

/* renamed from: anqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anqq implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ anqt f77461a;

    public anqq(anqt anqt) {
        this.f77461a = anqt;
    }

    public final void onAnimationEnd(Animation animation) {
        anqt anqt = this.f77461a;
        if (!anqt.f77468c.hasFocus()) {
            anqt.f77468c.requestFocus();
            ((InputMethodManager) anqt.getActivity().getSystemService("input_method")).toggleSoftInputFromWindow(anqt.f77468c.getApplicationWindowToken(), 1, 0);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
