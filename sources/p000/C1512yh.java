package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: yh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1512yh implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C1515yk f27646a;

    public C1512yh(C1515yk ykVar) {
        this.f27646a = ykVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f27646a.f27653d.setSelection(i);
        if (this.f27646a.f27653d.getOnItemClickListener() != null) {
            C1515yk ykVar = this.f27646a;
            ykVar.f27653d.performItemClick(view, i, ykVar.f27651b.getItemId(i));
        }
        this.f27646a.mo105d();
    }
}
