package p000;

import android.os.SystemClock;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atpw */
public final /* synthetic */ class atpw implements Runnable {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90645a;

    public atpw(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90645a = enterVerificationCodeChimeraActivity;
    }

    public final void run() {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90645a;
        if (!enterVerificationCodeChimeraActivity.isFinishing() && !enterVerificationCodeChimeraActivity.isDestroyed()) {
            enterVerificationCodeChimeraActivity.setResult(-1);
            enterVerificationCodeChimeraActivity.finish();
            ars ars = enterVerificationCodeChimeraActivity.f108813s;
            int decrementAndGet = ars.f2096a.decrementAndGet();
            if (decrementAndGet == 0) {
                arr arr = ars.f2097b;
                ars.f2099d = SystemClock.uptimeMillis();
            }
            if (decrementAndGet < 0) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Counter has been corrupted! counterVal=");
                sb.append(decrementAndGet);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
