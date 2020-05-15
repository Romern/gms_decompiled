package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: ov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1256ov {
    /* renamed from: a */
    public static int m19815a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return Gravity.getAbsoluteGravity(i, i2);
    }

    /* renamed from: a */
    public static void m19816a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }
}
