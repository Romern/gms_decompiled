package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: aan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aan implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ aap f54a;

    public aan(aap aap) {
        this.f54a = aap;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            PopupWindow popupWindow = this.f54a.f72q;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.f54a.f72q.getWidth() || y < 0 || y >= this.f54a.f72q.getHeight()) {
                return false;
            }
            aap aap = this.f54a;
            aap.f70o.postDelayed(aap.f69n, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            aap aap2 = this.f54a;
            aap2.f70o.removeCallbacks(aap2.f69n);
            return false;
        }
    }
}
