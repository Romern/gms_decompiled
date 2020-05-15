package p000;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.HorizontalScrollView;
import com.google.android.libraries.matchstick.p091ui.ReplyViewSwipeHelper$9;
import java.lang.ref.WeakReference;

/* renamed from: azme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azme {

    /* renamed from: a */
    public final long f99615a;

    /* renamed from: b */
    public final long f99616b;

    /* renamed from: c */
    public final View f99617c;

    /* renamed from: d */
    public final View f99618d;

    /* renamed from: e */
    public final WeakReference f99619e;

    /* renamed from: f */
    public final Handler f99620f;

    /* renamed from: g */
    public final View f99621g;

    /* renamed from: h */
    public boolean f99622h;

    /* renamed from: i */
    public ResultReceiver f99623i;

    /* renamed from: j */
    public ResultReceiver f99624j;

    /* renamed from: k */
    private final int f99625k;

    /* renamed from: l */
    private final int f99626l;

    /* renamed from: m */
    private final int f99627m;

    /* renamed from: n */
    private final HorizontalScrollView f99628n;

    /* renamed from: o */
    private int f99629o = 1;

    /* renamed from: p */
    private float f99630p;

    /* renamed from: q */
    private float f99631q;

    /* renamed from: r */
    private boolean f99632r;

    /* renamed from: s */
    private int f99633s;

    /* renamed from: t */
    private float f99634t;

    /* renamed from: u */
    private VelocityTracker f99635u;

    /* renamed from: v */
    private ResultReceiver f99636v;

    /* renamed from: w */
    private boolean f99637w;

    public azme(View view, HorizontalScrollView horizontalScrollView, View view2, View view3, azmg azmg) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f99625k = viewConfiguration.getScaledTouchSlop();
        long integer = (long) view.getContext().getResources().getInteger(17694720);
        this.f99615a = integer;
        this.f99616b = integer / 2;
        this.f99626l = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f99627m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f99621g = view;
        this.f99619e = new WeakReference(azmg);
        this.f99617c = view2;
        this.f99618d = view3;
        this.f99628n = horizontalScrollView;
        this.f99637w = false;
        view2.setOnClickListener(new azly(this));
        this.f99618d.setOnClickListener(new azlz(this));
        this.f99620f = new adzt();
    }

    /* renamed from: b */
    private final void m85822b() {
        this.f99634t = 0.0f;
        this.f99630p = 0.0f;
        this.f99631q = 0.0f;
        this.f99632r = false;
        this.f99637w = false;
        this.f99635u.recycle();
        this.f99635u = null;
    }

    /* renamed from: a */
    public final void mo55043a() {
        this.f99618d.setVisibility(4);
        this.f99617c.setVisibility(4);
        azmg azmg = (azmg) this.f99619e.get();
        if (azmg != null) {
            if (this.f99636v == null) {
                this.f99636v = new ReplyViewSwipeHelper$9(this, this.f99620f);
            }
            azmg.mo55048b(this.f99636v);
        }
    }

    /* renamed from: a */
    public final void mo55044a(View view, View view2) {
        view.setScaleX(0.5f);
        view.setScaleY(0.5f);
        view.setAlpha(0.0f);
        view.setVisibility(0);
        this.f99622h = false;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f99616b);
        duration.addUpdateListener(new azmb(this, view, view2));
        duration.start();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final boolean mo55045a(MotionEvent motionEvent) {
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.f99628n.getVisibility() == 0) {
            int[] iArr = new int[2];
            this.f99628n.getLocationOnScreen(iArr);
            int i = iArr[0];
            if (new Rect(i, iArr[1], this.f99628n.getWidth() + i, iArr[1] + this.f99628n.getHeight()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return false;
            }
        }
        motionEvent.offsetLocation(this.f99634t, 0.0f);
        if (this.f99629o < 2) {
            this.f99629o = this.f99621g.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        mo55043a();
                        m85822b();
                    }
                } else if (!this.f99637w) {
                    return false;
                } else {
                    this.f99635u.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f99630p;
                    float abs = Math.abs(motionEvent.getRawY() - this.f99631q);
                    float abs2 = Math.abs(rawX) / 2.0f;
                    float abs3 = Math.abs(rawX);
                    int i2 = this.f99625k;
                    float f2 = (float) i2;
                    if (!this.f99632r && abs3 > f2 && abs < abs2) {
                        this.f99632r = true;
                        if (rawX <= 0.0f) {
                            i2 = -i2;
                        }
                        this.f99633s = i2;
                        this.f99621g.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    if (this.f99632r) {
                        this.f99634t = rawX;
                        this.f99621g.setTranslationX(rawX - ((float) this.f99633s));
                        View view = this.f99621g;
                        float abs4 = Math.abs(rawX);
                        view.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((abs4 + abs4) / ((float) this.f99629o)))));
                        return true;
                    }
                }
            } else if (!this.f99637w) {
                return false;
            } else {
                float rawX2 = motionEvent.getRawX() - this.f99630p;
                this.f99635u.addMovement(motionEvent);
                this.f99635u.computeCurrentVelocity(1000);
                float xVelocity = this.f99635u.getXVelocity();
                float abs5 = Math.abs(xVelocity);
                float abs6 = Math.abs(this.f99635u.getYVelocity());
                if (Math.abs(rawX2) > ((float) (this.f99629o / 2))) {
                    z = rawX2 > 0.0f;
                } else if (((float) this.f99626l) > abs5) {
                    z = false;
                    z5 = false;
                } else if (abs5 > ((float) this.f99627m)) {
                    z = false;
                    z5 = false;
                } else if (abs6 < abs5 && this.f99632r) {
                    if (xVelocity >= 0.0f) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (rawX2 >= 0.0f) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2 == z3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z4;
                    z = this.f99635u.getXVelocity() > 0.0f;
                } else {
                    z = false;
                    z5 = false;
                }
                if (z5) {
                    ViewPropertyAnimator animate = this.f99621g.animate();
                    if (!z) {
                        f = (float) (-this.f99629o);
                    } else {
                        f = (float) this.f99629o;
                    }
                    animate.translationX(f).alpha(0.0f).setDuration(this.f99615a).setListener(new azma(this, z));
                } else if (this.f99632r) {
                    mo55043a();
                }
                m85822b();
            }
            return false;
        }
        this.f99630p = motionEvent.getRawX();
        this.f99631q = motionEvent.getRawY();
        VelocityTracker obtain = VelocityTracker.obtain();
        this.f99635u = obtain;
        this.f99637w = true;
        obtain.addMovement(motionEvent);
        return false;
    }
}
