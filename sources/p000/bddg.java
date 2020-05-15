package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;

/* renamed from: bddg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bddg extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ bddk f105360a;

    public bddg(bddk bddk) {
        this.f105360a = bddk;
    }

    public final void onAnimationEnd(Animator animator) {
        bddk bddk = this.f105360a;
        Property property = bddk.f105364f;
        bddk.f105365a.setImageDrawable(null);
    }
}
