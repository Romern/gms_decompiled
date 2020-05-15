package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* renamed from: asjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjj {

    /* renamed from: a */
    public static final long f89069a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final long f89070b = TimeUnit.MINUTES.toMillis(5);

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public static void m74219a(Context context) {
        int i;
        new skc(context).mo25668a(atht.m75912a(context, "com.google.android.gms.tapandpay.SETUP_ADMIN_TIMEOUT"));
        String string = context.getString(C0126R.string.tp_device_admin_notification_title);
        if (!asjw.m74255a()) {
            i = C0126R.string.tp_device_admin_notification_non_nfc_content;
        } else {
            i = C0126R.string.tp_device_admin_notification_content;
        }
        m74221a(context, string, context.getString(i), true);
        m74220a(context, f89070b, "com.google.android.gms.tapandpay.selfdestruct.SCHEDULE_SELF_DESTRUCT_ACTION");
    }

    /* renamed from: b */
    public static void m74222b(Context context) {
        int i;
        String string = context.getString(C0126R.string.tp_secure_keyguard_prompt_title);
        if (!asjw.m74255a()) {
            i = C0126R.string.tp_secure_keyguard_notification_non_nfc_content;
        } else {
            i = C0126R.string.tp_secure_keyguard_notification_content;
        }
        m74221a(context, string, context.getString(i), false);
        m74223c(context);
    }

    /* renamed from: c */
    public static void m74223c(Context context) {
        if (IntentOperation.getPendingIntent(context, "com.google.android.gms.tapandpay.selfdestruct.ScheduleSelfDestructOperation", new Intent("com.google.android.gms.tapandpay.selfdestruct.SCHEDULE_SELF_DESTRUCT_ACTION"), 1, 536870912) == null) {
            new skc(context).mo25668a(atht.m75912a(context, "com.google.android.gms.tapandpay.SETUP_KEYGUARD_TIMEOUT"));
            m74220a(context, f89070b, "com.google.android.gms.tapandpay.selfdestruct.SCHEDULE_SELF_DESTRUCT_ACTION");
        }
    }

    /* renamed from: d */
    public static void m74224d(Context context) {
        context.startService(IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.selfdestruct.SelfDestructIntentOperation", "com.google.android.gms.tapandpay.selfdestruct.SELF_DESTRUCT_ACTION"));
    }

    /* renamed from: e */
    public static void m74225e(Context context) {
        skc skc = new skc(context);
        skc.mo25668a(atht.m75912a(context, "com.google.android.gms.tapandpay.SETUP_ADMIN_TIMEOUT"));
        skc.mo25668a(atht.m75912a(context, "com.google.android.gms.tapandpay.SETUP_KEYGUARD_TIMEOUT"));
        skc.mo25668a(atht.m75912a(context, "com.google.android.gms.tapandpay.selfdestruct.SCHEDULE_SELF_DESTRUCT_ACTION"));
        atbg.m75370a(context, (String) null);
    }

    /* renamed from: a */
    public static void m74220a(Context context, long j, String str) {
        new skc(context).mo25675a("SecurityNotificationHelper", 0, System.currentTimeMillis() + j, atht.m75912a(context, str), (String) null);
    }

    /* renamed from: a */
    private static void m74221a(Context context, String str, String str2, boolean z) {
        C1102je a = atbg.m75368a(context, atbf.ALERTS);
        a.mo13616a(11);
        a.mo13640e(str);
        a.mo13632b(str2);
        a.mo13639d(str);
        a.mo13627a(true);
        if (z) {
            a.f22254f = PendingIntent.getService(context, 0, IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.admin.RedirectToSettingIntentOperation", "com.google.android.gms.tapandpay.admin.REDIRECT_TO_SETTING"), 134217728);
        } else {
            sre.m36089i(context);
            Intent className = new Intent().setClassName(context, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity");
            className.setFlags(268468224);
            a.f22254f = PendingIntent.getActivity(context, 0, className, 134217728);
        }
        atbg.m75371a(context, (String) null, a);
    }
}
