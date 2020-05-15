package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atpy */
public final /* synthetic */ class atpy implements View.OnClickListener {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90647a;

    /* renamed from: b */
    private final Intent f90648b;

    public atpy(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity, Intent intent) {
        this.f90647a = enterVerificationCodeChimeraActivity;
        this.f90648b = intent;
    }

    public void onClick(View view) {
        this.f90647a.startActivityForResult(this.f90648b, 1003);
    }
}
