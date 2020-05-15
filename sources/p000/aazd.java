package p000;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: aazd */
final /* synthetic */ class aazd implements View.OnScrollChangeListener {

    /* renamed from: a */
    private final AppBarLayout f56880a;

    public aazd(AppBarLayout appBarLayout) {
        this.f56880a = appBarLayout;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        this.f56880a.mo70974b(i2 != 0);
    }
}
