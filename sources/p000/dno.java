package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: dno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dno extends abr {

    /* renamed from: a */
    public Drawable f13638a;

    /* renamed from: b */
    public int f13639b;

    /* renamed from: c */
    final /* synthetic */ dns f13640c;

    public dno(dns dns) {
        this.f13640c = dns;
    }

    /* renamed from: a */
    private static final boolean m8887a(View view, RecyclerView recyclerView) {
        acm childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof aoq) || !((aoq) childViewHolder).f1899v) {
            return false;
        }
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return true;
        }
        acm childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
        if (!(childViewHolder2 instanceof aoq) || !((aoq) childViewHolder2).f1898u) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo212b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f13638a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (m8887a(childAt, recyclerView)) {
                    int n = ((int) C1280ps.m19932n(childAt)) + childAt.getHeight();
                    this.f13638a.setBounds(0, n, width, this.f13639b + n);
                    this.f13638a.draw(canvas);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        if (m8887a(view, recyclerView)) {
            rect.bottom = this.f13639b;
        }
    }
}
