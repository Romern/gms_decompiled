package p000;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: absh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absh {

    /* renamed from: a */
    public static final long f58101a = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: b */
    public static final long f58102b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: a */
    public static aebm m48213a(String str, long j, long j2, int i, boolean z) {
        int nextInt = new Random(System.nanoTime()).nextInt((int) Math.min(f58102b, j - j2));
        aebl aebl = new aebl();
        aebl.f63099k = str;
        aebl.f63070a = j;
        aebl.f63071b = j - (j2 + ((long) nextInt));
        aebl.f63102n = true;
        aebl.mo34026a(((Boolean) abzt.f58984d.mo58455c()).booleanValue());
        aebl.mo34023a(i);
        aebl.mo34024a(1, 1);
        aebl.f63097i = "com.google.android.gms.icing.service.IcingGcmTaskService";
        aebl.mo34029b(z);
        return aebl.mo33974b();
    }

    /* renamed from: a */
    public static void m48214a(aeat aeat, boolean z) {
        long j;
        absg.m48196c("MaintenanceDriver: Registering all GCM Tasks.");
        long longValue = ((Long) abzt.f58949bk.mo58455c()).longValue();
        long j2 = f58101a;
        if (cdny.m134346k()) {
            double h = 1.0d - cdnj.m134212h();
            double d = (double) longValue;
            Double.isNaN(d);
            j = (long) (h * d);
        } else {
            j = j2;
        }
        aeat.mo33984a(m48213a("Maintenance.BatchDownload.24h", longValue, j, 1, z));
    }
}
