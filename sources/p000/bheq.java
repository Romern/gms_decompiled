package p000;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: bheq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bheq implements C1314qz {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f118409a;

    public bheq(SwipeDismissBehavior swipeDismissBehavior) {
        this.f118409a = swipeDismissBehavior;
    }

    /* renamed from: a */
    public final boolean mo812a(View view) {
        if (!this.f118409a.mo71017d(view)) {
            return false;
        }
        int h = C1280ps.m19923h(view);
        int i = this.f118409a.f151057b;
        C1280ps.m19924h(view, (i != 0 ? i != 1 || h == 1 : h != 1) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        bhmx bhmx = this.f118409a.f151061f;
        if (bhmx != null) {
            bhmx.mo64004a(view);
        }
        return true;
    }
}
