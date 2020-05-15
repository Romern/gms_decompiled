package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import androidx.preference.PreferenceCategory;

/* renamed from: myb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class myb extends abr {

    /* renamed from: a */
    private final Drawable f34921a;

    /* renamed from: b */
    private final int f34922b;

    public myb(Drawable drawable) {
        this.f34922b = drawable != null ? drawable.getIntrinsicHeight() : 0;
        this.f34921a = drawable;
    }

    /* renamed from: b */
    public final void mo212b(Canvas canvas, RecyclerView recyclerView) {
        int childAdapterPosition;
        if (this.f34921a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                abh adapter = recyclerView.getAdapter();
                if ((adapter instanceof aoi) && (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) != -1 && (((aoi) adapter).mo2229f(childAdapterPosition) instanceof PreferenceCategory) && childAdapterPosition != 0) {
                    int n = (int) C1280ps.m19932n(childAt);
                    this.f34921a.setBounds(0, n, width, this.f34922b + n);
                    this.f34921a.draw(canvas);
                }
            }
        }
    }
}
