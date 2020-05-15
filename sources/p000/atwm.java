package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atwm implements atfd {

    /* renamed from: a */
    private final String f91051a;

    public atwm(String str) {
        this.f91051a = str;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bnsl bnsl = (bnsl) WalletTransactionDetailsChimeraActivity.f108938b.mo68387b();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("atwm", "onErrorResponse", 937, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Server error: %s", this.f91051a);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        btrk btrk = (btrk) obj;
    }
}
