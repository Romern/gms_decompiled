package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: bjfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfw implements bjew {

    /* renamed from: a */
    final rjx f122631a;

    public bjfw(Context context) {
        this.f122631a = rjx.m33696b(context);
    }

    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        Intent intent;
        Intent intent2 = bjfc.f122612a;
        if (!intent2.getBooleanExtra("skipLockScreen", false)) {
            this.f122631a.mo24771y();
        }
        asmk asmk = (asmk) this.f122631a.mo24712a((RetrieveInAppPaymentCredentialRequest) intent2.getParcelableExtra("retrieveInAppPaymentCredentialRequest")).mo9456a(10, TimeUnit.SECONDS);
        int i = asmk.mo7183bo().f30115i;
        if (i == 0) {
            Intent a = bjfd.m103295a(0);
            a.putExtra("retrieveInAppPaymentCredentialResponse", asmk.mo49242b());
            intent = a;
        } else if (i != 16) {
            intent = bjfd.m103296b(i);
        } else {
            intent = bjfd.m103295a(1);
        }
        return new bjfd(intent);
    }
}
