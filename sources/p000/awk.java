package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.wear.widget.SwipeDismissFrameLayout;

/* renamed from: awk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class awk extends FrameLayout {

    /* renamed from: a */
    private int f2423a;

    /* renamed from: b */
    private int f2424b;

    /* renamed from: c */
    private float f2425c;

    /* renamed from: d */
    private int f2426d;

    /* renamed from: e */
    private float f2427e;

    /* renamed from: f */
    private float f2428f;

    /* renamed from: g */
    private boolean f2429g;

    /* renamed from: h */
    public awh f2430h;

    /* renamed from: i */
    public awg f2431i;

    /* renamed from: j */
    public awj f2432j;

    /* renamed from: k */
    private boolean f2433k;

    /* renamed from: l */
    private boolean f2434l;

    /* renamed from: m */
    private boolean f2435m;

    /* renamed from: n */
    private boolean f2436n;

    /* renamed from: o */
    private VelocityTracker f2437o;

    /* renamed from: p */
    private float f2438p;

    /* renamed from: q */
    private boolean f2439q;

    /* renamed from: r */
    private float f2440r;

    /* renamed from: s */
    private float f2441s;

    awk(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void mo2194a() {
        awj awj = this.f2432j;
        if (awj != null) {
            SwipeDismissFrameLayout swipeDismissFrameLayout = awj.f2422a;
            swipeDismissFrameLayout.f1812f = false;
            swipeDismissFrameLayout.animate().translationX(0.0f).alpha(1.0f).setDuration((long) awj.f2422a.f1808b).setInterpolator(awj.f2422a.f1809c).withEndAction(new awi(awj));
        }
    }

    /* renamed from: b */
    private final void m2268b() {
        VelocityTracker velocityTracker = this.f2437o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f2437o = null;
        this.f2438p = 0.0f;
        this.f2427e = 0.0f;
        this.f2428f = 0.0f;
        this.f2433k = false;
        this.f2435m = false;
        this.f2436n = false;
        this.f2434l = true;
        this.f2439q = false;
    }

    public final boolean canScrollHorizontally(int i) {
        return i < 0 && this.f2429g && getVisibility() == 0;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f2429g) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(this.f2438p, 0.0f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            this.f2426d = motionEvent.getPointerId(motionEvent.getActionIndex());
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f2426d) {
                                if (actionIndex == 0) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                this.f2426d = motionEvent.getPointerId(i);
                            }
                        }
                    }
                } else if (this.f2437o != null && !this.f2436n) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2426d);
                    if (findPointerIndex == -1) {
                        Log.e("SwipeDismissLayout", "Invalid pointer index: ignoring.");
                        this.f2436n = true;
                    } else {
                        float rawX = motionEvent.getRawX() - this.f2427e;
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        if (rawX == 0.0f || this.f2427e < this.f2425c || !mo2754a(this, false, rawX, x, y)) {
                            m2267a(motionEvent);
                        } else {
                            this.f2436n = true;
                        }
                    }
                }
            }
            m2268b();
        } else {
            m2268b();
            this.f2427e = motionEvent.getRawX();
            this.f2428f = motionEvent.getRawY();
            this.f2426d = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f2437o = obtain;
            obtain.addMovement(motionEvent);
        }
        awh awh = this.f2430h;
        if (awh != null || this.f2439q) {
            awh.mo2752a();
        }
        return !this.f2436n && this.f2433k;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TimeInterpolator timeInterpolator;
        if (!this.f2429g) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f2437o == null) {
            return super.onTouchEvent(motionEvent);
        }
        awh awh = this.f2430h;
        if (awh != null) {
            awh.mo2752a();
        }
        motionEvent.offsetLocation(this.f2438p, 0.0f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            float rawX = motionEvent.getRawX() - this.f2427e;
            this.f2437o.addMovement(motionEvent);
            this.f2437o.computeCurrentVelocity(1000);
            if (!this.f2435m && ((rawX > ((float) getWidth()) * this.f2441s && motionEvent.getRawX() >= this.f2440r) || this.f2437o.getXVelocity() >= ((float) this.f2424b))) {
                this.f2435m = true;
            }
            if (this.f2435m && this.f2433k && this.f2437o.getXVelocity() < ((float) (-this.f2424b))) {
                this.f2435m = false;
            }
            if (this.f2435m) {
                awg awg = this.f2431i;
                if (awg != null) {
                    ViewPropertyAnimator duration = awg.f2419a.animate().translationX((float) awg.f2419a.getWidth()).alpha(0.0f).setDuration((long) awg.f2419a.f1808b);
                    SwipeDismissFrameLayout swipeDismissFrameLayout = awg.f2419a;
                    if (!swipeDismissFrameLayout.f1812f) {
                        timeInterpolator = swipeDismissFrameLayout.f1810d;
                    } else {
                        timeInterpolator = swipeDismissFrameLayout.f1811e;
                    }
                    duration.setInterpolator(timeInterpolator).withEndAction(new awf(awg));
                }
            } else if (this.f2433k) {
                mo2194a();
            }
            m2268b();
        } else if (actionMasked == 2) {
            this.f2437o.addMovement(motionEvent);
            this.f2440r = motionEvent.getRawX();
            m2267a(motionEvent);
            if (this.f2433k) {
                float rawX2 = motionEvent.getRawX() - this.f2427e;
                this.f2438p = rawX2;
                awj awj = this.f2432j;
                if (awj != null && rawX2 >= 0.0f) {
                    int width = getWidth();
                    awj.f2422a.setTranslationX(rawX2);
                    awj.f2422a.setAlpha(1.0f - ((rawX2 / ((float) width)) * 0.5f));
                    SwipeDismissFrameLayout swipeDismissFrameLayout2 = awj.f2422a;
                    if (!swipeDismissFrameLayout2.f1812f) {
                        for (int size = swipeDismissFrameLayout2.f1807a.size() - 1; size >= 0; size--) {
                            awe awe = (awe) awj.f2422a.f1807a.get(size);
                        }
                        awj.f2422a.f1812f = true;
                    }
                }
            }
        } else if (actionMasked == 3) {
            mo2194a();
            m2268b();
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.f2439q = z;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public awk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public awk(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private final void m2267a(MotionEvent motionEvent) {
        if (!this.f2433k) {
            float rawX = motionEvent.getRawX() - this.f2427e;
            float rawY = motionEvent.getRawY() - this.f2428f;
            int i = this.f2423a;
            if ((rawX * rawX) + (rawY * rawY) > ((float) (i * i))) {
                boolean z = false;
                if (this.f2434l && Math.abs(rawY) < Math.abs(rawX) && rawX > 0.0f) {
                    z = true;
                }
                this.f2433k = z;
                this.f2434l = z;
            }
        }
    }

    public awk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2434l = true;
        this.f2441s = 0.33f;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2423a = viewConfiguration.getScaledTouchSlop();
        this.f2424b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2425c = ((float) Resources.getSystem().getDisplayMetrics().widthPixels) * 0.1f;
        this.f2429g = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo2754a(View view, boolean z, float f, float f2, float f3) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                float f4 = f2 + ((float) scrollX);
                if (f4 >= ((float) childAt.getLeft()) && f4 < ((float) childAt.getRight())) {
                    float f5 = f3 + ((float) scrollY);
                    if (f5 >= ((float) childAt.getTop()) && f5 < ((float) childAt.getBottom()) && mo2754a(childAt, true, f, f4 - ((float) childAt.getLeft()), f5 - ((float) childAt.getTop()))) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally((int) (-f))) {
            return false;
        }
        return true;
    }
}
