package com.google.android.gms.tapandpay.notifications;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NHoursAfterGmsCoreRenderedNotificationTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108613a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static void m93071a(String str, int i, askf askf) {
        Bundle bundle = new Bundle();
        bundle.putString("campaign_id", str);
        bundle.putInt("behavior_cohort", i - 1);
        bundle.putString("environment", askf.f89125c);
        bundle.putParcelable("extra_account_info", askf.mo49209a());
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebi.f63099k = "notifications.nHoursAfterGmsCoreRenderedNotificationActivation";
        aebi.mo34004a(TimeUnit.DAYS.toSeconds(1), TimeUnit.DAYS.toSeconds(1) + TimeUnit.HOURS.toSeconds(1));
        aebi.f63107s = bundle;
        aeat.m51532a(askf.f89126d).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
    }

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        String str = aecc.f63128a;
        int i = 2;
        if ("notifications.nHoursAfterGmsCoreRenderedNotificationActivation".equals(str)) {
            Bundle bundle = aecc.f63129b;
            AccountInfo accountInfo = (AccountInfo) bundle.getParcelable("extra_account_info");
            String string = bundle.getString("environment");
            if (accountInfo == null || string == null) {
                bnsl bnsl = (bnsl) f108613a.mo68388c();
                bnsl.mo68432a("com.google.android.gms.tapandpay.notifications.NHoursAfterGmsCoreRenderedNotificationTaskOperation", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Missing accountInfo or environment");
                return 2;
            }
            bxvd da = bpbx.f135635S.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbx bpbx = (bpbx) da.f164949b;
            bpbx.f135657c = 64;
            bpbx.f135655a |= 1;
            bxvd da2 = bozl.f135386f.mo74144da();
            String string2 = bundle.getString("campaign_id");
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bozl bozl = (bozl) da2.f164949b;
            string2.getClass();
            bozl.f135388a |= 4;
            bozl.f135391d = string2;
            int a = bozi.m111690a(bundle.getInt("behavior_cohort", 0));
            if (a == 0) {
                a = 1;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bozl bozl2 = (bozl) da2.f164949b;
            bozl2.f135392e = a - 1;
            bozl2.f135388a |= 8;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbx bpbx2 = (bpbx) da.f164949b;
            bozl bozl3 = (bozl) da2.mo74062i();
            bozl3.getClass();
            bpbx2.f135677w = bozl3;
            bpbx2.f135655a |= 8388608;
            bxvd da3 = bozb.f135362e.mo74144da();
            if (!sey.m35126a(context).mo25460a()) {
                i = 3;
            }
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bozb bozb = (bozb) da3.f164949b;
            bozb.f135365b = i - 1;
            bozb.f135364a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbx bpbx3 = (bpbx) da.f164949b;
            bozb bozb2 = (bozb) da3.mo74062i();
            bozb2.getClass();
            bpbx3.f135678x = bozb2;
            bpbx3.f135655a |= 16777216;
            new atam(new askf(accountInfo, string, context)).mo49741a((bpbx) da.mo74062i());
            return 0;
        }
        bnsl bnsl2 = (bnsl) f108613a.mo68388c();
        bnsl2.mo68432a("com.google.android.gms.tapandpay.notifications.NHoursAfterGmsCoreRenderedNotificationTaskOperation", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Got an unexpected task service tag: %s", str);
        return 2;
    }
}
