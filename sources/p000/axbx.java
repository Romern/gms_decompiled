package p000;

import com.google.android.gms.wallet.p088ui.component.pageheader.PageHeaderView;

/* renamed from: axbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PageHeaderView f95742a;

    public axbx(PageHeaderView pageHeaderView) {
        this.f95742a = pageHeaderView;
    }

    public final void run() {
        PageHeaderView pageHeaderView = this.f95742a;
        pageHeaderView.f110582b.getLocationOnScreen(pageHeaderView.f110585e);
        PageHeaderView pageHeaderView2 = this.f95742a;
        int[] iArr = pageHeaderView2.f110584d;
        if (iArr[0] == 0) {
            pageHeaderView2.f110583c.getLocationOnScreen(iArr);
        }
        PageHeaderView pageHeaderView3 = this.f95742a;
        pageHeaderView3.f110583c.setTranslationX((float) (pageHeaderView3.f110585e[0] - pageHeaderView3.f110584d[0]));
        PageHeaderView pageHeaderView4 = this.f95742a;
        pageHeaderView4.f110583c.setTranslationY((float) Math.max(0, pageHeaderView4.f110585e[1] - pageHeaderView4.f110584d[1]));
        this.f95742a.f110583c.setVisibility(0);
    }
}
