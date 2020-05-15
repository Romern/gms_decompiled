package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: qk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1299qk {

    /* renamed from: a */
    final Object f26875a;

    public C1299qk(Object obj) {
        this.f26875a = obj;
    }

    /* renamed from: a */
    public static C1299qk m20013a(int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return new C1299qk(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
