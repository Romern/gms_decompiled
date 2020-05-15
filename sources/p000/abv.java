package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: abv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class abv extends ViewGroup.MarginLayoutParams {

    /* renamed from: c */
    public acm f129c;

    /* renamed from: d */
    public final Rect f130d = new Rect();

    /* renamed from: e */
    public boolean f131e = true;

    /* renamed from: f */
    boolean f132f = false;

    public abv(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public final boolean mo256a() {
        return this.f129c.mo333n();
    }

    /* renamed from: b */
    public final boolean mo257b() {
        return this.f129c.mo341u();
    }

    /* renamed from: c */
    public final int mo258c() {
        return this.f129c.mo322c();
    }

    public abv(abv abv) {
        super((ViewGroup.LayoutParams) abv);
    }

    public abv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abv(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public abv(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
