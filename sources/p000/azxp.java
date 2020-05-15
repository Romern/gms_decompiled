package p000;

import android.animation.TimeInterpolator;

/* renamed from: azxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azxp implements TimeInterpolator {

    /* renamed from: a */
    private final TimeInterpolator f100179a;

    public azxp(TimeInterpolator timeInterpolator) {
        this.f100179a = timeInterpolator;
    }

    /* renamed from: a */
    public static TimeInterpolator m86335a(boolean z, TimeInterpolator timeInterpolator) {
        return !z ? new azxp(timeInterpolator) : timeInterpolator;
    }

    public final float getInterpolation(float f) {
        return 1.0f - this.f100179a.getInterpolation(f);
    }
}
