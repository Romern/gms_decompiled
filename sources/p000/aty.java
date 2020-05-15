package p000;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* renamed from: aty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aty {

    /* renamed from: a */
    static final Property f2232a = new atw(Float.class, "translationAlpha");

    /* renamed from: b */
    public static final /* synthetic */ int f2233b = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        new atx(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m2101a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: b */
    static aue m2103b(View view) {
        int i = Build.VERSION.SDK_INT;
        return new aue(view);
    }

    /* renamed from: a */
    static float m2099a(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: a */
    static void m2100a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: a */
    static void m2102a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
