package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: vi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1432vi implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C1437vn f27371a;

    public C1432vi(C1437vn vnVar) {
        this.f27371a = vnVar;
    }

    public final void onGlobalLayout() {
        if (this.f27371a.mo107e() && this.f27371a.f27382b.size() > 0) {
            if (!((C1436vm) this.f27371a.f27382b.get(0)).f27378a.f71p) {
                View view = this.f27371a.f27384d;
                if (view != null && view.isShown()) {
                    List list = this.f27371a.f27382b;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C1436vm) list.get(i)).f27378a.mo101aI();
                    }
                    return;
                }
                this.f27371a.mo105d();
            }
        }
    }
}
