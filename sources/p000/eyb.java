package p000;

import com.google.android.gms.accountsettings.p007mg.poc.p008ui.view.BottomNavMenuScrollView;

/* renamed from: eyb */
public final /* synthetic */ class eyb implements Runnable {

    /* renamed from: a */
    private final BottomNavMenuScrollView f16022a;

    public eyb(BottomNavMenuScrollView bottomNavMenuScrollView) {
        this.f16022a = bottomNavMenuScrollView;
    }

    public final void run() {
        BottomNavMenuScrollView bottomNavMenuScrollView = this.f16022a;
        if (bottomNavMenuScrollView.f7784c) {
            bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.f7783b);
        } else {
            bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.f7782a);
        }
    }
}
