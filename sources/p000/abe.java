package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: abe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abe implements aei {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f99a;

    public abe(RecyclerView recyclerView) {
        this.f99a = recyclerView;
    }

    /* renamed from: a */
    public final void mo142a(acm acm) {
        RecyclerView recyclerView = this.f99a;
        abu abu = recyclerView.mLayout;
        View view = acm.f201a;
        acc acc = recyclerView.mRecycler;
        C1524yt ytVar = abu.f119q;
        int a = ytVar.f27684c.mo147a(view);
        if (a >= 0) {
            if (ytVar.f27682a.mo16578d(a)) {
                ytVar.mo16592d(view);
            }
            ytVar.f27684c.mo148a(a);
        }
        acc.mo281a(view);
    }

    /* renamed from: b */
    public final void mo144b(acm acm, abo abo, abo abo2) {
        this.f99a.animateAppearance(acm, abo, abo2);
    }

    /* renamed from: c */
    public final void mo145c(acm acm, abo abo, abo abo2) {
        acm.mo317a(false);
        RecyclerView recyclerView = this.f99a;
        if (recyclerView.mDataSetHasChangedAfterLayout) {
            if (recyclerView.mItemAnimator.mo200a(acm, acm, abo, abo2)) {
                this.f99a.postAnimationRunner();
            }
        } else if (recyclerView.mItemAnimator.mo204c(acm, abo, abo2)) {
            this.f99a.postAnimationRunner();
        }
    }

    /* renamed from: a */
    public final void mo143a(acm acm, abo abo, abo abo2) {
        this.f99a.mRecycler.mo284b(acm);
        this.f99a.animateDisappearance(acm, abo, abo2);
    }
}
