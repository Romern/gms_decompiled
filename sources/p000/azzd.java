package p000;

import android.animation.ObjectAnimator;

/* renamed from: azzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azzd {
    /* renamed from: a */
    public static ObjectAnimator m86376a(Object obj, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, 1.0f);
        ofFloat.setInterpolator(azwy.f100140a);
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    /* renamed from: b */
    public static ObjectAnimator m86377b(Object obj, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, 0.0f);
        ofFloat.setInterpolator(azwy.f100140a);
        ofFloat.setDuration(500L);
        return ofFloat;
    }
}
