package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: bino */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bino extends ViewGroup {

    /* renamed from: d */
    private static final Interpolator f121012d = new binn();

    /* renamed from: a */
    private final int f121013a;

    /* renamed from: b */
    private boolean f121014b = false;

    /* renamed from: c */
    private boolean f121015c = false;

    /* renamed from: h */
    public final float[] f121016h = {0.0f, 0.0f};

    /* renamed from: i */
    public final int[] f121017i = {-2147483647, Integer.MAX_VALUE};

    /* renamed from: j */
    public final int f121018j;

    /* renamed from: k */
    public final int f121019k;

    /* renamed from: l */
    public float f121020l = 0.0f;

    /* renamed from: m */
    public VelocityTracker f121021m;

    /* renamed from: n */
    protected boolean f121022n = false;

    /* renamed from: o */
    public boolean f121023o = false;

    /* renamed from: p */
    public final int f121024p = 500;

    /* renamed from: q */
    protected final Scroller f121025q;

    public bino(Context context) {
        super(context);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.f121013a = viewConfiguration.getScaledTouchSlop();
        this.f121019k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f121018j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f121025q = new Scroller(context2, f121012d);
    }

    /* renamed from: a */
    private final void mo71324a() {
        if (!this.f121022n && this.f121025q.isFinished()) {
            mo64809c();
            this.f121014b = true;
        }
        this.f121022n = true;
        this.f121020l = 0.0f;
        this.f121025q.abortAnimation();
    }

    /* renamed from: b */
    private final int m102613b(int i) {
        int[] iArr = this.f121017i;
        int i2 = iArr[0];
        if (i < i2) {
            return i2;
        }
        int i3 = iArr[1];
        return i > i3 ? i3 : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64803a(float f) {
        throw null;
    }

    /* renamed from: c */
    public void mo64809c() {
    }

    public final void computeScroll() {
        if (this.f121025q.computeScrollOffset()) {
            int currY = this.f121025q.getCurrY();
            this.f121015c = true;
            scrollTo(0, currY);
            this.f121015c = false;
            invalidate();
            float f = this.f121020l;
            if (f != 0.0f) {
                mo64803a(f);
                this.f121020l = 0.0f;
            }
            if (currY == this.f121025q.getFinalY()) {
                this.f121025q.abortAnimation();
                if (this.f121014b) {
                    this.f121014b = false;
                    mo64811d();
                }
            }
        }
    }

    /* renamed from: d */
    public void mo64811d() {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return mo64807a(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f121021m == null) {
            this.f121021m = VelocityTracker.obtain();
        }
        this.f121021m.addMovement(motionEvent);
        if (this.f121022n) {
            if (action != 1) {
                if (action == 2) {
                    float f = this.f121016h[1];
                    mo64808b(motionEvent);
                    mo64804a(getScrollY() + Math.round(f - this.f121016h[1]));
                    this.f121023o = false;
                }
                return true;
            }
            this.f121022n = false;
            if (action == 3 || getChildCount() <= 0) {
                mo64803a(0.0f);
            } else {
                this.f121021m.computeCurrentVelocity(1000, (float) this.f121018j);
                float yVelocity = this.f121021m.getYVelocity();
                int i = this.f121019k;
                if (yVelocity <= ((float) i) && yVelocity >= ((float) (-i))) {
                    mo64803a(0.0f);
                } else {
                    float f2 = -yVelocity;
                    this.f121020l = f2;
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    Scroller scroller = this.f121025q;
                    int[] iArr = this.f121017i;
                    scroller.fling(scrollX, scrollY, 0, (int) f2, 0, 0, iArr[0], iArr[1]);
                    invalidate();
                }
            }
            VelocityTracker velocityTracker = this.f121021m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f121021m = null;
            }
            this.f121023o = false;
            return true;
        } else if (mo64807a(motionEvent) || action != 1 || !this.f121023o) {
            return true;
        } else {
            this.f121023o = false;
            return performClick();
        }
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (!this.f121015c) {
            this.f121025q.abortAnimation();
        }
    }

    public final boolean showContextMenuForChild(View view) {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo64808b(MotionEvent motionEvent) {
        this.f121016h[0] = motionEvent.getX();
        this.f121016h[1] = motionEvent.getY();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64804a(int i) {
        scrollTo(0, m102613b(i));
    }

    public bino(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.f121013a = viewConfiguration.getScaledTouchSlop();
        this.f121019k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f121018j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f121025q = new Scroller(context2, f121012d);
    }

    /* renamed from: a */
    public final void mo64805a(int i, int i2) {
        int[] iArr = this.f121017i;
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: a */
    public final void mo64806a(int i, boolean z, int i2) {
        if (z) {
            i = m102613b(i);
        }
        this.f121025q.startScroll(0, getScrollY(), 0, i - getScrollY(), i2);
        invalidate();
    }

    public bino(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.f121013a = viewConfiguration.getScaledTouchSlop();
        this.f121019k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f121018j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f121025q = new Scroller(context2, f121012d);
    }

    /* renamed from: a */
    public final boolean mo64807a(MotionEvent motionEvent) {
        boolean z;
        if (!this.f121022n) {
            int action = motionEvent.getAction();
            if (action == 0) {
                mo64808b(motionEvent);
                if (this.f121025q.isFinished()) {
                    this.f121023o = true;
                } else {
                    mo71324a();
                    return true;
                }
            } else if (action == 2) {
                float x = motionEvent.getX() - this.f121016h[0];
                float y = motionEvent.getY() - this.f121016h[1];
                int i = this.f121013a;
                float f = (float) i;
                if (x > f || x < ((float) (-i))) {
                    z = true;
                } else {
                    z = false;
                }
                if ((y > f || y < ((float) (-i))) && !z) {
                    mo64808b(motionEvent);
                    mo71324a();
                    return true;
                }
            }
            return false;
        }
        this.f121022n = false;
        return false;
    }
}
