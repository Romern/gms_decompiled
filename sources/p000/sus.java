package p000;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: sus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sus implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ suu f45193a;

    public sus(suu suu) {
        this.f45193a = suu;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        this.f45193a.mo26136b();
        return false;
    }
}
