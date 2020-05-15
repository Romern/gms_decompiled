package p000;

import android.view.MenuItem;

/* renamed from: wa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1451wa implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ C1453wc f27485a;

    /* renamed from: b */
    private final MenuItem.OnActionExpandListener f27486b;

    public C1451wa(C1453wc wcVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f27485a = wcVar;
        this.f27486b = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f27486b.onMenuItemActionCollapse(this.f27485a.mo16183a(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f27486b.onMenuItemActionExpand(this.f27485a.mo16183a(menuItem));
    }
}
