package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: ql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1300ql {

    /* renamed from: a */
    final Object f26876a;

    public C1300ql(Object obj) {
        this.f26876a = obj;
    }

    /* renamed from: a */
    public static C1300ql m20014a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = Build.VERSION.SDK_INT;
        return new C1300ql(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
