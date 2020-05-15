package p000;

import android.support.p002v7.widget.SwitchCompat;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: ajun */
final /* synthetic */ class ajun implements View.OnTouchListener {

    /* renamed from: a */
    private final ajup f71303a;

    public ajun(ajup ajup) {
        this.f71303a = ajup;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SwitchCompat switchCompat = this.f71303a.f71306s;
        akiu.m59853a(motionEvent, view, switchCompat);
        return switchCompat.dispatchTouchEvent(motionEvent);
    }
}
