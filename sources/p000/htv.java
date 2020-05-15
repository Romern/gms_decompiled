package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.EventsInterceptableLinearLayout;

/* renamed from: htv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class htv extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ EventsInterceptableLinearLayout f20420a;

    public htv(EventsInterceptableLinearLayout eventsInterceptableLinearLayout) {
        this.f20420a = eventsInterceptableLinearLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f20420a.setAlpha(0.5f);
    }
}
