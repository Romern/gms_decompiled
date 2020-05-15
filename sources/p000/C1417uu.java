package p000;

import android.content.Context;
import android.support.p002v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: uu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1417uu extends C1414ur implements C1441vr {

    /* renamed from: a */
    public final C1443vt f27279a;

    /* renamed from: b */
    private final Context f27280b;

    /* renamed from: c */
    private final ActionBarContextView f27281c;

    /* renamed from: f */
    private final C1413uq f27282f;

    /* renamed from: g */
    private WeakReference f27283g;

    /* renamed from: h */
    private boolean f27284h;

    public C1417uu(Context context, ActionBarContextView actionBarContextView, C1413uq uqVar) {
        this.f27280b = context;
        this.f27281c = actionBarContextView;
        this.f27282f = uqVar;
        C1443vt vtVar = new C1443vt(actionBarContextView.getContext());
        vtVar.mo16264m();
        this.f27279a = vtVar;
        vtVar.f27424b = this;
    }

    /* renamed from: a */
    public final MenuInflater mo16022a() {
        return new C1422uz(this.f27281c.getContext());
    }

    /* renamed from: b */
    public final Menu mo16027b() {
        return this.f27279a;
    }

    /* renamed from: c */
    public final void mo16030c() {
        if (!this.f27284h) {
            this.f27284h = true;
            this.f27281c.sendAccessibilityEvent(32);
            this.f27282f.mo15960a(this);
        }
    }

    /* renamed from: d */
    public final void mo16031d() {
        this.f27282f.mo15963b(this, this.f27279a);
    }

    /* renamed from: e */
    public final CharSequence mo16032e() {
        return this.f27281c.f1123g;
    }

    /* renamed from: f */
    public final CharSequence mo16033f() {
        return this.f27281c.f1124h;
    }

    /* renamed from: g */
    public final boolean mo16034g() {
        return this.f27281c.f1126j;
    }

    /* renamed from: h */
    public final View mo16035h() {
        WeakReference weakReference = this.f27283g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo16023a(int i) {
        mo16029b(this.f27280b.getString(i));
    }

    /* renamed from: b */
    public final void mo16028b(int i) {
        mo16025a(this.f27280b.getString(i));
    }

    /* renamed from: a */
    public final void mo16024a(View view) {
        this.f27281c.mo1242a(view);
        this.f27283g = view != null ? new WeakReference(view) : null;
    }

    /* renamed from: b */
    public final void mo16029b(CharSequence charSequence) {
        this.f27281c.mo1243a(charSequence);
    }

    /* renamed from: a */
    public final void mo16025a(CharSequence charSequence) {
        this.f27281c.mo1247b(charSequence);
    }

    /* renamed from: a */
    public final void mo132a(C1443vt vtVar) {
        mo16031d();
        this.f27281c.mo1246b();
    }

    /* renamed from: a */
    public final void mo16026a(boolean z) {
        this.f27273e = z;
        this.f27281c.mo1245a(z);
    }

    /* renamed from: a */
    public final boolean mo133a(C1443vt vtVar, MenuItem menuItem) {
        return this.f27282f.mo15962a(this, menuItem);
    }
}
