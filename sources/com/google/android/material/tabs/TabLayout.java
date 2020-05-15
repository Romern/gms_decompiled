package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@avm
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: B */
    public static final /* synthetic */ int f151230B = 0;

    /* renamed from: a */
    private static final int f151231a = 2132019313;

    /* renamed from: b */
    private static final C1241og f151232b = new C1243oi(16);

    /* renamed from: A */
    public ViewPager f151233A;

    /* renamed from: C */
    private bhnu f151234C;

    /* renamed from: D */
    private final int f151235D;

    /* renamed from: E */
    private final int f151236E;

    /* renamed from: F */
    private final int f151237F;

    /* renamed from: G */
    private int f151238G;

    /* renamed from: H */
    private final ArrayList f151239H;

    /* renamed from: I */
    private ValueAnimator f151240I;

    /* renamed from: J */
    private avh f151241J;

    /* renamed from: K */
    private DataSetObserver f151242K;

    /* renamed from: L */
    private bhnv f151243L;

    /* renamed from: M */
    private bhnp f151244M;

    /* renamed from: N */
    private boolean f151245N;

    /* renamed from: O */
    private final C1241og f151246O;

    /* renamed from: P */
    private bhny f151247P;

    /* renamed from: c */
    public final ArrayList f151248c;

    /* renamed from: d */
    public final RectF f151249d;

    /* renamed from: e */
    final bhnt f151250e;

    /* renamed from: f */
    public int f151251f;

    /* renamed from: g */
    public int f151252g;

    /* renamed from: h */
    public int f151253h;

    /* renamed from: i */
    public int f151254i;

    /* renamed from: j */
    public int f151255j;

    /* renamed from: k */
    public ColorStateList f151256k;

    /* renamed from: l */
    public ColorStateList f151257l;

    /* renamed from: m */
    public ColorStateList f151258m;

    /* renamed from: n */
    public Drawable f151259n;

    /* renamed from: o */
    public PorterDuff.Mode f151260o;

    /* renamed from: p */
    public float f151261p;

    /* renamed from: q */
    public float f151262q;

    /* renamed from: r */
    public final int f151263r;

    /* renamed from: s */
    public int f151264s;

    /* renamed from: t */
    public int f151265t;

    /* renamed from: u */
    int f151266u;

    /* renamed from: v */
    public int f151267v;

    /* renamed from: w */
    public int f151268w;

    /* renamed from: x */
    public boolean f151269x;

    /* renamed from: y */
    public boolean f151270y;

    /* renamed from: z */
    public boolean f151271z;

    public TabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final int m117609a(int i, float f) {
        View view;
        int i2;
        int i3 = this.f151268w;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.f151250e.getChildAt(i);
        int i5 = i + 1;
        if (i5 < this.f151250e.getChildCount()) {
            view = this.f151250e.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i6 = (int) (((float) (i2 + i4)) * 0.5f * f);
        return C1280ps.m19923h(this) != 0 ? left - i6 : left + i6;
    }

    /* renamed from: a */
    private final void m117611a(LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.f151268w == 1 && this.f151265t == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0 != 2) goto L_0x0050;
     */
    /* renamed from: e */
    private final void m117613e() {
        int i;
        int i2 = this.f151268w;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f151238G - this.f151251f);
        } else {
            i = 0;
        }
        C1280ps.m19885a(this.f151250e, i, 0, 0, 0);
        int i3 = this.f151268w;
        if (i3 == 0) {
            int i4 = this.f151265t;
            if (i4 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i4 == 1) {
                this.f151250e.setGravity(1);
            }
            this.f151250e.setGravity(8388611);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f151265t == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f151250e.setGravity(1);
        }
        mo71222a(true);
    }

    /* renamed from: f */
    private final int m117615f() {
        int i = this.f151235D;
        if (i != -1) {
            return i;
        }
        int i2 = this.f151268w;
        if (i2 == 0 || i2 == 2) {
            return this.f151237F;
        }
        return 0;
    }

    public final void addView(View view) {
        m117610a(view);
    }

    /* renamed from: b */
    public final int mo71227b() {
        return this.f151248c.size();
    }

    /* renamed from: c */
    public final int mo71230c() {
        bhnu bhnu = this.f151234C;
        if (bhnu != null) {
            return bhnu.f119165d;
        }
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.tabs.TabLayout.a(bhnu, boolean):void
     arg types: [bhnu, int]
     candidates:
      com.google.android.material.tabs.TabLayout.a(int, float):int
      com.google.android.material.tabs.TabLayout.a(androidx.viewpager.widget.ViewPager, boolean):void
      com.google.android.material.tabs.TabLayout.a(avh, boolean):void
      com.google.android.material.tabs.TabLayout.a(bhnu, boolean):void */
    /* renamed from: d */
    public final void mo71232d() {
        int i;
        for (int childCount = this.f151250e.getChildCount() - 1; childCount >= 0; childCount--) {
            bhnx bhnx = (bhnx) this.f151250e.getChildAt(childCount);
            this.f151250e.removeViewAt(childCount);
            if (bhnx != null) {
                bhnx.mo64066a((bhnu) null);
                bhnx.setSelected(false);
                this.f151246O.mo8189a(bhnx);
            }
            requestLayout();
        }
        Iterator it = this.f151248c.iterator();
        while (it.hasNext()) {
            bhnu bhnu = (bhnu) it.next();
            it.remove();
            bhnu.f119168g = null;
            bhnu.f119169h = null;
            bhnu.f119162a = null;
            bhnu.f119163b = null;
            bhnu.f119164c = null;
            bhnu.f119165d = -1;
            bhnu.f119166e = null;
            f151232b.mo8189a(bhnu);
        }
        this.f151234C = null;
        avh avh = this.f151241J;
        if (avh != null) {
            int a = avh.mo2709a();
            for (int i2 = 0; i2 < a; i2++) {
                bhnu a2 = mo71215a();
                CharSequence c = this.f151241J.mo2719c(i2);
                if (TextUtils.isEmpty(a2.f119164c) && !TextUtils.isEmpty(c)) {
                    a2.f119169h.setContentDescription(c);
                }
                a2.f119163b = c;
                a2.mo64063b();
                mo71221a(a2, false);
            }
            ViewPager viewPager = this.f151233A;
            if (viewPager != null && a > 0 && (i = viewPager.f1754c) != mo71230c() && i < mo71227b()) {
                mo71220a(mo71216a(i));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.tabs.TabLayout.a(androidx.viewpager.widget.ViewPager, boolean):void
     arg types: [androidx.viewpager.widget.ViewPager, int]
     candidates:
      com.google.android.material.tabs.TabLayout.a(int, float):int
      com.google.android.material.tabs.TabLayout.a(avh, boolean):void
      com.google.android.material.tabs.TabLayout.a(bhnu, boolean):void
      com.google.android.material.tabs.TabLayout.a(androidx.viewpager.widget.ViewPager, boolean):void */
    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhls.m101141a(this);
        if (this.f151233A == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m117612a((ViewPager) parent, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f151245N) {
            mo71218a((ViewPager) null);
            this.f151245N = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        bhnx bhnx;
        Drawable drawable;
        for (int i = 0; i < this.f151250e.getChildCount(); i++) {
            View childAt = this.f151250e.getChildAt(i);
            if ((childAt instanceof bhnx) && (drawable = (bhnx = (bhnx) childAt).f119176c) != null) {
                drawable.setBounds(bhnx.getLeft(), bhnx.getTop(), bhnx.getRight(), bhnx.getBottom());
                bhnx.f119176c.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1301qm.m20017a(accessibilityNodeInfo).mo15756a(C1299qk.m20013a(1, mo71227b(), 1));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        Context context = getContext();
        int size = this.f151248c.size();
        int i4 = 0;
        while (true) {
            i3 = 48;
            if (i4 >= size) {
                break;
            }
            bhnu bhnu = (bhnu) this.f151248c.get(i4);
            if (bhnu == null || bhnu.f119162a == null || TextUtils.isEmpty(bhnu.f119163b)) {
                i4++;
            } else if (!this.f151269x) {
                i3 = 72;
            }
        }
        int round = Math.round(bhkn.m101061a(context, i3));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), JGCastService.FLAG_PRIVATE_DISPLAY);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i5 = this.f151236E;
            if (i5 <= 0) {
                i5 = (int) (((float) size2) - bhkn.m101061a(getContext(), 56));
            }
            this.f151264s = i5;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i6 = this.f151268w;
            if (i6 != 0) {
                if (i6 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                } else if (i6 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        bhls.m101142a(this, f);
    }

    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.f151250e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.tabStyle);
    }

    /* renamed from: f */
    private final void m117616f(int i) {
        int childCount = this.f151250e.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f151250e.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void addView(View view, int i) {
        m117610a(view);
    }

    /* renamed from: b */
    public final void mo71228b(int i) {
        if (i != this.f151268w) {
            this.f151268w = i;
            m117613e();
        }
    }

    /* renamed from: c */
    public final void mo71231c(int i) {
        if (this.f151265t != i) {
            this.f151265t = i;
            m117613e();
        }
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, f151231a), attributeSet, i);
        this.f151248c = new ArrayList();
        this.f151249d = new RectF();
        this.f151264s = Integer.MAX_VALUE;
        this.f151239H = new ArrayList();
        this.f151246O = new C1242oh(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        bhnt bhnt = new bhnt(this, context2);
        this.f151250e = bhnt;
        super.addView(bhnt, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a = bhki.m101052a(context2, attributeSet, bhnm.f119138a, i, f151231a, 22);
        if (getBackground() instanceof ColorDrawable) {
            bhlr bhlr = new bhlr();
            bhlr.mo63948c(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            bhlr.mo63942a(context2);
            bhlr.mo63949d(C1280ps.m19933o(this));
            C1280ps.m19890a(this, bhlr);
        }
        bhnt bhnt2 = this.f151250e;
        int dimensionPixelSize = a.getDimensionPixelSize(10, -1);
        if (bhnt2.f119151a != dimensionPixelSize) {
            bhnt2.f119151a = dimensionPixelSize;
            C1280ps.m19915e(bhnt2);
        }
        bhnt bhnt3 = this.f151250e;
        int color = a.getColor(7, 0);
        if (bhnt3.f119152b.getColor() != color) {
            bhnt3.f119152b.setColor(color);
            C1280ps.m19915e(bhnt3);
        }
        Drawable b = bhky.m101078b(context2, a, 5);
        if (this.f151259n != b) {
            this.f151259n = b;
            C1280ps.m19915e(this.f151250e);
        }
        int i2 = a.getInt(9, 0);
        if (this.f151267v != i2) {
            this.f151267v = i2;
            C1280ps.m19915e(this.f151250e);
        }
        this.f151270y = a.getBoolean(8, true);
        C1280ps.m19915e(this.f151250e);
        int dimensionPixelSize2 = a.getDimensionPixelSize(15, 0);
        this.f151254i = dimensionPixelSize2;
        this.f151253h = dimensionPixelSize2;
        this.f151252g = dimensionPixelSize2;
        this.f151251f = dimensionPixelSize2;
        this.f151251f = a.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f151252g = a.getDimensionPixelSize(19, this.f151252g);
        this.f151253h = a.getDimensionPixelSize(17, this.f151253h);
        this.f151254i = a.getDimensionPixelSize(16, this.f151254i);
        int resourceId = a.getResourceId(22, 2132018400);
        this.f151255j = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C1390tu.f27216y);
        try {
            this.f151261p = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f151256k = bhky.m101077a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (a.hasValue(23)) {
                this.f151256k = bhky.m101077a(context2, a, 23);
            }
            if (a.hasValue(21)) {
                int color2 = a.getColor(21, 0);
                int defaultColor = this.f151256k.getDefaultColor();
                this.f151256k = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color2, defaultColor});
            }
            this.f151257l = bhky.m101077a(context2, a, 3);
            this.f151260o = bhkn.m101062a(a.getInt(4, -1), (PorterDuff.Mode) null);
            this.f151258m = bhky.m101077a(context2, a, 20);
            this.f151266u = a.getInt(6, 300);
            this.f151235D = a.getDimensionPixelSize(13, -1);
            this.f151236E = a.getDimensionPixelSize(12, -1);
            this.f151263r = a.getResourceId(0, 0);
            this.f151238G = a.getDimensionPixelSize(1, 0);
            this.f151268w = a.getInt(14, 1);
            this.f151265t = a.getInt(2, 0);
            this.f151269x = a.getBoolean(11, false);
            this.f151271z = a.getBoolean(24, false);
            a.recycle();
            Resources resources = getResources();
            this.f151262q = (float) resources.getDimensionPixelSize(C0126R.dimen.design_tab_text_size_2line);
            this.f151237F = resources.getDimensionPixelSize(C0126R.dimen.design_tab_scrollable_min_width);
            m117613e();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m117610a(view);
    }

    /* renamed from: b */
    public final void mo71229b(bhnu bhnu, boolean z) {
        bhnu bhnu2 = this.f151234C;
        if (bhnu2 != bhnu) {
            int i = bhnu != null ? bhnu.f119165d : -1;
            if (z) {
                if ((bhnu2 == null || bhnu2.f119165d == -1) && i != -1) {
                    mo71233d(i);
                } else {
                    m117614e(i);
                }
                if (i != -1) {
                    m117616f(i);
                }
            }
            this.f151234C = bhnu;
            if (bhnu2 != null) {
                for (int size = this.f151239H.size() - 1; size >= 0; size--) {
                    bhny bhny = (bhny) this.f151239H.get(size);
                }
            }
            if (bhnu != null) {
                for (int size2 = this.f151239H.size() - 1; size2 >= 0; size2--) {
                    ((bhny) this.f151239H.get(size2)).f119180a.mo2143b(bhnu.f119165d);
                }
            }
        } else if (bhnu2 != null) {
            for (int size3 = this.f151239H.size() - 1; size3 >= 0; size3--) {
                bhny bhny2 = (bhny) this.f151239H.get(size3);
            }
            m117614e(bhnu.f119165d);
        }
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m117610a(view);
    }

    /* renamed from: a */
    private final void m117610a(View view) {
        if (view instanceof bhnn) {
            bhnn bhnn = (bhnn) view;
            bhnu a = mo71215a();
            CharSequence charSequence = bhnn.f119139a;
            Drawable drawable = bhnn.f119140b;
            int i = bhnn.f119141c;
            if (!TextUtils.isEmpty(bhnn.getContentDescription())) {
                a.mo64062a(bhnn.getContentDescription());
            }
            mo71221a(a, this.f151248c.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: e */
    private final void m117614e(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C1280ps.m19868C(this)) {
                bhnt bhnt = this.f151250e;
                int childCount = bhnt.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (bhnt.getChildAt(i2).getWidth() > 0) {
                        i2++;
                    }
                }
                int scrollX = getScrollX();
                int a = m117609a(i, 0.0f);
                if (scrollX != a) {
                    if (this.f151240I == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.f151240I = valueAnimator;
                        valueAnimator.setInterpolator(bhdl.f118328b);
                        this.f151240I.setDuration((long) this.f151266u);
                        this.f151240I.addUpdateListener(new bhno(this));
                    }
                    this.f151240I.setIntValues(scrollX, a);
                    this.f151240I.start();
                }
                bhnt bhnt2 = this.f151250e;
                int i3 = this.f151266u;
                ValueAnimator valueAnimator2 = bhnt2.f119157g;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    bhnt2.f119157g.cancel();
                }
                bhnt2.mo64055a(true, i, i3);
                return;
            }
            mo71233d(i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.tabs.TabLayout.a(avh, boolean):void
     arg types: [avh, int]
     candidates:
      com.google.android.material.tabs.TabLayout.a(int, float):int
      com.google.android.material.tabs.TabLayout.a(androidx.viewpager.widget.ViewPager, boolean):void
      com.google.android.material.tabs.TabLayout.a(bhnu, boolean):void
      com.google.android.material.tabs.TabLayout.a(avh, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.tabs.TabLayout.a(avh, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.material.tabs.TabLayout.a(int, float):int
      com.google.android.material.tabs.TabLayout.a(androidx.viewpager.widget.ViewPager, boolean):void
      com.google.android.material.tabs.TabLayout.a(bhnu, boolean):void
      com.google.android.material.tabs.TabLayout.a(avh, boolean):void */
    /* renamed from: a */
    private final void m117612a(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.f151233A;
        if (viewPager2 != null) {
            bhnv bhnv = this.f151243L;
            if (!(bhnv == null || (list2 = viewPager2.f1756e) == null)) {
                list2.remove(bhnv);
            }
            bhnp bhnp = this.f151244M;
            if (!(bhnp == null || (list = this.f151233A.f1757f) == null)) {
                list.remove(bhnp);
            }
        }
        bhny bhny = this.f151247P;
        if (bhny != null) {
            this.f151239H.remove(bhny);
            this.f151247P = null;
        }
        if (viewPager != null) {
            this.f151233A = viewPager;
            if (this.f151243L == null) {
                this.f151243L = new bhnv(this);
            }
            bhnv bhnv2 = this.f151243L;
            bhnv2.f119171b = 0;
            bhnv2.f119170a = 0;
            viewPager.mo2137a(bhnv2);
            bhny bhny2 = new bhny(viewPager);
            this.f151247P = bhny2;
            if (!this.f151239H.contains(bhny2)) {
                this.f151239H.add(bhny2);
            }
            avh avh = viewPager.f1753b;
            if (avh != null) {
                mo71219a(avh, true);
            }
            if (this.f151244M == null) {
                this.f151244M = new bhnp(this);
            }
            bhnp bhnp2 = this.f151244M;
            bhnp2.f119143a = true;
            if (viewPager.f1757f == null) {
                viewPager.f1757f = new ArrayList();
            }
            viewPager.f1757f.add(bhnp2);
            mo71233d(viewPager.f1754c);
        } else {
            this.f151233A = null;
            mo71219a((avh) null, false);
        }
        this.f151245N = z;
    }

    /* renamed from: d */
    public final void mo71233d(int i) {
        mo71217a(i, 0.0f, true, true);
    }

    /* renamed from: a */
    public final bhnu mo71215a() {
        bhnx bhnx;
        bhnu bhnu = (bhnu) f151232b.mo8188a();
        if (bhnu == null) {
            bhnu = new bhnu();
        }
        bhnu.f119168g = this;
        C1241og ogVar = this.f151246O;
        if (ogVar != null) {
            bhnx = (bhnx) ogVar.mo8188a();
        } else {
            bhnx = null;
        }
        if (bhnx == null) {
            bhnx = new bhnx(this, getContext());
        }
        bhnx.mo64066a(bhnu);
        bhnx.setFocusable(true);
        bhnx.setMinimumWidth(m117615f());
        if (TextUtils.isEmpty(bhnu.f119164c)) {
            bhnx.setContentDescription(bhnu.f119163b);
        } else {
            bhnx.setContentDescription(bhnu.f119164c);
        }
        bhnu.f119169h = bhnx;
        return bhnu;
    }

    /* renamed from: a */
    public final bhnu mo71216a(int i) {
        if (i < 0 || i >= mo71227b()) {
            return null;
        }
        return (bhnu) this.f151248c.get(i);
    }

    /* renamed from: a */
    public final void mo71217a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f151250e.getChildCount()) {
            if (z2) {
                bhnt bhnt = this.f151250e;
                ValueAnimator valueAnimator = bhnt.f119157g;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    bhnt.f119157g.cancel();
                }
                bhnt.f119153c = i;
                bhnt.f119154d = f;
                bhnt.mo64053a();
            }
            ValueAnimator valueAnimator2 = this.f151240I;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f151240I.cancel();
            }
            scrollTo(m117609a(i, f), 0);
            if (z) {
                m117616f(round);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.tabs.TabLayout.a(androidx.viewpager.widget.ViewPager, boolean):void
     arg types: [androidx.viewpager.widget.ViewPager, int]
     candidates:
      com.google.android.material.tabs.TabLayout.a(int, float):int
      com.google.android.material.tabs.TabLayout.a(avh, boolean):void
      com.google.android.material.tabs.TabLayout.a(bhnu, boolean):void
      com.google.android.material.tabs.TabLayout.a(androidx.viewpager.widget.ViewPager, boolean):void */
    /* renamed from: a */
    public final void mo71218a(ViewPager viewPager) {
        m117612a(viewPager, false);
    }

    /* renamed from: a */
    public final void mo71219a(avh avh, boolean z) {
        DataSetObserver dataSetObserver;
        avh avh2 = this.f151241J;
        if (!(avh2 == null || (dataSetObserver = this.f151242K) == null)) {
            avh2.f2376a.unregisterObserver(dataSetObserver);
        }
        this.f151241J = avh;
        if (z && avh != null) {
            if (this.f151242K == null) {
                this.f151242K = new bhnq(this);
            }
            avh.f2376a.registerObserver(this.f151242K);
        }
        mo71232d();
    }

    /* renamed from: a */
    public final void mo71220a(bhnu bhnu) {
        mo71229b(bhnu, true);
    }

    /* renamed from: a */
    public void mo6364a(bhnu bhnu, int i, boolean z) {
        if (bhnu.f119168g == this) {
            bhnu.f119165d = i;
            this.f151248c.add(i, bhnu);
            int size = this.f151248c.size();
            for (int i2 = i + 1; i2 < size; i2++) {
                ((bhnu) this.f151248c.get(i2)).f119165d = i2;
            }
            bhnx bhnx = bhnu.f119169h;
            bhnx.setSelected(false);
            bhnx.setActivated(false);
            bhnt bhnt = this.f151250e;
            int i3 = bhnu.f119165d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            m117611a(layoutParams);
            bhnt.addView(bhnx, i3, layoutParams);
            if (z) {
                bhnu.mo64060a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: a */
    public final void mo71221a(bhnu bhnu, boolean z) {
        mo6364a(bhnu, this.f151248c.size(), z);
    }

    /* renamed from: a */
    public final void mo71222a(boolean z) {
        for (int i = 0; i < this.f151250e.getChildCount(); i++) {
            View childAt = this.f151250e.getChildAt(i);
            childAt.setMinimumWidth(m117615f());
            m117611a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }
}
