package p000;

import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.view.BottomNavMenuScrollView;

/* renamed from: ext */
final /* synthetic */ class C0975ext implements Runnable {

    /* renamed from: a */
    private final exv f15992a;

    /* renamed from: b */
    private final AccessibilityManager f15993b;

    public C0975ext(exv exv, AccessibilityManager accessibilityManager) {
        this.f15992a = exv;
        this.f15993b = accessibilityManager;
    }

    public final void run() {
        exv exv = this.f15992a;
        AccessibilityManager accessibilityManager = this.f15993b;
        exv.f15998c.f16004f.getLayoutParams().height = exv.f15998c.f16001c.getHeight();
        exv.f15998c.f16004f.requestLayout();
        exv.f15998c.f16002d.setVisibility(0);
        BottomNavMenuScrollView bottomNavMenuScrollView = exv.f15998c.f16003e;
        bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.f7782a);
        new adzt(Looper.getMainLooper()).postDelayed(new exu(exv, accessibilityManager), 500);
    }
}
