package p000;

import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: ewq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ewq extends abr {

    /* renamed from: a */
    private final int f15940a;

    public ewq(int i) {
        this.f15940a = i;
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        if (recyclerView.getChildAdapterPosition(view) != recyclerView.getAdapter().mo161a() - 1) {
            rect.bottom = this.f15940a;
        }
    }
}
