package p000;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: ajgx */
final /* synthetic */ class ajgx implements View.OnTouchListener {

    /* renamed from: a */
    private final ajhe f70606a;

    public ajgx(ajhe ajhe) {
        this.f70606a = ajhe;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ajhe ajhe = this.f70606a;
        if (motionEvent.getAction() == 1) {
            ajhe.finish();
        }
        return true;
    }
}
