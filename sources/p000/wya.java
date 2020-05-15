package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/* renamed from: wya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wya implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ Toast f51557a;

    public wya(Toast toast) {
        this.f51557a = toast;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f51557a.cancel();
        } else if (action == 1) {
            view.performClick();
        }
        return true;
    }
}
