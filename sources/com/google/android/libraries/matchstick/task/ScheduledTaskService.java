package com.google.android.libraries.matchstick.task;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScheduledTaskService extends aeah {

    /* renamed from: a */
    private azdl f111165a;

    /* renamed from: a */
    public static void m94657a(Context context) {
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.tickle_handle_action");
        intent.putExtra("command_source_in_int", 2);
        intent.putExtra("command_type", "report_status");
        MessagingService.m94557b(intent, context);
    }

    /* renamed from: b */
    public static void m94662b(Context context) {
        MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.SYNC_ENABLED_APPS_METADATA"), context);
    }

    /* renamed from: c */
    public static void m94665c(Context context) {
        m94661a(context, false, true);
    }

    /* renamed from: b */
    public static void m94663b(Context context, String str) {
        new Object[1][0] = str;
        aeat.m51532a(context).mo33986a(str, "com.google.android.gms.matchstick.task.ScheduledTaskService");
    }

    /* renamed from: b */
    public static void m94664b(Context context, String str, long j, long j2) {
        m94663b(context, str);
        m94660a(context, str, j, j2);
    }

    /* renamed from: a */
    public static void m94658a(Context context, String str) {
        new Object[1][0] = str;
        aebi aebi = new aebi();
        aebi.f63099k = str;
        aebi.f63097i = "com.google.android.gms.matchstick.task.ScheduledTaskService";
        aebi.mo34023a(0);
        aebi.mo34004a(0, cfeo.f183719a.mo6606a().mo81028bi());
        aebi.mo34027b(1);
        aebi.f63102n = true;
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m94659a(Context context, String str, long j, float f) {
        int i = 0;
        new Object[1][0] = str;
        long j2 = 0;
        if (j <= 0) {
            azoj.m85933c("ScheduledTaskService", "Invalid interval %s", Long.valueOf(j));
            return;
        }
        if (f > 0.0f && f < 1.0f) {
            j2 = (long) Math.round(((float) j) * f);
        }
        aebl aebl = new aebl();
        aebl.f63099k = str;
        aebl.f63097i = "com.google.android.gms.matchstick.task.ScheduledTaskService";
        aebl.mo34023a(0);
        boolean Q = cfeo.m138860Q();
        if (cdny.m134338c() || cfeo.m138860Q()) {
            i = 1;
        }
        aebl.mo34024a(Q ? 1 : 0, i);
        aebl.f63070a = j;
        aebl.f63071b = j2;
        aebl.mo34027b(1);
        aebl.f63102n = true;
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }

    /* renamed from: a */
    public static void m94660a(Context context, String str, long j, long j2) {
        Object[] objArr = {str, Long.valueOf(j)};
        aebi aebi = new aebi();
        aebi.f63099k = str;
        aebi.f63097i = "com.google.android.gms.matchstick.task.ScheduledTaskService";
        aebi.mo34004a(j, j2 + j);
        aebi.mo34032e();
        aebi.mo34027b(1);
        aebi.f63102n = true;
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    private static void m94661a(Context context, boolean z, boolean z2) {
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.RUN_SYNC_CHECKER");
        intent.setClassName(context, "com.google.android.gms.matchstick.net.MessagingService");
        intent.putExtra("reset_connection", z);
        intent.putExtra("sync_ops", 2006);
        if (z2) {
            MessagingService.m94556a(intent, context);
        } else {
            MessagingService.m94557b(intent, context);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        this.f111165a = azdl.m85412a(getApplicationContext());
        String str = aecc.f63128a;
        new Object[1][0] = str;
        switch (str.hashCode()) {
            case -2101566210:
                if (str.equals("gms:matchstick:checkRegistrationWithLighter")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -1708889704:
                if (str.equals("gms:matchstick:restoreConn")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1458226966:
                if (str.equals("gms:matchstick:pingDuo")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1075298488:
                if (str.equals("gms:matchstick:syncWithoutBind")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -905241633:
                if (str.equals("gms:matchstick:periodicTokenRefresh")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1324977272:
                if (str.equals("gms:matchstick:periodicSyncAppMetadata")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 1431201459:
                if (str.equals("gms:matchstick:clientStatusReport")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1616156448:
                if (str.equals("gms:matchstick:renotification")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1778052261:
                if (str.equals("gms:matchstick:register")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1807600856:
                if (str.equals("gms:matchstick:periodicSync")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2100563703:
                if (str.equals("gms:matchstick:updateClientCaps")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                Context applicationContext = getApplicationContext();
                Intent intent = new Intent(applicationContext, SilentRegisterIntentOperation.class);
                intent.setAction("com.google.android.gms.matchstick.register_intent_action");
                if (azcv.m85357a(applicationContext).mo54698b((LocalEntityId) null) || this.f111165a.mo54792n()) {
                    SilentRegisterIntentOperation.m94575a(intent, applicationContext);
                }
                return 0;
            case 1:
                m94661a(getApplicationContext(), true, false);
                return 0;
            case 2:
                Context applicationContext2 = getApplicationContext();
                Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.RUN_SYNC_CHECKER");
                intent2.putExtra("sync_ops", 2048);
                MessagingService.m94557b(intent2, applicationContext2);
                return 0;
            case 3:
                MessagingService.m94556a(new Intent("com.google.android.apps.libraries.matchstick.action.RESTORE_BIND"), getApplicationContext());
                return 0;
            case 4:
                m94665c(getApplicationContext());
                return 0;
            case 5:
                Context applicationContext3 = getApplicationContext();
                Intent a = SilentRegisterIntentOperation.m94569a(applicationContext3, (String) null);
                a.putExtra("periodic_registration_intent_extra", true);
                SilentRegisterIntentOperation.m94594b(a, applicationContext3);
                return 0;
            case 6:
                getApplicationContext().sendBroadcast(new Intent(cfeo.f183719a.mo6606a().mo80931R()).addFlags(32).setClassName(cfeo.m138886q(), cfeo.f183719a.mo6606a().mo80933T()));
                return 0;
            case 7:
                m94657a(getApplicationContext());
                return 0;
            case 8:
                m94662b(getApplicationContext());
                return 0;
            case 9:
                Context applicationContext4 = getApplicationContext();
                Intent intent3 = new Intent(applicationContext4, SilentRegisterIntentOperation.class);
                intent3.setAction("com.google.android.gms.matchstick.force_register_refresh_request_action");
                azoj.m85930a("ScheduledTaskService", "Triggering RegisterRefresh to notify Tachyon BE of cap changes: %s", Boolean.valueOf(SilentRegisterIntentOperation.m94594b(intent3, applicationContext4)));
                return 0;
            case 10:
                Context applicationContext5 = getApplicationContext();
                Intent intent4 = new Intent(applicationContext5, SilentRegisterIntentOperation.class);
                intent4.setAction("com.google.android.gms.matchstick.check_registration_with_lighter_action");
                azoj.m85930a("ScheduledTaskService", "Triggering checkRegistrationWithLighter: %s", Boolean.valueOf(SilentRegisterIntentOperation.m94594b(intent4, applicationContext5)));
                return 0;
            default:
                return 2;
        }
    }
}
