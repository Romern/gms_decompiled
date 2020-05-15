package p000;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.places.p095ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: bink */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bink implements binp {

    /* renamed from: a */
    final /* synthetic */ ExpandingScrollView f120999a;

    public bink(ExpandingScrollView expandingScrollView) {
        this.f120999a = expandingScrollView;
    }

    /* renamed from: a */
    public final void mo64799a(MotionEvent motionEvent) {
        View view = this.f120999a.f151446g;
        if (view != null) {
            view.dispatchTouchEvent(motionEvent);
        }
    }
}
