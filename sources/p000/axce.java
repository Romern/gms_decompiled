package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: axce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axce extends abr {

    /* renamed from: a */
    final Drawable f95752a;

    /* renamed from: b */
    final Rect f95753b = new Rect();

    /* renamed from: c */
    private final axci f95754c;

    /* renamed from: d */
    private final int f95755d;

    public axce(axci axci, Context context) {
        this.f95754c = axci;
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.dividerDrawable});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f95752a = drawable;
        this.f95755d = drawable != null ? drawable.getIntrinsicHeight() : i;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo210a(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int a = bwii.m121989a(this.f95754c.mo53010d(this.f95754c.mo53009c(recyclerView.getChildViewHolder(childAt).mo322c()).f95763a).f159641c);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if ((i2 == 0 || i2 == 2) && this.f95752a != null) {
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f95753b);
                int round = this.f95753b.top + Math.round(childAt.getTranslationY());
                this.f95752a.setBounds(this.f95753b.left, round, this.f95753b.right, this.f95755d + round);
                this.f95752a.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        int a = bwii.m121989a(this.f95754c.mo53010d(this.f95754c.mo53009c(recyclerView.getChildViewHolder(view).mo322c()).f95763a).f159641c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 0 || i == 2) {
            rect.set(0, this.f95755d, 0, 0);
        } else {
            super.mo211a(rect, view, recyclerView, acj);
        }
    }
}
