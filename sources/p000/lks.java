package p000;

import android.view.MenuItem;

/* renamed from: lks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lks implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ lkx f26266a;

    public lks(lkx lkx) {
        this.f26266a = lkx;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        this.f26266a.f26160b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerfilterQuery");
        return true;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
