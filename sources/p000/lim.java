package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: lim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class lim {

    /* renamed from: a */
    public final lir f26159a;

    /* renamed from: b */
    public final Bundle f26160b;

    /* renamed from: c */
    public final bngx f26161c;

    protected lim(lir lir, Bundle bundle, bngx bngx) {
        this.f26159a = lir;
        this.f26160b = bundle;
        this.f26161c = bngx;
    }

    /* renamed from: a */
    public void mo15164a() {
    }

    /* renamed from: a */
    public void mo15166a(int i, int i2, Intent intent) {
    }

    /* renamed from: b */
    public void mo15171b() {
    }

    /* renamed from: c */
    public void mo15172c() {
    }

    /* renamed from: d */
    public void mo15173d() {
    }

    /* renamed from: e */
    public void mo15174e() {
    }

    /* renamed from: f */
    public void mo15175f() {
    }

    /* renamed from: g */
    public void mo15176g() {
        mo15165a(0);
    }

    /* renamed from: a */
    public final void mo15165a(int i) {
        mo15167a(i, null);
    }

    /* renamed from: a */
    public void mo15167a(int i, Intent intent) {
        mo15168a(i, intent, 0);
    }

    /* renamed from: a */
    public void mo15168a(int i, Intent intent, int i2) {
        this.f26159a.mo15178a(i, intent);
        bnre i3 = this.f26161c.listIterator();
        while (i3.hasNext()) {
            ((lil) i3.next()).mo14922a(i, i2);
        }
    }

    /* renamed from: a */
    public boolean mo15169a(Menu menu) {
        return this.f26159a.mo15179a(menu);
    }

    /* renamed from: a */
    public boolean mo15170a(MenuItem menuItem) {
        return this.f26159a.mo15180a(menuItem);
    }
}
