package p000;

import android.view.MenuItem;
import com.google.android.gms.drive.p039ui.select.path.SearchPathElement;

/* renamed from: vmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vmw implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ vmy f49537a;

    public vmw(vmy vmy) {
        this.f49537a = vmy;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        if (!(this.f49537a.f49552h.mo18351b() instanceof SearchPathElement)) {
            return true;
        }
        vmy vmy = this.f49537a;
        vmy.f49552h.mo18348a(vmy.f49551g);
        return true;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
