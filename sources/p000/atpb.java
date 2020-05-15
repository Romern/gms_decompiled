package p000;

import com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity;

/* renamed from: atpb */
public final /* synthetic */ class atpb implements aubt {

    /* renamed from: a */
    private final AccountSetupChimeraActivity f90624a;

    public atpb(AccountSetupChimeraActivity accountSetupChimeraActivity) {
        this.f90624a = accountSetupChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        AccountSetupChimeraActivity accountSetupChimeraActivity = this.f90624a;
        bnsl bnsl = (bnsl) AccountSetupChimeraActivity.f108750b.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity", "a", 290, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to get bender token to add account, finishing");
        accountSetupChimeraActivity.mo59433a((btnf) null);
    }
}
