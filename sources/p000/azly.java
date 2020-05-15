package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: azly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azly implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ azme f99606a;

    public azly(azme azme) {
        this.f99606a = azme;
    }

    public void onClick(View view) {
        azme azme = this.f99606a;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(azme.f99616b);
        duration.addListener(new azmc(azme));
        duration.addUpdateListener(new azmd(azme));
        duration.start();
    }
}
