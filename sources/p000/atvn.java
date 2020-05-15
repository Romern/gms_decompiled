package p000;

import android.view.View;

/* renamed from: atvn */
public final /* synthetic */ class atvn implements View.OnClickListener {

    /* renamed from: a */
    private final atvu f91014a;

    public atvn(atvu atvu) {
        this.f91014a = atvu;
    }

    public void onClick(View view) {
        atvu atvu = this.f91014a;
        bnsl bnsl = (bnsl) atvu.f91025a.mo68390d();
        bnsl.mo68432a("atvu", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("User closing WalletTransactionDetailsActivity.");
        atvu.f91026b.finish();
    }
}
