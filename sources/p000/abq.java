package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: abq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abq implements abn {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f109a;

    public abq(RecyclerView recyclerView) {
        this.f109a = recyclerView;
    }

    /* renamed from: a */
    public final void mo196a(acm acm) {
        acm.mo317a(true);
        if (acm.f208h != null && acm.f209i == null) {
            acm.f208h = null;
        }
        acm.f209i = null;
        if ((acm.f210j & 16) == 0 && !this.f109a.removeAnimatingView(acm.f201a) && acm.mo334o()) {
            this.f109a.removeDetachedView(acm.f201a, false);
        }
    }
}
