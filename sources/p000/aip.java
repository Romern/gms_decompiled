package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: aip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aip extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public aim f596a;

    /* renamed from: b */
    public boolean f597b = false;

    /* renamed from: c */
    public int f598c = 0;

    /* renamed from: d */
    public int f599d = 0;

    /* renamed from: e */
    public int f600e = -1;

    /* renamed from: f */
    public int f601f = -1;

    /* renamed from: g */
    public int f602g = 0;

    /* renamed from: h */
    public int f603h = 0;

    /* renamed from: i */
    public int f604i;

    /* renamed from: j */
    public int f605j;

    /* renamed from: k */
    public View f606k;

    /* renamed from: l */
    public View f607l;

    /* renamed from: m */
    public boolean f608m;

    /* renamed from: n */
    public boolean f609n;

    /* renamed from: o */
    public final Rect f610o = new Rect();

    /* renamed from: p */
    private boolean f611p;

    /* renamed from: q */
    private boolean f612q;

    public aip() {
        super(-2, -2);
    }

    /* renamed from: a */
    public final void mo785a() {
        this.f609n = false;
    }

    /* renamed from: a */
    public final void mo786a(int i, boolean z) {
        if (i == 0) {
            this.f611p = z;
        } else if (i == 1) {
            this.f612q = z;
        }
    }

    /* renamed from: a */
    public final boolean mo788a(int i) {
        if (i == 0) {
            return this.f611p;
        }
        if (i != 1) {
            return false;
        }
        return this.f612q;
    }

    public aip(aip aip) {
        super((ViewGroup.MarginLayoutParams) aip);
    }

    /* renamed from: a */
    public final void mo787a(aim aim) {
        aim aim2 = this.f596a;
        if (aim2 != aim) {
            if (aim2 != null) {
                aim2.mo763a();
            }
            this.f596a = aim;
            this.f597b = true;
            if (aim != null) {
                aim.mo764a(this);
            }
        }
    }

    public aip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aij.f593b);
        this.f598c = obtainStyledAttributes.getInteger(0, 0);
        this.f601f = obtainStyledAttributes.getResourceId(1, -1);
        this.f599d = obtainStyledAttributes.getInteger(2, 0);
        this.f600e = obtainStyledAttributes.getInteger(6, -1);
        this.f602g = obtainStyledAttributes.getInt(5, 0);
        this.f603h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f597b = hasValue;
        if (hasValue) {
            this.f596a = CoordinatorLayout.m1455a(context, attributeSet, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        aim aim = this.f596a;
        if (aim != null) {
            aim.mo764a(this);
        }
    }

    public aip(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public aip(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
