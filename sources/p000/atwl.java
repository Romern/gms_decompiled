package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atwl extends atfe {
    public final void onErrorResponse(VolleyError volleyError) {
        bnsl bnsl = (bnsl) WalletTransactionDetailsChimeraActivity.f108938b.mo68387b();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("atwl", "onErrorResponse", 780, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Server error: %s", "Error calling TRANSACTION_FEEDBACK_RPC, ignoring it.");
    }
}
