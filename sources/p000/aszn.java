package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: aszn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszn implements atfd {

    /* renamed from: a */
    final /* synthetic */ RequestTokenizeChimeraActivity f89921a;

    public aszn(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity) {
        this.f89921a = requestTokenizeChimeraActivity;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        ((bnsl) RequestTokenizeChimeraActivity.f108577b.mo68388c()).mo68405a("Could not retrieve marketing emails setting");
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        srn srn = RequestTokenizeChimeraActivity.f108577b;
        if (!((btnr) obj).f149680a) {
            this.f89921a.f108580e.setVisibility(0);
        }
    }
}
