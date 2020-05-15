package p000;

import android.view.View;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atps */
public final /* synthetic */ class atps implements View.OnClickListener {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90641a;

    public atps(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90641a = enterVerificationCodeChimeraActivity;
    }

    public void onClick(View view) {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90641a;
        enterVerificationCodeChimeraActivity.mo59444a(enterVerificationCodeChimeraActivity.f108801g.getText().toString());
    }
}
