package com.google.android.gms.tapandpay.clientconfig;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentsDisabledSyncTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108321a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        String str;
        boolean z;
        int i;
        boolean z2;
        Context context2 = context;
        String str2 = aecc.f63128a;
        int i2 = 2;
        if (!"paymentsdisabledoneoff.sync".equals(str2) && !"paymentsdisabledperiodic.sync".equals(str2)) {
            return 2;
        }
        try {
            String b = askc.m74272b();
            List<AccountInfo> d = asix.m74203d(context2, b);
            boolean z3 = false;
            if (d.isEmpty()) {
                return 0;
            }
            d.size();
            for (AccountInfo accountInfo : d) {
                askf askf = new askf(accountInfo, b, context2);
                if (!askc.m74274c(askc.m74272b())) {
                    str = cgxr.f187985a.mo6606a().mo84699k();
                } else {
                    str = cgxr.f187985a.mo6606a().mo84698j();
                }
                boolean z4 = true;
                if (!TextUtils.isEmpty(str)) {
                    if (atds.m75666a(askf).mo49852b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean a = asjg.m74210a(askf.f89124b, askf.f89126d, str);
                    int i3 = 3;
                    int i4 = a != null ? !a.booleanValue() ? 3 : 2 : 1;
                    Boolean a2 = asjg.m74210a(askf.f89124b, askf.f89126d, "service_CPanel");
                    if (a2 != null) {
                        i = !a2.booleanValue() ? 3 : 2;
                    } else {
                        i = 1;
                    }
                    boolean endsWith = askf.f89124b.endsWith("@gmail.com");
                    if (!z) {
                        i3 = 1;
                        z2 = false;
                    } else {
                        if (i4 == 3) {
                            if (i == i2) {
                                if (!endsWith) {
                                    z2 = atey.m75754b(askf);
                                    if (atey.m75753a(askf)) {
                                        i3 = 2;
                                    }
                                } else {
                                    i3 = 1;
                                    z2 = false;
                                }
                            }
                        }
                        i3 = 1;
                        z2 = false;
                    }
                    atam atam = new atam(askf);
                    bxvd g = atam.mo49765g(79);
                    bxvd da = bozp.f135396h.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z3;
                    }
                    bozp bozp = (bozp) da.f164949b;
                    int i5 = bozp.f135398a | 1;
                    bozp.f135398a = i5;
                    bozp.f135399b = z;
                    bozp.f135400c = i4 - 1;
                    int i6 = i5 | 2;
                    bozp.f135398a = i6;
                    bozp.f135401d = i - 1;
                    int i7 = i6 | 4;
                    bozp.f135398a = i7;
                    int i8 = i7 | 8;
                    bozp.f135398a = i8;
                    bozp.f135402e = endsWith;
                    bozp.f135403f = i3 - 1;
                    int i9 = i8 | 16;
                    bozp.f135398a = i9;
                    bozp.f135398a = i9 | 32;
                    bozp.f135404g = z2;
                    if (g.f164950c) {
                        g.mo74035c();
                        g.f164950c = false;
                    }
                    bpbx bpbx = (bpbx) g.f164949b;
                    bozp bozp2 = (bozp) da.mo74062i();
                    bpbx bpbx2 = bpbx.f135635S;
                    bozp2.getClass();
                    bpbx.f135637A = bozp2;
                    bpbx.f135655a |= 268435456;
                    atam.mo49741a((bpbx) g.mo74062i());
                    if (z2) {
                        z4 = false;
                    }
                }
                if (z4 != asiv.m74191b(askf)) {
                    asiv.m74186a("UPDATE Wallets SET is_payments_enabled = ? WHERE account_id = ? AND environment = ?;", z4, askf);
                    asuc.getInstance().mo49500a(context2, "Payments disabled state changed");
                    i2 = 2;
                    z3 = false;
                } else {
                    i2 = 2;
                    z3 = false;
                }
            }
            return 0;
        } catch (asks e) {
            bnsl bnsl = (bnsl) f108321a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.clientconfig.PaymentsDisabledSyncTaskOperation", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error checking if payments disabled");
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebl.f63099k = "paymentsdisabledperiodic.sync";
        aebl.f63070a = TimeUnit.HOURS.toSeconds(24);
        aebl.f63071b = TimeUnit.HOURS.toSeconds(6);
        int i = 0;
        aebl.mo34028b(0, cdny.m134341f() ? 1 : 0);
        aebl.mo34024a(0, cdny.m134340e() ? 1 : 0);
        if (cdny.m134337b()) {
            i = 2;
        }
        aebl.mo34027b(i);
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }
}
