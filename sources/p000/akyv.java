package p000;

import android.view.View;
import com.google.android.gms.octarine.p057ui.OctarineWebviewChimeraActivity;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: akyv */
public final /* synthetic */ class akyv implements View.OnScrollChangeListener {

    /* renamed from: a */
    private final OctarineWebviewChimeraActivity f73142a;

    public akyv(OctarineWebviewChimeraActivity octarineWebviewChimeraActivity) {
        this.f73142a = octarineWebviewChimeraActivity;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        boolean z;
        alaf alaf = this.f73142a.f81389N;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (cfri.m142694e()) {
            View view2 = alaf.f73213g;
            if (view2 instanceof AppBarLayout) {
                ((AppBarLayout) view2).mo70974b(z);
            }
        }
    }
}
