package com.google.android.gms.tapandpay.notifications;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransactionNotificationSettingTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108616a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static boolean m93087b(Context context) {
        if (!cgwn.m147261k() || new atkm(context).f90420c.getBoolean("notification_setting_migration", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        if (!m93087b(context)) {
            return 0;
        }
        try {
            String b = askc.m74272b();
            for (AccountInfo accountInfo : asix.m74203d(context, b)) {
                askf askf = new askf(accountInfo, b, context);
                if (!asiv.m74193c(askf)) {
                    atbd.m75359b(askf);
                }
            }
            new atkm(context).f90420c.edit().putBoolean("notification_setting_migration", true).apply();
            return 0;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f108616a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.notifications.TransactionNotificationSettingTaskOperation", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Transient error, rescheduling");
            return 1;
        } catch (asks | atfh | IllegalArgumentException | IllegalStateException e2) {
            bnsl bnsl2 = (bnsl) f108616a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("com.google.android.gms.tapandpay.notifications.TransactionNotificationSettingTaskOperation", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Fatal error, aborting");
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        if (m93087b(context)) {
            aeat a = aeat.m51532a(context);
            aebi aebi = new aebi();
            aebi.mo34004a(0, TimeUnit.HOURS.toSeconds(4));
            aebi.f63099k = "tns.migrate";
            aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
            aebi.mo34023a(0);
            aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
            aebi.mo34027b(1);
            a.mo33984a(aebi.mo33974b());
        }
    }
}
