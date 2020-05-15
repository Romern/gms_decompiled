package p000;

import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: lmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lmw implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f26417a;

    /* renamed from: b */
    final /* synthetic */ int f26418b;

    /* renamed from: c */
    final /* synthetic */ Intent f26419c;

    /* renamed from: d */
    final /* synthetic */ int f26420d;

    /* renamed from: e */
    final /* synthetic */ lnb f26421e;

    public lmw(lnb lnb, View view, int i, Intent intent, int i2) {
        this.f26421e = lnb;
        this.f26417a = view;
        this.f26418b = i;
        this.f26419c = intent;
        this.f26420d = i2;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f26417a.setVisibility(8);
        this.f26421e.f26159a.overridePendingTransition(0, 0);
        lmw.super.mo15168a(this.f26418b, this.f26419c, this.f26420d);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
