package p000;

import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;

/* renamed from: attu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class attu implements atfd {

    /* renamed from: a */
    final /* synthetic */ attv f90885a;

    public attu(attv attv) {
        this.f90885a = attv;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        if (!ssk.m36235a(this.f90885a.f90886a.f89126d)) {
            attw attw = this.f90885a.f90889d;
            attw.mo50184a(attw.mo50186b(C0126R.string.tp_network_connection_needed_title), this.f90885a.f90889d.mo50186b(C0126R.string.tp_network_connection_needed_content));
            return;
        }
        attw attw2 = this.f90885a.f90889d;
        attw2.mo50184a(attw2.mo50186b(C0126R.string.common_something_went_wrong), this.f90885a.f90889d.mo50186b(C0126R.string.tp_generic_error_content));
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        int a;
        btqf btqf = (btqf) obj;
        if (btqf == null || (a = btqe.m117032a(btqf.f149932a)) == 0 || a != 4) {
            attw attw = this.f90885a.f90889d;
            attw.mo50184a(attw.mo50186b(C0126R.string.common_something_went_wrong), this.f90885a.f90889d.mo50186b(C0126R.string.tp_generic_error_content));
            return;
        }
        attw attw2 = this.f90885a.f90889d;
        attw2.mo50184a(attw2.mo50186b(C0126R.string.common_something_went_wrong), this.f90885a.f90889d.mo50186b(C0126R.string.tp_gsuite_error_message));
    }
}
