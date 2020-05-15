package p000;

import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;

/* renamed from: anqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anqp implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ anqt f77460a;

    public anqp(anqt anqt, String str) {
        this.f77460a = anqt;
        anqt.f77472g = str != null ? str.trim() : null;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f77460a.mo42144d();
        anqt anqt = this.f77460a;
        ((InputMethodManager) anqt.getActivity().getSystemService("input_method")).toggleSoftInputFromWindow(anqt.f77468c.getApplicationWindowToken(), 1, 0);
        this.f77460a.f77467b.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
