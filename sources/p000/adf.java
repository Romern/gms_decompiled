package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: adf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adf extends TouchDelegate {

    /* renamed from: a */
    private final View f251a;

    /* renamed from: b */
    private final Rect f252b = new Rect();

    /* renamed from: c */
    private final Rect f253c = new Rect();

    /* renamed from: d */
    private final Rect f254d = new Rect();

    /* renamed from: e */
    private final int f255e;

    /* renamed from: f */
    private boolean f256f;

    public adf(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.f255e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        mo423a(rect, rect2);
        this.f251a = view;
    }

    /* renamed from: a */
    public final void mo423a(Rect rect, Rect rect2) {
        this.f252b.set(rect);
        this.f254d.set(rect);
        Rect rect3 = this.f254d;
        int i = -this.f255e;
        rect3.inset(i, i);
        this.f253c.set(rect2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                boolean z3 = this.f256f;
                if (!z3 || this.f254d.contains(x, y)) {
                    z2 = z3;
                    z = true;
                } else {
                    z2 = z3;
                    z = false;
                }
            } else if (action != 3) {
                z = true;
                z2 = false;
            } else {
                boolean z4 = this.f256f;
                this.f256f = false;
                z2 = z4;
                z = true;
            }
        } else if (this.f252b.contains(x, y)) {
            this.f256f = true;
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (z && !this.f253c.contains(x, y)) {
            motionEvent.setLocation((float) (this.f251a.getWidth() / 2), (float) (this.f251a.getHeight() / 2));
        } else {
            motionEvent.setLocation((float) (x - this.f253c.left), (float) (y - this.f253c.top));
        }
        return this.f251a.dispatchTouchEvent(motionEvent);
    }
}
