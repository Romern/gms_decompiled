package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: zt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1551zt implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f27793a;

    /* renamed from: b */
    private final int f27794b;

    /* renamed from: c */
    final View f27795c;

    /* renamed from: d */
    public boolean f27796d;

    /* renamed from: e */
    private final int f27797e;

    /* renamed from: f */
    private Runnable f27798f;

    /* renamed from: g */
    private Runnable f27799g;

    /* renamed from: h */
    private int f27800h;

    /* renamed from: i */
    private final int[] f27801i = new int[2];

    public C1551zt(View view) {
        this.f27795c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f27793a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f27794b = tapTimeout;
        this.f27797e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    public abstract C1462wl mo16180a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo16181b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo16464c() {
        C1462wl a = mo16180a();
        if (a == null || !a.mo107e()) {
            return true;
        }
        a.mo105d();
        return true;
    }

    /* renamed from: d */
    public final void mo16638d() {
        Runnable runnable = this.f27799g;
        if (runnable != null) {
            this.f27795c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f27798f;
        if (runnable2 != null) {
            this.f27795c.removeCallbacks(runnable2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r13 == false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d  */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C1543zl zlVar;
        boolean z2;
        boolean z3 = this.f27796d;
        if (z3) {
            View view2 = this.f27795c;
            C1462wl a = mo16180a();
            if (a != null && a.mo107e() && (zlVar = (C1543zl) a.mo109g()) != null && zlVar.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f27801i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation((float) iArr[0], (float) iArr[1]);
                int[] iArr2 = this.f27801i;
                zlVar.getLocationOnScreen(iArr2);
                obtainNoHistory.offsetLocation((float) (-iArr2[0]), (float) (-iArr2[1]));
                boolean a2 = zlVar.mo16617a(obtainNoHistory, this.f27800h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1) {
                    z2 = false;
                } else {
                    z2 = actionMasked != 3;
                }
                if (a2) {
                }
            }
            if (mo16464c()) {
                z = false;
            }
            z = true;
        } else {
            View view3 = this.f27795c;
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f27800h);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.f27793a;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= ((float) (view3.getRight() - view3.getLeft())) + f || y >= ((float) (view3.getBottom() - view3.getTop())) + f) {
                                    mo16638d();
                                    view3.getParent().requestDisallowInterceptTouchEvent(true);
                                    z = mo16181b();
                                }
                            }
                            z = false;
                        } else if (actionMasked2 != 3) {
                            z = false;
                        }
                        if (z) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            this.f27795c.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                    }
                    mo16638d();
                    z = false;
                    if (z) {
                    }
                } else {
                    this.f27800h = motionEvent.getPointerId(0);
                    if (this.f27798f == null) {
                        this.f27798f = new C1549zr(this);
                    }
                    view3.postDelayed(this.f27798f, (long) this.f27794b);
                    if (this.f27799g == null) {
                        this.f27799g = new C1550zs(this);
                    }
                    view3.postDelayed(this.f27799g, (long) this.f27797e);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.f27796d = z;
        return z || z3;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f27796d = false;
        this.f27800h = -1;
        Runnable runnable = this.f27798f;
        if (runnable != null) {
            this.f27795c.removeCallbacks(runnable);
        }
    }
}
