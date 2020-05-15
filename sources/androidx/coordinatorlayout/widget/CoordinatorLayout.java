package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p001v4.view.AbsSavedState;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CoordinatorLayout extends ViewGroup implements C1267pf, C1268pg {

    /* renamed from: a */
    static final String f1480a;

    /* renamed from: b */
    static final Class[] f1481b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal f1482c = new ThreadLocal();

    /* renamed from: d */
    static final Comparator f1483d = new ais();

    /* renamed from: j */
    private static final C1241og f1484j = new C1243oi(12);

    /* renamed from: e */
    public final ait f1485e;

    /* renamed from: f */
    public final List f1486f;

    /* renamed from: g */
    public C1296qh f1487g;

    /* renamed from: h */
    public boolean f1488h;

    /* renamed from: i */
    public ViewGroup.OnHierarchyChangeListener f1489i;

    /* renamed from: k */
    private final List f1490k;

    /* renamed from: l */
    private final List f1491l;

    /* renamed from: m */
    private final int[] f1492m;

    /* renamed from: n */
    private final int[] f1493n;

    /* renamed from: o */
    private boolean f1494o;

    /* renamed from: p */
    private boolean f1495p;

    /* renamed from: q */
    private int[] f1496q;

    /* renamed from: r */
    private View f1497r;

    /* renamed from: s */
    private View f1498s;

    /* renamed from: t */
    private aiq f1499t;

    /* renamed from: u */
    private boolean f1500u;

    /* renamed from: v */
    private Drawable f1501v;

    /* renamed from: w */
    private C1270pi f1502w;

    /* renamed from: x */
    private final C1269ph f1503x;

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f1480a = str;
        int i = Build.VERSION.SDK_INT;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static aim m1455a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1480a)) {
            str = f1480a + '.' + str;
        }
        try {
            Map map = (Map) f1482c.get();
            if (map == null) {
                map = new HashMap();
                f1482c.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1481b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (aim) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: b */
    private final int m1463b(int i) {
        int[] iArr = this.f1496q;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: c */
    private static int m1465c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m1469d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aip) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        aim aim = ((aip) view.getLayoutParams()).f596a;
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1501v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aip();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aip(getContext(), attributeSet);
    }

    public final int getNestedScrollAxes() {
        return this.f1503x.mo15689a();
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1464b();
        if (this.f1500u) {
            if (this.f1499t == null) {
                this.f1499t = new aiq(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1499t);
        }
        if (this.f1487g == null && C1280ps.m19938t(this)) {
            C1280ps.m19937s(this);
        }
        this.f1495p = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1464b();
        if (this.f1500u && this.f1499t != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1499t);
        }
        View view = this.f1498s;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1495p = false;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f1488h && this.f1501v != null) {
            C1296qh qhVar = this.f1487g;
            if (qhVar != null) {
                i = qhVar.mo15733b();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f1501v.setBounds(0, 0, getWidth(), i);
                this.f1501v.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1464b();
        }
        boolean a = m1462a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1497r = null;
            m1464b();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        aim aim;
        int h = C1280ps.m19923h(this);
        int size = this.f1490k.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f1490k.get(i5);
            if (view.getVisibility() != 8 && ((aim = ((aip) view.getLayoutParams()).f596a) == null || !aim.mo773a(this, view, h))) {
                mo1876b(view, h);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0319, code lost:
        r9.f607l = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e3  */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        View view;
        int i12;
        int i13;
        aim aim;
        int i14;
        int i15;
        int i16;
        View view2;
        int i17;
        int i18;
        View view3;
        int i19;
        View childAt;
        int h;
        int a;
        aim aim2;
        this.f1490k.clear();
        ait ait = this.f1485e;
        int i20 = ait.f615b.f26809h;
        boolean z2 = false;
        int i21 = 0;
        while (i21 < i20) {
            ArrayList arrayList = (ArrayList) ait.f615b.mo15621c(i21);
            if (arrayList != null) {
                arrayList.clear();
                ait.f614a.mo8189a(arrayList);
            }
            i21++;
            z2 = false;
        }
        ait.f615b.clear();
        int childCount = getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt2 = getChildAt(i22);
            aip c = m1466c(childAt2);
            if (c.f601f != -1) {
                View view4 = c.f606k;
                if (view4 != null && view4.getId() == c.f601f) {
                    View view5 = c.f606k;
                    ViewParent parent = view5.getParent();
                    while (parent != this) {
                        if (parent == null || parent == childAt2) {
                            c.f607l = null;
                            c.f606k = null;
                        } else {
                            if (parent instanceof View) {
                                view5 = (View) parent;
                            }
                            parent = parent.getParent();
                        }
                    }
                    c.f607l = view5;
                }
                c.f606k = findViewById(c.f601f);
                View view6 = c.f606k;
                if (view6 == null) {
                    if (isInEditMode()) {
                        c.f607l = null;
                        c.f606k = null;
                    } else {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(c.f601f) + " to anchor view " + childAt2);
                    }
                } else if (view6 != this) {
                    ViewParent parent2 = view6.getParent();
                    while (true) {
                        if (!(parent2 == this || parent2 == null)) {
                            if (parent2 != childAt2) {
                                if (parent2 instanceof View) {
                                    view6 = (View) parent2;
                                }
                                parent2 = parent2.getParent();
                            } else if (isInEditMode()) {
                                c.f607l = null;
                                c.f606k = null;
                            } else {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                    }
                } else if (isInEditMode()) {
                    c.f607l = null;
                    c.f606k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else {
                c.f607l = null;
                c.f606k = null;
            }
            this.f1485e.mo794a(childAt2);
            for (int i23 = 0; i23 < childCount; i23++) {
                if (i23 != i22 && ((childAt = getChildAt(i23)) == c.f607l || (((a = C1256ov.m19815a(((aip) childAt.getLayoutParams()).f602g, (h = C1280ps.m19923h(this)))) != 0 && (C1256ov.m19815a(c.f603h, h) & a) == a) || ((aim2 = c.f596a) != null && aim2.mo772a(childAt2, childAt))))) {
                    if (!this.f1485e.f615b.containsKey(childAt)) {
                        this.f1485e.mo794a(childAt);
                    }
                    ait ait2 = this.f1485e;
                    if (!ait2.f615b.containsKey(childAt) || !ait2.f615b.containsKey(childAt2)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList2 = (ArrayList) ait2.f615b.get(childAt);
                    if (arrayList2 == null) {
                        arrayList2 = (ArrayList) ait2.f614a.mo8188a();
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ait2.f615b.put(childAt, arrayList2);
                    }
                    arrayList2.add(childAt2);
                }
            }
            i22++;
            z2 = false;
        }
        List list = this.f1490k;
        ait ait3 = this.f1485e;
        ait3.f616c.clear();
        ait3.f617d.clear();
        int i24 = ait3.f615b.f26809h;
        for (int i25 = 0; i25 < i24; i25++) {
            ait3.mo795a(ait3.f615b.mo15620b(i25), ait3.f616c, ait3.f617d);
        }
        list.addAll(ait3.f616c);
        Collections.reverse(this.f1490k);
        int childCount2 = getChildCount();
        int i26 = 0;
        loop3:
        while (true) {
            if (i26 >= childCount2) {
                z = false;
                break;
            }
            View childAt3 = getChildAt(i26);
            ait ait4 = this.f1485e;
            int i27 = ait4.f615b.f26809h;
            for (int i28 = 0; i28 < i27; i28++) {
                ArrayList arrayList3 = (ArrayList) ait4.f615b.mo15621c(i28);
                if (arrayList3 != null && arrayList3.contains(childAt3)) {
                    z = true;
                    break loop3;
                }
            }
            i26++;
        }
        if (z != this.f1500u) {
            if (z) {
                if (this.f1495p) {
                    if (this.f1499t == null) {
                        this.f1499t = new aiq(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f1499t);
                }
                this.f1500u = true;
            } else {
                if (this.f1495p && this.f1499t != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f1499t);
                }
                this.f1500u = z2;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int h2 = C1280ps.m19923h(this);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i29 = paddingLeft + paddingRight;
        int i30 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z3 = this.f1487g != null && C1280ps.m19938t(this);
        int size3 = this.f1490k.size();
        int i31 = suggestedMinimumWidth;
        int i32 = suggestedMinimumHeight;
        int i33 = 0;
        int i34 = 0;
        while (i34 < size3) {
            View view7 = (View) this.f1490k.get(i34);
            if (view7.getVisibility() != 8) {
                aip aip = (aip) view7.getLayoutParams();
                int i35 = aip.f600e;
                if (i35 < 0) {
                    i9 = i33;
                    i8 = i34;
                    i10 = 0;
                } else {
                    if (mode != 0) {
                        int b = m1463b(i35);
                        i9 = i33;
                        int a2 = C1256ov.m19815a(m1469d(aip.f598c), h2) & 7;
                        i8 = i34;
                        if (a2 == 3) {
                            if (h2 != 1) {
                                i19 = 0;
                                i10 = Math.max(i19, (size - paddingRight) - b);
                            }
                        }
                        if (a2 == 5) {
                            if (h2 == 1) {
                                i19 = 0;
                                i10 = Math.max(i19, (size - paddingRight) - b);
                            }
                        }
                        if (a2 != 5 || h2 == 1) {
                            if (a2 == 3) {
                                if (h2 != 1) {
                                }
                            }
                        }
                        i10 = Math.max(0, b - paddingLeft);
                    } else {
                        i9 = i33;
                        i8 = i34;
                    }
                    i10 = 0;
                }
                if (!z3) {
                    view = view7;
                    i11 = i32;
                } else if (!C1280ps.m19938t(view7)) {
                    int a3 = this.f1487g.mo15731a();
                    int c2 = this.f1487g.mo15735c();
                    view = view7;
                    int b2 = this.f1487g.mo15733b();
                    i11 = i32;
                    int d = this.f1487g.mo15736d();
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (a3 + c2), mode);
                    i12 = View.MeasureSpec.makeMeasureSpec(size2 - (b2 + d), mode2);
                    i13 = makeMeasureSpec;
                    aim = aip.f596a;
                    if (aim == null) {
                        i6 = paddingLeft;
                        i16 = i9;
                        view3 = view;
                        i7 = i8;
                        i18 = i13;
                        i5 = paddingRight;
                        i15 = i11;
                        i17 = i12;
                        i4 = h2;
                        i14 = i31;
                        i3 = size3;
                        if (aim.mo774a(this, view3, i18, i10, i17)) {
                            view2 = view3;
                            i31 = Math.max(i14, i29 + view2.getMeasuredWidth() + aip.leftMargin + aip.rightMargin);
                            i32 = Math.max(i15, i30 + view2.getMeasuredHeight() + aip.topMargin + aip.bottomMargin);
                            i33 = View.combineMeasuredStates(i16, view2.getMeasuredState());
                        }
                    } else {
                        i3 = size3;
                        i5 = paddingRight;
                        i4 = h2;
                        i7 = i8;
                        i15 = i11;
                        i18 = i13;
                        i17 = i12;
                        i14 = i31;
                        i6 = paddingLeft;
                        i16 = i9;
                        view3 = view;
                    }
                    view2 = view3;
                    mo1872a(view2, i18, i10, i17);
                    i31 = Math.max(i14, i29 + view2.getMeasuredWidth() + aip.leftMargin + aip.rightMargin);
                    i32 = Math.max(i15, i30 + view2.getMeasuredHeight() + aip.topMargin + aip.bottomMargin);
                    i33 = View.combineMeasuredStates(i16, view2.getMeasuredState());
                } else {
                    view = view7;
                    i11 = i32;
                }
                i13 = i;
                i12 = i2;
                aim = aip.f596a;
                if (aim == null) {
                }
                view2 = view3;
                mo1872a(view2, i18, i10, i17);
                i31 = Math.max(i14, i29 + view2.getMeasuredWidth() + aip.leftMargin + aip.rightMargin);
                i32 = Math.max(i15, i30 + view2.getMeasuredHeight() + aip.topMargin + aip.bottomMargin);
                i33 = View.combineMeasuredStates(i16, view2.getMeasuredState());
            } else {
                i7 = i34;
                i3 = size3;
                i6 = paddingLeft;
                i5 = paddingRight;
                i4 = h2;
            }
            i34 = i7 + 1;
            paddingLeft = i6;
            paddingRight = i5;
            h2 = i4;
            size3 = i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(i31, i, -16777216 & i33), View.resolveSizeAndState(i32, i2, i33 << 16));
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        aim aim;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                aip aip = (aip) childAt.getLayoutParams();
                if (aip.mo788a(0) && (aim = aip.f596a) != null) {
                    z2 |= aim.mo770a(childAt);
                }
            }
        }
        if (z2) {
            mo1870a(1);
        }
        return z2;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        aim aim;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                aip aip = (aip) childAt.getLayoutParams();
                if (aip.mo788a(0) && (aim = aip.f596a) != null) {
                    z |= aim.mo779b(view);
                }
            }
        }
        return z;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1133a(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1131a(view, i, i2, i3, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1144b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        SparseArray sparseArray = savedState.f1504c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            aim aim = m1466c(childAt).f596a;
            if (!(id == -1 || aim == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                aim.mo765a(childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable c;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            aim aim = ((aip) childAt.getLayoutParams()).f596a;
            if (!(id == -1 || aim == null || (c = aim.mo781c(childAt)) == null)) {
                sparseArray.append(id, c);
            }
        }
        savedState.f1504c = sparseArray;
        return savedState;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1139a(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo1130a(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f1497r;
        boolean z2 = false;
        if (view != null) {
            aim aim = ((aip) view.getLayoutParams()).f596a;
            z = aim != null ? aim.mo780b(this, this.f1497r, motionEvent) : false;
        } else {
            z = m1462a(motionEvent, 1);
            if (actionMasked != 0 && z) {
                z2 = true;
            }
        }
        if (this.f1497r == null || actionMasked == 3) {
            z |= super.onTouchEvent(motionEvent);
        } else if (z2) {
            MotionEvent a = m1457a(motionEvent);
            super.onTouchEvent(a);
            a.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1497r = null;
            m1464b();
        }
        return z;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        aim aim = ((aip) view.getLayoutParams()).f596a;
        if (aim == null || !aim.mo775a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1494o) {
            if (this.f1497r == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    aim aim = ((aip) childAt.getLayoutParams()).f596a;
                    if (aim != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        aim.mo776a(this, childAt, motionEvent);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            m1464b();
            this.f1494o = true;
        }
    }

    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1467c();
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1489i = onHierarchyChangeListener;
    }

    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1501v;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1501v.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1501v;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.coordinatorLayoutStyle);
    }

    /* renamed from: c */
    static final aip m1466c(View view) {
        aip aip = (aip) view.getLayoutParams();
        if (!aip.f597b) {
            if (view instanceof ail) {
                aim a = ((ail) view).mo762a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                aip.mo787a(a);
                aip.f597b = true;
            } else {
                ain ain = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    ain = (ain) cls.getAnnotation(ain.class);
                    if (ain != null) {
                        break;
                    }
                }
                if (ain != null) {
                    try {
                        aip.mo787a((aim) ain.mo782a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + ain.mo782a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                aip.f597b = true;
            }
        }
        return aip;
    }

    /* renamed from: d */
    private static final void m1470d(View view, int i) {
        aip aip = (aip) view.getLayoutParams();
        int i2 = aip.f605j;
        if (i2 != i) {
            C1280ps.m19922g(view, i - i2);
            aip.f605j = i;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [androidx.coordinatorlayout.widget.CoordinatorLayout, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f1490k = new ArrayList();
        this.f1485e = new ait();
        this.f1491l = new ArrayList();
        this.f1486f = new ArrayList();
        this.f1492m = new int[2];
        this.f1493n = new int[2];
        this.f1503x = new C1269ph();
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, aij.f592a, 0, 2132019577);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, aij.f592a, i, 0);
        }
        if (i == 0) {
            C1280ps.m19886a(this, context, aij.f592a, attributeSet, typedArray, 0, 2132019577);
        } else {
            C1280ps.m19886a(this, context, aij.f592a, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1496q = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1496q.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1496q;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f1501v = typedArray.getDrawable(1);
        typedArray.recycle();
        m1467c();
        super.setOnHierarchyChangeListener(new aio(this));
        if (C1280ps.m19917f(this) == 0) {
            C1280ps.m19906b((View) this, 1);
        }
    }

    /* renamed from: b */
    private final void m1464b() {
        View view = this.f1497r;
        if (view != null) {
            aim aim = ((aip) view.getLayoutParams()).f596a;
            if (aim != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                aim.mo780b(this, this.f1497r, obtain);
                obtain.recycle();
            }
            this.f1497r = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((aip) getChildAt(i).getLayoutParams()).f608m = false;
        }
        this.f1494o = false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aip) {
            return new aip((aip) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new aip((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new aip(layoutParams);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new air();

        /* renamed from: c */
        SparseArray f1504c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1504c = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1504c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f1504c;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f1504c.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.f1504c.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: b */
    public final List mo1875b(View view) {
        ait ait = this.f1485e;
        int i = ait.f615b.f26809h;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ait.f615b.mo15621c(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ait.f615b.mo15620b(i2));
            }
        }
        this.f1486f.clear();
        if (arrayList != null) {
            this.f1486f.addAll(arrayList);
        }
        return this.f1486f;
    }

    /* renamed from: a */
    private static Rect m1456a() {
        Rect rect = (Rect) f1484j.mo8188a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: c */
    private final void m1467c() {
        int i = Build.VERSION.SDK_INT;
        if (C1280ps.m19938t(this)) {
            if (this.f1502w == null) {
                this.f1502w = new aik(this);
            }
            C1280ps.m19895a(this, this.f1502w);
            setSystemUiVisibility(1280);
            return;
        }
        C1280ps.m19895a(this, (C1270pi) null);
    }

    /* renamed from: a */
    private static final MotionEvent m1457a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    /* renamed from: a */
    private static final void m1458a(int i, Rect rect, Rect rect2, aip aip, int i2, int i3) {
        int i4;
        int i5;
        int i6 = aip.f598c;
        if (i6 == 0) {
            i6 = 17;
        }
        int a = C1256ov.m19815a(i6, i);
        int a2 = C1256ov.m19815a(m1465c(aip.f599d), i);
        int i7 = a & 7;
        int i8 = a & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        int i9 = a2 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        int i10 = a2 & 7;
        if (i10 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i10 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = (rect.height() / 2) + rect.top;
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i7 == 1) {
            i4 -= i2 / 2;
        } else if (i7 != 5) {
            i4 -= i2;
        }
        if (i8 == 16) {
            i5 -= i3 / 2;
        } else if (i8 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: b */
    public final void mo1876b(View view, int i) {
        int i2;
        aip aip = (aip) view.getLayoutParams();
        View view2 = aip.f606k;
        if (view2 == null && aip.f601f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a = m1456a();
            Rect a2 = m1456a();
            try {
                aiu.m838a(this, view2, a);
                aip aip2 = (aip) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1458a(i, a, a2, aip2, measuredWidth, measuredHeight);
                m1459a(aip2, a2, measuredWidth, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
            } finally {
                m1460a(a);
                m1460a(a2);
            }
        } else {
            int i3 = aip.f600e;
            if (i3 >= 0) {
                aip aip3 = (aip) view.getLayoutParams();
                int a3 = C1256ov.m19815a(m1469d(aip3.f598c), i);
                int i4 = a3 & 7;
                int i5 = a3 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int b = m1463b(i3) - measuredWidth2;
                if (i4 == 1) {
                    b += measuredWidth2 / 2;
                } else if (i4 == 5) {
                    b += measuredWidth2;
                }
                if (i5 == 16) {
                    i2 = measuredHeight2 / 2;
                } else if (i5 != 80) {
                    i2 = 0;
                } else {
                    i2 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + aip3.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth2) - aip3.rightMargin));
                int max2 = Math.max(getPaddingTop() + aip3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - aip3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            aip aip4 = (aip) view.getLayoutParams();
            Rect a4 = m1456a();
            a4.set(getPaddingLeft() + aip4.leftMargin, getPaddingTop() + aip4.topMargin, (getWidth() - getPaddingRight()) - aip4.rightMargin, (getHeight() - getPaddingBottom()) - aip4.bottomMargin);
            if (this.f1487g != null && C1280ps.m19938t(this) && !C1280ps.m19938t(view)) {
                a4.left += this.f1487g.mo15731a();
                a4.top += this.f1487g.mo15733b();
                a4.right -= this.f1487g.mo15735c();
                a4.bottom -= this.f1487g.mo15736d();
            }
            Rect a5 = m1456a();
            C1256ov.m19816a(m1465c(aip4.f598c), view.getMeasuredWidth(), view.getMeasuredHeight(), a4, a5, i);
            view.layout(a5.left, a5.top, a5.right, a5.bottom);
            m1460a(a4);
            m1460a(a5);
        }
    }

    /* renamed from: c */
    private static final void m1468c(View view, int i) {
        aip aip = (aip) view.getLayoutParams();
        int i2 = aip.f604i;
        if (i2 != i) {
            C1280ps.m19924h(view, i - i2);
            aip.f604i = i;
        }
    }

    /* renamed from: a */
    private final void m1459a(aip aip, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + aip.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - aip.rightMargin));
        int max2 = Math.max(getPaddingTop() + aip.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - aip.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private static void m1460a(Rect rect) {
        rect.setEmpty();
        f1484j.mo8189a(rect);
    }

    /* renamed from: a */
    private final boolean m1461a(aim aim, View view, MotionEvent motionEvent, int i) {
        if (i != 0) {
            return aim.mo780b(this, view, motionEvent);
        }
        return aim.mo776a(this, view, motionEvent);
    }

    /* renamed from: a */
    private final boolean m1462a(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f1491l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = f1483d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            aip aip = (aip) view.getLayoutParams();
            aim aim = aip.f596a;
            if (!z || actionMasked == 0) {
                if (!z && aim != null && (z = m1461a(aim, view, motionEvent, i))) {
                    this.f1497r = view;
                    if (!(actionMasked == 3 || actionMasked == 1)) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) list.get(i4);
                            aim aim2 = ((aip) view2.getLayoutParams()).f596a;
                            if (aim2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = m1457a(motionEvent);
                                }
                                m1461a(aim2, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                if (aip.f596a == null) {
                    aip.f608m = false;
                }
                boolean z2 = aip.f608m;
            } else if (aim != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = m1457a(motionEvent);
                }
                m1461a(aim, view, motionEvent2, i);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    /* renamed from: b */
    public final void mo1144b(View view, View view2, int i, int i2) {
        this.f1503x.mo15691a(i, i2);
        this.f1498s = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((aip) getChildAt(i3).getLayoutParams()).mo788a(i2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.coordinatorlayout.widget.CoordinatorLayout.a(android.view.View, boolean, android.graphics.Rect):void
     arg types: [android.view.View, int, android.graphics.Rect]
     candidates:
      androidx.coordinatorlayout.widget.CoordinatorLayout.a(android.content.Context, android.util.AttributeSet, java.lang.String):aim
      androidx.coordinatorlayout.widget.CoordinatorLayout.a(android.view.View, int, int):boolean
      androidx.coordinatorlayout.widget.CoordinatorLayout.a(android.view.View, boolean, android.graphics.Rect):void */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d5 A[EDGE_INSN: B:134:0x02d5->B:127:0x02d5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0150  */
    /* renamed from: a */
    public final void mo1870a(int i) {
        int i2;
        int i3;
        int i4;
        aip aip;
        Rect rect;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        aip aip2;
        int i11;
        Rect rect2;
        int i12;
        int i13;
        boolean z4;
        aim aim;
        int i14 = i;
        int h = C1280ps.m19923h(this);
        int size = this.f1490k.size();
        Rect a = m1456a();
        Rect a2 = m1456a();
        Rect a3 = m1456a();
        int i15 = 0;
        while (i15 < size) {
            View view = (View) this.f1490k.get(i15);
            aip aip3 = (aip) view.getLayoutParams();
            if (i14 == 0) {
                if (view.getVisibility() != 8) {
                    i2 = 0;
                    while (i2 < i15) {
                        if (aip3.f607l == ((View) this.f1490k.get(i2))) {
                            aip aip4 = (aip) view.getLayoutParams();
                            if (aip4.f606k != null) {
                                Rect a4 = m1456a();
                                Rect a5 = m1456a();
                                Rect a6 = m1456a();
                                aiu.m838a(this, aip4.f606k, a4);
                                mo1873a(view, false, a5);
                                int measuredWidth = view.getMeasuredWidth();
                                i13 = size;
                                int measuredHeight = view.getMeasuredHeight();
                                i12 = i15;
                                Rect rect3 = a5;
                                Rect rect4 = a4;
                                aip aip5 = aip4;
                                int i16 = measuredWidth;
                                rect2 = a3;
                                i11 = i2;
                                aip2 = aip3;
                                m1458a(h, a4, a6, aip5, i16, measuredHeight);
                                if (a6.left == rect3.left && a6.top == rect3.top) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                aip aip6 = aip5;
                                m1459a(aip6, a6, i16, measuredHeight);
                                int i17 = a6.left - rect3.left;
                                int i18 = a6.top - rect3.top;
                                if (i17 != 0) {
                                    C1280ps.m19924h(view, i17);
                                }
                                if (i18 != 0) {
                                    C1280ps.m19922g(view, i18);
                                }
                                if (z4 && (aim = aip6.f596a) != null) {
                                    aim.mo777a(this, view, aip6.f606k);
                                }
                                m1460a(rect4);
                                m1460a(rect3);
                                m1460a(a6);
                            } else {
                                i11 = i2;
                                aip2 = aip3;
                                i13 = size;
                                rect2 = a3;
                                i12 = i15;
                            }
                        } else {
                            i11 = i2;
                            aip2 = aip3;
                            i13 = size;
                            rect2 = a3;
                            i12 = i15;
                        }
                        i2 = i11 + 1;
                        size = i13;
                        i15 = i12;
                        a3 = rect2;
                        aip3 = aip2;
                    }
                    i3 = size;
                    Rect rect5 = a3;
                    i4 = i15;
                    mo1873a(view, true, a2);
                    aip = aip3;
                    if (aip.f602g != 0 && !a2.isEmpty()) {
                        int a7 = C1256ov.m19815a(aip.f602g, h);
                        i9 = a7 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                        if (i9 != 48) {
                            a.top = Math.max(a.top, a2.bottom);
                        } else if (i9 == 80) {
                            a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                        }
                        i10 = a7 & 7;
                        if (i10 != 3) {
                            a.left = Math.max(a.left, a2.right);
                        } else if (i10 == 5) {
                            a.right = Math.max(a.right, getWidth() - a2.left);
                        }
                    }
                    if (aip.f603h == 0 && view.getVisibility() == 0) {
                        if (C1280ps.m19868C(view)) {
                            if (view.getWidth() > 0 && view.getHeight() > 0) {
                                aip aip7 = (aip) view.getLayoutParams();
                                aim aim2 = aip7.f596a;
                                Rect a8 = m1456a();
                                Rect a9 = m1456a();
                                a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                                if (aim2 == null || !aim2.mo771a(view, a8)) {
                                    a8.set(a9);
                                } else if (!a9.contains(a8)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a8.toShortString() + " | Bounds:" + a9.toShortString());
                                }
                                m1460a(a9);
                                if (a8.isEmpty()) {
                                    m1460a(a8);
                                } else {
                                    int a10 = C1256ov.m19815a(aip7.f603h, h);
                                    if ((a10 & 48) != 48 || (i8 = (a8.top - aip7.topMargin) - aip7.f605j) >= a.top) {
                                        z2 = false;
                                    } else {
                                        m1470d(view, a.top - i8);
                                        z2 = true;
                                    }
                                    if ((a10 & 80) == 80 && (height = ((getHeight() - a8.bottom) - aip7.bottomMargin) + aip7.f605j) < a.bottom) {
                                        m1470d(view, height - a.bottom);
                                    } else if (!z2) {
                                        m1470d(view, 0);
                                    }
                                    if ((a10 & 3) != 3 || (i7 = (a8.left - aip7.leftMargin) - aip7.f604i) >= a.left) {
                                        z3 = false;
                                    } else {
                                        m1468c(view, a.left - i7);
                                        z3 = true;
                                    }
                                    if ((a10 & 5) == 5 && (width = ((getWidth() - a8.right) - aip7.rightMargin) + aip7.f604i) < a.right) {
                                        m1468c(view, width - a.right);
                                    } else if (!z3) {
                                        m1468c(view, 0);
                                    }
                                    m1460a(a8);
                                }
                            }
                        }
                    }
                    if (i14 == 2) {
                        rect = rect5;
                        rect.set(((aip) view.getLayoutParams()).f610o);
                        if (!rect.equals(a2)) {
                            ((aip) view.getLayoutParams()).f610o.set(a2);
                        } else {
                            i6 = i3;
                        }
                    } else {
                        rect = rect5;
                    }
                    i5 = i4 + 1;
                    while (true) {
                        i6 = i3;
                        if (i5 < i6) {
                            break;
                        }
                        View view2 = (View) this.f1490k.get(i5);
                        aip aip8 = (aip) view2.getLayoutParams();
                        aim aim3 = aip8.f596a;
                        if (aim3 != null) {
                            if (aim3.mo772a(view2, view)) {
                                if (i14 != 0 || !aip8.f609n) {
                                    if (i14 != 2) {
                                        z = aim3.mo777a(this, view2, view);
                                    } else {
                                        aim3.mo766a(this, view);
                                        z = true;
                                    }
                                    if (i14 == 1) {
                                        aip8.f609n = z;
                                    }
                                } else {
                                    aip8.mo785a();
                                }
                            }
                        }
                        i5++;
                        i3 = i6;
                    }
                } else {
                    i6 = size;
                    rect = a3;
                    i4 = i15;
                }
            } else {
                i2 = 0;
                while (i2 < i15) {
                }
                i3 = size;
                Rect rect52 = a3;
                i4 = i15;
                mo1873a(view, true, a2);
                aip = aip3;
                int a72 = C1256ov.m19815a(aip.f602g, h);
                i9 = a72 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                if (i9 != 48) {
                }
                i10 = a72 & 7;
                if (i10 != 3) {
                }
                if (aip.f603h == 0) {
                }
                if (i14 == 2) {
                }
                i5 = i4 + 1;
                while (true) {
                    i6 = i3;
                    if (i5 < i6) {
                    }
                    i5++;
                    i3 = i6;
                }
            }
            i15 = i4 + 1;
            size = i6;
            a3 = rect;
        }
        m1460a(a);
        m1460a(a2);
        m1460a(a3);
    }

    /* renamed from: a */
    public final void mo1871a(View view) {
        List b = this.f1485e.mo796b(view);
        if (b != null && !b.isEmpty()) {
            for (int i = 0; i < b.size(); i++) {
                View view2 = (View) b.get(i);
                aim aim = ((aip) view2.getLayoutParams()).f596a;
                if (aim != null) {
                    aim.mo777a(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1130a(View view, int i) {
        this.f1503x.mo15690a(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            aip aip = (aip) childAt.getLayoutParams();
            if (aip.mo788a(i)) {
                aim aim = aip.f596a;
                if (aim != null) {
                    aim.mo768a(this, childAt, view, i);
                }
                aip.mo786a(i, false);
                aip.mo785a();
            }
        }
        this.f1498s = null;
    }

    /* renamed from: a */
    public final void mo1872a(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    /* renamed from: a */
    public final void mo1131a(View view, int i, int i2, int i3, int i4, int i5) {
        mo1132a(view, i, i2, i3, i4, 0, this.f1493n);
    }

    /* renamed from: a */
    public final void mo1132a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        aim aim;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                aip aip = (aip) childAt.getLayoutParams();
                if (aip.mo788a(i5) && (aim = aip.f596a) != null) {
                    int[] iArr2 = this.f1492m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aim.mo767a(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, this.f1492m[0]) : Math.min(i6, this.f1492m[0]);
                    i7 = i4 <= 0 ? Math.min(i7, this.f1492m[1]) : Math.max(i7, this.f1492m[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo1870a(1);
        }
    }

    /* renamed from: a */
    public final void mo1133a(View view, int i, int i2, int[] iArr, int i3) {
        aim aim;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                aip aip = (aip) childAt.getLayoutParams();
                if (aip.mo788a(i3) && (aim = aip.f596a) != null) {
                    int[] iArr2 = this.f1492m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aim.mo769a(this, childAt, view, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, this.f1492m[0]) : Math.min(i4, this.f1492m[0]);
                    i5 = i2 <= 0 ? Math.min(i5, this.f1492m[1]) : Math.max(i5, this.f1492m[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo1870a(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1873a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (!z) {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            aiu.m838a(this, view, rect);
        }
    }

    /* renamed from: a */
    public final boolean mo1874a(View view, int i, int i2) {
        Rect a = m1456a();
        aiu.m838a(this, view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m1460a(a);
        }
    }

    /* renamed from: a */
    public final boolean mo1139a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                aip aip = (aip) childAt.getLayoutParams();
                aim aim = aip.f596a;
                if (aim != null) {
                    boolean a = aim.mo778a(this, childAt, view, view2, i, i2);
                    z |= a;
                    aip.mo786a(i3, a);
                } else {
                    aip.mo786a(i3, false);
                }
            }
        }
        return z;
    }
}
