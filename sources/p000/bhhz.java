package p000;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: bhhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhhz implements View.OnTouchListener {

    /* renamed from: a */
    private final Dialog f118693a;

    /* renamed from: b */
    private final int f118694b;

    /* renamed from: c */
    private final int f118695c;

    public bhhz(Dialog dialog, Rect rect) {
        this.f118693a = dialog;
        this.f118694b = rect.left;
        this.f118695c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f118694b + findViewById.getLeft();
        int width = findViewById.getWidth();
        int top = this.f118695c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) (left + width), (float) (top + findViewById.getHeight())).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        int i = Build.VERSION.SDK_INT;
        view.performClick();
        return this.f118693a.onTouchEvent(obtain);
    }
}
