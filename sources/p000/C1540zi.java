package p000;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;

/* renamed from: zi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1540zi {

    /* renamed from: a */
    public static final Rect f27739a = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    /* renamed from: a */
    public static PorterDuff.Mode m20968a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: b */
    public static boolean m20971b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m20971b(drawable2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof C1174lu) {
            return m20971b(((C1174lu) drawable).mo15427a());
        } else {
            if (drawable instanceof C1392tw) {
                return m20971b(((C1392tw) drawable).f27218a);
            }
            if (drawable instanceof ScaleDrawable) {
                return m20971b(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: a */
    public static Rect m20969a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        Insets opticalInsets = drawable.getOpticalInsets();
        Rect rect = new Rect();
        rect.left = opticalInsets.left;
        rect.right = opticalInsets.right;
        rect.top = opticalInsets.top;
        rect.bottom = opticalInsets.bottom;
        return rect;
    }

    /* renamed from: a */
    static void m20970a() {
        int i = Build.VERSION.SDK_INT;
    }
}
