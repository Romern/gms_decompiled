package p000;

import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atrf */
public final /* synthetic */ class atrf implements Runnable {

    /* renamed from: a */
    private final TokenizePanChimeraActivity f90704a;

    public atrf(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        this.f90704a = tokenizePanChimeraActivity;
    }

    public final void run() {
        TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90704a;
        bnsl bnsl = (bnsl) TokenizePanChimeraActivity.f108905b.mo68388c();
        bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity", "g", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Timed out on tokenization. Finishing activity");
        tokenizePanChimeraActivity.setResult(404);
        tokenizePanChimeraActivity.finish();
    }
}
