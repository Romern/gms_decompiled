package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: vh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C1431vh {

    /* renamed from: a */
    final Context f27368a;

    /* renamed from: b */
    public C1245ok f27369b;

    /* renamed from: c */
    public C1245ok f27370c;

    public C1431vh(Context context) {
        this.f27368a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo16183a(MenuItem menuItem) {
        if (!(menuItem instanceof C1181ma)) {
            return menuItem;
        }
        C1181ma maVar = (C1181ma) menuItem;
        if (this.f27369b == null) {
            this.f27369b = new C1245ok();
        }
        MenuItem menuItem2 = (MenuItem) this.f27369b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C1453wc wcVar = new C1453wc(this.f27368a, maVar);
        this.f27369b.put(maVar, wcVar);
        return wcVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo16184a(SubMenu subMenu) {
        if (!(subMenu instanceof C1182mb)) {
            return subMenu;
        }
        C1182mb mbVar = (C1182mb) subMenu;
        if (this.f27370c == null) {
            this.f27370c = new C1245ok();
        }
        SubMenu subMenu2 = (SubMenu) this.f27370c.get(mbVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C1467wq wqVar = new C1467wq(this.f27368a, mbVar);
        this.f27370c.put(mbVar, wqVar);
        return wqVar;
    }
}
