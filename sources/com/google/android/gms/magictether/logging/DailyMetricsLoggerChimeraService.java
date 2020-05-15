package com.google.android.gms.magictether.logging;

import java.util.Calendar;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DailyMetricsLoggerChimeraService extends aeah {

    /* renamed from: a */
    private static final sek f79829a = new sek(new String[]{"DailyMetricsLogger"}, (int[]) null);

    /* renamed from: b */
    public static boolean m67145b() {
        return cfcm.m138682b() && cfcj.m138656c() && cfcj.m138657d();
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        if (!m67145b()) {
            f79829a.mo25418e("Failed to log daily metrics.", new Object[0]);
            aeat.m51532a(this).mo33986a("DailyMetricsLogger", "com.google.android.gms.magictether.logging.DailyMetricsLoggerService");
            return 2;
        }
        afba a = afaz.m52798a();
        if (cfcm.m138682b()) {
            long j = new aezv(rpr.m34216b()).mo34689a().getLong("KEY_LAST_ACTIVE_TIMESTAMP", -1);
            if (j > 0) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(System.currentTimeMillis());
                instance.add(6, -28);
                if (j >= instance.getTimeInMillis()) {
                    a.f64113b.mo24383c("magictether_active_hosts_28DA").mo24359a();
                }
                instance.add(6, 14);
                if (j >= instance.getTimeInMillis()) {
                    a.f64113b.mo24383c("magictether_active_hosts_14DA").mo24359a();
                }
                instance.add(6, 7);
                if (j >= instance.getTimeInMillis()) {
                    a.f64113b.mo24383c("magictether_active_hosts_7DA").mo24359a();
                }
                instance.add(6, 6);
                if (j >= instance.getTimeInMillis()) {
                    a.f64113b.mo24383c("magictether_active_hosts_1DA").mo24359a();
                }
            }
            a.mo34723a("host_status", new aezv(rpr.m34216b()).mo34688a("KEY_HOST_STATUS"));
            a.f64113b.mo24388e();
        }
        return 0;
    }
}
