package p000;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

/* renamed from: abnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abnj {

    /* renamed from: a */
    private static final long f57734a = TimeUnit.DAYS.toSeconds(35);

    /* renamed from: a */
    public static synchronized long m47955a() {
        boolean z;
        synchronized (abnj.class) {
            long currentTimeMillis = System.currentTimeMillis();
            long c = abmm.m47919c("herrevadId64Bit");
            Long valueOf = Long.valueOf(abmm.m47919c("lastHerrevadIdGenerationTimeSecs"));
            long j = 0;
            if (c != 0) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) - valueOf.longValue();
                long a = cekk.f182845a.mo6606a().mo79226a();
                if (a < 0) {
                    a = f57734a;
                }
                if (seconds <= a) {
                    return c;
                }
            } else if (valueOf.longValue() != 0) {
                abnd.m47943a("HERREVAD_ID_ZERO_PREFERENCE_READ");
            }
            SecureRandom secureRandom = new SecureRandom();
            long j2 = 0;
            int i = 0;
            while (true) {
                if (i >= 10) {
                    z = false;
                    break;
                }
                j2 = secureRandom.nextLong();
                if (j2 != 0 && j2 != c) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                eoa.m10824a("Herrevad", "Generated an invalid Herrevad ID!", new Object[0]);
                abnd.m47943a("HERREVAD_ID_ZERO_GENERATED");
            } else {
                j = j2;
            }
            abmm.m47912a("herrevadId64Bit", j);
            abmm.m47912a("lastHerrevadIdGenerationTimeSecs", TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis));
            return j;
        }
    }
}
