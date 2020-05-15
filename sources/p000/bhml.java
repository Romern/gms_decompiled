package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: bhml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhml extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ bhnd f119082a;

    public bhml(bhnd bhnd) {
        this.f119082a = bhnd;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f119082a.mo64026i();
    }

    public final void onAnimationStart(Animator animator) {
        bhnd bhnd = this.f119082a;
        String str = bhnd.f119106b;
        SnackbarContentLayout snackbarContentLayout = bhnd.f119117l;
        snackbarContentLayout.f151225a.setAlpha(0.0f);
        snackbarContentLayout.f151225a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (snackbarContentLayout.f151226b.getVisibility() == 0) {
            snackbarContentLayout.f151226b.setAlpha(0.0f);
            snackbarContentLayout.f151226b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }
}
