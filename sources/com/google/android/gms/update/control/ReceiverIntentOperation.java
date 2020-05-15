package com.google.android.gms.update.control;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReceiverIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String f109492a = ssv.m36267a("com.google.android.gms.update");

    /* renamed from: b */
    private static final sek f109493b = avpq.m79019f("ReceiverIntentOperation");

    /* renamed from: c */
    private static final bnhe f109494c;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("com.google.gservices.intent.action.GSERVICES_CHANGED", 2);
        h.mo67695b("com.google.android.gms.update.BASE_MODULE_INIT", 1);
        h.mo67695b("android.app.action.SYSTEM_UPDATE_POLICY_CHANGED", 6);
        h.mo67695b("android.intent.action.TIME_SET", 6);
        h.mo67695b("android.intent.action.ACTION_POWER_CONNECTED", 9);
        h.mo67695b("android.intent.action.USER_PRESENT", 11);
        h.mo67695b("com.google.android.gms.phenotype.COMMITTED", 2);
        h.mo67695b(f109492a, 2);
        h.mo67695b("com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED", 12);
        f109494c = h.mo67618b();
    }

    /* renamed from: a */
    public static Intent m93721a(Context context) {
        return IntentOperation.getStartIntent(context, ReceiverIntentOperation.class, "com.google.android.gms.update.BASE_MODULE_INIT");
    }

    /* renamed from: b */
    public static PendingIntent m93722b(Context context) {
        return PendingIntent.getService(context, 1, IntentOperation.getStartIntent(context, ReceiverIntentOperation.class, "com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED"), 134217728);
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || f109492a.equals(action)) && !TextUtils.equals("com.google.android.gms.update", intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            f109493b.mo25412b("Ignore non-related phenotype commit", new Object[0]);
            return;
        }
        f109493b.mo25414c("Received intent: %s.", intent);
        avms avms = (avms) avms.f93422b.mo51589b();
        Integer num = (Integer) f109494c.get(intent.getAction());
        if (num != null) {
            avms.mo51399a(num.intValue());
        }
        if (avls.m78734b() && "com.google.vr.powerpolicy.action.ACTION_POLICY_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("com.google.vr.powerpolicy.extra.POLICY", 0);
            if (intExtra == 0) {
                avms.mo51399a(7);
            } else if (intExtra == 2) {
                avms.mo51399a(5);
            }
        }
        if ("com.google.android.gms.update.NOTIFICATION_ACTION".equals(action)) {
            avnd avnd = (avnd) avnd.f93493b.mo51589b();
            int intExtra2 = intent.getIntExtra("notification_action", -1);
            if (intExtra2 == 0) {
                avnd.f93494c.mo51405a(new DownloadOptions(true, true));
            } else if (intExtra2 == 1) {
                avnd.f93494c.mo51406a(new InstallationOptions(true, true, true, false));
            } else if (intExtra2 == 2) {
                try {
                    avnd.f93494c.mo51411b(true);
                } catch (IOException e) {
                    avnd.f93492a.mo25418e("Unable to schedule install tonight", new Object[0]);
                }
            } else if (intExtra2 == 3) {
                avnd.f93494c.mo51410b(new InstallationOptions(true, true, true, false));
            } else if (intExtra2 != 4) {
                avnd.f93492a.mo25418e("Unknown notification action: %d.", Integer.valueOf(intExtra2));
                return;
            }
            bxvd da = bohr.f133141c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bohr bohr = (bohr) da.f164949b;
            bohr.f133143a = 1 | bohr.f133143a;
            bohr.f133144b = intExtra2;
            bohr bohr2 = (bohr) da.mo74062i();
            avpp avpp = avnd.f93495d;
            bxvd a = avpp.mo51476a(8);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bohn bohn = (bohn) a.f164949b;
            bohn bohn2 = bohn.f133102n;
            bohr2.getClass();
            bohn.f133114k = bohr2;
            bohn.f133104a |= 512;
            avpp.mo51478a((bohn) a.mo74062i());
        }
    }
}
