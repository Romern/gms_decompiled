package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: bhoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhoy implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ bhoz f119249a;

    public bhoy(bhoz bhoz) {
        this.f119249a = bhoz;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        long j2;
        int i2;
        View view2;
        View view3;
        long j3;
        if (i >= 0) {
            obj = this.f119249a.getAdapter().getItem(i);
        } else {
            aap aap = this.f119249a.f119250a;
            obj = aap.mo107e() ? aap.f60e.getSelectedItem() : null;
        }
        this.f119249a.mo64119a(obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f119249a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view != null && i >= 0) {
                view2 = view;
                i2 = i;
                j2 = j;
            } else {
                aap aap2 = this.f119249a.f119250a;
                if (aap2.mo107e()) {
                    view3 = aap2.f60e.getSelectedView();
                } else {
                    view3 = null;
                }
                int k = this.f119249a.f119250a.mo112k();
                aap aap3 = this.f119249a.f119250a;
                if (aap3.mo107e()) {
                    j3 = aap3.f60e.getSelectedItemId();
                } else {
                    j3 = Long.MIN_VALUE;
                }
                view2 = view3;
                i2 = k;
                j2 = j3;
            }
            onItemClickListener.onItemClick(this.f119249a.f119250a.f60e, view2, i2, j2);
        }
        this.f119249a.f119250a.mo105d();
    }
}
