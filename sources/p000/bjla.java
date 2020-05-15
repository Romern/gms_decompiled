package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: bjla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjla extends TouchDelegate implements View.OnLayoutChangeListener {

    /* renamed from: d */
    private static final Rect f122914d = new Rect();

    /* renamed from: a */
    public final C1245ok f122915a = new C1245ok();

    /* renamed from: b */
    public final C1245ok f122916b = new C1245ok();

    /* renamed from: c */
    public TouchDelegate f122917c;

    public bjla(View view) {
        super(f122914d, view);
    }

    /* renamed from: a */
    public final void mo65360a(View view) {
        Rect rect = (Rect) this.f122916b.get(view);
        Rect rect2 = new Rect();
        view.getHitRect(rect2);
        rect2.left -= rect.left;
        rect2.top -= rect.top;
        rect2.right += rect.right;
        rect2.bottom += rect.bottom;
        this.f122915a.put(view, new TouchDelegate(rect2, view));
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo65360a(view);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked != 0) {
            TouchDelegate touchDelegate = this.f122917c;
            if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
                z = true;
            }
            if (actionMasked == 1 || actionMasked == 32) {
                this.f122917c = null;
            }
            return z;
        }
        if (motionEvent.getPointerCount() <= 1) {
            int i = this.f122915a.f26809h;
            for (int i2 = 0; i2 < i; i2++) {
                if (((View) this.f122915a.mo15620b(i2)).isShown()) {
                    TouchDelegate touchDelegate2 = (TouchDelegate) this.f122915a.mo15621c(i2);
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    boolean onTouchEvent = touchDelegate2.onTouchEvent(motionEvent);
                    motionEvent.setLocation(x, y);
                    if (onTouchEvent) {
                        this.f122917c = touchDelegate2;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
