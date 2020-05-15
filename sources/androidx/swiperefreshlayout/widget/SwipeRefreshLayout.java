package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwipeRefreshLayout extends ViewGroup implements C1268pg, C1267pf, C1265pd {

    /* renamed from: D */
    private static final int[] f1682D = {16842766};

    /* renamed from: m */
    private static final String f1683m = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: A */
    private boolean f1684A;

    /* renamed from: B */
    private int f1685B;

    /* renamed from: C */
    private final DecelerateInterpolator f1686C;

    /* renamed from: E */
    private int f1687E;

    /* renamed from: F */
    private Animation f1688F;

    /* renamed from: G */
    private Animation f1689G;

    /* renamed from: H */
    private Animation f1690H;

    /* renamed from: I */
    private Animation f1691I;

    /* renamed from: J */
    private Animation f1692J;

    /* renamed from: K */
    private int f1693K;

    /* renamed from: L */
    private Animation.AnimationListener f1694L;

    /* renamed from: M */
    private final Animation f1695M;

    /* renamed from: N */
    private final Animation f1696N;

    /* renamed from: a */
    public arp f1697a;

    /* renamed from: b */
    public boolean f1698b;

    /* renamed from: c */
    public int f1699c;

    /* renamed from: d */
    public boolean f1700d;

    /* renamed from: e */
    public arc f1701e;

    /* renamed from: f */
    public int f1702f;

    /* renamed from: g */
    public float f1703g;

    /* renamed from: h */
    public int f1704h;

    /* renamed from: i */
    public int f1705i;

    /* renamed from: j */
    public arg f1706j;

    /* renamed from: k */
    public boolean f1707k;

    /* renamed from: l */
    public boolean f1708l;

    /* renamed from: n */
    private View f1709n;

    /* renamed from: o */
    private int f1710o;

    /* renamed from: p */
    private float f1711p;

    /* renamed from: q */
    private float f1712q;

    /* renamed from: r */
    private final C1269ph f1713r;

    /* renamed from: s */
    private final C1266pe f1714s;

    /* renamed from: t */
    private final int[] f1715t;

    /* renamed from: u */
    private final int[] f1716u;

    /* renamed from: v */
    private final int[] f1717v;

    /* renamed from: w */
    private boolean f1718w;

    /* renamed from: x */
    private int f1719x;

    /* renamed from: y */
    private float f1720y;

    /* renamed from: z */
    private float f1721z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new arq();

        /* renamed from: a */
        final boolean f1722a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1722a = parcel.readByte() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1722a ? (byte) 1 : 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f1722a = z;
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final Animation m1654a(int i, int i2) {
        ark ark = new ark(this, i, i2);
        ark.setDuration(300);
        arc arc = this.f1701e;
        arc.f2050a = null;
        arc.clearAnimation();
        this.f1701e.startAnimation(ark);
        return ark;
    }

    /* renamed from: c */
    private final void m1658c() {
        if (this.f1709n == null) {
            int i = 0;
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (childAt.equals(this.f1701e)) {
                    i++;
                } else {
                    this.f1709n = childAt;
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(int, int):android.view.animation.Animation
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(android.view.View, int):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, int):void
      pf.a(android.view.View, int):void
      pf.a(android.view.View, int):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, boolean):void */
    /* renamed from: d */
    private final void m1660d(float f) {
        arl arl;
        if (f <= this.f1711p) {
            this.f1698b = false;
            this.f1706j.mo2334c(0.0f);
            if (!this.f1700d) {
                arl = new arl(this);
            } else {
                arl = null;
            }
            int i = this.f1699c;
            if (this.f1700d) {
                this.f1702f = i;
                this.f1703g = this.f1701e.getScaleX();
                aro aro = new aro(this);
                this.f1692J = aro;
                aro.setDuration(150);
                if (arl != null) {
                    this.f1701e.f2050a = arl;
                }
                this.f1701e.clearAnimation();
                this.f1701e.startAnimation(this.f1692J);
            } else {
                this.f1702f = i;
                this.f1696N.reset();
                this.f1696N.setDuration(200);
                this.f1696N.setInterpolator(this.f1686C);
                if (arl != null) {
                    this.f1701e.f2050a = arl;
                }
                this.f1701e.clearAnimation();
                this.f1701e.startAnimation(this.f1696N);
            }
            this.f1706j.mo2331a(false);
            return;
        }
        m1656a(true, true);
    }

    /* renamed from: e */
    private final void m1661e(float f) {
        float f2 = this.f1721z;
        float f3 = (float) this.f1710o;
        if (f - f2 > f3 && !this.f1684A) {
            this.f1720y = f2 + f3;
            this.f1684A = true;
            this.f1706j.setAlpha(76);
        }
    }

    /* renamed from: b */
    public final void mo2093b(float f) {
        int i = this.f1702f;
        mo2094b((i + ((int) (((float) (this.f1704h - i)) * f))) - this.f1701e.getTop());
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1714s.mo15679a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1714s.mo15678a(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1714s.mo15684a(i, i2, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1714s.mo15682a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1687E;
        return i3 >= 0 ? i2 != i + -1 ? i2 >= i3 ? i2 + 1 : i2 : i3 : i2;
    }

    public final int getNestedScrollAxes() {
        return this.f1713r.mo15689a();
    }

    public final boolean hasNestedScrollingParent() {
        return this.f1714s.mo15677a();
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f1714s.f26827a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2086a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m1658c();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || mo2096b() || this.f1698b || this.f1718w) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f1685B;
                    if (i == -1) {
                        Log.e(f1683m, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m1661e(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m1655a(motionEvent);
                    }
                }
            }
            this.f1684A = false;
            this.f1685B = -1;
        } else {
            mo2094b(this.f1704h - this.f1701e.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f1685B = pointerId;
            this.f1684A = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f1721z = motionEvent.getY(findPointerIndex2);
        }
        return this.f1684A;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1709n == null) {
                m1658c();
            }
            View view = this.f1709n;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f1701e.getMeasuredWidth();
                int measuredHeight2 = this.f1701e.getMeasuredHeight();
                arc arc = this.f1701e;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f1699c;
                arc.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1709n == null) {
            m1658c();
        }
        View view = this.f1709n;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), JGCastService.FLAG_PRIVATE_DISPLAY));
            this.f1701e.measure(View.MeasureSpec.makeMeasureSpec(this.f1693K, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(this.f1693K, JGCastService.FLAG_PRIVATE_DISPLAY));
            this.f1687E = -1;
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (getChildAt(i3) != this.f1701e) {
                    i3++;
                } else {
                    this.f1687E = i3;
                    return;
                }
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f;
        if (i2 > 0) {
            float f2 = this.f1712q;
            if (f2 > 0.0f) {
                float f3 = (float) i2;
                if (f3 <= f2) {
                    f = f2 - f3;
                    this.f1712q = f;
                    iArr[1] = i2;
                } else {
                    iArr[1] = (int) f2;
                    this.f1712q = 0.0f;
                    f = 0.0f;
                }
                m1659c(f);
            }
        }
        if (this.f1708l && i2 > 0 && this.f1712q == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f1701e.setVisibility(8);
        }
        int[] iArr2 = this.f1715t;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1132a(view, i, i2, i3, i4, 0, this.f1717v);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1713r.mo15692b(i);
        startNestedScroll(i & 2);
        this.f1712q = 0.0f;
        this.f1718w = true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        mo2090a(savedState.f1722a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f1698b);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f1698b && (i & 2) != 0;
    }

    public final void onStopNestedScroll(View view) {
        this.f1713r.mo15690a(0);
        this.f1718w = false;
        float f = this.f1712q;
        if (f > 0.0f) {
            m1660d(f);
            this.f1712q = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || mo2096b() || this.f1698b || this.f1718w) {
            return false;
        }
        if (actionMasked == 0) {
            this.f1685B = motionEvent.getPointerId(0);
            this.f1684A = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1685B);
            if (findPointerIndex < 0) {
                Log.e(f1683m, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f1684A) {
                float y = motionEvent.getY(findPointerIndex);
                float f = this.f1720y;
                this.f1684A = false;
                m1660d((y - f) * 0.5f);
            }
            this.f1685B = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f1685B);
            if (findPointerIndex2 < 0) {
                Log.e(f1683m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            m1661e(y2);
            if (this.f1684A) {
                float f2 = (y2 - this.f1720y) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m1659c(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f1683m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f1685B = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1655a(motionEvent);
            }
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int i = Build.VERSION.SDK_INT;
        View view = this.f1709n;
        if (view == null || C1280ps.m19944z(view)) {
            super.requestDisallowInterceptTouchEvent(z);
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo2086a();
        }
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f1714s.mo15676a(z);
    }

    public final boolean startNestedScroll(int i) {
        return this.f1714s.mo15687b(i);
    }

    public final void stopNestedScroll() {
        this.f1714s.mo15686b();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1698b = false;
        this.f1711p = -1.0f;
        this.f1715t = new int[2];
        this.f1716u = new int[2];
        this.f1717v = new int[2];
        this.f1685B = -1;
        this.f1687E = -1;
        this.f1694L = new arh(this);
        this.f1695M = new arm(this);
        this.f1696N = new arn(this);
        this.f1710o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1719x = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f1686C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1693K = (int) (displayMetrics.density * 40.0f);
        this.f1701e = new arc(getContext());
        arg arg = new arg(getContext());
        this.f1706j = arg;
        arg.mo2328a();
        this.f1701e.setImageDrawable(this.f1706j);
        this.f1701e.setVisibility(8);
        addView(this.f1701e);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f1705i = i;
        this.f1711p = (float) i;
        this.f1713r = new C1269ph();
        this.f1714s = new C1266pe(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f1693K;
        this.f1699c = i2;
        this.f1704h = i2;
        mo2093b(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1682D);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: c */
    private final void m1659c(float f) {
        int i;
        this.f1706j.mo2331a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f1711p));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 11.2d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f1711p;
        if (this.f1708l) {
            i = this.f1705i - this.f1704h;
        } else {
            i = this.f1705i;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 + f2) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = (float) (max2 - pow);
        float f4 = f3 + f3;
        float f5 = f2 * f4;
        int i2 = this.f1704h + ((int) ((f2 * min) + f5 + f5));
        if (this.f1701e.getVisibility() != 0) {
            this.f1701e.setVisibility(0);
        }
        if (!this.f1700d) {
            this.f1701e.setScaleX(1.0f);
            this.f1701e.setScaleY(1.0f);
        }
        if (this.f1700d) {
            mo2087a(Math.min(1.0f, f / this.f1711p));
        }
        if (f < this.f1711p) {
            if (this.f1706j.getAlpha() > 76 && !m1657a(this.f1690H)) {
                this.f1690H = m1654a(this.f1706j.getAlpha(), 76);
            }
        } else if (this.f1706j.getAlpha() < 255 && !m1657a(this.f1691I)) {
            this.f1691I = m1654a(this.f1706j.getAlpha(), 255);
        }
        this.f1706j.mo2334c(Math.min(0.8f, max * 0.8f));
        this.f1706j.mo2333b(Math.min(1.0f, max));
        arg arg = this.f1706j;
        arg.f2080a.f2062g = (((max * 0.4f) - 16.0f) + f4 + f4) * 0.5f;
        arg.invalidateSelf();
        mo2094b(i2 - this.f1699c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.g(android.view.View, int):void
     arg types: [arc, int]
     candidates:
      ps.g(android.view.View, float):void
      ps.g(android.view.View, int):void */
    /* renamed from: b */
    public final void mo2094b(int i) {
        this.f1701e.bringToFront();
        C1280ps.m19922g((View) this.f1701e, i);
        this.f1699c = this.f1701e.getTop();
    }

    /* renamed from: b */
    public final void mo1144b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: a */
    private final void m1655a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1685B) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f1685B = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: b */
    public final void mo2095b(int... iArr) {
        m1658c();
        this.f1706j.mo2332a(iArr);
    }

    /* renamed from: b */
    public final boolean mo2096b() {
        View view = this.f1709n;
        if (!(view instanceof ListView)) {
            return view.canScrollVertically(-1);
        }
        int i = Build.VERSION.SDK_INT;
        return ((ListView) view).canScrollList(-1);
    }

    /* renamed from: a */
    private final void m1656a(boolean z, boolean z2) {
        if (this.f1698b != z) {
            this.f1707k = z2;
            m1658c();
            this.f1698b = z;
            if (z) {
                int i = this.f1699c;
                Animation.AnimationListener animationListener = this.f1694L;
                this.f1702f = i;
                this.f1695M.reset();
                this.f1695M.setDuration(200);
                this.f1695M.setInterpolator(this.f1686C);
                if (animationListener != null) {
                    this.f1701e.f2050a = animationListener;
                }
                this.f1701e.clearAnimation();
                this.f1701e.startAnimation(this.f1695M);
                return;
            }
            mo2089a(this.f1694L);
        }
    }

    /* renamed from: a */
    private static final boolean m1657a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: a */
    public final void mo2086a() {
        this.f1701e.clearAnimation();
        this.f1706j.stop();
        this.f1701e.setVisibility(8);
        this.f1701e.getBackground().setAlpha(255);
        this.f1706j.setAlpha(255);
        if (!this.f1700d) {
            mo2094b(this.f1704h - this.f1699c);
        } else {
            mo2087a(0.0f);
        }
        this.f1699c = this.f1701e.getTop();
    }

    /* renamed from: a */
    public final void mo2087a(float f) {
        this.f1701e.setScaleX(f);
        this.f1701e.setScaleY(f);
    }

    /* renamed from: a */
    public final void mo2088a(int i) {
        this.f1701e.setBackgroundColor(i);
    }

    /* renamed from: a */
    public final void mo1130a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public final void mo1131a(View view, int i, int i2, int i3, int i4, int i5) {
        mo1132a(view, i, i2, i3, i4, i5, this.f1717v);
    }

    /* renamed from: a */
    public final void mo1132a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            this.f1714s.mo15683a(i, i2, i3, i4, this.f1716u, 0, iArr);
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i6 = i4 + this.f1716u[1];
            } else {
                i6 = i8;
            }
            if (i6 < 0 && !mo2096b()) {
                float abs = this.f1712q + ((float) Math.abs(i6));
                this.f1712q = abs;
                m1659c(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    /* renamed from: a */
    public final void mo1133a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public final void mo2089a(Animation.AnimationListener animationListener) {
        arj arj = new arj(this);
        this.f1689G = arj;
        arj.setDuration(150);
        arc arc = this.f1701e;
        arc.f2050a = animationListener;
        arc.clearAnimation();
        this.f1701e.startAnimation(this.f1689G);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(int, int):android.view.animation.Animation
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(android.view.View, int):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, int):void
      pf.a(android.view.View, int):void
      pf.a(android.view.View, int):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo2090a(boolean z) {
        int i;
        if (z) {
            if (!this.f1698b) {
                this.f1698b = true;
                if (!this.f1708l) {
                    i = this.f1705i + this.f1704h;
                } else {
                    i = this.f1705i;
                }
                mo2094b(i - this.f1699c);
                this.f1707k = false;
                Animation.AnimationListener animationListener = this.f1694L;
                this.f1701e.setVisibility(0);
                this.f1706j.setAlpha(255);
                ari ari = new ari(this);
                this.f1688F = ari;
                ari.setDuration((long) this.f1719x);
                if (animationListener != null) {
                    this.f1701e.f2050a = animationListener;
                }
                this.f1701e.clearAnimation();
                this.f1701e.startAnimation(this.f1688F);
                return;
            }
            z = true;
        }
        m1656a(z, false);
    }

    /* renamed from: a */
    public final void mo2091a(boolean z, int i) {
        this.f1700d = z;
        this.f1704h = 0;
        this.f1705i = i;
        this.f1708l = true;
        mo2086a();
        this.f1698b = false;
    }

    /* renamed from: a */
    public final void mo2092a(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C1133kh.m17843b(context, iArr[i]);
        }
        mo2095b(iArr2);
    }

    /* renamed from: a */
    public final boolean mo1139a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }
}
