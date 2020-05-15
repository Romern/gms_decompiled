package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: adck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adck extends C1539zh {

    /* renamed from: a */
    private final Drawable f61370a;

    /* renamed from: b */
    private final int f61371b;

    /* renamed from: c */
    private final int f61372c;

    /* renamed from: d */
    private final int f61373d;

    public adck(Context context, Drawable drawable, int i, int i2, int i3) {
        super(context);
        this.f61370a = drawable;
        this.f61371b = i;
        this.f61372c = i2;
        this.f61373d = i3;
    }

    /* renamed from: a */
    public final void mo210a(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft() + this.f61373d;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f61372c;
        int childCount = recyclerView.getChildCount();
        for (int i = this.f61371b; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((abv) childAt.getLayoutParams()).bottomMargin;
            this.f61370a.setBounds(paddingLeft, bottom, width, this.f61370a.getIntrinsicHeight() + bottom);
            this.f61370a.draw(canvas);
        }
    }
}
