package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fag extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ fak f16147a;

    public fag(fak fak) {
        this.f16147a = fak;
    }

    public final void onAnimationEnd(Animator animator) {
        fai fai = this.f16147a.f16155c;
        if (!evi.m11189b(fai.f16149a.getContext())) {
            fai.f16149a.f16153a.mo10766a();
            return;
        }
        Resources resources = fai.f16149a.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.as_expanded_avatar_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0126R.dimen.as_appbar_expanded_avatar_top_margin);
        float dimensionPixelSize3 = ((float) dimensionPixelSize) / ((float) resources.getDimensionPixelSize(C0126R.dimen.as_ob_avatar_size));
        fai.f16149a.f16157e.animate().translationY((((float) dimensionPixelSize2) - fai.f16149a.f16157e.getY()) - ((((float) resources.getDimensionPixelSize(C0126R.dimen.as_ob_avatar_size)) * (1.0f - dimensionPixelSize3)) / 2.0f)).scaleX(dimensionPixelSize3).scaleY(dimensionPixelSize3).setDuration(250).setInterpolator(new akd()).setListener(new fah(fai));
    }
}
