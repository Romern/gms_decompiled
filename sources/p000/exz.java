package p000;

import com.google.android.gms.accountsettings.p007mg.poc.p008ui.view.BottomNavMenuScrollView;

/* renamed from: exz */
public final /* synthetic */ class exz implements Runnable {

    /* renamed from: a */
    private final BottomNavMenuScrollView f16010a;

    public exz(BottomNavMenuScrollView bottomNavMenuScrollView) {
        this.f16010a = bottomNavMenuScrollView;
    }

    public final void run() {
        BottomNavMenuScrollView bottomNavMenuScrollView = this.f16010a;
        if (!bottomNavMenuScrollView.f7784c) {
            bottomNavMenuScrollView.f7785d.f15982a.mo10568a(null);
        } else {
            bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.f7782a);
        }
    }
}
