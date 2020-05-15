package p000;

import android.database.Cursor;
import android.support.p002v7.widget.SearchView;

/* renamed from: acu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchView f242a;

    public acu(SearchView searchView) {
        this.f242a = searchView;
    }

    public final void run() {
        aix aix = this.f242a.f1264q;
        if (aix instanceof adk) {
            aix.mo431a((Cursor) null);
        }
    }
}
