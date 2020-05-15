package p000;

import android.view.View;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atpx */
public final /* synthetic */ class atpx implements View.OnClickListener {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90646a;

    public atpx(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90646a = enterVerificationCodeChimeraActivity;
    }

    public void onClick(View view) {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90646a;
        enterVerificationCodeChimeraActivity.setResult(2);
        enterVerificationCodeChimeraActivity.finish();
    }
}
