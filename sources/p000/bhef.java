package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: bhef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhef extends bhei {

    /* renamed from: a */
    private Runnable f118365a;

    /* renamed from: b */
    private boolean f118366b;

    /* renamed from: c */
    OverScroller f118367c;

    /* renamed from: d */
    private int f118368d = -1;

    /* renamed from: e */
    private int f118369e;

    /* renamed from: f */
    private int f118370f = -1;

    /* renamed from: g */
    private VelocityTracker f118371g;

    public bhef() {
    }

    /* renamed from: a */
    public boolean mo776a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f118370f < 0) {
            this.f118370f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f118366b) {
            int i = this.f118368d;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f118369e) > this.f118370f) {
                this.f118369e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f118368d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!mo63595f(view) || !coordinatorLayout.mo1874a(view, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.f118366b = z;
            if (z) {
                this.f118369e = y2;
                this.f118368d = motionEvent.getPointerId(0);
                if (this.f118371g == null) {
                    this.f118371g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f118367c;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f118367c.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f118371g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* renamed from: b */
    public int mo63588b() {
        throw null;
    }

    /* renamed from: b */
    public int mo63589b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    /* renamed from: b */
    public void mo63590b(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    /* renamed from: c */
    public final int mo63592c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return mo63589b(coordinatorLayout, view, mo63588b() - i, i2, i3);
    }

    /* renamed from: d */
    public int mo63593d(View view) {
        throw null;
    }

    /* renamed from: e */
    public int mo63594e(View view) {
        throw null;
    }

    /* renamed from: f */
    public boolean mo63595f(View view) {
        throw null;
    }

    public bhef(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final void mo63591b(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo63589b(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00da  */
    /* renamed from: b */
    public final boolean mo780b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        View view2 = view;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f118368d);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent2.getY(findPointerIndex);
                int i = this.f118369e;
                this.f118369e = y;
                mo63592c(coordinatorLayout, view, i - y, mo63594e(view2), 0);
                z = false;
            } else if (actionMasked == 3) {
                z = false;
            } else if (actionMasked != 6) {
                z = false;
            } else {
                int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f118368d = motionEvent2.getPointerId(i2);
                this.f118369e = (int) (motionEvent2.getY(i2) + 0.5f);
                z = false;
            }
            velocityTracker = this.f118371g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent2);
            }
            return !this.f118366b || z;
        }
        VelocityTracker velocityTracker2 = this.f118371g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent2);
            this.f118371g.computeCurrentVelocity(1000);
            float yVelocity = this.f118371g.getYVelocity(this.f118368d);
            int i3 = -mo63593d(view2);
            Runnable runnable = this.f118365a;
            if (runnable != null) {
                view2.removeCallbacks(runnable);
                this.f118365a = null;
            }
            if (this.f118367c == null) {
                this.f118367c = new OverScroller(view.getContext());
            }
            this.f118367c.fling(0, mo63602c(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.f118367c.computeScrollOffset()) {
                bhee bhee = new bhee(this, coordinatorLayout, view2);
                this.f118365a = bhee;
                C1280ps.m19891a(view2, bhee);
                z = true;
            } else {
                mo63590b(coordinatorLayout, view);
                z = true;
            }
        } else {
            z = false;
        }
        this.f118366b = false;
        this.f118368d = -1;
        VelocityTracker velocityTracker3 = this.f118371g;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f118371g = null;
        }
        velocityTracker = this.f118371g;
        if (velocityTracker != null) {
        }
        if (!this.f118366b) {
        }
    }
}
