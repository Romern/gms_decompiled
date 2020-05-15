package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: a */
    public final bhje f151020a;

    /* renamed from: b */
    public Drawable f151021b;

    /* renamed from: c */
    public int f151022c;

    /* renamed from: d */
    public C1296qh f151023d;

    /* renamed from: e */
    private boolean f151024e;

    /* renamed from: f */
    private int f151025f;

    /* renamed from: g */
    private Toolbar f151026g;

    /* renamed from: h */
    private View f151027h;

    /* renamed from: i */
    private View f151028i;

    /* renamed from: j */
    private int f151029j;

    /* renamed from: k */
    private int f151030k;

    /* renamed from: l */
    private int f151031l;

    /* renamed from: m */
    private int f151032m;

    /* renamed from: n */
    private final Rect f151033n;

    /* renamed from: o */
    private boolean f151034o;

    /* renamed from: p */
    private boolean f151035p;

    /* renamed from: q */
    private Drawable f151036q;

    /* renamed from: r */
    private int f151037r;

    /* renamed from: s */
    private boolean f151038s;

    /* renamed from: t */
    private ValueAnimator f151039t;

    /* renamed from: u */
    private long f151040u;

    /* renamed from: v */
    private int f151041v;

    /* renamed from: w */
    private bhdz f151042w;

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static bhej m117457a(View view) {
        bhej bhej = (bhej) view.getTag(C0126R.C0129id.view_offset_helper);
        if (bhej != null) {
            return bhej;
        }
        bhej bhej2 = new bhej(view);
        view.setTag(C0126R.C0129id.view_offset_helper, bhej2);
        return bhej2;
    }

    /* renamed from: b */
    protected static final bhec m117458b() {
        return new bhec();
    }

    /* renamed from: c */
    private static int m117459c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof bhec;
    }

    public final void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        m117460c();
        if (this.f151026g == null && (drawable = this.f151036q) != null && this.f151037r > 0) {
            drawable.mutate().setAlpha(this.f151037r);
            this.f151036q.draw(canvas);
        }
        if (this.f151034o && this.f151035p) {
            this.f151020a.mo63851a(canvas);
        }
        if (this.f151021b != null && this.f151037r > 0) {
            C1296qh qhVar = this.f151023d;
            if (qhVar != null) {
                i = qhVar.mo15733b();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f151021b.setBounds(0, -this.f151022c, getWidth(), i - this.f151022c);
                this.f151021b.mutate().setAlpha(this.f151037r);
                this.f151021b.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.f151036q;
        if (drawable == null || this.f151037r <= 0 || (!((view2 = this.f151027h) == null || view2 == this) ? view == view2 : view == this.f151026g)) {
            z = false;
        } else {
            drawable.mutate().setAlpha(this.f151037r);
            this.f151036q.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f151021b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f151036q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        bhje bhje = this.f151020a;
        if (bhje != null) {
            z |= bhje.mo63854a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, boolean):void
     arg types: [com.google.android.material.appbar.CollapsingToolbarLayout, boolean]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, int):void
      ps.b(android.view.View, boolean):void */
    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C1280ps.m19907b((View) this, C1280ps.m19938t((View) parent));
            if (this.f151042w == null) {
                this.f151042w = new bhed(this);
            }
            ((AppBarLayout) parent).mo70968a(this.f151042w);
            C1280ps.m19937s(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        bhdz bhdz = this.f151042w;
        if (bhdz != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo70973b(bhdz);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        C1296qh qhVar = this.f151023d;
        if (qhVar != null) {
            int b = qhVar.mo15733b();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (!C1280ps.m19938t(childAt) && childAt.getTop() < b) {
                    C1280ps.m19922g(childAt, b);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            m117457a(getChildAt(i10)).mo63603a();
        }
        if (this.f151034o && (view = this.f151028i) != null) {
            if (!C1280ps.m19871F(view) || this.f151028i.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f151035p = z2;
            if (z2) {
                int h = C1280ps.m19923h(this);
                View view2 = this.f151027h;
                if (view2 == null) {
                    view2 = this.f151026g;
                }
                int b2 = mo71000b(view2);
                bhjf.m101008a(this, this.f151028i, this.f151033n);
                bhje bhje = this.f151020a;
                int i11 = this.f151033n.left;
                if (h == 1) {
                    i5 = this.f151026g.f1346l;
                } else {
                    i5 = this.f151026g.f1345k;
                }
                int i12 = i11 + i5;
                int i13 = this.f151033n.top + b2 + this.f151026g.f1347m;
                int i14 = this.f151033n.right;
                if (h == 1) {
                    i6 = this.f151026g.f1345k;
                } else {
                    i6 = this.f151026g.f1346l;
                }
                bhje.mo63858b(i12, i13, i14 + i6, (this.f151033n.bottom + b2) - this.f151026g.f1348n);
                bhje bhje2 = this.f151020a;
                if (h != 1) {
                    i7 = this.f151029j;
                } else {
                    i7 = this.f151031l;
                }
                int i15 = this.f151033n.top + this.f151030k;
                int i16 = i3 - i;
                if (h != 1) {
                    i8 = this.f151031l;
                } else {
                    i8 = this.f151029j;
                }
                bhje2.mo63848a(i7, i15, i16 - i8, (i4 - i2) - this.f151032m);
                this.f151020a.mo63866e();
            }
        }
        if (this.f151026g != null) {
            if (this.f151034o && TextUtils.isEmpty(this.f151020a.f118810f)) {
                mo70999a(this.f151026g.mo1693f());
            }
            View view3 = this.f151027h;
            if (view3 == null || view3 == this) {
                setMinimumHeight(m117459c(this.f151026g));
            } else {
                setMinimumHeight(m117459c(view3));
            }
        }
        mo70997a();
        int childCount3 = getChildCount();
        for (int i17 = 0; i17 < childCount3; i17++) {
            m117457a(getChildAt(i17)).mo63605b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        m117460c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C1296qh qhVar = this.f151023d;
        if (qhVar != null) {
            i3 = qhVar.mo15733b();
        } else {
            i3 = 0;
        }
        if (mode == 0 && i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, JGCastService.FLAG_PRIVATE_DISPLAY));
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f151036q;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f151021b;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f151021b.setVisible(z, false);
        }
        Drawable drawable2 = this.f151036q;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f151036q.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f151036q || drawable == this.f151021b;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final int mo71000b(View view) {
        return ((getHeight() - m117457a(view).f118383a) - view.getHeight()) - ((bhec) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new bhec(layoutParams);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019307), attributeSet, i);
        Drawable drawable;
        boolean z = true;
        this.f151024e = true;
        this.f151033n = new Rect();
        this.f151041v = -1;
        Context context2 = getContext();
        bhje bhje = new bhje(this);
        this.f151020a = bhje;
        bhje.mo63849a(bhdl.f118331e);
        TypedArray a = bhki.m101052a(context2, attributeSet, bheh.f118378c, i, 2132019307, new int[0]);
        this.f151020a.mo63847a(a.getInt(3, 8388691));
        this.f151020a.mo63857b(a.getInt(0, 8388627));
        int dimensionPixelSize = a.getDimensionPixelSize(4, 0);
        this.f151032m = dimensionPixelSize;
        this.f151031l = dimensionPixelSize;
        this.f151030k = dimensionPixelSize;
        this.f151029j = dimensionPixelSize;
        if (a.hasValue(7)) {
            this.f151029j = a.getDimensionPixelSize(7, 0);
        }
        if (a.hasValue(6)) {
            this.f151031l = a.getDimensionPixelSize(6, 0);
        }
        if (a.hasValue(8)) {
            this.f151030k = a.getDimensionPixelSize(8, 0);
        }
        if (a.hasValue(5)) {
            this.f151032m = a.getDimensionPixelSize(5, 0);
        }
        this.f151034o = a.getBoolean(15, true);
        mo70999a(a.getText(14));
        this.f151020a.mo63865d(2132018390);
        this.f151020a.mo63863c(2132018364);
        if (a.hasValue(9)) {
            this.f151020a.mo63865d(a.getResourceId(9, 0));
        }
        if (a.hasValue(1)) {
            this.f151020a.mo63863c(a.getResourceId(1, 0));
        }
        this.f151041v = a.getDimensionPixelSize(12, -1);
        if (a.hasValue(10)) {
            bhje bhje2 = this.f151020a;
            int i2 = a.getInt(10, 1);
            if (i2 != bhje2.f118814j) {
                bhje2.f118814j = i2;
                bhje2.mo63866e();
            }
        }
        this.f151040u = (long) a.getInt(11, 600);
        Drawable drawable2 = a.getDrawable(2);
        Drawable drawable3 = this.f151036q;
        Drawable drawable4 = null;
        if (drawable3 != drawable2) {
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (drawable2 != null) {
                drawable = drawable2.mutate();
            } else {
                drawable = null;
            }
            this.f151036q = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                this.f151036q.setCallback(this);
                this.f151036q.setAlpha(this.f151037r);
            }
            C1280ps.m19915e(this);
        }
        Drawable drawable5 = a.getDrawable(13);
        Drawable drawable6 = this.f151021b;
        if (drawable6 != drawable5) {
            if (drawable6 != null) {
                drawable6.setCallback(null);
            }
            drawable4 = drawable5 != null ? drawable5.mutate() : drawable4;
            this.f151021b = drawable4;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f151021b.setState(getDrawableState());
                }
                C1173lt.m19608b(this.f151021b, C1280ps.m19923h(this));
                this.f151021b.setVisible(getVisibility() != 0 ? false : z, false);
                this.f151021b.setCallback(this);
                this.f151021b.setAlpha(this.f151037r);
            }
            C1280ps.m19915e(this);
        }
        this.f151025f = a.getResourceId(16, -1);
        a.recycle();
        setWillNotDraw(false);
        C1280ps.m19895a(this, new bhea(this));
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:46:0x0028 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:45:0x0028 */
    /* renamed from: c */
    private final void m117460c() {
        View view;
        if (this.f151024e) {
            Toolbar toolbar = null;
            this.f151026g = null;
            this.f151027h = null;
            int i = this.f151025f;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.f151026g = toolbar2;
                if (toolbar2 != null) {
                    ViewParent parent = toolbar2.getParent();
                    View view2 = toolbar2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                        parent = parent.getParent();
                        view2 = view2;
                    }
                    this.f151027h = view2;
                }
            }
            if (this.f151026g == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.f151026g = toolbar;
            }
            if (!this.f151034o && (view = this.f151028i) != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.f151028i);
                }
            }
            if (this.f151034o && this.f151026g != null) {
                if (this.f151028i == null) {
                    this.f151028i = new View(getContext());
                }
                if (this.f151028i.getParent() == null) {
                    this.f151026g.addView(this.f151028i, -1, -1);
                }
            }
            this.f151024e = false;
        }
    }

    /* renamed from: a */
    public final void mo70997a() {
        boolean z;
        boolean z2;
        int i;
        if (this.f151036q != null || this.f151021b != null) {
            int height = getHeight() + this.f151022c;
            int i2 = this.f151041v;
            int i3 = 0;
            if (i2 < 0) {
                C1296qh qhVar = this.f151023d;
                if (qhVar != null) {
                    i = qhVar.mo15733b();
                } else {
                    i = 0;
                }
                int l = C1280ps.m19930l(this);
                if (l > 0) {
                    i2 = Math.min(l + l + i, getHeight());
                } else {
                    i2 = getHeight() / 3;
                }
            }
            if (height < i2) {
                z = true;
            } else {
                z = false;
            }
            if (!C1280ps.m19868C(this) || isInEditMode()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f151038s != z) {
                int i4 = 255;
                if (!z2) {
                    if (height < i2) {
                        i3 = 255;
                    }
                    mo70998a(i3);
                } else {
                    if (height >= i2) {
                        i4 = 0;
                    }
                    m117460c();
                    ValueAnimator valueAnimator = this.f151039t;
                    if (valueAnimator == null) {
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        this.f151039t = valueAnimator2;
                        valueAnimator2.setDuration(this.f151040u);
                        this.f151039t.setInterpolator(i4 > this.f151037r ? bhdl.f118329c : bhdl.f118330d);
                        this.f151039t.addUpdateListener(new bheb(this));
                    } else if (valueAnimator.isRunning()) {
                        this.f151039t.cancel();
                    }
                    this.f151039t.setIntValues(this.f151037r, i4);
                    this.f151039t.start();
                }
                this.f151038s = z;
            }
        }
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bhec(getContext(), attributeSet);
    }

    /* renamed from: a */
    public final void mo70998a(int i) {
        Toolbar toolbar;
        if (i != this.f151037r) {
            if (!(this.f151036q == null || (toolbar = this.f151026g) == null)) {
                C1280ps.m19915e(toolbar);
            }
            this.f151037r = i;
            C1280ps.m19915e(this);
        }
    }

    /* renamed from: a */
    public final void mo70999a(CharSequence charSequence) {
        CharSequence charSequence2;
        this.f151020a.mo63860b(charSequence);
        if (this.f151034o) {
            charSequence2 = this.f151020a.f118810f;
        } else {
            charSequence2 = null;
        }
        setContentDescription(charSequence2);
    }
}
