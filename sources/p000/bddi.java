package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;

/* renamed from: bddi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bddi extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ bddk f105363a;

    public bddi(bddk bddk) {
        this.f105363a = bddk;
    }

    public final void onAnimationEnd(Animator animator) {
        bddk bddk = this.f105363a;
        Property property = bddk.f105364f;
        bddk.f105369e = null;
    }
}
