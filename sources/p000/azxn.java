package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: azxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azxn implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public static final /* synthetic */ int f100175a = 0;

    /* renamed from: b */
    private final azxm f100176b;

    /* renamed from: c */
    private final View[] f100177c;

    public azxn(azxm azxm, View... viewArr) {
        this.f100176b = azxm;
        this.f100177c = viewArr;
    }

    /* renamed from: a */
    public static azxn m86332a(View... viewArr) {
        return new azxn(azxi.f100171a, viewArr);
    }

    /* renamed from: b */
    public static azxn m86333b(View... viewArr) {
        return new azxn(azxk.f100173a, viewArr);
    }

    /* renamed from: c */
    public static azxn m86334c(View... viewArr) {
        return new azxn(azxl.f100174a, viewArr);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f100177c) {
            this.f100176b.mo55369a(valueAnimator, view);
        }
    }
}
