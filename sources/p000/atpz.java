package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atpz */
public final /* synthetic */ class atpz implements View.OnClickListener {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90649a;

    public atpz(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90649a = enterVerificationCodeChimeraActivity;
    }

    public void onClick(View view) {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90649a;
        ((InputMethodManager) enterVerificationCodeChimeraActivity.getSystemService("input_method")).showSoftInput(enterVerificationCodeChimeraActivity.f108801g, 0);
    }
}
