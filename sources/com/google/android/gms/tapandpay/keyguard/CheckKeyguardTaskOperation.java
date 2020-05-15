package com.google.android.gms.tapandpay.keyguard;

import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckKeyguardTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108606a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        try {
            if (atcx.m75568a(context, askc.m74272b())) {
                new aszt(context).mo49721a(SystemClock.elapsedRealtime());
            }
            return 0;
        } catch (asks e) {
            bnsl bnsl = (bnsl) f108606a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.keyguard.CheckKeyguardTaskOperation", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to checkin");
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        if (!asjk.m74227a()) {
            aeat a = aeat.m51532a(context);
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
            aebl.mo34008a(TimeUnit.HOURS.toSeconds(1), TimeUnit.MINUTES.toSeconds(20), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            aebl.mo34024a(0, cdny.m134338c() ? 1 : 0);
            aebl.mo34027b(1);
            aebl.f63099k = "keyguard.check";
            a.mo33984a(aebl.mo33974b());
        }
    }
}
