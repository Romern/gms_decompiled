package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aupb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aupb extends abr {

    /* renamed from: a */
    private static final int[] f92244a = {16843284};

    /* renamed from: b */
    private final Drawable f92245b;

    public aupb(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f92244a);
        this.f92245b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo210a(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((abv) childAt.getLayoutParams()).bottomMargin;
            this.f92245b.setBounds(paddingLeft, bottom, width, this.f92245b.getIntrinsicHeight() + bottom);
            this.f92245b.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        rect.set(0, 0, 0, this.f92245b.getIntrinsicHeight());
    }
}
