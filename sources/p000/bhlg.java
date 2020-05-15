package p000;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* renamed from: bhlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlg {

    /* renamed from: a */
    public static final boolean f118948a = true;

    /* renamed from: b */
    private static final int[] f118949b = {16842919};

    /* renamed from: c */
    private static final int[] f118950c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f118951d = {16842908};

    /* renamed from: e */
    private static final int[] f118952e = {16843623};

    /* renamed from: f */
    private static final int[] f118953f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f118954g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f118955h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f118956i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f118957j = {16842913};

    static {
        int i = Build.VERSION.SDK_INT;
        bhlg.class.getSimpleName();
    }

    private bhlg() {
    }

    /* renamed from: a */
    private static int m101093a(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (!f118948a) {
            return i;
        }
        int alpha = Color.alpha(i);
        return C1165lm.m19355b(i, Math.min(alpha + alpha, 255));
    }

    /* renamed from: b */
    public static ColorStateList m101096b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        return colorStateList;
    }

    /* renamed from: a */
    public static ColorStateList m101094a(ColorStateList colorStateList) {
        if (!f118948a) {
            int[] iArr = f118953f;
            int[] iArr2 = f118954g;
            int[] iArr3 = f118955h;
            int[] iArr4 = f118956i;
            int[] iArr5 = f118949b;
            int[] iArr6 = f118950c;
            int[] iArr7 = f118951d;
            int[] iArr8 = f118952e;
            return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f118957j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m101093a(colorStateList, iArr), m101093a(colorStateList, iArr2), m101093a(colorStateList, iArr3), m101093a(colorStateList, iArr4), 0, m101093a(colorStateList, iArr5), m101093a(colorStateList, iArr6), m101093a(colorStateList, iArr7), m101093a(colorStateList, iArr8), 0});
        }
        return new ColorStateList(new int[][]{f118957j, StateSet.NOTHING}, new int[]{m101093a(colorStateList, f118953f), m101093a(colorStateList, f118949b)});
    }

    /* renamed from: a */
    public static boolean m101095a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
