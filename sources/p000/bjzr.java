package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjzr implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ bkaf f123711a;

    public bjzr(bkaf bkaf) {
        this.f123711a = bkaf;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f123711a.mo65708b(false);
        bkaf bkaf = this.f123711a;
        bkaf.mo65702a(bkaf.f123765b.getString(C0126R.string.wallet_uic_network_error_title), this.f123711a.f123765b.getString(C0126R.string.wallet_uic_network_error_message), (String) null);
    }
}
