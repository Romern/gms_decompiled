package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* renamed from: zh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1539zh extends abr {

    /* renamed from: a */
    private static final int[] f27736a = {16843284};

    /* renamed from: b */
    private final Drawable f27737b;

    /* renamed from: c */
    private final Rect f27738c = new Rect();

    public C1539zh(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f27736a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f27737b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo210a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        if (recyclerView.getLayoutManager() != null && this.f27737b != null) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                i = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                i = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f27738c);
                int round = this.f27738c.bottom + Math.round(childAt.getTranslationY());
                this.f27737b.setBounds(i2, round - this.f27737b.getIntrinsicHeight(), i, round);
                this.f27737b.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        Drawable drawable = this.f27737b;
        if (drawable != null) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
