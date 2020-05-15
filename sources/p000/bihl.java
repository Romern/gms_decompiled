package p000;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: bihl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihl implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ biht f120602a;

    public bihl(biht biht) {
        this.f120602a = biht;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (motionEvent.getAction() == 0) {
            this.f120602a.f120622j.setAlpha(1.0f);
            return false;
        } else if (motionEvent.getAction() != 1) {
            return false;
        } else {
            this.f120602a.f120622j.setAlpha(0.87f);
            return false;
        }
    }
}
