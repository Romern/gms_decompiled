package p000;

import com.google.android.gms.accountsettings.p007mg.poc.p008ui.view.BottomNavMenuScrollView;

/* renamed from: eya */
public final /* synthetic */ class eya implements Runnable {

    /* renamed from: a */
    private final BottomNavMenuScrollView f16021a;

    public eya(BottomNavMenuScrollView bottomNavMenuScrollView) {
        this.f16021a = bottomNavMenuScrollView;
    }

    public final void run() {
        BottomNavMenuScrollView bottomNavMenuScrollView = this.f16021a;
        bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.f7782a);
    }
}
