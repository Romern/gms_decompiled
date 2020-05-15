package android.support.p001v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.cast.JGCastService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NestedScrollView extends FrameLayout implements C1268pg, C1265pd {

    /* renamed from: x */
    private static final C1330ro f1049x = new C1330ro();

    /* renamed from: y */
    private static final int[] f1050y = {16843130};

    /* renamed from: A */
    private final C1266pe f1051A;

    /* renamed from: B */
    private float f1052B;

    /* renamed from: a */
    public C1331rp f1053a;

    /* renamed from: b */
    private long f1054b;

    /* renamed from: c */
    private final Rect f1055c;

    /* renamed from: d */
    private OverScroller f1056d;

    /* renamed from: e */
    private EdgeEffect f1057e;

    /* renamed from: f */
    private EdgeEffect f1058f;

    /* renamed from: g */
    private int f1059g;

    /* renamed from: h */
    private boolean f1060h;

    /* renamed from: i */
    private boolean f1061i;

    /* renamed from: j */
    private View f1062j;

    /* renamed from: k */
    private boolean f1063k;

    /* renamed from: l */
    private VelocityTracker f1064l;

    /* renamed from: m */
    private boolean f1065m;

    /* renamed from: n */
    private boolean f1066n;

    /* renamed from: o */
    private int f1067o;

    /* renamed from: p */
    private int f1068p;

    /* renamed from: q */
    private int f1069q;

    /* renamed from: r */
    private int f1070r;

    /* renamed from: s */
    private final int[] f1071s;

    /* renamed from: t */
    private final int[] f1072t;

    /* renamed from: u */
    private int f1073u;

    /* renamed from: v */
    private int f1074v;

    /* renamed from: w */
    private SavedState f1075w;

    /* renamed from: z */
    private final C1269ph f1076z;

    /* renamed from: android.support.v4.widget.NestedScrollView$SavedState */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C1332rq();

        /* renamed from: a */
        public int f1077a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1077a = parcel.readInt();
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1077a + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1077a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m1191a(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1054b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i3 = layoutParams.topMargin;
                int i4 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                this.f1056d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i3) + i4) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, 250);
                m1201b(z);
            } else {
                if (!this.f1056d.isFinished()) {
                    m1203d();
                }
                scrollBy(i, i2);
            }
            this.f1054b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b */
    private static int m1198b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: c */
    private final void m1202c() {
        VelocityTracker velocityTracker = this.f1064l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1064l = null;
        }
    }

    /* renamed from: d */
    private final void m1203d() {
        this.f1056d.abortAnimation();
        mo1128a(1);
    }

    /* renamed from: e */
    private final void m1204e() {
        this.f1063k = false;
        m1202c();
        mo1128a(0);
        EdgeEffect edgeEffect = this.f1057e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1058f.onRelease();
        }
    }

    /* renamed from: f */
    private final void m1205f() {
        if (getOverScrollMode() == 2) {
            this.f1057e = null;
            this.f1058f = null;
        } else if (this.f1057e == null) {
            Context context = getContext();
            this.f1057e = new EdgeEffect(context);
            this.f1058f = new EdgeEffect(context);
        }
    }

    /* renamed from: h */
    private final void m1206h(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1066n) {
            mo1162f(i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: a */
    public final boolean mo1139a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final void computeScroll() {
        if (!this.f1056d.isFinished()) {
            this.f1056d.computeScrollOffset();
            int currY = this.f1056d.getCurrY();
            int i = currY - this.f1074v;
            this.f1074v = currY;
            int[] iArr = this.f1072t;
            iArr[1] = 0;
            mo1137a(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f1072t[1];
            int a = mo1126a();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo1136a(i2, getScrollX(), scrollY, a);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f1072t;
                iArr2[1] = 0;
                mo1129a(scrollY2, i3, this.f1071s, 1, iArr2);
                i2 = i3 - this.f1072t[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && a > 0)) {
                    m1205f();
                    if (i2 < 0) {
                        if (this.f1057e.isFinished()) {
                            this.f1057e.onAbsorb((int) this.f1056d.getCurrVelocity());
                        }
                    } else if (this.f1058f.isFinished()) {
                        this.f1058f.onAbsorb((int) this.f1056d.getCurrVelocity());
                    }
                }
                m1203d();
            }
            if (!this.f1056d.isFinished()) {
                C1280ps.m19915e(this);
            } else {
                mo1128a(1);
            }
        }
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY <= max ? bottom : bottom + (scrollY - max);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo1138a(keyEvent);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1051A.mo15679a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1051A.mo15678a(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo1137a(i, i2, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1051A.mo15682a(i, i2, i3, i4, iArr);
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1057e != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1057e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                } else {
                    i = 0;
                }
                int i4 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1057e.setSize(width, height);
                if (this.f1057e.draw(canvas)) {
                    C1280ps.m19915e(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1058f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(mo1126a(), scrollY) + height2;
                int i5 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft();
                }
                int i6 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1058f.setSize(width2, height2);
                if (this.f1058f.draw(canvas)) {
                    C1280ps.m19915e(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final int getNestedScrollAxes() {
        return this.f1076z.mo15689a();
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final boolean hasNestedScrollingParent() {
        return mo1145b(0);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f1051A.f26827a;
    }

    /* access modifiers changed from: protected */
    public final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1061i = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1063k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                float f = this.f1052B;
                if (f == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        f = typedValue.getDimension(context.getResources().getDisplayMetrics());
                        this.f1052B = f;
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int a = mo1126a();
                int scrollY = getScrollY();
                int i = scrollY - ((int) (axisValue * f));
                if (i < 0) {
                    a = 0;
                } else if (i <= a) {
                    a = i;
                }
                if (a != scrollY) {
                    super.scrollTo(getScrollX(), a);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1063k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1070r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1059g) > this.f1067o && (2 & getNestedScrollAxes()) == 0) {
                                this.f1063k = true;
                                this.f1059g = y;
                                m1199b();
                                this.f1064l.addMovement(motionEvent);
                                this.f1073u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1193a(motionEvent);
                    }
                }
            }
            this.f1063k = false;
            this.f1070r = -1;
            m1202c();
            if (this.f1056d.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo1126a())) {
                C1280ps.m19915e(this);
            }
            mo1128a(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.f1059g = y2;
                    this.f1070r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.f1064l;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    } else {
                        this.f1064l = VelocityTracker.obtain();
                    }
                    this.f1064l.addMovement(motionEvent);
                    this.f1056d.computeScrollOffset();
                    this.f1063k = !this.f1056d.isFinished();
                    mo1135a(2, 0);
                }
            }
            this.f1063k = false;
            m1202c();
        }
        return this.f1063k;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1060h = false;
        View view = this.f1062j;
        if (view != null && m1197a(view, this)) {
            m1200b(this.f1062j);
        }
        this.f1062j = null;
        if (!this.f1061i) {
            if (this.f1075w != null) {
                scrollTo(getScrollX(), this.f1075w.f1077a);
                this.f1075w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int b = m1198b(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1061i = true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1065m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, JGCastService.FLAG_PRIVATE_DISPLAY));
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo1161e((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1133a(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1192a(i4, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1144b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocusFromRect = rect != null ? FocusFinder.getInstance().findNextFocusFromRect(this, rect, i) : FocusFinder.getInstance().findNextFocus(this, null, i);
        if (findNextFocusFromRect == null || m1195a(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1075w = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1077a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C1331rp rpVar = this.f1053a;
        if (rpVar != null) {
            ((bjqp) rpVar).mo65458a(this, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1196a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1055c);
            offsetDescendantRectToMyCoords(findFocus, this.f1055c);
            m1206h(mo1127a(this.f1055c));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1139a(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo1130a(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int i;
        MotionEvent motionEvent2 = motionEvent;
        m1199b();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1073u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f1073u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1064l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1069q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1070r);
                if (Math.abs(yVelocity) >= this.f1068p) {
                    int i2 = -yVelocity;
                    float f = (float) i2;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo1161e(i2);
                    }
                } else if (this.f1056d.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo1126a())) {
                    C1280ps.m19915e(this);
                }
                this.f1070r = -1;
                m1204e();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f1070r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1070r + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.f1059g - y;
                    if (!this.f1063k && Math.abs(i3) > this.f1067o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1063k = true;
                        if (i3 > 0) {
                            i3 -= this.f1067o;
                        } else {
                            i = i3 + this.f1067o;
                            if (this.f1063k) {
                                if (mo1137a(0, i, this.f1072t, this.f1071s, 0)) {
                                    i -= this.f1072t[1];
                                    this.f1073u += this.f1071s[1];
                                }
                                this.f1059g = y - this.f1071s[1];
                                int scrollY = getScrollY();
                                int a = mo1126a();
                                int overScrollMode = getOverScrollMode();
                                boolean z = overScrollMode == 0 ? true : overScrollMode == 1 && a > 0;
                                if (mo1136a(i, 0, getScrollY(), a) && !mo1145b(0)) {
                                    this.f1064l.clear();
                                }
                                int scrollY2 = getScrollY() - scrollY;
                                int[] iArr = this.f1072t;
                                iArr[1] = 0;
                                mo1129a(scrollY2, i - scrollY2, this.f1071s, 0, iArr);
                                int i4 = this.f1059g;
                                int i5 = this.f1071s[1];
                                this.f1059g = i4 - i5;
                                this.f1073u += i5;
                                if (z) {
                                    int i6 = i - this.f1072t[1];
                                    m1205f();
                                    int i7 = scrollY + i6;
                                    if (i7 < 0) {
                                        C1322rg.m20066a(this.f1057e, ((float) i6) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                        if (!this.f1058f.isFinished()) {
                                            this.f1058f.onRelease();
                                        }
                                    } else if (i7 > a) {
                                        C1322rg.m20066a(this.f1058f, ((float) i6) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                        if (!this.f1057e.isFinished()) {
                                            this.f1057e.onRelease();
                                        }
                                    }
                                    EdgeEffect edgeEffect = this.f1057e;
                                    if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f1058f.isFinished())) {
                                        C1280ps.m19915e(this);
                                    }
                                }
                            }
                        }
                    }
                    i = i3;
                    if (this.f1063k) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1063k && getChildCount() > 0 && this.f1056d.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo1126a())) {
                    C1280ps.m19915e(this);
                }
                this.f1070r = -1;
                m1204e();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1059g = (int) motionEvent2.getY(actionIndex);
                this.f1070r = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1193a(motionEvent);
                this.f1059g = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f1070r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f1056d.isFinished();
            this.f1063k = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1056d.isFinished()) {
                m1203d();
            }
            this.f1059g = (int) motionEvent.getY();
            this.f1070r = motionEvent2.getPointerId(0);
            mo1135a(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f1064l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f1060h) {
            m1200b(view2);
        } else {
            this.f1062j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = mo1127a(rect);
        if (a != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!z) {
                mo1162f(a);
            } else {
                scrollBy(0, a);
            }
        }
        return z2;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1202c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.f1060h = true;
        super.requestLayout();
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b = m1198b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b2 = m1198b(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f1051A.mo15676a(z);
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return mo1135a(i, 0);
    }

    public final void stopNestedScroll() {
        mo1128a(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private final void m1199b() {
        if (this.f1064l == null) {
            this.f1064l = VelocityTracker.obtain();
        }
    }

    /* renamed from: c */
    public final boolean mo1146c(int i) {
        int childCount;
        int height = getHeight();
        this.f1055c.top = 0;
        this.f1055c.bottom = height;
        if (i == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1055c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.f1055c;
            rect.top = rect.bottom - height;
        }
        return m1194a(i, this.f1055c.top, this.f1055c.bottom);
    }

    /* renamed from: d */
    public final boolean mo1154d(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !m1196a(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m1206h(height);
        } else {
            findNextFocus.getDrawingRect(this.f1055c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1055c);
            m1206h(mo1127a(this.f1055c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m1195a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v4.widget.NestedScrollView.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      android.support.v4.widget.NestedScrollView.a(int, int, int[]):void
      android.support.v4.widget.NestedScrollView.a(int, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(android.view.View, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(int, int, boolean):void */
    /* renamed from: g */
    public final void mo1163g(int i) {
        m1191a(-getScrollX(), i - getScrollY(), true);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1055c = new Rect();
        this.f1060h = true;
        this.f1061i = false;
        this.f1062j = null;
        this.f1063k = false;
        this.f1066n = true;
        this.f1070r = -1;
        this.f1071s = new int[2];
        this.f1072t = new int[2];
        this.f1056d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1067o = viewConfiguration.getScaledTouchSlop();
        this.f1068p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1069q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1050y, i, 0);
        mo1134a(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1076z = new C1269ph();
        this.f1051A = new C1266pe(this);
        setNestedScrollingEnabled(true);
        C1280ps.m19894a(this, f1049x);
    }

    /* renamed from: b */
    private final void m1200b(View view) {
        view.getDrawingRect(this.f1055c);
        offsetDescendantRectToMyCoords(view, this.f1055c);
        int a = mo1127a(this.f1055c);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: e */
    public final void mo1161e(int i) {
        if (getChildCount() > 0) {
            this.f1056d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m1201b(true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v4.widget.NestedScrollView.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      android.support.v4.widget.NestedScrollView.a(int, int, int[]):void
      android.support.v4.widget.NestedScrollView.a(int, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(android.view.View, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(int, int, boolean):void */
    /* renamed from: f */
    public final void mo1162f(int i) {
        m1191a(0, i, false);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    private final void m1192a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1051A.mo15683a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: b */
    private final void m1201b(boolean z) {
        if (z) {
            mo1135a(2, 1);
        } else {
            mo1128a(1);
        }
        this.f1074v = getScrollY();
        C1280ps.m19915e(this);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    private final void m1193a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1070r) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f1059g = (int) motionEvent.getY(i);
            this.f1070r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1064l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: b */
    public final void mo1144b(View view, View view2, int i, int i2) {
        this.f1076z.mo15691a(i, i2);
        mo1135a(2, i2);
    }

    /* renamed from: b */
    public final boolean mo1145b(int i) {
        return this.f1051A.mo15680a(i);
    }

    /* renamed from: a */
    private final boolean m1194a(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                if (i6 >= top) {
                    z2 = false;
                } else {
                    z2 = bottom < i7;
                }
                if (view == null) {
                    view = view2;
                    z3 = z2;
                } else {
                    boolean z4 = i5 != 33 ? bottom > view.getBottom() : top < view.getTop();
                    if (!z3) {
                        if (z2) {
                            view = view2;
                            z3 = true;
                        } else if (!z4) {
                        }
                    } else if (z2) {
                        if (!z4) {
                        }
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i6 < scrollY || i7 > i8) {
            if (i5 != 33) {
                i4 = i7 - i8;
            } else {
                i4 = i6 - scrollY;
            }
            m1206h(i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z;
    }

    /* renamed from: a */
    private final boolean m1195a(View view) {
        return !m1196a(view, 0, getHeight());
    }

    /* renamed from: a */
    private final boolean m1196a(View view, int i, int i2) {
        view.getDrawingRect(this.f1055c);
        offsetDescendantRectToMyCoords(view, this.f1055c);
        return this.f1055c.bottom + i >= getScrollY() && this.f1055c.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m1197a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m1197a((View) parent, view2);
    }

    /* renamed from: a */
    public final int mo1126a() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo1127a(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = -(i - rect.bottom);
            } else {
                i2 = -(scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    /* renamed from: a */
    public final void mo1128a(int i) {
        this.f1051A.mo15688c(i);
    }

    /* renamed from: a */
    public final void mo1129a(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.f1051A.mo15683a(0, i, 0, i2, iArr, i3, iArr2);
    }

    /* renamed from: a */
    public final void mo1130a(View view, int i) {
        this.f1076z.mo15690a(i);
        mo1128a(i);
    }

    /* renamed from: a */
    public final void mo1131a(View view, int i, int i2, int i3, int i4, int i5) {
        m1192a(i4, i5, (int[]) null);
    }

    /* renamed from: a */
    public final void mo1132a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1192a(i4, i5, iArr);
    }

    /* renamed from: a */
    public final void mo1133a(View view, int i, int i2, int[] iArr, int i3) {
        mo1137a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public final void mo1134a(boolean z) {
        if (z != this.f1065m) {
            this.f1065m = z;
            requestLayout();
        }
    }

    /* renamed from: a */
    public final boolean mo1135a(int i, int i2) {
        return this.f1051A.mo15681a(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo1136a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 > 0) {
            z = true;
        } else {
            z = i2 < 0;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 >= 0) {
            i4 = i5;
            z2 = false;
        } else {
            z2 = true;
            i4 = 0;
        }
        if (z2 && !mo1145b(1)) {
            this.f1056d.springBack(0, i4, 0, 0, 0, mo1126a());
        }
        super.scrollTo(0, i4);
        return z || z2;
    }

    /* renamed from: a */
    public final boolean mo1137a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1051A.mo15685a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public final boolean mo1138a(KeyEvent keyEvent) {
        this.f1055c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                int i = 33;
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            return false;
                        }
                        if (!keyEvent.isShiftPressed()) {
                            i = 130;
                        }
                        int height = getHeight();
                        if (i == 130) {
                            this.f1055c.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                                if (this.f1055c.top + height > bottom) {
                                    this.f1055c.top = bottom - height;
                                }
                            }
                        } else {
                            this.f1055c.top = getScrollY() - height;
                            if (this.f1055c.top < 0) {
                                this.f1055c.top = 0;
                            }
                        }
                        Rect rect = this.f1055c;
                        rect.bottom = rect.top + height;
                        m1194a(i, this.f1055c.top, this.f1055c.bottom);
                        return false;
                    } else if (!keyEvent.isAltPressed()) {
                        return mo1154d(130);
                    } else {
                        return mo1146c(130);
                    }
                } else if (!keyEvent.isAltPressed()) {
                    return mo1154d(33);
                } else {
                    return mo1146c(33);
                }
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
