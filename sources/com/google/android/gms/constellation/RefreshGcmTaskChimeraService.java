package com.google.android.gms.constellation;

import android.content.Context;
import android.os.Bundle;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RefreshGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    public static final sek f30484a = tea.m36798a("refresh_gcm_service");

    /* renamed from: b */
    public tds f30485b;

    /* renamed from: a */
    public static void m22786a(Context context) {
        if (szg.m36645d()) {
            long k = cdfn.f180658a.mo6606a().mo77409k();
            double d = (double) k;
            Double.isNaN(d);
            long j = (long) (d * 0.05d);
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
            aebi.f63099k = "CELL_NETWORK";
            aebi.mo34004a(k - j, j + k);
            aebi.mo34027b(1);
            aeat.m51532a(context).mo33984a(aebi.mo33974b());
            f30484a.mo25409a("Network signals listener scheduled with delay %ds.", Long.valueOf(k));
            return;
        }
        f30484a.mo25409a("Cellular network signals disabled.", new Object[0]);
    }

    /* renamed from: b */
    public static void m22788b(Context context) {
        szm.m36651a();
        if (!szm.m36650a(context).isEmpty()) {
            long v = cdfn.f180658a.mo6606a().mo77420v();
            double d = (double) v;
            Double.isNaN(d);
            long j = (long) (d * 0.05d);
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
            aebi.f63099k = "SERVICE_STATE";
            aebi.mo34004a(v - j, j + v);
            aebi.mo34027b(1);
            aeat.m51532a(context).mo33984a(aebi.mo33974b());
            f30484a.mo25409a("Service state signals listener scheduled with delay %ds.", Long.valueOf(v));
            return;
        }
        f30484a.mo25409a("Service state signals disabled for all subIds.", new Object[0]);
    }

    public final void onCreate() {
        f30484a.mo25409a("onCreate", new Object[0]);
        super.onCreate();
    }

    /* renamed from: a */
    public static void m22787a(Context context, long j, boolean z) {
        long currentTimeMillis = (j - System.currentTimeMillis()) / 1000;
        long f = (cdfw.m133051f() / 1000) + currentTimeMillis;
        f30484a.mo25409a("schedule refresh sync task. The service will be kicked off after %d seconds till %d seconds", Long.valueOf(currentTimeMillis), Long.valueOf(f));
        Bundle bundle = new Bundle();
        bundle.putBoolean("isRetrySync", z);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
        aebi.f63099k = "com.google.android.gms.constellation.checker.RefreshGcmTaskService.tag";
        aebi.mo34004a(currentTimeMillis, f);
        aebi.mo34023a(0);
        aebi.mo34027b(1);
        aebi.f63102n = true;
        aebi.f63107s = bundle;
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        int i;
        boolean z = true;
        f30484a.mo25409a("On run task %s", aecc.f63128a);
        String str = aecc.f63128a;
        int hashCode = str.hashCode();
        int i2 = 2;
        if (hashCode != -1986036153) {
            if (hashCode != -1222098358) {
                if (hashCode == -729969615 && str.equals("CELL_NETWORK")) {
                    c = 1;
                    if (c != 0) {
                        Bundle bundle = aecc.f63129b;
                        if (bundle == null || !bundle.getBoolean("isRetrySync", false)) {
                            z = false;
                        }
                        f30484a.mo25414c("Running refresh sync", new Object[0]);
                        this.f30485b = tds.m36774a(this);
                        UUID randomUUID = UUID.randomUUID();
                        tds tds = this.f30485b;
                        if (!z) {
                            i = 7;
                        } else {
                            i = 12;
                        }
                        tds.mo26401a(randomUUID, i);
                        sns sns = new sns(10);
                        sxt.m36563a();
                        Context applicationContext = getApplicationContext();
                        if (z) {
                            i2 = 10;
                        }
                        sxt.m36568b(applicationContext, randomUUID, i2, new syb(this, new snr(sns), randomUUID, z));
                    } else if (c == 1) {
                        szg.m36644a().mo26267b();
                        m22786a(getApplicationContext());
                    } else if (c == 2) {
                        szm.m36651a().mo26276b();
                        m22788b(getApplicationContext());
                    }
                    return 0;
                }
            } else if (str.equals("com.google.android.gms.constellation.checker.RefreshGcmTaskService.tag")) {
                c = 0;
                if (c != 0) {
                }
                return 0;
            }
        } else if (str.equals("SERVICE_STATE")) {
            c = 2;
            if (c != 0) {
            }
            return 0;
        }
        c = 65535;
        if (c != 0) {
        }
        return 0;
    }
}
