package p000;

import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atrg */
public final /* synthetic */ class atrg implements Runnable {

    /* renamed from: a */
    private final TokenizePanChimeraActivity f90705a;

    public atrg(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        this.f90705a = tokenizePanChimeraActivity;
    }

    public final void run() {
        TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90705a;
        tokenizePanChimeraActivity.setResult(0);
        tokenizePanChimeraActivity.finish();
    }
}
