package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: svo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class svo extends abr {

    /* renamed from: a */
    static final int[] f45241a = {16843284};

    /* renamed from: b */
    private final Drawable f45242b;

    public svo(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f45241a);
        this.f45242b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static int m36467a(RecyclerView recyclerView) {
        return ((aah) recyclerView.getLayoutManager()).f41i;
    }

    /* renamed from: a */
    private static final boolean m36468a(View view, RecyclerView recyclerView) {
        acm childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder instanceof svn) {
            return ((svn) childViewHolder).mo26143v();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo210a(Canvas canvas, RecyclerView recyclerView) {
        if (this.f45242b != null) {
            int i = 0;
            if (m36467a(recyclerView) == 1) {
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                while (i < childCount) {
                    View childAt = recyclerView.getChildAt(i);
                    if (m36468a(childAt, recyclerView)) {
                        int bottom = childAt.getBottom() + ((abv) childAt.getLayoutParams()).bottomMargin;
                        this.f45242b.setBounds(paddingLeft, bottom, width, this.f45242b.getIntrinsicHeight() + bottom);
                        this.f45242b.draw(canvas);
                    }
                    i++;
                }
                return;
            }
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount2 = recyclerView.getChildCount();
            while (i < childCount2) {
                View childAt2 = recyclerView.getChildAt(i);
                if (m36468a(childAt2, recyclerView)) {
                    int right = childAt2.getRight() + ((abv) childAt2.getLayoutParams()).rightMargin;
                    this.f45242b.setBounds(right, paddingTop, this.f45242b.getIntrinsicHeight() + right, height);
                    this.f45242b.draw(canvas);
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        if (!m36468a(view, recyclerView)) {
            return;
        }
        if (m36467a(recyclerView) == 1) {
            rect.set(0, 0, 0, this.f45242b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f45242b.getIntrinsicWidth(), 0);
        }
    }
}
