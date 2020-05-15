package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraGcmTaskService extends aeah {

    /* renamed from: a */
    public static final sek f109491a = avpq.m79017d("ChimeraGcmTaskService");

    /* renamed from: a */
    public static void m93713a(Context context) {
        f109491a.mo25414c("Scheduling task: DeviceIdle.", new Object[0]);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        aebi.f63099k = "DeviceIdle";
        aebi.mo34004a(0, TimeUnit.DAYS.toSeconds(365));
        aebi.f63102n = false;
        aebi.mo34023a(2);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(true);
        aebi.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: b */
    public static void m93714b(Context context) {
        aeat.m51532a(context).mo33986a("DeviceIdle", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }

    /* renamed from: c */
    public static void m93715c(Context context) {
        f109491a.mo25414c("Scheduling task: DeviceCharging.", new Object[0]);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        aebi.f63099k = "DeviceCharging";
        aebi.mo34004a(0, TimeUnit.DAYS.toSeconds(365));
        aebi.f63102n = false;
        aebi.mo34023a(2);
        aebi.mo34024a(1, 1);
        aebi.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: d */
    public static void m93716d(Context context) {
        aeat.m51532a(context).mo33986a("DeviceCharging", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }

    /* renamed from: e */
    public static void m93717e(Context context) {
        f109491a.mo25414c("Scheduling task: WifiConnected.", new Object[0]);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        aebi.f63099k = "WifiConnected";
        aebi.mo34004a(0, TimeUnit.DAYS.toSeconds(365));
        aebi.f63102n = false;
        aebi.mo34023a(1);
        aebi.mo34024a(0, 0);
        aebi.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: f */
    public static void m93718f(Context context) {
        aeat.m51532a(context).mo33986a("WifiConnected", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        f109491a.mo25414c("Task started with tag: %s.", aecc.f63128a);
        if ("WifiNeededRetry".equals(str)) {
            avli.m78712a(this, new Intent());
        } else if ("DeviceIdle".equals(str)) {
            avmq avmq = (avmq) avmq.f93413e.mo51589b();
            if (((Boolean) avmq.f93420g.mo51607b(avmq.f93410b)).booleanValue()) {
                m93713a(avmq.f93419f);
                if (!avls.m78734b()) {
                    ((avms) avms.f93422b.mo51589b()).mo51399a(5);
                }
            }
        } else if ("DeviceCharging".equals(str)) {
            avmi avmi = (avmi) avmi.f93389c.mo51589b();
            if (((Boolean) avmi.f93391e.mo51607b(avmi.f93388b)).booleanValue()) {
                m93715c(avmi.f93390d);
                ((avms) avms.f93422b.mo51589b()).mo51399a(4);
            }
        } else if ("WifiConnected".equals(str)) {
            avnb avnb = (avnb) avnb.f93488c.mo51589b();
            if (((Boolean) avnb.f93490e.mo51607b(avnb.f93487b)).booleanValue()) {
                m93717e(avnb.f93489d);
                ((avms) avms.f93422b.mo51589b()).mo51399a(3);
            }
        } else if ("LogStatus".equals(str)) {
            avmz avmz = (avmz) avmz.f93475a.mo51589b();
            avmz.mo51422c();
            avmz.mo51419a();
        } else if ("CheckConfigUpdate".equals(str)) {
            ((avmx) avmx.f93453h.mo51589b()).mo51416f();
        } else if ("LogHeartBeat".equals(str)) {
            avmz avmz2 = (avmz) avmz.f93475a.mo51589b();
            avpp avpp = avmz2.f93482b;
            avpp.mo51478a((bohn) avpp.mo51476a(9).mo74062i());
            if (avmz.m78855e()) {
                avmz2.mo51421b();
                avmz2.mo51420a(true);
            } else {
                avmz2.mo51420a(false);
            }
        }
        return 0;
    }
}
