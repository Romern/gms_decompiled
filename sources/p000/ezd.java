package p000;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: ezd */
final /* synthetic */ class ezd implements bhdz {

    /* renamed from: a */
    private final ezm f16082a;

    /* renamed from: b */
    private final CoordinatorLayout f16083b;

    public ezd(ezm ezm, CoordinatorLayout coordinatorLayout) {
        this.f16082a = ezm;
        this.f16083b = coordinatorLayout;
    }

    /* renamed from: a */
    public final void mo10589a(AppBarLayout appBarLayout, int i) {
        ezm ezm = this.f16082a;
        CoordinatorLayout coordinatorLayout = this.f16083b;
        if (ezm.getContext() != null) {
            if (i == 0 || Math.abs(i) == appBarLayout.mo70975c()) {
                coordinatorLayout.mo1871a(appBarLayout);
            }
            if (((double) Math.abs(((float) i) / ((float) appBarLayout.mo70975c()))) < 0.5d) {
                ezm.mo10623a(ezm.f16103d, null, null);
                ezm.mo10623a(ezm.f16105f, ezm.f16107h, ezm.f16108i);
                return;
            }
            ezm.mo10623a(ezm.f16103d, new eza(ezm), ezm.getString(C0126R.string.as_account_spinner_a11y_tap_action));
            ezm.mo10623a(ezm.f16105f, null, null);
        }
    }
}
