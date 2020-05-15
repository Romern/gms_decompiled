package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azki extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99555a;

    public azki(CardChimeraActivity cardChimeraActivity) {
        this.f99555a = cardChimeraActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f99555a.finish();
        this.f99555a.overridePendingTransition(0, 0);
    }
}
