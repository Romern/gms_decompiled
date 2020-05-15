package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: apdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apdq extends abr {

    /* renamed from: a */
    private static final int[] f84183a = {16843284};

    /* renamed from: b */
    private final Drawable f84184b;

    public apdq(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f84183a);
        this.f84184b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static boolean m70065a(View view, RecyclerView recyclerView) {
        acm childViewHolder = recyclerView.getChildViewHolder(view);
        if ((childViewHolder instanceof apdg) || (childViewHolder instanceof apde) || (childViewHolder.mo323d() == recyclerView.getAdapter().mo161a() - 1 && recyclerView.getAdapter().mo161a() != 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo210a(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (m70065a(childAt, recyclerView)) {
                int bottom = childAt.getBottom() + ((abv) childAt.getLayoutParams()).bottomMargin;
                this.f84184b.setBounds(paddingLeft, bottom, width, this.f84184b.getIntrinsicHeight() + bottom);
                this.f84184b.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        if (m70065a(view, recyclerView)) {
            rect.set(0, 0, 0, this.f84184b.getIntrinsicHeight());
        }
    }
}
