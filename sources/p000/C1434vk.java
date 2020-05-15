package p000;

import android.view.MenuItem;

/* renamed from: vk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1434vk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1436vm f27373a;

    /* renamed from: b */
    final /* synthetic */ MenuItem f27374b;

    /* renamed from: c */
    final /* synthetic */ C1443vt f27375c;

    /* renamed from: d */
    final /* synthetic */ C1435vl f27376d;

    public C1434vk(C1435vl vlVar, C1436vm vmVar, MenuItem menuItem, C1443vt vtVar) {
        this.f27376d = vlVar;
        this.f27373a = vmVar;
        this.f27374b = menuItem;
        this.f27375c = vtVar;
    }

    public final void run() {
        C1436vm vmVar = this.f27373a;
        if (vmVar != null) {
            this.f27376d.f27377a.f27386f = true;
            vmVar.f27379b.mo16226a(false);
            this.f27376d.f27377a.f27386f = false;
        }
        if (this.f27374b.isEnabled() && this.f27374b.hasSubMenu()) {
            this.f27375c.mo16227a(this.f27374b, 4);
        }
    }
}
