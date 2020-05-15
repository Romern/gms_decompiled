package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: abh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abh {

    /* renamed from: a */
    private final abi f102a = new abi();

    /* renamed from: b */
    public boolean f103b = false;

    /* renamed from: c */
    public final int f104c = 1;

    /* renamed from: L */
    public long mo157L(int i) {
        return -1;
    }

    /* renamed from: M */
    public final void mo158M(int i) {
        this.f102a.mo181a(i, 1);
    }

    /* renamed from: N */
    public final void mo159N(int i) {
        this.f102a.mo185b(i, 1);
    }

    /* renamed from: O */
    public final void mo160O(int i) {
        this.f102a.mo186c(i, 1);
    }

    /* renamed from: a */
    public abstract int mo161a();

    /* renamed from: a */
    public int mo162a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract acm mo163a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo167a(acm acm) {
    }

    /* renamed from: a */
    public abstract void mo168a(acm acm, int i);

    /* renamed from: aJ */
    public final void mo171aJ() {
        this.f102a.mo184b();
    }

    /* renamed from: b */
    public final acm mo172b(ViewGroup viewGroup, int i) {
        try {
            C1192ml.m19643a("RV CreateView");
            acm a = mo163a(viewGroup, i);
            if (a.f201a.getParent() == null) {
                a.f206f = i;
                return a;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            C1192ml.m19642a();
        }
    }

    /* renamed from: b */
    public void mo175b(acm acm) {
    }

    /* renamed from: c */
    public final void mo177c(int i, int i2) {
        this.f102a.mo185b(i, i2);
    }

    /* renamed from: d */
    public final void mo178d(int i, int i2) {
        this.f102a.mo186c(i, i2);
    }

    /* renamed from: d */
    public void mo179d(RecyclerView recyclerView) {
    }

    /* renamed from: h */
    public final void mo180h(int i, int i2) {
        this.f102a.mo181a(i, i2);
    }

    /* renamed from: a */
    public final void mo164a(int i, int i2, Object obj) {
        this.f102a.mo182a(i, i2, obj);
    }

    /* renamed from: a */
    public final void mo165a(int i, Object obj) {
        this.f102a.mo182a(i, 1, obj);
    }

    /* renamed from: b */
    public final void mo173b(int i, int i2) {
        this.f102a.mo187d(i, i2);
    }

    /* renamed from: a */
    public void mo166a(abj abj) {
        this.f102a.registerObserver(abj);
    }

    /* renamed from: b */
    public void mo174b(abj abj) {
        this.f102a.unregisterObserver(abj);
    }

    /* renamed from: a */
    public void mo169a(acm acm, int i, List list) {
        mo168a(acm, i);
    }

    /* renamed from: b */
    public final void mo176b(acm acm, int i) {
        abh abh = acm.f218r;
        if (abh == null) {
            acm.f203c = i;
            if (this.f103b) {
                acm.f205e = mo157L(i);
            }
            acm.mo313a(1, 519);
            C1192ml.m19643a("RV OnBindView");
        }
        acm.f218r = this;
        mo169a(acm, i, acm.mo337r());
        if (abh == null) {
            acm.mo336q();
            ViewGroup.LayoutParams layoutParams = acm.f201a.getLayoutParams();
            if (layoutParams instanceof abv) {
                ((abv) layoutParams).f131e = true;
            }
            C1192ml.m19642a();
        }
    }

    /* renamed from: a */
    public final void mo170a(boolean z) {
        if (!this.f102a.mo183a()) {
            this.f103b = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
