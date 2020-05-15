package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: lt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1173lt {
    /* renamed from: a */
    public static void m19598a(Drawable drawable, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        drawable.setHotspot(f, f2);
    }

    /* renamed from: b */
    public static int m19607b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getAlpha();
    }

    /* renamed from: c */
    public static boolean m19609c(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.canApplyTheme();
    }

    /* renamed from: d */
    public static ColorFilter m19610d(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getColorFilter();
    }

    /* renamed from: e */
    public static void m19611e(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
    }

    /* renamed from: f */
    public static Drawable m19612f(Drawable drawable) {
        return drawable instanceof C1174lu ? ((C1174lu) drawable).mo15427a() : drawable;
    }

    /* renamed from: g */
    public static int m19613g(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getLayoutDirection();
    }

    /* renamed from: a */
    public static void m19599a(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        drawable.setTint(i);
    }

    /* renamed from: b */
    public static boolean m19608b(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return drawable.setLayoutDirection(i);
    }

    /* renamed from: a */
    public static void m19600a(Drawable drawable, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m19601a(Drawable drawable, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintList(colorStateList);
    }

    /* renamed from: a */
    public static void m19602a(Drawable drawable, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        drawable.applyTheme(theme);
    }

    /* renamed from: a */
    public static void m19603a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: a */
    public static void m19604a(Drawable drawable, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintMode(mode);
    }

    /* renamed from: a */
    public static void m19605a(Drawable drawable, boolean z) {
        int i = Build.VERSION.SDK_INT;
        drawable.setAutoMirrored(z);
    }

    /* renamed from: a */
    public static boolean m19606a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }
}
