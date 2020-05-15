package com.google.android.gms.tapandpay.tapreporting;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapInfoUploadGcmTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108736a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    static void m93182b(Context context) {
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebi.f63099k = "tapreporting.uploadTapInfos";
        aebi.mo34023a(0);
        aebi.mo34004a(0, TimeUnit.MINUTES.toSeconds(60));
        aebi.mo34027b(0);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        String str = aecc.f63128a;
        if ("tapreporting.uploadTapInfos".equals(str)) {
            return new atoq().mo50090a(context);
        }
        ((bnsl) f108736a.mo68388c()).mo68420a("Got an unexpected task service tag: %s", str);
        return 2;
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        m93182b(context);
    }
}
