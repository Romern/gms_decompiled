package p000;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: oz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1260oz {
    /* renamed from: a */
    public static int m19820a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginStart();
    }

    /* renamed from: b */
    public static int m19822b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginEnd();
    }

    /* renamed from: a */
    public static void m19821a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginStart(i);
    }

    /* renamed from: b */
    public static void m19823b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd(i);
    }
}
