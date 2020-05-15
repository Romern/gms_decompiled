package p000;

import android.util.Log;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tnw */
final /* synthetic */ class tnw implements C0038ax {

    /* renamed from: a */
    private final tnx f46364a;

    public tnw(tnx tnx) {
        this.f46364a = tnx;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tnx tnx = this.f46364a;
        tql tql = (tql) obj;
        int c = tql.mo26737c();
        if (c == 0) {
            throw null;
        } else if (c != 3) {
        } else {
            if (!(tql.mo26736b() instanceof rjp) || ((rjp) tql.mo26736b()).mo24655a() != 7) {
                Log.e("AffiliatedGroupCntrllr", "An unknown error occurred", tql.mo26736b());
                Toast.makeText(tnx.f46366b.getContext(), (int) C0126R.string.common_something_went_wrong, 0).show();
                return;
            }
            Log.e("AffiliatedGroupCntrllr", "A network error occurred", tql.mo26736b());
            Toast.makeText(tnx.f46366b.getContext(), (int) C0126R.string.common_no_network, 1).show();
        }
    }
}
