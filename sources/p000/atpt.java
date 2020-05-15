package p000;

import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atpt */
final /* synthetic */ class atpt implements Runnable {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90642a;

    public atpt(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90642a = enterVerificationCodeChimeraActivity;
    }

    public final void run() {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90642a;
        if (!enterVerificationCodeChimeraActivity.isFinishing() && !enterVerificationCodeChimeraActivity.isDestroyed()) {
            enterVerificationCodeChimeraActivity.mo59450g();
        }
    }
}
