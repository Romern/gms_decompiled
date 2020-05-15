package p000;

import android.view.MenuItem;

/* renamed from: wb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1452wb implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C1453wc f27487a;

    /* renamed from: b */
    private final MenuItem.OnMenuItemClickListener f27488b;

    public C1452wb(C1453wc wcVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f27487a = wcVar;
        this.f27488b = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f27488b.onMenuItemClick(this.f27487a.mo16183a(menuItem));
    }
}
