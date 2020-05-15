package p000;

import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: ewp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ewp extends abr {

    /* renamed from: a */
    private final int f15939a;

    public ewp(int i) {
        this.f15939a = i;
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        if (recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().mo161a() - 1) {
            return;
        }
        if (evi.m11187a(view.getContext())) {
            rect.left = this.f15939a;
        } else {
            rect.right = this.f15939a;
        }
    }
}
