package p000;

import android.support.p002v7.widget.ActionMenuView;
import android.view.MenuItem;

/* renamed from: xl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1489xl implements C1441vr {

    /* renamed from: a */
    final /* synthetic */ ActionMenuView f27586a;

    public C1489xl(ActionMenuView actionMenuView) {
        this.f27586a = actionMenuView;
    }

    /* renamed from: a */
    public final void mo132a(C1443vt vtVar) {
        C1441vr vrVar = this.f27586a.f1166d;
        if (vrVar != null) {
            vrVar.mo132a(vtVar);
        }
    }

    /* renamed from: a */
    public final boolean mo133a(C1443vt vtVar, MenuItem menuItem) {
        adx adx;
        C0006ads ads = this.f27586a.f1167e;
        return (ads == null || (adx = ads.f292a.f1351q) == null || !adx.mo477a(menuItem)) ? false : true;
    }
}
