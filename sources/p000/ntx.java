package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: ntx */
final /* synthetic */ class ntx implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    private final nud f36490a;

    public ntx(nud nud) {
        this.f36490a = nud;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        nud nud = this.f36490a;
        if (view != null) {
            if (nly.m26778a("CAR.PROJECTION.PRES", 3)) {
                Log.d("CAR.PROJECTION.PRES", String.format("%s.onGlobalFocusChanged: setHovered(false) for oldFocus: %s", null, view));
            }
            view.setHovered(false);
        }
        View view3 = (View) nud.f36502f.get();
        if (!(view3 == null || view3 == view || view3 == view2)) {
            if (nly.m26778a("CAR.PROJECTION.PRES", 3)) {
                Log.d("CAR.PROJECTION.PRES", String.format("%s.onGlobalFocusChanged: setHovered(false) for lastFocus: %s", null, view3));
            }
            view3.setHovered(false);
        }
        if (view2 != null) {
            view2.isFocused();
            if (nly.m26778a("CAR.PROJECTION.PRES", 3)) {
                Log.d("CAR.PROJECTION.PRES", String.format("%s updateHoveredState(%s) for %s", null, false, view2));
            }
            view2.setHovered(false);
        }
        nud.f36502f = new WeakReference(view2);
    }
}
