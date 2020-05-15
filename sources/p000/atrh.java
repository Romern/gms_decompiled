package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atrh */
public final /* synthetic */ class atrh implements Runnable {

    /* renamed from: a */
    private final TokenizePanChimeraActivity f90706a;

    public atrh(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        this.f90706a = tokenizePanChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(boolean, int):void
     arg types: [int, ?]
     candidates:
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(java.lang.String, java.lang.String):void
      auat.a(int, int):void
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(boolean, int):void */
    public final void run() {
        TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90706a;
        if (tokenizePanChimeraActivity.f108908e) {
            tokenizePanChimeraActivity.mo59480a(true, (int) C0126R.string.tp_tokenize_verifying_card);
        }
    }
}
