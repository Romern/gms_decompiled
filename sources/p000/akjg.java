package p000;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: akjg */
public final /* synthetic */ class akjg implements View.OnTouchListener {

    /* renamed from: a */
    private final View f72086a;

    public akjg(View view) {
        this.f72086a = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.f72086a;
        akiu.m59853a(motionEvent, view, view2);
        return view2.dispatchTouchEvent(motionEvent);
    }
}
