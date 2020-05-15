package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: abf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abf {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f100a;

    public abf(RecyclerView recyclerView) {
        this.f100a = recyclerView;
    }

    /* renamed from: a */
    public final int mo146a() {
        return this.f100a.getChildCount();
    }

    /* renamed from: b */
    public final View mo149b(int i) {
        return this.f100a.getChildAt(i);
    }

    /* renamed from: a */
    public final int mo147a(View view) {
        return this.f100a.indexOfChild(view);
    }

    /* renamed from: b */
    public final void mo150b(View view) {
        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            this.f100a.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.f215o);
            childViewHolderInt.f215o = 0;
        }
    }

    /* renamed from: a */
    public final void mo148a(int i) {
        View childAt = this.f100a.getChildAt(i);
        if (childAt != null) {
            this.f100a.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        this.f100a.removeViewAt(i);
    }
}
