package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: bhmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhmn extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f119084a;

    /* renamed from: b */
    final /* synthetic */ bhnd f119085b;

    public bhmn(bhnd bhnd, int i) {
        this.f119085b = bhnd;
        this.f119084a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f119085b.mo64028k();
    }

    public final void onAnimationStart(Animator animator) {
        bhnd bhnd = this.f119085b;
        String str = bhnd.f119106b;
        SnackbarContentLayout snackbarContentLayout = bhnd.f119117l;
        snackbarContentLayout.f151225a.setAlpha(1.0f);
        snackbarContentLayout.f151225a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (snackbarContentLayout.f151226b.getVisibility() == 0) {
            snackbarContentLayout.f151226b.setAlpha(1.0f);
            snackbarContentLayout.f151226b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }
}
