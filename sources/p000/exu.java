package p000;

import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.view.BottomNavMenuScrollView;

/* renamed from: exu */
final /* synthetic */ class exu implements Runnable {

    /* renamed from: a */
    private final exv f15994a;

    /* renamed from: b */
    private final AccessibilityManager f15995b;

    public exu(exv exv, AccessibilityManager accessibilityManager) {
        this.f15994a = exv;
        this.f15995b = accessibilityManager;
    }

    public final void run() {
        exv exv = this.f15994a;
        AccessibilityManager accessibilityManager = this.f15995b;
        BottomNavMenuScrollView bottomNavMenuScrollView = exv.f15998c.f16003e;
        bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.f7782a);
        exx exx = exv.f15998c;
        ffp.m11618a(exx.f16004f, accessibilityManager, exx.f16007i);
        if (exv.f15998c.f16005g.getChildCount() > 0) {
            exv.f15998c.f16005g.getChildAt(0).requestFocus();
        }
    }
}
