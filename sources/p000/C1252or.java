package p000;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: or */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1252or {

    /* renamed from: a */
    public C1445vv f26821a;

    /* renamed from: a */
    public abstract View mo15660a();

    /* renamed from: a */
    public View mo15661a(MenuItem menuItem) {
        return mo15660a();
    }

    /* renamed from: a */
    public void mo15662a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo15664b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo15665c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo15666d() {
        throw null;
    }

    /* renamed from: e */
    public boolean mo15667e() {
        throw null;
    }

    /* renamed from: a */
    public void mo15663a(C1445vv vvVar) {
        if (this.f26821a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f26821a = vvVar;
    }
}
