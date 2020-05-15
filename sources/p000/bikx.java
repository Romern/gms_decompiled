package p000;

import android.database.DataSetObserver;

/* renamed from: bikx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bikx extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ bikz f120802a;

    public bikx(bikz bikz) {
        this.f120802a = bikz;
    }

    public final void onChanged() {
        bikz bikz = this.f120802a;
        bikz.f120805d = bikz.f120806e;
        bikz.f120806e = bikz.f120804a.getCount();
    }

    public final void onInvalidated() {
        bikz bikz = this.f120802a;
        bikz.f120806e = 0;
        bikz.f120805d = 0;
    }
}
