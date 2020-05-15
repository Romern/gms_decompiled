package p000;

import android.animation.Animator;
import android.graphics.drawable.Drawable;

/* renamed from: ajut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajut extends ajvi {

    /* renamed from: a */
    final /* synthetic */ Drawable f71320a;

    /* renamed from: b */
    final /* synthetic */ ajuv f71321b;

    public ajut(ajuv ajuv, Drawable drawable) {
        this.f71321b = ajuv;
        this.f71320a = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f71321b.mo38945b(this.f71320a);
        this.f71321b.f71329E = null;
    }
}
