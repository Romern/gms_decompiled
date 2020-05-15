package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: adh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adh extends abz {

    /* renamed from: a */
    boolean f257a = false;

    /* renamed from: b */
    final /* synthetic */ abx f258b;

    public adh(abx abx) {
        this.f258b = abx;
    }

    /* renamed from: a */
    public final void mo270a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f257a) {
            this.f257a = false;
            this.f258b.mo263a();
        }
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.f257a = true;
        }
    }
}
