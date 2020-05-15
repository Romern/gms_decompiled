package p000;

import android.database.DataSetObserver;

/* renamed from: aal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aal extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ aap f52a;

    public aal(aap aap) {
        this.f52a = aap;
    }

    public final void onChanged() {
        if (this.f52a.mo107e()) {
            this.f52a.mo101aI();
        }
    }

    public final void onInvalidated() {
        this.f52a.mo105d();
    }
}
