package p000;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.chimera.debug.items.ModuleItem;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;

/* renamed from: qpf */
final /* synthetic */ class qpf implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private final qpk f41913a;

    public qpf(qpk qpk) {
        this.f41913a = qpk;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        qpk qpk = this.f41913a;
        qoz qoz = (qoz) adapterView.getItemAtPosition(i);
        Object a = qoz.mo24187a();
        qpp qpp = qpk.f41918a;
        if (qpp == null) {
            return;
        }
        if (a instanceof ModuleItem) {
            qpp.mo17637a((ModuleItem) a);
        } else if (a instanceof ModuleSetItem) {
            qpp.mo17638a((ModuleSetItem) a);
        } else if (qoz instanceof qpj) {
            qpp.mo17643i();
        }
    }
}
