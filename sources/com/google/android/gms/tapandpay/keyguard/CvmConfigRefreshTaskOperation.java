package com.google.android.gms.tapandpay.keyguard;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CvmConfigRefreshTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108607a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        String str = aecc.f63128a;
        if ("keyguard.refresh_cvm_config".equals(str)) {
            try {
                String b = askc.m74272b();
                List<AccountInfo> d = asix.m74203d(context, b);
                if (d.isEmpty()) {
                    return 0;
                }
                d.size();
                for (AccountInfo accountInfo : d) {
                    atds a = atds.m75666a(new askf(accountInfo, b, context));
                    if (a.mo49849a(TimeUnit.DAYS.toSeconds(1))) {
                        String str2 = accountInfo.f108326b;
                    } else {
                        try {
                            a.mo49859d();
                        } catch (asks | atfh | IOException e) {
                            String str3 = accountInfo.f108326b;
                        }
                    }
                }
                return 0;
            } catch (asks e2) {
                bnsl bnsl = (bnsl) f108607a.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68432a("com.google.android.gms.tapandpay.keyguard.CvmConfigRefreshTaskOperation", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error refreshing cvm config");
                return 2;
            }
        } else {
            bnsl bnsl2 = (bnsl) f108607a.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.tapandpay.keyguard.CvmConfigRefreshTaskOperation", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Got an unexpected task service tag: %s", str);
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebl.f63099k = "keyguard.refresh_cvm_config";
        aebl.f63070a = TimeUnit.DAYS.toSeconds(7);
        aebl.f63071b = TimeUnit.DAYS.toSeconds(2);
        int i = 0;
        aebl.mo34028b(0, cdny.m134341f() ? 1 : 0);
        aebl.mo34024a(1, 1);
        if (cdny.m134337b()) {
            i = 2;
        }
        aebl.mo34027b(i);
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }
}
