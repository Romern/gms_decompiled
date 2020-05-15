package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: wp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1466wp extends C1443vt implements SubMenu {

    /* renamed from: j */
    public final C1443vt f27526j;

    /* renamed from: k */
    public final C1446vw f27527k;

    public C1466wp(Context context, C1443vt vtVar, C1446vw vwVar) {
        super(context);
        this.f27526j = vtVar;
        this.f27527k = vwVar;
    }

    /* renamed from: a */
    public final String mo16218a() {
        C1446vw vwVar = this.f27527k;
        int i = vwVar != null ? vwVar.f27454a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    /* renamed from: b */
    public final boolean mo16243b() {
        return this.f27526j.mo16243b();
    }

    /* renamed from: c */
    public final boolean mo16246c() {
        return this.f27526j.mo16246c();
    }

    /* renamed from: d */
    public final boolean mo16251d() {
        return this.f27526j.mo16251d();
    }

    public final MenuItem getItem() {
        return this.f27527k;
    }

    /* renamed from: j */
    public final C1443vt mo16261j() {
        return this.f27526j.mo16261j();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.f27526j.setGroupDividerEnabled(z);
    }

    public final SubMenu setIcon(int i) {
        this.f27527k.setIcon(i);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.f27526j.setQwertyMode(z);
    }

    /* renamed from: a */
    public final void mo16223a(C1441vr vrVar) {
        this.f27526j.mo16223a(vrVar);
    }

    /* renamed from: b */
    public final boolean mo16244b(C1446vw vwVar) {
        return this.f27526j.mo16244b(vwVar);
    }

    public final SubMenu setHeaderIcon(int i) {
        super.mo16220a(0, null, i, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        super.mo16220a(i, null, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.mo16220a(0, null, 0, null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f27527k.setIcon(drawable);
        return this;
    }

    /* renamed from: a */
    public final boolean mo16229a(C1443vt vtVar, MenuItem menuItem) {
        return super.mo16229a(vtVar, menuItem) || this.f27526j.mo16229a(vtVar, menuItem);
    }

    /* renamed from: a */
    public final boolean mo16230a(C1446vw vwVar) {
        return this.f27526j.mo16230a(vwVar);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.mo16220a(0, null, 0, drawable, null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo16220a(0, charSequence, 0, null, null);
        return this;
    }
}
