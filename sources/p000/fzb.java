package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: fzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fzb extends abz {

    /* renamed from: a */
    final /* synthetic */ fzc f17725a;

    public fzb(fzc fzc) {
        this.f17725a = fzc;
    }

    /* renamed from: a */
    public final void mo270a(RecyclerView recyclerView, int i) {
        this.f17725a.mo11551a(i);
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        fzc fzc = this.f17725a;
        int max = Math.max(0, fzc.getChildPosition(fzc.getChildAt(0)));
        fzc fzc2 = this.f17725a;
        fzc2.mo11552a(max, fzc2.getChildCount(), this.f17725a.getAdapter().mo161a());
        this.f17725a.f17726a.mo11525a();
        abz abz = this.f17725a.f17727b;
        if (abz != null) {
            abz.mo271a(recyclerView, i, i2);
        }
    }
}
