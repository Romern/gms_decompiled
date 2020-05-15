package p000;

import android.database.DataSetObserver;

/* renamed from: aiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiw extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ aix f621a;

    public aiw(aix aix) {
        this.f621a = aix;
    }

    public final void onChanged() {
        aix aix = this.f621a;
        aix.f622b = true;
        aix.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        aix aix = this.f621a;
        aix.f622b = false;
        aix.notifyDataSetInvalidated();
    }
}
