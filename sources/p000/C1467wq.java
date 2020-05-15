package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: wq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1467wq extends C1461wk implements SubMenu {

    /* renamed from: d */
    private final C1182mb f27528d;

    public C1467wq(Context context, C1182mb mbVar) {
        super(context, mbVar);
        this.f27528d = mbVar;
    }

    public final void clearHeader() {
        this.f27528d.clearHeader();
    }

    public final MenuItem getItem() {
        return mo16183a(this.f27528d.getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        this.f27528d.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.f27528d.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f27528d.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f27528d.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f27528d.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f27528d.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f27528d.setIcon(drawable);
        return this;
    }
}
