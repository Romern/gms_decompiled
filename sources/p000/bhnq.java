package p000;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: bhnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhnq extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ TabLayout f119145a;

    public bhnq(TabLayout tabLayout) {
        this.f119145a = tabLayout;
    }

    public final void onChanged() {
        this.f119145a.mo71232d();
    }

    public final void onInvalidated() {
        this.f119145a.mo71232d();
    }
}
