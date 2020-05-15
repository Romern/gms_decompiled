package p000;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: ia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1068ia extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f20620a;

    public C1068ia(Rect rect) {
        this.f20620a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f20620a;
    }
}
