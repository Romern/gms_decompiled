package p000;

import android.os.Build;
import android.widget.PopupWindow;

/* renamed from: rr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1333rr {
    /* renamed from: a */
    public static void m20100a(PopupWindow popupWindow, int i) {
        int i2 = Build.VERSION.SDK_INT;
        popupWindow.setWindowLayoutType(i);
    }

    /* renamed from: a */
    public static void m20101a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        popupWindow.setOverlapAnchor(z);
    }
}
