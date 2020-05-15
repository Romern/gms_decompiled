package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.cast.JGCastService;
import com.google.android.material.tabs.TabLayout;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ViewPager extends ViewGroup {

    /* renamed from: W */
    private static final avu f1724W = new avu();

    /* renamed from: a */
    public static final int[] f1725a = {16842931};

    /* renamed from: h */
    private static final Comparator f1726h = new avi();

    /* renamed from: i */
    private static final Interpolator f1727i = new avj();

    /* renamed from: A */
    private int f1728A;

    /* renamed from: B */
    private int f1729B;

    /* renamed from: C */
    private int f1730C;

    /* renamed from: D */
    private boolean f1731D = true;

    /* renamed from: E */
    private float f1732E;

    /* renamed from: F */
    private float f1733F;

    /* renamed from: G */
    private float f1734G;

    /* renamed from: H */
    private float f1735H;

    /* renamed from: I */
    private int f1736I = -1;

    /* renamed from: J */
    private VelocityTracker f1737J;

    /* renamed from: K */
    private int f1738K;

    /* renamed from: L */
    private int f1739L;

    /* renamed from: M */
    private int f1740M;

    /* renamed from: N */
    private int f1741N;

    /* renamed from: O */
    private EdgeEffect f1742O;

    /* renamed from: P */
    private EdgeEffect f1743P;

    /* renamed from: Q */
    private boolean f1744Q = true;

    /* renamed from: R */
    private boolean f1745R;

    /* renamed from: S */
    private int f1746S;

    /* renamed from: T */
    private int f1747T;

    /* renamed from: U */
    private int f1748U;

    /* renamed from: V */
    private ArrayList f1749V;

    /* renamed from: aa */
    private final Runnable f1750aa = new avk(this);

    /* renamed from: ab */
    private int f1751ab = 0;

    /* renamed from: ac */
    private atmd f1752ac;

    /* renamed from: b */
    public avh f1753b;

    /* renamed from: c */
    public int f1754c;

    /* renamed from: d */
    public int f1755d;

    /* renamed from: e */
    public List f1756e;

    /* renamed from: f */
    public List f1757f;

    /* renamed from: g */
    private int f1758g;

    /* renamed from: j */
    private final ArrayList f1759j = new ArrayList();

    /* renamed from: k */
    private final avn f1760k = new avn();

    /* renamed from: l */
    private final Rect f1761l = new Rect();

    /* renamed from: m */
    private int f1762m = -1;

    /* renamed from: n */
    private Parcelable f1763n = null;

    /* renamed from: o */
    private ClassLoader f1764o = null;

    /* renamed from: p */
    private Scroller f1765p;

    /* renamed from: q */
    private boolean f1766q;

    /* renamed from: r */
    private avr f1767r;

    /* renamed from: s */
    private float f1768s = -3.4028235E38f;

    /* renamed from: t */
    private float f1769t = Float.MAX_VALUE;

    /* renamed from: u */
    private boolean f1770u;

    /* renamed from: v */
    private boolean f1771v;

    /* renamed from: w */
    private boolean f1772w;

    /* renamed from: x */
    private int f1773x = 1;

    /* renamed from: y */
    private boolean f1774y;

    /* renamed from: z */
    private boolean f1775z;

    public ViewPager(Context context) {
        super(context);
        mo2129a();
    }

    /* renamed from: a */
    private final Rect m1679a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view != null) {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            ViewParent parent = view.getParent();
            while ((parent instanceof ViewGroup) && parent != this) {
                ViewGroup viewGroup = (ViewGroup) parent;
                rect.left += viewGroup.getLeft();
                rect.right += viewGroup.getRight();
                rect.top += viewGroup.getTop();
                rect.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            }
            return rect;
        }
        rect.set(0, 0, 0, 0);
        return rect;
    }

    /* renamed from: b */
    private final void m1684b(boolean z) {
        if (this.f1771v != z) {
            this.f1771v = z;
        }
    }

    /* renamed from: f */
    private final int m1685f() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: g */
    private final void m1686g() {
        if (this.f1748U != 0) {
            ArrayList arrayList = this.f1749V;
            if (arrayList == null) {
                this.f1749V = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f1749V.add(getChildAt(i));
            }
            Collections.sort(this.f1749V, f1724W);
        }
    }

    /* renamed from: h */
    private final void m1688h(int i) {
        List list = this.f1756e;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                avq avq = (avq) this.f1756e.get(i2);
                if (avq != null) {
                    avq.mo1834a(i);
                }
            }
        }
    }

    /* renamed from: i */
    private final avn m1690i() {
        float f;
        float f2;
        int i;
        int f3 = m1685f();
        float f4 = 0.0f;
        if (f3 > 0) {
            f = ((float) getScrollX()) / ((float) f3);
        } else {
            f = 0.0f;
        }
        if (f3 > 0) {
            f2 = ((float) this.f1755d) / ((float) f3);
        } else {
            f2 = 0.0f;
        }
        avn avn = null;
        float f5 = 0.0f;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        while (i2 < this.f1759j.size()) {
            avn avn2 = (avn) this.f1759j.get(i2);
            if (!z && avn2.f2382b != (i = i3 + 1)) {
                avn2 = this.f1760k;
                avn2.f2385e = f4 + f5 + f2;
                avn2.f2382b = i;
                avn2.f2384d = 1.0f;
                i2--;
            }
            f4 = avn2.f2385e;
            float f6 = avn2.f2384d + f4 + f2;
            if (!z && f < f4) {
                return avn;
            }
            if (f < f6 || i2 == this.f1759j.size() - 1) {
                return avn2;
            }
            i3 = avn2.f2382b;
            f5 = avn2.f2384d;
            i2++;
            avn = avn2;
            z = false;
        }
        return avn;
    }

    /* renamed from: j */
    private final void m1691j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        avn a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = mo2128a(childAt)) != null && a.f2382b == this.f1754c) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        avn a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = mo2128a(childAt)) != null && a.f2382b == this.f1754c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        avo avo = (avo) layoutParams;
        boolean z2 = avo.f2386a;
        if (view.getClass().getAnnotation(avm.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        avo.f2386a = z3;
        if (!this.f1770u) {
            super.addView(view, i, layoutParams);
        } else if (avo != null && z3) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            avo.f2389d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* renamed from: c */
    public final void mo2144c() {
        mo2145c(this.f1754c);
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.f1753b != null) {
            int f = m1685f();
            int scrollX = getScrollX();
            return i < 0 ? scrollX > ((int) (((float) f) * this.f1768s)) : i > 0 && scrollX < ((int) (((float) f) * this.f1769t));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof avo) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.f1766q = true;
        if (this.f1765p.isFinished() || !this.f1765p.computeScrollOffset()) {
            m1682a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1765p.getCurrX();
        int currY = this.f1765p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m1687g(currX)) {
                this.f1765p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C1280ps.m19915e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final avn mo2149d(int i) {
        for (int i2 = 0; i2 < this.f1759j.size(); i2++) {
            avn avn = (avn) this.f1759j.get(i2);
            if (avn.f2382b == i) {
                return avn;
            }
        }
        return null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                z = keyEvent.hasModifiers(2) ? mo2150d() : mo2155e(17);
            } else if (keyCode == 22) {
                z = keyEvent.hasModifiers(2) ? mo2154e() : mo2155e(66);
            } else if (keyCode != 61) {
                return false;
            } else {
                if (keyEvent.hasNoModifiers()) {
                    z = mo2155e(2);
                } else if (!keyEvent.hasModifiers(1)) {
                    return false;
                } else {
                    z = mo2155e(1);
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        avn a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = mo2128a(childAt)) != null && a.f2382b == this.f1754c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        boolean z;
        avh avh;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (avh = this.f1753b) == null || avh.mo2709a() <= 1)) {
            this.f1742O.finish();
            this.f1743P.finish();
            return;
        }
        if (!this.f1742O.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-height) + getPaddingTop()), this.f1768s * ((float) width));
            this.f1742O.setSize(height, width);
            z = this.f1742O.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        if (!this.f1743P.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), (-(this.f1769t + 1.0f)) * ((float) width2));
            this.f1743P.setSize((height2 - paddingTop) - paddingBottom, width2);
            z |= this.f1743P.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z) {
            C1280ps.m19915e(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo2154e() {
        avh avh = this.f1753b;
        if (avh == null || this.f1754c >= avh.mo2709a() - 1) {
            return false;
        }
        mo2156f(this.f1754c + 1);
        return true;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new avo();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new avo(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        return ((avo) ((View) this.f1749V.get(i2)).getLayoutParams()).f2391f;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1744Q = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1750aa);
        Scroller scroller = this.f1765p;
        if (scroller != null && !scroller.isFinished()) {
            this.f1765p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m1689h();
            return false;
        }
        if (action != 0) {
            if (this.f1774y) {
                return true;
            }
            if (this.f1775z) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1734G = x;
            this.f1732E = x;
            float y = motionEvent.getY();
            this.f1735H = y;
            this.f1733F = y;
            this.f1736I = motionEvent2.getPointerId(0);
            this.f1775z = false;
            this.f1766q = true;
            this.f1765p.computeScrollOffset();
            if (this.f1751ab != 2 || Math.abs(this.f1765p.getFinalX() - this.f1765p.getCurrX()) <= this.f1741N) {
                m1682a(false);
                this.f1774y = false;
            } else {
                this.f1765p.abortAnimation();
                this.f1772w = false;
                mo2144c();
                this.f1774y = true;
                m1691j();
                mo2130a(1);
            }
        } else if (action == 2) {
            int i = this.f1736I;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.f1732E;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f1735H);
                if (f2 != 0.0f) {
                    float f3 = this.f1732E;
                    if ((this.f1731D || ((f3 >= ((float) this.f1729B) || f2 <= 0.0f) && (f3 <= ((float) (getWidth() - this.f1729B)) || f2 >= 0.0f))) && mo2138a(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.f1732E = x2;
                        this.f1733F = y2;
                        this.f1775z = true;
                        return false;
                    }
                }
                float f4 = (float) this.f1730C;
                if (abs > f4 && abs * 0.5f > abs2) {
                    this.f1774y = true;
                    m1691j();
                    mo2130a(1);
                    if (f2 <= 0.0f) {
                        f = this.f1734G - ((float) this.f1730C);
                    } else {
                        f = this.f1734G + ((float) this.f1730C);
                    }
                    this.f1732E = f;
                    this.f1733F = y2;
                    m1684b(true);
                } else if (abs2 > f4) {
                    this.f1775z = true;
                }
                if (this.f1774y && m1683a(x2)) {
                    C1280ps.m19915e(this);
                }
            }
        } else if (action == 6) {
            m1681a(motionEvent);
        }
        if (this.f1737J == null) {
            this.f1737J = VelocityTracker.obtain();
        }
        this.f1737J.addMovement(motionEvent2);
        return this.f1774y;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        avn a;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                avo avo = (avo) childAt.getLayoutParams();
                if (avo.f2386a) {
                    int i11 = avo.f2387b;
                    int i12 = i11 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                    int i13 = i11 & 7;
                    if (i13 == 1) {
                        i5 = paddingLeft;
                        paddingLeft = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i13 == 3) {
                        i5 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i13 != 5) {
                        i5 = paddingLeft;
                    } else {
                        int measuredWidth = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i5 = paddingLeft;
                        paddingLeft = measuredWidth;
                    }
                    if (i12 == 16) {
                        i6 = paddingTop;
                        paddingTop = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else if (i12 == 48) {
                        i6 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i12 != 80) {
                        i6 = paddingTop;
                    } else {
                        int measuredHeight = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i6 = paddingTop;
                        paddingTop = measuredHeight;
                    }
                    int i14 = paddingLeft + scrollX;
                    childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, paddingTop + childAt.getMeasuredHeight());
                    i10++;
                    paddingLeft = i5;
                    paddingTop = i6;
                }
            }
            i9++;
            z2 = false;
        }
        int i15 = (i7 - paddingLeft) - paddingRight;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                avo avo2 = (avo) childAt2.getLayoutParams();
                if (!avo2.f2386a && (a = mo2128a(childAt2)) != null) {
                    float f = (float) i15;
                    int i17 = ((int) (a.f2385e * f)) + paddingLeft;
                    if (avo2.f2389d) {
                        avo2.f2389d = z2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * avo2.f2388c), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, JGCastService.FLAG_PRIVATE_DISPLAY));
                    }
                    childAt2.layout(i17, paddingTop, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f1746S = i10;
        if (this.f1744Q) {
            m1680a(this.f1754c, z2, z2 ? 1 : 0, z2);
        }
        this.f1744Q = z2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        avo avo;
        avo avo2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1729B = Math.min(measuredWidth / 10, this.f1728A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z3 = true;
            z3 = true;
            int i8 = JGCastService.FLAG_PRIVATE_DISPLAY;
            i8 = JGCastService.FLAG_PRIVATE_DISPLAY;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (!(childAt.getVisibility() == 8 || (avo2 = (avo) childAt.getLayoutParams()) == null || !avo2.f2386a)) {
                int i9 = avo2.f2387b;
                int i10 = i9 & 7;
                int i11 = i9 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                if (i11 == 48 || i11 == 80) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i10 == 3 || i10 == 5)) {
                    z3 = false;
                }
                int i12 = Integer.MIN_VALUE;
                i12 = Integer.MIN_VALUE;
                if (z) {
                    i12 = JGCastService.FLAG_PRIVATE_DISPLAY;
                    i3 = Integer.MIN_VALUE;
                } else {
                    i3 = z3 ? JGCastService.FLAG_PRIVATE_DISPLAY : Integer.MIN_VALUE;
                }
                if (avo2.width == -2) {
                    i4 = i12;
                    i5 = paddingLeft;
                } else {
                    i5 = avo2.width != -1 ? avo2.width : paddingLeft;
                    i4 = JGCastService.FLAG_PRIVATE_DISPLAY;
                }
                if (avo2.height == -2) {
                    i6 = measuredHeight;
                    i8 = i3;
                } else {
                    i6 = avo2.height != -1 ? avo2.height : measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i4), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z3) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z2 = false;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, JGCastService.FLAG_PRIVATE_DISPLAY);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, JGCastService.FLAG_PRIVATE_DISPLAY);
        this.f1770u = true;
        mo2144c();
        this.f1770u = z2;
        int childCount2 = getChildCount();
        for (int i13 = z2; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((avo = (avo) childAt2.getLayoutParams()) == null || !avo.f2386a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * avo.f2388c), JGCastService.FLAG_PRIVATE_DISPLAY), makeMeasureSpec);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        avn a;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) == 0) {
            i3 = childCount - 1;
            i2 = -1;
        } else {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (a = mo2128a(childAt)) != null && a.f2382b == this.f1754c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        avh avh = this.f1753b;
        if (avh != null) {
            avh.mo2713a(savedState.f1777d, savedState.f1778e);
            mo2133a(savedState.f1776c, false, true);
            return;
        }
        this.f1762m = savedState.f1776c;
        this.f1763n = savedState.f1777d;
        this.f1764o = savedState.f1778e;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1776c = this.f1754c;
        avh avh = this.f1753b;
        if (avh != null) {
            savedState.f1777d = avh.mo2717b();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f1755d;
            mo2132a(i, i3, i5, i5);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.viewpager.widget.ViewPager.a(int, boolean, int, boolean):void
     arg types: [int, int, int, int]
     candidates:
      androidx.viewpager.widget.ViewPager.a(int, int, int, int):void
      androidx.viewpager.widget.ViewPager.a(int, boolean, boolean, int):void
      androidx.viewpager.widget.ViewPager.a(int, boolean, int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.viewpager.widget.ViewPager.a(int, boolean, boolean, int):void
     arg types: [int, int, int, int]
     candidates:
      androidx.viewpager.widget.ViewPager.a(int, boolean, int, boolean):void
      androidx.viewpager.widget.ViewPager.a(int, int, int, int):void
      androidx.viewpager.widget.ViewPager.a(int, boolean, boolean, int):void */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        avh avh;
        boolean z;
        float f;
        float f2;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (avh = this.f1753b) == null || avh.mo2709a() == 0) {
            return false;
        }
        if (this.f1737J == null) {
            this.f1737J = VelocityTracker.obtain();
        }
        this.f1737J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f1774y) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f1736I);
                        if (findPointerIndex == -1) {
                            z = m1689h();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.f1732E);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.f1733F);
                            if (abs > ((float) this.f1730C) && abs > abs2) {
                                this.f1774y = true;
                                m1691j();
                                float f3 = this.f1734G;
                                if (x - f3 > 0.0f) {
                                    f2 = f3 + ((float) this.f1730C);
                                } else {
                                    f2 = f3 - ((float) this.f1730C);
                                }
                                this.f1732E = f2;
                                this.f1733F = y;
                                mo2130a(1);
                                m1684b(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f1774y) {
                        z = m1683a(motionEvent.getX(motionEvent.findPointerIndex(this.f1736I)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f1732E = motionEvent.getX(actionIndex);
                        this.f1736I = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m1681a(motionEvent);
                        this.f1732E = motionEvent.getX(motionEvent.findPointerIndex(this.f1736I));
                    }
                } else if (this.f1774y) {
                    m1680a(this.f1754c, true, 0, false);
                    z = m1689h();
                }
            } else if (this.f1774y) {
                VelocityTracker velocityTracker = this.f1737J;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1739L);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f1736I);
                this.f1772w = true;
                int f4 = m1685f();
                int scrollX = getScrollX();
                avn i = m1690i();
                int i2 = this.f1755d;
                int i3 = i.f2382b;
                float f5 = (float) f4;
                float f6 = ((((float) scrollX) / f5) - i.f2385e) / (i.f2384d + (((float) i2) / f5));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f1736I)) - this.f1734G)) <= this.f1740M || Math.abs(xVelocity) <= this.f1738K) {
                    if (i3 >= this.f1754c) {
                        f = 0.4f;
                    } else {
                        f = 0.6f;
                    }
                    i3 += (int) (f6 + f);
                } else if (xVelocity <= 0) {
                    i3++;
                }
                if (this.f1759j.size() > 0) {
                    ArrayList arrayList = this.f1759j;
                    i3 = Math.max(((avn) this.f1759j.get(0)).f2382b, Math.min(i3, ((avn) arrayList.get(arrayList.size() - 1)).f2382b));
                }
                mo2134a(i3, true, true, xVelocity);
                z = m1689h();
            }
            if (z) {
                C1280ps.m19915e(this);
            }
        } else {
            this.f1765p.abortAnimation();
            this.f1772w = false;
            mo2144c();
            float x2 = motionEvent.getX();
            this.f1734G = x2;
            this.f1732E = x2;
            float y2 = motionEvent.getY();
            this.f1735H = y2;
            this.f1733F = y2;
            this.f1736I = motionEvent.getPointerId(0);
        }
        return true;
    }

    public final void removeView(View view) {
        if (this.f1770u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    /* renamed from: b */
    public final void mo2142b() {
        boolean z;
        int a = this.f1753b.mo2709a();
        this.f1758g = a;
        int size = this.f1759j.size();
        int i = this.f1773x;
        if (size >= i + i + 1 || this.f1759j.size() >= a) {
            z = false;
        } else {
            z = true;
        }
        int i2 = this.f1754c;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.f1759j.size()) {
            avn avn = (avn) this.f1759j.get(i3);
            int a2 = this.f1753b.mo2710a(avn.f2381a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.f1759j.remove(i3);
                    i3--;
                    if (!z2) {
                        this.f1753b.mo2714a((ViewGroup) this);
                    }
                    this.f1753b.mo2715a(this, avn.f2382b, avn.f2381a);
                    int i4 = this.f1754c;
                    if (i4 == avn.f2382b) {
                        i2 = Math.max(0, Math.min(i4, -1 + a));
                    }
                    z = true;
                    z2 = true;
                } else {
                    int i5 = avn.f2382b;
                    if (i5 != a2) {
                        if (i5 == this.f1754c) {
                            i2 = a2;
                        }
                        avn.f2382b = a2;
                        z = true;
                    }
                }
            }
            i3++;
        }
        if (z2) {
            this.f1753b.mo2721d();
        }
        Collections.sort(this.f1759j, f1726h);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                avo avo = (avo) getChildAt(i6).getLayoutParams();
                if (!avo.f2386a) {
                    avo.f2388c = 0.0f;
                }
            }
            mo2133a(i2, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r9 == r10) goto L_0x005e;
     */
    /* renamed from: c */
    public final void mo2145c(int i) {
        avn avn;
        String str;
        avn avn2;
        avn avn3;
        int i2;
        avn a;
        avn avn4;
        float f;
        float f2;
        int i3;
        int i4;
        avn avn5;
        avn avn6;
        avn avn7;
        float f3;
        int i5 = i;
        int i6 = this.f1754c;
        if (i6 != i5) {
            avn = mo2149d(i6);
            this.f1754c = i5;
        } else {
            avn = null;
        }
        if (this.f1753b == null) {
            m1686g();
        } else if (this.f1772w) {
            m1686g();
        } else if (getWindowToken() != null) {
            this.f1753b.mo2714a((ViewGroup) this);
            int i7 = this.f1773x;
            int max = Math.max(0, this.f1754c - i7);
            int a2 = this.f1753b.mo2709a();
            int min = Math.min(a2 - 1, this.f1754c + i7);
            if (a2 == this.f1758g) {
                int i8 = 0;
                while (true) {
                    if (i8 >= this.f1759j.size()) {
                        break;
                    }
                    avn2 = (avn) this.f1759j.get(i8);
                    int i9 = avn2.f2382b;
                    int i10 = this.f1754c;
                    if (i9 < i10) {
                        i8++;
                    }
                }
                avn2 = null;
                if (avn2 == null && a2 > 0) {
                    avn2 = mo2127a(this.f1754c, i8);
                }
                if (avn2 != null) {
                    int i11 = i8 - 1;
                    if (i11 >= 0) {
                        avn4 = (avn) this.f1759j.get(i11);
                    } else {
                        avn4 = null;
                    }
                    int f4 = m1685f();
                    if (f4 > 0) {
                        f = (2.0f - avn2.f2384d) + (((float) getPaddingLeft()) / ((float) f4));
                    } else {
                        f = 0.0f;
                    }
                    float f5 = 0.0f;
                    for (int i12 = this.f1754c - 1; i12 >= 0; i12--) {
                        if (f5 >= f && i12 < max) {
                            if (avn4 == null) {
                                break;
                            } else if (i12 == avn4.f2382b && !avn4.f2383c) {
                                this.f1759j.remove(i11);
                                this.f1753b.mo2715a(this, i12, avn4.f2381a);
                                i11--;
                                i8--;
                                avn4 = i11 >= 0 ? (avn) this.f1759j.get(i11) : null;
                            }
                        } else if (avn4 != null && i12 == avn4.f2382b) {
                            f5 += avn4.f2384d;
                            i11--;
                            avn4 = i11 >= 0 ? (avn) this.f1759j.get(i11) : null;
                        } else {
                            f5 += mo2127a(i12, i11 + 1).f2384d;
                            i8++;
                            avn4 = i11 >= 0 ? (avn) this.f1759j.get(i11) : null;
                        }
                    }
                    float f6 = avn2.f2384d;
                    int i13 = i8 + 1;
                    if (f6 < 2.0f) {
                        if (i13 < this.f1759j.size()) {
                            avn7 = (avn) this.f1759j.get(i13);
                        } else {
                            avn7 = null;
                        }
                        if (f4 > 0) {
                            f3 = (((float) getPaddingRight()) / ((float) f4)) + 2.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        int i14 = i13;
                        for (int i15 = this.f1754c + 1; i15 < a2; i15++) {
                            if (f6 >= f3 && i15 > min) {
                                if (avn7 == null) {
                                    break;
                                } else if (i15 == avn7.f2382b && !avn7.f2383c) {
                                    this.f1759j.remove(i14);
                                    this.f1753b.mo2715a(this, i15, avn7.f2381a);
                                    avn7 = i14 < this.f1759j.size() ? (avn) this.f1759j.get(i14) : null;
                                }
                            } else if (avn7 != null && i15 == avn7.f2382b) {
                                f6 += avn7.f2384d;
                                i14++;
                                avn7 = i14 < this.f1759j.size() ? (avn) this.f1759j.get(i14) : null;
                            } else {
                                int i16 = i14 + 1;
                                f6 += mo2127a(i15, i14).f2384d;
                                if (i16 < this.f1759j.size()) {
                                    i14 = i16;
                                    avn7 = (avn) this.f1759j.get(i16);
                                } else {
                                    i14 = i16;
                                    avn7 = null;
                                }
                            }
                        }
                    }
                    int a3 = this.f1753b.mo2709a();
                    int f7 = m1685f();
                    if (f7 > 0) {
                        f2 = ((float) this.f1755d) / ((float) f7);
                    } else {
                        f2 = 0.0f;
                    }
                    if (avn != null) {
                        int i17 = avn.f2382b;
                        int i18 = avn2.f2382b;
                        if (i17 < i18) {
                            float f8 = avn.f2385e + avn.f2384d + f2;
                            int i19 = i17 + 1;
                            int i20 = 0;
                            while (i19 <= avn2.f2382b && i20 < this.f1759j.size()) {
                                Object obj = this.f1759j.get(i20);
                                while (true) {
                                    avn6 = (avn) obj;
                                    if (i19 > avn6.f2382b && i20 < this.f1759j.size() - 1) {
                                        i20++;
                                        obj = this.f1759j.get(i20);
                                    }
                                }
                                while (i19 < avn6.f2382b) {
                                    f8 += f2 + 1.0f;
                                    i19++;
                                }
                                avn6.f2385e = f8;
                                f8 += avn6.f2384d + f2;
                                i19++;
                            }
                        } else if (i17 > i18) {
                            int size = this.f1759j.size() - 1;
                            float f9 = avn.f2385e;
                            while (true) {
                                i17--;
                                if (i17 < avn2.f2382b || size < 0) {
                                    break;
                                }
                                Object obj2 = this.f1759j.get(size);
                                while (true) {
                                    avn5 = (avn) obj2;
                                    if (i17 < avn5.f2382b && size > 0) {
                                        size--;
                                        obj2 = this.f1759j.get(size);
                                    }
                                }
                                while (i17 > avn5.f2382b) {
                                    f9 -= f2 + 1.0f;
                                    i17--;
                                }
                                f9 -= avn5.f2384d + f2;
                                avn5.f2385e = f9;
                            }
                        }
                    }
                    int size2 = this.f1759j.size();
                    float f10 = avn2.f2385e;
                    int i21 = avn2.f2382b;
                    int i22 = i21 - 1;
                    this.f1768s = i21 == 0 ? f10 : -3.4028235E38f;
                    int i23 = a3 - 1;
                    this.f1769t = i21 == i23 ? (avn2.f2384d + f10) - 4.0f : Float.MAX_VALUE;
                    int i24 = i8 - 1;
                    while (i24 >= 0) {
                        avn avn8 = (avn) this.f1759j.get(i24);
                        while (true) {
                            i4 = avn8.f2382b;
                            if (i22 <= i4) {
                                break;
                            }
                            i22--;
                            f10 -= f2 + 1.0f;
                        }
                        f10 -= avn8.f2384d + f2;
                        avn8.f2385e = f10;
                        if (i4 == 0) {
                            this.f1768s = f10;
                        }
                        i24--;
                        i22--;
                    }
                    float f11 = avn2.f2385e + avn2.f2384d + f2;
                    int i25 = avn2.f2382b + 1;
                    while (i13 < size2) {
                        avn avn9 = (avn) this.f1759j.get(i13);
                        while (true) {
                            i3 = avn9.f2382b;
                            if (i25 >= i3) {
                                break;
                            }
                            i25++;
                            f11 += f2 + 1.0f;
                        }
                        if (i3 == i23) {
                            this.f1769t = (avn9.f2384d + f11) - 4.0f;
                        }
                        avn9.f2385e = f11;
                        f11 += avn9.f2384d + f2;
                        i13++;
                        i25++;
                    }
                    this.f1753b.mo2718b(avn2.f2381a);
                }
                this.f1753b.mo2721d();
                int childCount = getChildCount();
                for (int i26 = 0; i26 < childCount; i26++) {
                    View childAt = getChildAt(i26);
                    avo avo = (avo) childAt.getLayoutParams();
                    avo.f2391f = i26;
                    if (!avo.f2386a && avo.f2388c == 0.0f && (a = mo2128a(childAt)) != null) {
                        avo.f2388c = a.f2384d;
                        avo.f2390e = a.f2382b;
                    }
                }
                m1686g();
                if (hasFocus()) {
                    View findFocus = findFocus();
                    if (findFocus != null) {
                        while (true) {
                            ViewParent parent = findFocus.getParent();
                            if (parent != this) {
                                if (!(parent instanceof View)) {
                                    avn3 = null;
                                    break;
                                }
                                findFocus = (View) parent;
                            } else {
                                avn3 = mo2128a(findFocus);
                                break;
                            }
                        }
                    } else {
                        avn3 = null;
                    }
                    if (avn3 == null) {
                        i2 = 0;
                    } else if (avn3.f2382b != this.f1754c) {
                        i2 = 0;
                    } else {
                        return;
                    }
                    while (i2 < getChildCount()) {
                        View childAt2 = getChildAt(i2);
                        avn a4 = mo2128a(childAt2);
                        if (a4 == null || a4.f2382b != this.f1754c || !childAt2.requestFocus(2)) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            try {
                str = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException e) {
                str = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f1758g + ", found: " + a2 + " Pager id: " + str + " Pager class: " + getClass() + " Problematic adapter: " + this.f1753b.getClass());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo2150d() {
        int i = this.f1754c;
        if (i <= 0) {
            return false;
        }
        mo2156f(i - 1);
        return true;
    }

    /* renamed from: e */
    public final boolean mo2155e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (parent instanceof ViewGroup) {
                    if (parent == this) {
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    findFocus = null;
                }
            }
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        boolean z = false;
        if (findNextFocus == null || findNextFocus == findFocus) {
            if (i == 17 || i == 1) {
                z = mo2150d();
            } else if (i == 66 || i == 2) {
                z = mo2154e();
            }
        } else if (i == 17) {
            z = (findFocus != null && m1679a(this.f1761l, findNextFocus).left >= m1679a(this.f1761l, findFocus).left) ? mo2150d() : findNextFocus.requestFocus();
        } else if (i == 66) {
            z = (findFocus != null && m1679a(this.f1761l, findNextFocus).left <= m1679a(this.f1761l, findFocus).left) ? mo2154e() : findNextFocus.requestFocus();
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z;
    }

    /* renamed from: f */
    public final void mo2156f(int i) {
        this.f1772w = false;
        mo2133a(i, true, false);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new avs();

        /* renamed from: c */
        int f1776c;

        /* renamed from: d */
        Parcelable f1777d;

        /* renamed from: e */
        ClassLoader f1778e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f1776c = parcel.readInt();
            this.f1777d = parcel.readParcelable(classLoader);
            this.f1778e = classLoader;
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1776c + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1776c);
            parcel.writeParcelable(this.f1777d, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: h */
    private final boolean m1689h() {
        this.f1736I = -1;
        this.f1774y = false;
        this.f1775z = false;
        VelocityTracker velocityTracker = this.f1737J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1737J = null;
        }
        this.f1742O.onRelease();
        this.f1743P.onRelease();
        if (this.f1742O.isFinished() || this.f1743P.isFinished()) {
            return true;
        }
        return false;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2129a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    private final void m1680a(int i, boolean z, int i2, boolean z2) {
        int i3;
        int i4;
        avn d = mo2149d(i);
        int f = d != null ? (int) (((float) m1685f()) * Math.max(this.f1768s, Math.min(d.f2385e, this.f1769t))) : 0;
        if (z) {
            if (getChildCount() != 0) {
                Scroller scroller = this.f1765p;
                if (scroller != null && !scroller.isFinished()) {
                    int startX = !this.f1766q ? this.f1765p.getStartX() : this.f1765p.getCurrX();
                    this.f1765p.abortAnimation();
                    m1684b(false);
                    i3 = startX;
                } else {
                    i3 = getScrollX();
                }
                int scrollY = getScrollY();
                int i5 = f - i3;
                int i6 = -scrollY;
                if (i5 == 0 && i6 == 0) {
                    m1682a(false);
                    mo2144c();
                    mo2130a(0);
                } else {
                    m1684b(true);
                    mo2130a(2);
                    int f2 = m1685f();
                    float f3 = (float) (f2 / 2);
                    float f4 = (float) f2;
                    float sin = f3 + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i5)) / f4) - 8.0f) * 0.47123894f))) * f3);
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        i4 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        i4 = (int) (((((float) Math.abs(i5)) / (f4 + ((float) this.f1755d))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i4, 600);
                    this.f1766q = false;
                    this.f1765p.startScroll(i3, scrollY, i5, i6, min);
                    C1280ps.m19915e(this);
                }
            } else {
                m1684b(false);
            }
            if (z2) {
                m1688h(i);
                return;
            }
            return;
        }
        if (z2) {
            m1688h(i);
        }
        m1682a(false);
        scrollTo(f, 0);
        m1687g(f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.viewpager.widget.ViewPager.a(int, float):void
     arg types: [int, int]
     candidates:
      androidx.viewpager.widget.ViewPager.a(android.graphics.Rect, android.view.View):android.graphics.Rect
      androidx.viewpager.widget.ViewPager.a(int, int):avn
      androidx.viewpager.widget.ViewPager.a(int, float):void */
    /* renamed from: g */
    private final boolean m1687g(int i) {
        if (this.f1759j.size() != 0) {
            avn i2 = m1690i();
            int f = m1685f();
            int i3 = this.f1755d;
            int i4 = i2.f2382b;
            float f2 = (float) f;
            float f3 = i2.f2385e;
            float f4 = i2.f2384d;
            this.f1745R = false;
            mo2131a(i4, ((((float) i) / f2) - f3) / (f4 + (((float) i3) / f2)));
            if (this.f1745R) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f1744Q) {
            return false;
        } else {
            this.f1745R = false;
            mo2131a(0, 0.0f);
            if (this.f1745R) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: b */
    public final void mo2143b(int i) {
        this.f1772w = false;
        mo2133a(i, !this.f1744Q, false);
    }

    /* renamed from: a */
    private final void m1681a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1736I) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f1732E = motionEvent.getX(i);
            this.f1736I = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1737J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private final void m1682a(boolean z) {
        boolean z2;
        if (this.f1751ab == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            m1684b(false);
            if (!this.f1765p.isFinished()) {
                this.f1765p.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1765p.getCurrX();
                int currY = this.f1765p.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (scrollX != currX) {
                        m1687g(currX);
                    }
                }
            }
        }
        this.f1772w = false;
        for (int i = 0; i < this.f1759j.size(); i++) {
            avn avn = (avn) this.f1759j.get(i);
            if (avn.f2383c) {
                avn.f2383c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (!z) {
            this.f1750aa.run();
        } else {
            C1280ps.m19891a(this, this.f1750aa);
        }
    }

    /* renamed from: a */
    private final boolean m1683a(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1732E;
        this.f1732E = f;
        float scrollX = ((float) getScrollX()) + (f2 - f);
        float f3 = (float) m1685f();
        float f4 = this.f1768s * f3;
        float f5 = this.f1769t * f3;
        boolean z3 = false;
        avn avn = (avn) this.f1759j.get(0);
        ArrayList arrayList = this.f1759j;
        avn avn2 = (avn) arrayList.get(arrayList.size() - 1);
        if (avn.f2382b != 0) {
            f4 = avn.f2385e * f3;
            z = false;
        } else {
            z = true;
        }
        if (avn2.f2382b != this.f1753b.mo2709a() - 1) {
            f5 = avn2.f2385e * f3;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.f1742O.onPull(Math.abs(f4 - scrollX) / f3);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.f1743P.onPull(Math.abs(scrollX - f5) / f3);
                z3 = true;
            }
            scrollX = f5;
        }
        int i = (int) scrollX;
        this.f1732E += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m1687g(i);
        return z3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final avn mo2127a(int i, int i2) {
        avn avn = new avn();
        avn.f2382b = i;
        avn.f2381a = this.f1753b.mo2711a(this, i);
        avn.f2384d = 1.0f;
        if (i2 < 0 || i2 >= this.f1759j.size()) {
            this.f1759j.add(avn);
        } else {
            this.f1759j.add(i2, avn);
        }
        return avn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final avn mo2128a(View view) {
        for (int i = 0; i < this.f1759j.size(); i++) {
            avn avn = (avn) this.f1759j.get(i);
            if (this.f1753b.mo2716a(view, avn.f2381a)) {
                return avn;
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [androidx.viewpager.widget.ViewPager, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2129a() {
        setWillNotDraw(false);
        setDescendantFocusability(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        setFocusable(true);
        Context context = getContext();
        this.f1765p = new Scroller(context, f1727i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1730C = viewConfiguration.getScaledPagingTouchSlop();
        this.f1738K = (int) (400.0f * f);
        this.f1739L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1742O = new EdgeEffect(context);
        this.f1743P = new EdgeEffect(context);
        this.f1740M = (int) (25.0f * f);
        this.f1741N = (int) (f + f);
        this.f1728A = (int) (f * 16.0f);
        C1280ps.m19894a(this, new avp(this));
        if (C1280ps.m19917f(this) == 0) {
            C1280ps.m19906b((View) this, 1);
        }
        C1280ps.m19895a(this, new avl(this));
    }

    /* renamed from: a */
    public final void mo2130a(int i) {
        int i2;
        if (this.f1751ab != i) {
            this.f1751ab = i;
            if (this.f1752ac != null) {
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (i != 0) {
                        i2 = this.f1747T;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, null);
                }
            }
            List list = this.f1756e;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    avq avq = (avq) this.f1756e.get(i4);
                    if (avq != null) {
                        avq.mo1836b(i);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2131a(int i, float f) {
        float f2;
        int i2;
        if (this.f1746S > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                avo avo = (avo) childAt.getLayoutParams();
                if (avo.f2386a) {
                    int i4 = avo.f2387b & 7;
                    if (i4 == 1) {
                        i2 = paddingLeft;
                        paddingLeft = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i4 == 3) {
                        i2 = childAt.getWidth() + paddingLeft;
                    } else if (i4 != 5) {
                        i2 = paddingLeft;
                    } else {
                        int measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i2 = paddingLeft;
                        paddingLeft = measuredWidth;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i2;
                }
            }
        }
        List list = this.f1756e;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                avq avq = (avq) this.f1756e.get(i5);
                if (avq != null) {
                    avq.mo1835a(i, f);
                }
            }
        }
        if (this.f1752ac != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((avo) childAt2.getLayoutParams()).f2386a) {
                    float left2 = (((float) (childAt2.getLeft() - scrollX2)) / ((float) m1685f())) - ((((float) (this.f1752ac.f90468a.f90473f.getMeasuredWidth() - childAt2.getMeasuredWidth())) / ((float) childAt2.getMeasuredWidth())) / 2.0f);
                    if (left2 >= 0.0f) {
                        f2 = 1.0f - (left2 * 0.39999998f);
                    } else {
                        f2 = 1.0f + (left2 * 0.39999998f);
                    }
                    float max = Math.max(0.8f, f2);
                    childAt2.setScaleX(max);
                    childAt2.setScaleY(max);
                }
            }
        }
        this.f1745R = true;
    }

    /* renamed from: a */
    public final void mo2132a(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.f1759j.isEmpty()) {
            avn d = mo2149d(this.f1754c);
            if (d != null) {
                f = Math.min(d.f2385e, this.f1769t);
            } else {
                f = 0.0f;
            }
            int paddingLeft = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                m1682a(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.f1765p.isFinished()) {
            this.f1765p.setFinalX(this.f1754c * m1685f());
        } else {
            int paddingLeft2 = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingLeft3 = getPaddingLeft();
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - paddingLeft3) - getPaddingRight()) + i4))) * ((float) (((i - paddingLeft2) - paddingRight) + i3))), getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2133a(int i, boolean z, boolean z2) {
        mo2134a(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[LOOP:0: B:22:0x0046->B:24:0x004e, LOOP_END] */
    /* renamed from: a */
    public final void mo2134a(int i, boolean z, boolean z2, int i2) {
        int i3;
        avh avh = this.f1753b;
        boolean z3 = false;
        if (avh == null || avh.mo2709a() <= 0) {
            m1684b(false);
        } else if (z2 || this.f1754c != i || this.f1759j.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f1753b.mo2709a()) {
                i = this.f1753b.mo2709a() - 1;
            }
            int i4 = this.f1773x;
            int i5 = this.f1754c;
            if (i > i5 + i4) {
                i3 = 0;
                while (i3 < this.f1759j.size()) {
                }
            } else if (i < i5 - i4) {
                i3 = 0;
                while (i3 < this.f1759j.size()) {
                    ((avn) this.f1759j.get(i3)).f2383c = true;
                    i3++;
                }
            }
            if (this.f1754c != i) {
                z3 = true;
            }
            if (this.f1744Q) {
                this.f1754c = i;
                if (z3) {
                    m1688h(i);
                }
                requestLayout();
                return;
            }
            mo2145c(i);
            m1680a(i, z, i2, z3);
        } else {
            m1684b(false);
        }
    }

    /* renamed from: a */
    public final void mo2135a(atmd atmd) {
        atmd atmd2 = this.f1752ac;
        this.f1752ac = atmd;
        setChildrenDrawingOrderEnabled(true);
        this.f1748U = 1;
        this.f1747T = 2;
        if (atmd2 == null) {
            mo2144c();
        }
    }

    /* renamed from: a */
    public final void mo2136a(avh avh) {
        avh avh2 = this.f1753b;
        if (avh2 != null) {
            avh2.mo2712a((DataSetObserver) null);
            this.f1753b.mo2714a((ViewGroup) this);
            for (int i = 0; i < this.f1759j.size(); i++) {
                avn avn = (avn) this.f1759j.get(i);
                this.f1753b.mo2715a(this, avn.f2382b, avn.f2381a);
            }
            this.f1753b.mo2721d();
            this.f1759j.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((avo) getChildAt(i2).getLayoutParams()).f2386a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f1754c = 0;
            scrollTo(0, 0);
        }
        this.f1753b = avh;
        this.f1758g = 0;
        if (avh != null) {
            if (this.f1767r == null) {
                this.f1767r = new avr(this);
            }
            this.f1753b.mo2712a((DataSetObserver) this.f1767r);
            this.f1772w = false;
            boolean z = this.f1744Q;
            this.f1744Q = true;
            this.f1758g = this.f1753b.mo2709a();
            if (this.f1762m >= 0) {
                this.f1753b.mo2713a(this.f1763n, this.f1764o);
                mo2133a(this.f1762m, false, true);
                this.f1762m = -1;
                this.f1763n = null;
                this.f1764o = null;
            } else if (z) {
                requestLayout();
            } else {
                mo2144c();
            }
        }
        List list = this.f1757f;
        if (list != null && !list.isEmpty()) {
            int size = this.f1757f.size();
            for (int i3 = 0; i3 < size; i3++) {
                bhnp bhnp = (bhnp) this.f1757f.get(i3);
                TabLayout tabLayout = bhnp.f119144b;
                if (tabLayout.f151233A == this) {
                    tabLayout.mo71219a(avh, bhnp.f119143a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2137a(avq avq) {
        if (this.f1756e == null) {
            this.f1756e = new ArrayList();
        }
        this.f1756e.add(avq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo2138a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && mo2138a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }
}
