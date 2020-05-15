package p000;

import android.support.wearable.watchface.decompositionface.DecompositionConfigView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* renamed from: agg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agg extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ DecompositionConfigView f501a;

    public agg(DecompositionConfigView decompositionConfigView) {
        this.f501a = decompositionConfigView;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = this.f501a.f1466a;
        return false;
    }
}
