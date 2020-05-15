package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrawerLayout extends ViewGroup {

    /* renamed from: C */
    private static boolean f1505C = true;

    /* renamed from: a */
    public static final int[] f1506a = {16842931};

    /* renamed from: h */
    public static final /* synthetic */ int f1507h = 0;

    /* renamed from: i */
    private static final int[] f1508i = {16843828};

    /* renamed from: A */
    private Rect f1509A;

    /* renamed from: B */
    private Matrix f1510B;

    /* renamed from: D */
    private final C1314qz f1511D;

    /* renamed from: b */
    public final C1338rw f1512b;

    /* renamed from: c */
    public final C1338rw f1513c;

    /* renamed from: d */
    public int f1514d;

    /* renamed from: e */
    public boolean f1515e;

    /* renamed from: f */
    public Object f1516f;

    /* renamed from: g */
    public boolean f1517g;

    /* renamed from: j */
    private float f1518j;

    /* renamed from: k */
    private int f1519k;

    /* renamed from: l */
    private int f1520l;

    /* renamed from: m */
    private float f1521m;

    /* renamed from: n */
    private Paint f1522n;

    /* renamed from: o */
    private final ajk f1523o;

    /* renamed from: p */
    private final ajk f1524p;

    /* renamed from: q */
    private boolean f1525q;

    /* renamed from: r */
    private boolean f1526r;

    /* renamed from: s */
    private int f1527s;

    /* renamed from: t */
    private int f1528t;

    /* renamed from: u */
    private int f1529u;

    /* renamed from: v */
    private int f1530v;

    /* renamed from: w */
    private float f1531w;

    /* renamed from: x */
    private float f1532x;

    /* renamed from: y */
    private Drawable f1533y;

    /* renamed from: z */
    private final ArrayList f1534z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new aji();

        /* renamed from: c */
        int f1535c = 0;

        /* renamed from: d */
        int f1536d;

        /* renamed from: e */
        int f1537e;

        /* renamed from: f */
        int f1538f;

        /* renamed from: g */
        int f1539g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1535c = parcel.readInt();
            this.f1536d = parcel.readInt();
            this.f1537e = parcel.readInt();
            this.f1538f = parcel.readInt();
            this.f1539g = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1535c);
            parcel.writeInt(this.f1536d);
            parcel.writeInt(this.f1537e);
            parcel.writeInt(this.f1538f);
            parcel.writeInt(this.f1539g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public static String m1484b(int i) {
        if ((i & 3) != 3) {
            return (i & 5) != 5 ? Integer.toHexString(i) : "RIGHT";
        }
        return "LEFT";
    }

    /* renamed from: g */
    public static boolean m1485g(View view) {
        return (C1280ps.m19917f(view) == 4 || C1280ps.m19917f(view) == 2) ? false : true;
    }

    /* renamed from: h */
    static final boolean m1486h(View view) {
        return ((ajh) view.getLayoutParams()).f641a == 0;
    }

    /* renamed from: a */
    public final int mo1908a(View view) {
        int i;
        if (mo1923d(view)) {
            int i2 = ((ajh) view.getLayoutParams()).f641a;
            int h = C1280ps.m19923h(this);
            if (i2 == 3) {
                i = this.f1527s;
                if (i == 3) {
                    int i3 = h != 0 ? this.f1530v : this.f1529u;
                    if (i3 == 3) {
                        return 0;
                    }
                    return i3;
                }
            } else if (i2 == 5) {
                i = this.f1528t;
                if (i == 3) {
                    int i4 = h != 0 ? this.f1529u : this.f1530v;
                    if (i4 == 3) {
                        return 0;
                    }
                    return i4;
                }
            } else if (i2 == 8388611) {
                i = this.f1529u;
                if (i == 3) {
                    int i5 = h != 0 ? this.f1528t : this.f1527s;
                    if (i5 == 3) {
                        return 0;
                    }
                    return i5;
                }
            } else if (i2 != 8388613) {
                return 0;
            } else {
                i = this.f1530v;
                if (i == 3) {
                    int i6 = h != 0 ? this.f1527s : this.f1528t;
                    if (i6 == 3) {
                        return 0;
                    }
                    return i6;
                }
            }
            return i;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo1923d(childAt)) {
                    this.f1534z.add(childAt);
                } else if (mo1927f(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f1534z.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = (View) this.f1534z.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f1534z.clear();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo1909a() != null || mo1923d(view)) {
            C1280ps.m19906b(view, 4);
        } else {
            C1280ps.m19906b(view, 1);
        }
    }

    /* renamed from: c */
    public final int mo1920c(View view) {
        return C1256ov.m19815a(((ajh) view.getLayoutParams()).f641a, C1280ps.m19923h(this));
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ajh) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((ajh) getChildAt(i).getLayoutParams()).f642b);
        }
        this.f1521m = f;
        boolean b = this.f1512b.mo15834b();
        boolean b2 = this.f1513c.mo15834b();
        if (b || b2) {
            C1280ps.m19915e(this);
        }
    }

    /* renamed from: d */
    public final boolean mo1923d(View view) {
        int a = C1256ov.m19815a(((ajh) view.getLayoutParams()).f641a, C1280ps.m19923h(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1521m <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f1509A == null) {
                this.f1509A = new Rect();
            }
            childAt.getHitRect(this.f1509A);
            if (this.f1509A.contains((int) x, (int) y) && !m1486h(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    int scrollX2 = getScrollX();
                    int left = childAt.getLeft();
                    int scrollY2 = getScrollY();
                    int top = childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (scrollX2 - left), (float) (scrollY2 - top));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f1510B == null) {
                            this.f1510B = new Matrix();
                        }
                        matrix.invert(this.f1510B);
                        obtain.transform(this.f1510B);
                    }
                    z = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean h = m1486h(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (h) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && mo1923d(childAt) && childAt.getHeight() >= height) {
                    if (mo1915a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f1521m;
        if (f > 0.0f && h) {
            int i4 = this.f1520l;
            this.f1522n.setColor((((int) (((float) (i4 >>> 24)) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f1522n);
        }
        return drawChild;
    }

    /* renamed from: f */
    public final boolean mo1927f(View view) {
        if (mo1923d(view)) {
            return (((ajh) view.getLayoutParams()).f644d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ajh();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ajh(getContext(), attributeSet);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.drawerlayout.widget.DrawerLayout.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      androidx.drawerlayout.widget.DrawerLayout.a(int, int):void
      androidx.drawerlayout.widget.DrawerLayout.a(android.view.View, float):void
      androidx.drawerlayout.widget.DrawerLayout.a(android.view.View, int):boolean
      androidx.drawerlayout.widget.DrawerLayout.a(android.view.View, boolean):void */
    /* renamed from: i */
    public final void mo1931i(View view) {
        if (mo1923d(view)) {
            ajh ajh = (ajh) view.getLayoutParams();
            if (this.f1526r) {
                ajh.f642b = 1.0f;
                ajh.f644d = 1;
                mo1913a(view, true);
                mo1919b(view);
            } else {
                ajh.f644d |= 2;
                if (mo1915a(view, 3)) {
                    this.f1512b.mo15830a(view, 0, view.getTop());
                } else {
                    this.f1513c.mo15830a(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1526r = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1526r = true;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f1517g && this.f1533y != null) {
            int i2 = Build.VERSION.SDK_INT;
            Object obj = this.f1516f;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f1533y.setBounds(0, 0, getWidth(), i);
                this.f1533y.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View b;
        int actionMasked = motionEvent.getActionMasked();
        boolean a = this.f1512b.mo15829a(motionEvent) | this.f1513c.mo15829a(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    C1338rw rwVar = this.f1512b;
                    int length = rwVar.f26935c.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (rwVar.mo15827a(i)) {
                            float f = rwVar.f26937e[i] - rwVar.f26935c[i];
                            float f2 = rwVar.f26938f[i] - rwVar.f26936d[i];
                            int i2 = rwVar.f26934b;
                            if ((f * f) + (f2 * f2) > ((float) (i2 * i2))) {
                                this.f1523o.mo829d();
                                this.f1524p.mo829d();
                                break;
                            }
                        }
                        i++;
                    }
                    z = false;
                } else if (actionMasked != 3) {
                    z = false;
                }
            }
            mo1914a(true);
            this.f1515e = false;
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f1531w = x;
            this.f1532x = y;
            z = this.f1521m > 0.0f && (b = this.f1512b.mo15831b((int) x, (int) y)) != null && m1486h(b);
            this.f1515e = false;
        }
        if (!a && !z) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 < childCount) {
                    if (((ajh) getChildAt(i3).getLayoutParams()).f643c) {
                        break;
                    }
                    i3++;
                } else if (!this.f1515e) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || mo1918b() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View b = mo1918b();
        if (b != null && mo1908a(b) == 0) {
            mo1914a(false);
        }
        if (b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        this.f1525q = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ajh ajh = (ajh) childAt.getLayoutParams();
                if (m1486h(childAt)) {
                    childAt.layout(ajh.leftMargin, ajh.topMargin, ajh.leftMargin + childAt.getMeasuredWidth(), ajh.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo1915a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (ajh.f642b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        i5 = i6 - ((int) (ajh.f642b * f3));
                        f = ((float) (i6 - i5)) / f3;
                    }
                    float f4 = ajh.f642b;
                    int i8 = ajh.f641a & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                    if (i8 == 16) {
                        int i9 = i4 - i2;
                        int i10 = (i9 - measuredHeight) / 2;
                        if (i10 < ajh.topMargin) {
                            i10 = ajh.topMargin;
                        } else if (i10 + measuredHeight > i9 - ajh.bottomMargin) {
                            i10 = (i9 - ajh.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i10, measuredWidth + i5, measuredHeight + i10);
                    } else if (i8 != 80) {
                        childAt.layout(i5, ajh.topMargin, measuredWidth + i5, ajh.topMargin + measuredHeight);
                    } else {
                        int i11 = i4 - i2;
                        childAt.layout(i5, (i11 - ajh.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i11 - ajh.bottomMargin);
                    }
                    if (f != f4) {
                        mo1912a(childAt, f);
                    }
                    int i12 = ajh.f642b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i12) {
                        childAt.setVisibility(i12);
                    }
                }
            }
        }
        if (f1505C && (rootWindowInsets = getRootWindowInsets()) != null) {
            C1166ln k = C1296qh.m19996a(rootWindowInsets).mo15745k();
            C1338rw rwVar = this.f1512b;
            rwVar.f26940h = Math.max(rwVar.f26941i, k.f26426b);
            C1338rw rwVar2 = this.f1513c;
            rwVar2.f26940h = Math.max(rwVar2.f26941i, k.f26428d);
        }
        this.f1525q = false;
        this.f1526r = false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z2 = this.f1516f != null && C1280ps.m19938t(this);
        int h = C1280ps.m19923h(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ajh ajh = (ajh) childAt.getLayoutParams();
                if (z2) {
                    int a = C1256ov.m19815a(ajh.f641a, h);
                    if (C1280ps.m19938t(childAt)) {
                        int i5 = Build.VERSION.SDK_INT;
                        Object obj = this.f1516f;
                        if (a == 3) {
                            WindowInsets windowInsets = (WindowInsets) obj;
                            obj = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            WindowInsets windowInsets2 = (WindowInsets) obj;
                            obj = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets((WindowInsets) obj);
                    } else {
                        int i6 = Build.VERSION.SDK_INT;
                        Object obj2 = this.f1516f;
                        if (a == 3) {
                            WindowInsets windowInsets3 = (WindowInsets) obj2;
                            obj2 = windowInsets3.replaceSystemWindowInsets(windowInsets3.getSystemWindowInsetLeft(), windowInsets3.getSystemWindowInsetTop(), i3, windowInsets3.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            WindowInsets windowInsets4 = (WindowInsets) obj2;
                            obj2 = windowInsets4.replaceSystemWindowInsets(i3, windowInsets4.getSystemWindowInsetTop(), windowInsets4.getSystemWindowInsetRight(), windowInsets4.getSystemWindowInsetBottom());
                        }
                        WindowInsets windowInsets5 = (WindowInsets) obj2;
                        ajh.leftMargin = windowInsets5.getSystemWindowInsetLeft();
                        ajh.topMargin = windowInsets5.getSystemWindowInsetTop();
                        ajh.rightMargin = windowInsets5.getSystemWindowInsetRight();
                        ajh.bottomMargin = windowInsets5.getSystemWindowInsetBottom();
                    }
                }
                if (m1486h(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ajh.leftMargin) - ajh.rightMargin, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec((size2 - ajh.topMargin) - ajh.bottomMargin, JGCastService.FLAG_PRIVATE_DISPLAY));
                } else if (mo1923d(childAt)) {
                    float o = C1280ps.m19933o(childAt);
                    float f = this.f1518j;
                    if (o != f) {
                        C1280ps.m19918f(childAt, f);
                    }
                    int c = mo1920c(childAt) & 7;
                    if (c == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((!z || !z4) && (z || !z3)) {
                        z3 |= !z;
                        z4 |= z;
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f1519k + ajh.leftMargin + ajh.rightMargin, ajh.width), ViewGroup.getChildMeasureSpec(i2, ajh.topMargin + ajh.bottomMargin, ajh.height));
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m1484b(c) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View a;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        int i = savedState.f1535c;
        if (!(i == 0 || (a = mo1910a(i)) == null)) {
            mo1931i(a);
        }
        int i2 = savedState.f1536d;
        if (i2 != 3) {
            mo1911a(i2, 3);
        }
        int i3 = savedState.f1537e;
        if (i3 != 3) {
            mo1911a(i3, 5);
        }
        int i4 = savedState.f1538f;
        if (i4 != 3) {
            mo1911a(i4, 8388611);
        }
        int i5 = savedState.f1539g;
        if (i5 != 3) {
            mo1911a(i5, 8388613);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        ajh ajh;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            ajh = (ajh) getChildAt(i).getLayoutParams();
            int i2 = ajh.f644d;
            if (!(i2 == 1 || i2 == 2)) {
                i++;
            }
        }
        savedState.f1535c = ajh.f641a;
        savedState.f1536d = this.f1527s;
        savedState.f1537e = this.f1528t;
        savedState.f1538f = this.f1529u;
        savedState.f1539g = this.f1530v;
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View a;
        this.f1512b.mo15833b(motionEvent);
        this.f1513c.mo15833b(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = false;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f1531w = x;
            this.f1532x = y;
            this.f1515e = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View b = this.f1512b.mo15831b((int) x2, (int) y2);
            if (b != null && m1486h(b)) {
                float f = x2 - this.f1531w;
                float f2 = y2 - this.f1532x;
                int i = this.f1512b.f26934b;
                if ((f * f) + (f2 * f2) < ((float) (i * i)) && (a = mo1909a()) != null) {
                    if (mo1908a(a) == 2) {
                        z = true;
                    }
                    mo1914a(z);
                }
            }
            z = true;
            mo1914a(z);
        } else if (action == 3) {
            mo1914a(true);
            this.f1515e = false;
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo1914a(true);
        }
    }

    public final void requestLayout() {
        if (!this.f1525q) {
            super.requestLayout();
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.drawerLayoutStyle);
    }

    /* renamed from: b */
    public final View mo1918b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo1923d(childAt)) {
                if (!mo1923d(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                } else if (((ajh) childAt.getLayoutParams()).f642b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo1926e(View view) {
        if (mo1923d(view)) {
            ajh ajh = (ajh) view.getLayoutParams();
            if (!this.f1526r) {
                ajh.f644d |= 4;
                if (mo1915a(view, 3)) {
                    this.f1512b.mo15830a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f1513c.mo15830a(view, getWidth(), view.getTop());
                }
            } else {
                ajh.f642b = 0.0f;
                ajh.f644d = 0;
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ajh) {
            return new ajh((ajh) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ajh((ViewGroup.MarginLayoutParams) layoutParams) : new ajh(layoutParams);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [androidx.drawerlayout.widget.DrawerLayout, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new ajg();
        this.f1520l = -1728053248;
        this.f1522n = new Paint();
        this.f1526r = true;
        this.f1527s = 3;
        this.f1528t = 3;
        this.f1529u = 3;
        this.f1530v = 3;
        this.f1511D = new ajd(this);
        setDescendantFocusability(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        float f = getResources().getDisplayMetrics().density;
        this.f1519k = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        this.f1523o = new ajk(this, 3);
        this.f1524p = new ajk(this, 5);
        C1338rw b = C1338rw.m20131b(this, this.f1523o);
        this.f1512b = b;
        b.f26942j = 1;
        b.f26939g = f2;
        this.f1523o.f647b = b;
        C1338rw b2 = C1338rw.m20131b(this, this.f1524p);
        this.f1513c = b2;
        b2.f26942j = 2;
        b2.f26939g = f2;
        this.f1524p.f647b = b2;
        setFocusableInTouchMode(true);
        C1280ps.m19906b((View) this, 1);
        C1280ps.m19894a(this, new ajf(this));
        setMotionEventSplittingEnabled(false);
        if (C1280ps.m19938t(this)) {
            int i2 = Build.VERSION.SDK_INT;
            setOnApplyWindowInsetsListener(new aje());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1508i);
            try {
                this.f1533y = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ajc.f638a, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f1518j = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f1518j = getResources().getDimension(C0126R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f1534z = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo1909a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((ajh) childAt.getLayoutParams()).f644d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final View mo1910a(int i) {
        int a = C1256ov.m19815a(i, C1280ps.m19923h(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo1920c(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo1919b(View view) {
        C1280ps.m19910c(view, C1298qj.f26868i.mo15748a());
        if (mo1927f(view) && mo1908a(view) != 2) {
            C1280ps.m19898a(view, C1298qj.f26868i, this.f1511D);
        }
    }

    /* renamed from: a */
    public final void mo1911a(int i, int i2) {
        View a;
        C1338rw rwVar;
        int a2 = C1256ov.m19815a(i2, C1280ps.m19923h(this));
        if (i2 == 3) {
            this.f1527s = i;
        } else if (i2 == 5) {
            this.f1528t = i;
        } else if (i2 == 8388611) {
            this.f1529u = i;
        } else if (i2 == 8388613) {
            this.f1530v = i;
        }
        if (i != 0) {
            if (a2 != 3) {
                rwVar = this.f1513c;
            } else {
                rwVar = this.f1512b;
            }
            rwVar.mo15825a();
        }
        if (i == 1) {
            View a3 = mo1910a(a2);
            if (a3 != null) {
                mo1926e(a3);
            }
        } else if (i == 2 && (a = mo1910a(a2)) != null) {
            mo1931i(a);
        }
    }

    /* renamed from: a */
    public final void mo1912a(View view, float f) {
        ajh ajh = (ajh) view.getLayoutParams();
        if (f != ajh.f642b) {
            ajh.f642b = f;
        }
    }

    /* renamed from: a */
    public final void mo1913a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (z ? childAt != view : mo1923d(childAt)) {
                C1280ps.m19906b(childAt, 4);
            } else {
                C1280ps.m19906b(childAt, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1914a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ajh ajh = (ajh) childAt.getLayoutParams();
            if (mo1923d(childAt) && (!z || ajh.f643c)) {
                int width = childAt.getWidth();
                if (mo1915a(childAt, 3)) {
                    z2 |= this.f1512b.mo15830a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.f1513c.mo15830a(childAt, getWidth(), childAt.getTop());
                }
                ajh.f643c = false;
            }
        }
        this.f1523o.mo829d();
        this.f1524p.mo829d();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: a */
    public final boolean mo1915a(View view, int i) {
        return (mo1920c(view) & i) == i;
    }
}
