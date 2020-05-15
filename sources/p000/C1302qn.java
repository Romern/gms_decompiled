package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: qn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C1302qn extends AccessibilityNodeProvider {

    /* renamed from: a */
    final C1304qp f26880a;

    public C1302qn(C1304qp qpVar) {
        this.f26880a = qpVar;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1301qm a = this.f26880a.mo15792a(i);
        if (a != null) {
            return a.f26877a;
        }
        return null;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f26880a.mo15793a(i, i2, bundle);
    }
}
