package p000;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: ra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1316ra {
    /* renamed from: a */
    public static Interpolator m20056a(float f, float f2, float f3, float f4) {
        int i = Build.VERSION.SDK_INT;
        return new PathInterpolator(f, f2, f3, f4);
    }
}
