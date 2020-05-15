package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.EventsInterceptableLinearLayout;

/* renamed from: htu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class htu extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ EventsInterceptableLinearLayout f20419a;

    public htu(EventsInterceptableLinearLayout eventsInterceptableLinearLayout) {
        this.f20419a = eventsInterceptableLinearLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f20419a.setAlpha(1.0f);
        this.f20419a.f10196a = false;
    }
}
