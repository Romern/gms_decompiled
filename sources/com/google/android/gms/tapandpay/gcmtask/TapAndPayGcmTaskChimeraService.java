package com.google.android.gms.tapandpay.gcmtask;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    public static final srn f108498a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    static final bnhe f108499b;

    /* renamed from: c */
    public volatile aspl f108500c = new aspl();

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("tapreporting.uploadTapInfos", "com.google.android.gms.tapandpay.tapreporting.TapInfoUploadGcmTaskOperation");
        h.mo67695b("clientconfig.sync", "com.google.android.gms.tapandpay.clientconfig.ClientConfigSyncTaskOperation");
        h.mo67695b("clientconfig.oneoffsync", "com.google.android.gms.tapandpay.clientconfig.ClientConfigSyncTaskOperation");
        h.mo67695b("paymentsdisabledoneoff.sync", "com.google.android.gms.tapandpay.clientconfig.PaymentsDisabledSyncTaskOperation");
        h.mo67695b("paymentsdisabledperiodic.sync", "com.google.android.gms.tapandpay.clientconfig.PaymentsDisabledSyncTaskOperation");
        h.mo67695b("keyguard.refresh_cvm_config", "com.google.android.gms.tapandpay.keyguard.CvmConfigRefreshTaskOperation");
        h.mo67695b("tapreporting.uploadDoodleRenderedInfos", "com.google.android.gms.tapandpay.tapreporting.UploadDoodleRenderedInfosTaskOperation");
        h.mo67695b("notifications.nHoursAfterGmsCoreRenderedNotificationActivation", "com.google.android.gms.tapandpay.notifications.NHoursAfterGmsCoreRenderedNotificationTaskOperation");
        h.mo67695b("checkin_task", "com.google.android.gms.tapandpay.security.CheckInTaskOperation");
        h.mo67695b("fetch_storage_key", "com.google.android.gms.tapandpay.security.FetchStorageKeyTaskOperation");
        h.mo67695b("immediate", "com.google.android.gms.tapandpay.notifications.TapAndPayGcmRegistrationTaskOperation");
        h.mo67695b("periodic", "com.google.android.gms.tapandpay.notifications.TapAndPayGcmRegistrationTaskOperation");
        h.mo67695b("Oneoff", "com.google.android.gms.tapandpay.paymentbundle.PaymentBundleRefreshTaskOperation");
        h.mo67695b("Periodic", "com.google.android.gms.tapandpay.paymentbundle.PaymentBundleRefreshTaskOperation");
        h.mo67695b("secard_CardsStateSync", "com.google.android.gms.tapandpay.secard.FelicaCardStateSyncTaskOperation");
        h.mo67695b("secard.transactions.sync", "com.google.android.gms.tapandpay.secard.SeTransactionSyncTaskOperation");
        h.mo67695b("local_notification.oneoff", "com.google.android.gms.tapandpay.notifications.LocalNotificationTaskOperation");
        h.mo67695b("manageNotificationChannels", "com.google.android.gms.tapandpay.notifications.ManageNotificationChannelsTaskOperation");
        h.mo67695b("keyguard.check", "com.google.android.gms.tapandpay.keyguard.CheckKeyguardTaskOperation");
        h.mo67695b("globalactions.state", "com.google.android.gms.tapandpay.globalactions.GlobalActionsStateUpdateTaskOperation");
        h.mo67695b("tns.migrate", "com.google.android.gms.tapandpay.notifications.TransactionNotificationSettingTaskOperation");
        h.mo67695b("hce.dynamic_aid_registration.oneoff", "com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation");
        h.mo67695b("tokenization.dypNotification", "com.google.android.gms.tapandpay.tokenization.gcmtasks.DeferredYellowPathNotificationTaskOperation");
        f108499b = h.mo67618b();
    }

    /* renamed from: a */
    public static void m93027a(Context context) {
        m93028a(context, new aspl());
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        snp.m35702a(10).execute(new aspk(this));
    }

    /* renamed from: a */
    public static void m93028a(Context context, aspl aspl) {
        for (String str : new HashSet(f108499b.values())) {
            aspm a = aspl.mo49331a(str);
            if (a != null) {
                a.mo49333a(context);
            }
        }
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        aspm a;
        String str = aecc.f63128a;
        if (asjw.m74259d(this)) {
            String str2 = aecc.f63128a;
            if (f108499b.containsKey(str2) && (a = this.f108500c.mo49331a((String) f108499b.get(str2))) != null) {
                try {
                    return a.mo49332a(aecc, this);
                } catch (SQLiteException e) {
                    bnsl bnsl = (bnsl) f108498a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskChimeraService", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Database error running task with tag: %s", str2);
                    return 2;
                }
            }
        }
        return 2;
    }
}
