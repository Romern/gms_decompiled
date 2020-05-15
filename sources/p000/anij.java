package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: anij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anij {

    /* renamed from: a */
    protected static final long f76943a = TimeUnit.MINUTES.toSeconds(30);

    /* renamed from: b */
    protected static final long f76944b = TimeUnit.DAYS.toSeconds(7);

    /* renamed from: c */
    private static final srn f76945c = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: a */
    private static final Bundle m64474a(int i) {
        return m64475a(i, (String) null);
    }

    /* renamed from: b */
    protected static void m64481b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("SchedulerPrefs", 0);
        long j = sharedPreferences.getLong("scheduledPeriodSec", -1);
        long i = cgem.m144894i();
        if (j != i) {
            long k = cgec.f186635a.mo6606a().mo83530k();
            long j2 = f76943a;
            if (i < j2) {
                i = j2;
            } else {
                long j3 = f76944b;
                if (i > j3) {
                    i = j3;
                }
            }
            bnsl bnsl = (bnsl) f76945c.mo68390d();
            bnsl.mo68432a("anij", "b", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68417a("Scheduling a periodic sync task every %d seconds, with flex of %d seconds", i, k);
            aebl aebl = new aebl();
            aebl.f63070a = i;
            aebl.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            aebl.mo34027b(1);
            aebl.f63102n = true;
            aebl.f63071b = k;
            aebl.mo34028b(0, 0);
            aebl.mo34024a(0, 0);
            aebl.mo34026a(false);
            aebl.f63099k = "PhenotypePeriodicSync";
            aebl.f63107s = m64474a(2);
            if (cgem.m144891f()) {
                aebl.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
            }
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("scheduledPeriodSec", i);
            edit.apply();
        }
    }

    /* renamed from: c */
    protected static void m64483c(Context context) {
        long a = cgem.f186663a.mo6606a().mo83544a();
        long j = f76943a;
        if (a < j) {
            a = j;
        }
        bnsl bnsl = (bnsl) f76945c.mo68390d();
        bnsl.mo68432a("anij", "c", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68417a("Scheduling adaptive one off task with window [%d, %d] in seconds", a, f76944b);
        aebi aebi = new aebi();
        aebi.mo34004a(a, f76944b);
        aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        aebi.f63099k = "PhenotypeAdaptiveSync";
        aebi.f63107s = m64474a(3);
        aebi.f63102n = true;
        aebi.mo34027b(1);
        aebi.mo34028b(0, 0);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(false);
        if (cgem.m144891f()) {
            aebi.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
        }
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: d */
    public static void m64484d(Context context) {
        long i = cgem.m144894i();
        aebi aebi = new aebi();
        aebi.mo34004a(i / 2, i);
        aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        aebi.f63102n = true;
        aebi.mo34027b(0);
        aebi.f63099k = "PhenotypePeriodicSync";
        aebi.f63107s = m64474a(2);
        aebi.mo34028b(0, 0);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(false);
        if (cgem.m144891f()) {
            aebi.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
        }
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: e */
    public static void m64485e(Context context) {
        long q = cgec.f186635a.mo6606a().mo83536q();
        m64479a(context, q, q + q, "PhenotypeSyncAfterRetry", 12, null);
    }

    /* renamed from: a */
    private static final Bundle m64475a(int i, String str) {
        Bundle bundle = new Bundle(1);
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("fetchReason", i2);
            if (str != null) {
                bundle.putString("fetchPackage", str);
            }
            return bundle;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m64476a(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SchedulerPrefs", 0).edit();
        edit.clear();
        edit.apply();
        int nextInt = new Random().nextInt(14340) + 60;
        bnsl bnsl = (bnsl) f76945c.mo68390d();
        bnsl.mo68432a("anij", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cancel all previously scheduled polling");
        aeat.m51532a(context).mo33985a("com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator");
        bnsl bnsl2 = (bnsl) f76945c.mo68390d();
        bnsl2.mo68432a("anij", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68412a("Scheduling Phenotype for first execution %d seconds from now (%d)", nextInt, System.currentTimeMillis());
        aebi aebi = new aebi();
        aebi.mo34004a((long) (nextInt - 5), (long) (nextInt + 5));
        aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        aebi.f63102n = true;
        aebi.f63099k = "PhenotypePeriodicSync";
        aebi.mo34028b(0, 0);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(false);
        aebi.f63107s = m64474a(2);
        if (cgem.m144891f()) {
            aebi.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
        }
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: b */
    public static void m64482b(Context context, int i) {
        long j = (long) i;
        if (j < cgec.m144833h()) {
            i = (int) cgec.m144833h();
        } else if (j > cgec.m144832g()) {
            i = (int) cgec.m144832g();
        }
        bnsl bnsl = (bnsl) f76945c.mo68390d();
        bnsl.mo68432a("anij", "b", 263, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Handling Retry-After: scheduling Phenotype for one-off execution %d from now", i);
        aebi aebi = new aebi();
        aebi.mo34004a((long) i, (long) (i + 60));
        aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        aebi.mo34027b(1);
        aebi.f63102n = true;
        aebi.f63099k = "PhenotypeRetryAfter";
        aebi.f63107s = m64474a(11);
        aebi.mo34028b(0, 0);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(false);
        if (cgem.m144891f()) {
            aebi.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
        }
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    protected static void m64477a(Context context, int i) {
        bnsl bnsl = (bnsl) f76945c.mo68390d();
        bnsl.mo68432a("anij", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cancel all previously scheduled polling");
        aeat.m51532a(context).mo33985a("com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator");
        bnsl bnsl2 = (bnsl) f76945c.mo68390d();
        bnsl2.mo68432a("anij", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68412a("Scheduling Phenotype for first execution %d seconds from now (%d)", i, System.currentTimeMillis());
        aebi aebi = new aebi();
        aebi.mo34004a((long) (i - 5), (long) (i + 5));
        aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        aebi.f63102n = true;
        aebi.f63099k = "PhenotypePeriodicSync";
        aebi.mo34028b(0, 0);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(false);
        aebi.f63107s = m64474a(2);
        if (cgem.m144891f()) {
            aebi.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
        }
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m64478a(Context context, int i, String str) {
        m64479a(context, 1, 2, "PhenotypeSyncImmediately", i, str);
    }

    /* renamed from: a */
    private static void m64479a(Context context, long j, long j2, String str, int i, String str2) {
        bnsl bnsl = (bnsl) f76945c.mo68390d();
        bnsl.mo68432a("anij", "a", 325, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        int i2 = i - 1;
        if (i != 0) {
            bnsl.mo68427a("Scheduling Phenotype for a %s(%d, %s) one off with window [%d, %d] in seconds", str, Integer.valueOf(i2), str2, Long.valueOf(j), Long.valueOf(j2));
            aebi aebi = new aebi();
            aebi.mo34004a(j, j2);
            aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            aebi.f63099k = str;
            aebi.f63102n = true;
            aebi.mo34027b(1);
            aebi.mo34028b(0, 0);
            aebi.mo34024a(0, 0);
            aebi.mo34026a(false);
            aebi.f63107s = m64475a(i, str2);
            if (cgem.m144891f()) {
                aebi.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
            }
            aeat.m51532a(context).mo33984a(aebi.mo33974b());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m64480a(Context context, String str, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("SchedulerPrefs", 0);
        long j = sharedPreferences.getLong("scheduledPeriodSec", -1);
        long i2 = cgem.m144894i();
        if (j != i2) {
            long k = cgec.f186635a.mo6606a().mo83530k();
            long j2 = f76943a;
            if (i2 < j2) {
                i2 = j2;
            } else {
                long j3 = f76944b;
                if (i2 > j3) {
                    i2 = j3;
                }
            }
            bnsl bnsl = (bnsl) f76945c.mo68390d();
            bnsl.mo68432a("anij", "b", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68417a("Scheduling a periodic sync task every %d seconds, with flex of %d seconds", i2, k);
            aebl aebl = new aebl();
            aebl.f63070a = i2;
            aebl.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            aebl.mo34027b(1);
            aebl.f63102n = true;
            aebl.f63071b = k;
            aebl.mo34028b(0, 0);
            aebl.mo34024a(0, 0);
            aebl.mo34026a(false);
            aebl.f63099k = "PhenotypePeriodicSync";
            aebl.f63107s = m64474a(2);
            if (cgem.m144891f()) {
                aebl.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
            }
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("scheduledPeriodSec", i2);
            edit.apply();
        }
        if ("PhenotypeAdaptiveSync".equals(str) || i == 0) {
            long a = cgem.f186663a.mo6606a().mo83544a();
            long j4 = f76943a;
            if (a < j4) {
                a = j4;
            }
            bnsl bnsl2 = (bnsl) f76945c.mo68390d();
            bnsl2.mo68432a("anij", "c", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68417a("Scheduling adaptive one off task with window [%d, %d] in seconds", a, f76944b);
            aebi aebi = new aebi();
            aebi.mo34004a(a, f76944b);
            aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            aebi.f63099k = "PhenotypeAdaptiveSync";
            aebi.f63107s = m64474a(3);
            aebi.f63102n = true;
            aebi.mo34027b(1);
            aebi.mo34028b(0, 0);
            aebi.mo34024a(0, 0);
            aebi.mo34026a(false);
            if (cgem.m144891f()) {
                aebi.mo34025a(bnic.m109489a(aeca.m51619a(aniu.m64525e().f76981a)));
            }
            aeat.m51532a(context).mo33984a(aebi.mo33974b());
        }
    }
}
