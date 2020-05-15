package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: op */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1250op extends View.AccessibilityDelegate {

    /* renamed from: a */
    final C1251oq f26817a;

    public C1250op(C1251oq oqVar) {
        this.f26817a = oqVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f26817a.mo348b(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C1304qp a = this.f26817a.mo342a(view);
        if (a != null) {
            return (AccessibilityNodeProvider) a.f26881a;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f26817a.mo350d(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        C1301qm a = C1301qm.m20017a(accessibilityNodeInfo);
        boolean I = C1280ps.m19874I(view);
        int i = Build.VERSION.SDK_INT;
        a.f26877a.setScreenReaderFocusable(I);
        Boolean bool = (Boolean) new C1276po().mo15702b(view);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        int i2 = Build.VERSION.SDK_INT;
        a.f26877a.setHeading(z);
        CharSequence J = C1280ps.m19875J(view);
        int i3 = Build.VERSION.SDK_INT;
        a.f26877a.setPaneTitle(J);
        this.f26817a.mo345a(view, a);
        accessibilityNodeInfo.getText();
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        List b = C1251oq.m19796b(view);
        for (int i6 = 0; i6 < b.size(); i6++) {
            a.mo15757a((C1298qj) b.get(i6));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f26817a.mo349c(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f26817a.mo347a(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f26817a.mo346a(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f26817a.mo343a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f26817a.mo344a(view, accessibilityEvent);
    }
}
