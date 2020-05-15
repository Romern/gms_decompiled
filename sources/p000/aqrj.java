package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: aqrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqrj extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ SmartProfileContainerView f86662a;

    public aqrj(SmartProfileContainerView smartProfileContainerView) {
        this.f86662a = smartProfileContainerView;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        this.f86662a.f107731c.mo59021c();
        this.f86662a.f107734f.forceFinished(true);
        SmartProfileContainerView smartProfileContainerView = this.f86662a;
        int i2 = smartProfileContainerView.f107729a;
        if (i2 == 1) {
            i = smartProfileContainerView.f107731c.getHeight();
        } else if (i2 != 2) {
            i = (int) smartProfileContainerView.mo58998d();
        } else {
            i = smartProfileContainerView.f107733e.getScrollY();
            f2 = -f2;
        }
        this.f86662a.mo58992a((float) i, f2);
        C1280ps.m19915e(this.f86662a);
        return true;
    }
}
