package p000;

import android.content.Context;
import android.support.p002v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: ts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1388ts extends C1414ur implements C1441vr {

    /* renamed from: a */
    public final C1443vt f27156a;

    /* renamed from: b */
    public C1413uq f27157b;

    /* renamed from: c */
    final /* synthetic */ C1389tt f27158c;

    /* renamed from: f */
    private final Context f27159f;

    /* renamed from: g */
    private WeakReference f27160g;

    public C1388ts(C1389tt ttVar, Context context, C1413uq uqVar) {
        this.f27158c = ttVar;
        this.f27159f = context;
        this.f27157b = uqVar;
        C1443vt vtVar = new C1443vt(context);
        vtVar.mo16264m();
        this.f27156a = vtVar;
        vtVar.f27424b = this;
    }

    /* renamed from: a */
    public final MenuInflater mo16022a() {
        return new C1422uz(this.f27159f);
    }

    /* renamed from: b */
    public final Menu mo16027b() {
        return this.f27156a;
    }

    /* renamed from: c */
    public final void mo16030c() {
        C1389tt ttVar = this.f27158c;
        if (ttVar.f27171g == this) {
            if (!C1389tt.m20417a(ttVar.f27176l, ttVar.f27177m, false)) {
                C1389tt ttVar2 = this.f27158c;
                ttVar2.f27172h = this;
                ttVar2.f27173i = this.f27157b;
            } else {
                this.f27157b.mo15960a(this);
            }
            this.f27157b = null;
            this.f27158c.mo16037h(false);
            ActionBarContextView actionBarContextView = this.f27158c.f27169e;
            if (actionBarContextView.f1125i == null) {
                actionBarContextView.mo1240a();
            }
            this.f27158c.f27168d.mo486a().sendAccessibilityEvent(32);
            C1389tt ttVar3 = this.f27158c;
            ttVar3.f27166b.mo1260a(ttVar3.f27179o);
            this.f27158c.f27171g = null;
        }
    }

    /* renamed from: d */
    public final void mo16031d() {
        if (this.f27158c.f27171g == this) {
            this.f27156a.mo16252e();
            try {
                this.f27157b.mo15963b(this, this.f27156a);
            } finally {
                this.f27156a.mo16253f();
            }
        }
    }

    /* renamed from: e */
    public final CharSequence mo16032e() {
        return this.f27158c.f27169e.f1123g;
    }

    /* renamed from: f */
    public final CharSequence mo16033f() {
        return this.f27158c.f27169e.f1124h;
    }

    /* renamed from: g */
    public final boolean mo16034g() {
        return this.f27158c.f27169e.f1126j;
    }

    /* renamed from: h */
    public final View mo16035h() {
        WeakReference weakReference = this.f27160g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo16023a(int i) {
        mo16029b(this.f27158c.f27165a.getResources().getString(i));
    }

    /* renamed from: b */
    public final void mo16028b(int i) {
        mo16025a(this.f27158c.f27165a.getResources().getString(i));
    }

    /* renamed from: a */
    public final void mo16024a(View view) {
        this.f27158c.f27169e.mo1242a(view);
        this.f27160g = new WeakReference(view);
    }

    /* renamed from: b */
    public final void mo16029b(CharSequence charSequence) {
        this.f27158c.f27169e.mo1243a(charSequence);
    }

    /* renamed from: a */
    public final void mo16025a(CharSequence charSequence) {
        this.f27158c.f27169e.mo1247b(charSequence);
    }

    /* renamed from: a */
    public final void mo132a(C1443vt vtVar) {
        if (this.f27157b != null) {
            mo16031d();
            this.f27158c.f27169e.mo1246b();
        }
    }

    /* renamed from: a */
    public final void mo16026a(boolean z) {
        this.f27273e = z;
        this.f27158c.f27169e.mo1245a(z);
    }

    /* renamed from: a */
    public final boolean mo133a(C1443vt vtVar, MenuItem menuItem) {
        C1413uq uqVar = this.f27157b;
        if (uqVar != null) {
            return uqVar.mo15962a(this, menuItem);
        }
        return false;
    }
}
