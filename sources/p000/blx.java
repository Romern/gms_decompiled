package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

@Deprecated
/* renamed from: blx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blx extends abr {

    /* renamed from: a */
    public Drawable f5125a;

    /* renamed from: b */
    private int f5126b;

    /* renamed from: c */
    private int f5127c;

    /* renamed from: d */
    private int f5128d;

    public blx() {
    }

    /* renamed from: a */
    private final boolean m3320a(View view, RecyclerView recyclerView) {
        acm childViewHolder = recyclerView.getChildViewHolder(view);
        int c = childViewHolder.mo322c();
        int a = recyclerView.getAdapter().mo161a() - 1;
        if (!(childViewHolder instanceof blw) || ((blw) childViewHolder).mo3255b()) {
            if (this.f5128d == 0) {
                return true;
            }
        } else if (this.f5128d == 1 || c == a) {
            return false;
        }
        if (c < a) {
            acm findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(c + 1);
            return !(findViewHolderForLayoutPosition instanceof blw) || ((blw) findViewHolderForLayoutPosition).mo3254a();
        }
    }

    public blx(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(blz.f5137d);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        int i = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        mo3256a(drawable);
        this.f5126b = dimensionPixelSize;
        this.f5128d = i;
    }

    /* renamed from: a */
    public final void mo210a(Canvas canvas, RecyclerView recyclerView) {
        if (this.f5125a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            int i = this.f5126b;
            if (i == 0) {
                i = this.f5127c;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (m3320a(childAt, recyclerView)) {
                    int n = ((int) C1280ps.m19932n(childAt)) + childAt.getHeight();
                    this.f5125a.setBounds(0, n, width, n + i);
                    this.f5125a.draw(canvas);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        if (m3320a(view, recyclerView)) {
            int i = this.f5126b;
            if (i == 0) {
                i = this.f5127c;
            }
            rect.bottom = i;
        }
    }

    /* renamed from: a */
    public final void mo3256a(Drawable drawable) {
        this.f5127c = drawable != null ? drawable.getIntrinsicHeight() : 0;
        this.f5125a = drawable;
    }
}
