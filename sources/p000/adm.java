package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* renamed from: adm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adm {

    /* renamed from: a */
    static final int[] f278a = {-16842910};

    /* renamed from: b */
    static final int[] f279b = {16842908};

    /* renamed from: c */
    static final int[] f280c = {16842919};

    /* renamed from: d */
    static final int[] f281d = {16842912};

    /* renamed from: e */
    static final int[] f282e = new int[0];

    /* renamed from: f */
    private static final ThreadLocal f283f = new ThreadLocal();

    /* renamed from: g */
    private static final int[] f284g = new int[1];

    /* renamed from: a */
    public static int m514a(Context context, int i) {
        int[] iArr = f284g;
        iArr[0] = i;
        adr a = adr.m522a(context, (AttributeSet) null, iArr);
        try {
            return a.mo463h(0);
        } finally {
            a.mo450a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m516b(Context context, int i) {
        int[] iArr = f284g;
        iArr[0] = i;
        adr a = adr.m522a(context, (AttributeSet) null, iArr);
        try {
            return a.mo459e(0);
        } finally {
            a.mo450a();
        }
    }

    /* renamed from: c */
    public static int m517c(Context context, int i) {
        ColorStateList b = m516b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f278a, b.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f283f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f283f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = m514a(context, i);
        return C1165lm.m19355b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    /* renamed from: a */
    public static void m515a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1390tu.f27201j);
        try {
            if (!obtainStyledAttributes.hasValue(115)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
