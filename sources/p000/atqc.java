package p000;

import android.view.inputmethod.InputMethodManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atqc */
public final /* synthetic */ class atqc implements Runnable {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90652a;

    public atqc(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90652a = enterVerificationCodeChimeraActivity;
    }

    public final void run() {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90652a;
        InputMethodManager inputMethodManager = (InputMethodManager) enterVerificationCodeChimeraActivity.getSystemService("input_method");
        if (enterVerificationCodeChimeraActivity.findViewById(C0126R.C0129id.InterstitialLayout).getVisibility() == 0) {
            inputMethodManager.hideSoftInputFromWindow(enterVerificationCodeChimeraActivity.f108801g.getWindowToken(), 0);
        } else {
            inputMethodManager.showSoftInput(enterVerificationCodeChimeraActivity.f108801g, 0);
        }
    }
}
