package p000;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* renamed from: vx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C1447vx extends C1252or {

    /* renamed from: b */
    final ActionProvider f27480b;

    /* renamed from: c */
    final /* synthetic */ C1453wc f27481c;

    public C1447vx(C1453wc wcVar, ActionProvider actionProvider) {
        this.f27481c = wcVar;
        this.f27480b = actionProvider;
    }

    /* renamed from: a */
    public final View mo15660a() {
        return this.f27480b.onCreateActionView();
    }

    /* renamed from: d */
    public final boolean mo15666d() {
        return this.f27480b.onPerformDefaultAction();
    }

    /* renamed from: e */
    public final boolean mo15667e() {
        return this.f27480b.hasSubMenu();
    }

    /* renamed from: a */
    public final void mo15662a(SubMenu subMenu) {
        this.f27480b.onPrepareSubMenu(this.f27481c.mo16184a(subMenu));
    }
}
