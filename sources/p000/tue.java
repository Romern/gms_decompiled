package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tue */
final /* synthetic */ class tue implements C0038ax {

    /* renamed from: a */
    private final tuf f46676a;

    public tue(tuf tuf) {
        this.f46676a = tuf;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        Exception b;
        tuf tuf = this.f46676a;
        tql tql = (tql) obj;
        if (tql.mo26737c() == 1) {
            tuf.mo26810a(false);
            if (tql.mo26735a() != null) {
                tuf.mo26811a(((bngx) tql.mo26735a()).isEmpty(), tuf.getView());
            }
        } else if (tql.mo26737c() == 3 && (b = tql.mo26736b()) != null) {
            if (!(b instanceof rjp) || ((rjp) b).mo24655a() != 7) {
                Toast.makeText(tuf.getContext(), (int) C0126R.string.common_something_went_wrong, 0).show();
            } else {
                Toast.makeText(tuf.getContext(), (int) C0126R.string.common_no_network, 0).show();
            }
            tuf.getActivity().finish();
        }
    }
}
