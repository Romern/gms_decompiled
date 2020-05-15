package p000;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: fba */
final /* synthetic */ class fba implements View.OnTouchListener {

    /* renamed from: a */
    private final fbh f16186a;

    public fba(fbh fbh) {
        this.f16186a = fbh;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        fbh fbh = this.f16186a;
        if (motionEvent.getAction() == 1) {
            view.performClick();
            return false;
        }
        fbh.f16196d.clearFocus();
        return false;
    }
}
