package p000;

import android.support.p002v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: ada */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ada implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f248a;

    public ada(SearchView searchView) {
        this.f248a = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f248a.mo1626e(i);
    }
}
