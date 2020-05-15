package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ttm */
final /* synthetic */ class ttm implements C0038ax {

    /* renamed from: a */
    private final ttp f46640a;

    public ttm(ttp ttp) {
        this.f46640a = ttp;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ttp ttp = this.f46640a;
        tql tql = (tql) obj;
        if (tql.mo26737c() == 1) {
            ttp.mo26795d();
        } else if (tql.mo26737c() == 3) {
            ttp.mo26791a(tto.WAS_EDITED);
            Toast.makeText(ttp.getActivity(), (int) C0126R.string.common_something_went_wrong, 0).show();
        }
    }
}
