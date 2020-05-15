package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: in */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1083in implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C1084io f21376a;

    public C1083in(C1084io ioVar) {
        this.f21376a = ioVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f21376a.onListItemClick((ListView) adapterView, view, i, j);
    }
}
