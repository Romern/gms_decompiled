package com.google.android.gms.wallet.p088ui.component.table;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.android.gms.wallet.ui.component.table.RowClickFrameLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RowClickFrameLayout extends FrameLayout implements aby {

    /* renamed from: a */
    boolean f110587a;

    /* renamed from: b */
    int f110588b = -1;

    /* renamed from: c */
    public axcc f110589c;

    /* renamed from: d */
    public axci f110590d;

    public RowClickFrameLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo267a(MotionEvent motionEvent) {
        if (this.f110588b != -1) {
            onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1) {
                axcc axcc = this.f110589c;
                axcj axcj = (axcj) axcc;
                bjwf bjwf = (bjwf) axcj.f95771e.mo15534a(axcj.f95769a.mo53010d(this.f110588b).f159639a);
                if (bjwf != null) {
                    bjwf.mo65585a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo268a(boolean z) {
        this.f110587a = z;
    }

    public RowClickFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RowClickFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RowClickFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final boolean mo269a(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f110588b = -1;
        if (!this.f110587a) {
            View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (findChildViewUnder != null) {
                int i = this.f110590d.mo53009c(recyclerView.getChildAdapterPosition(findChildViewUnder)).f95763a;
                int a = bwii.m121989a(this.f110590d.mo53010d(i).f159641c);
                if (a != 0 && a == 3) {
                    this.f110588b = i;
                    Drawable background = getBackground();
                    if (background != null) {
                        background.setBounds(getLeft(), findChildViewUnder.getTop(), getRight(), findChildViewUnder.getBottom());
                    }
                    onTouchEvent(motionEvent);
                }
            }
            return this.f110588b != -1;
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.f110587a = false;
        }
        return false;
    }
}
