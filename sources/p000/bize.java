package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: bize */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bize extends abr {

    /* renamed from: a */
    public Drawable f122358a;

    /* renamed from: b */
    private int f122359b;

    /* renamed from: c */
    private int f122360c;

    /* renamed from: d */
    private int f122361d;

    public bize() {
    }

    /* renamed from: a */
    private final boolean m103029a(View view, RecyclerView recyclerView) {
        acm childViewHolder = recyclerView.getChildViewHolder(view);
        int c = childViewHolder.mo322c();
        int a = recyclerView.getAdapter().mo161a() - 1;
        if (!(childViewHolder instanceof bizd) || ((bizd) childViewHolder).mo64897b()) {
            if (this.f122361d == 0) {
                return true;
            }
        } else if (this.f122361d == 1 || c == a) {
            return false;
        }
        if (c < a) {
            acm findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(c + 1);
            return !(findViewHolderForLayoutPosition instanceof bizd) || ((bizd) findViewHolderForLayoutPosition).mo64896a();
        }
    }

    public bize(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(bizg.f122370d);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        int i = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        mo64898a(drawable);
        this.f122359b = dimensionPixelSize;
        this.f122361d = i;
    }

    /* renamed from: a */
    public final void mo210a(Canvas canvas, RecyclerView recyclerView) {
        if (this.f122358a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            int i = this.f122359b;
            if (i == 0) {
                i = this.f122360c;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (m103029a(childAt, recyclerView)) {
                    int n = ((int) C1280ps.m19932n(childAt)) + childAt.getHeight();
                    this.f122358a.setBounds(0, n, width, n + i);
                    this.f122358a.draw(canvas);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        if (m103029a(view, recyclerView)) {
            int i = this.f122359b;
            if (i == 0) {
                i = this.f122360c;
            }
            rect.bottom = i;
        }
    }

    /* renamed from: a */
    public final void mo64898a(Drawable drawable) {
        this.f122360c = drawable != null ? drawable.getIntrinsicHeight() : 0;
        this.f122358a = drawable;
    }
}
