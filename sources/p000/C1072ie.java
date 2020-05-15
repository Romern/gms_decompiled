package p000;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: ie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1072ie extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f20784a;

    public C1072ie(Rect rect) {
        this.f20784a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f20784a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f20784a;
    }
}
