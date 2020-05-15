package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;

/* renamed from: aahe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahe {

    /* renamed from: a */
    public static boolean f28111a = false;

    /* renamed from: b */
    public static boolean f28112b = false;

    /* renamed from: c */
    public static boolean f28113c = false;

    /* renamed from: d */
    public static Long f28114d = 0L;

    /* renamed from: e */
    public static boolean f28115e = true;

    /* renamed from: f */
    public static Long f28116f = 0L;

    /* renamed from: g */
    public static Long f28117g = 0L;

    /* renamed from: h */
    public static boolean f28118h = true;

    /* renamed from: i */
    public static Long f28119i = 0L;

    /* renamed from: j */
    public static Long f28120j = 0L;

    /* renamed from: k */
    public static boolean f28121k = true;

    /* renamed from: l */
    public static boolean f28122l = true;

    /* renamed from: m */
    public static Long f28123m = 0L;

    /* renamed from: a */
    public static void m21252a(Context context) {
        f28114d = Long.valueOf(ceax.m135879c());
        f28115e = ceax.m135880d();
        f28116f = Long.valueOf(ceax.m135878b());
        Long l = f28114d;
        new Object[1][0] = l;
        m21253a(context, "com.google.android.gms.gass.chimera.SchedulePeriodicTasksService", "GASS_PERIODIC_TASKS_AD_ATTESTATION_SIGNAL", f28111a, l.longValue(), f28115e, f28116f.longValue(), null);
    }

    /* renamed from: b */
    public static void m21254b(Context context) {
        if (cebd.m135901e()) {
            f28117g = Long.valueOf(cebd.m135900d());
            f28118h = cebd.m135902f();
            f28119i = Long.valueOf(cebd.m135898b());
            Long l = f28117g;
            new Object[1][0] = l;
            m21253a(context, "com.google.android.gms.gass.chimera.SchedulePeriodicTasksService", "GPTGLS", f28112b, l.longValue(), f28118h, f28119i.longValue(), null);
        }
    }

    /* renamed from: c */
    public static void m21255c(Context context) {
        if (cebg.m135923b()) {
            f28120j = Long.valueOf(cebg.m135925d());
            f28121k = cebg.m135926e();
            f28122l = cebg.m135927f();
            f28123m = Long.valueOf(cebg.m135924c());
            new Object[1][0] = f28120j;
            aahn aahn = new aahn(context);
            HashSet<dcg> hashSet = new HashSet();
            hashSet.add(new aahr(aahn.f28141b, null).mo16874a());
            dcg[] values = dcg.values();
            for (dcg dcg : values) {
                if (aahn.f28140a.getBoolean(Integer.toString(dcg.f12804f), false)) {
                    hashSet.add(dcg);
                }
            }
            for (dcg dcg2 : hashSet) {
                Bundle bundle = new Bundle();
                bundle.putInt("PDTAKey", dcg2.f12804f);
                m21253a(context, "com.google.android.gms.gass.chimera.SchedulePeriodicTasksService", "GPDT", f28113c, f28120j.longValue(), f28121k, f28123m.longValue(), bundle);
            }
        }
    }

    /* renamed from: a */
    private static void m21253a(Context context, String str, String str2, boolean z, long j, boolean z2, long j2, Bundle bundle) {
        aeat a = aeat.m51532a(context);
        if (a == null) {
            Log.e("PeriodicTasksManager", "Failed to get a GmsTaskScheduler instance.");
            return;
        }
        if (z) {
            StringBuilder sb = new StringBuilder(str.length() + 32 + str2.length());
            sb.append("Cancel the existing ");
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append(" task first");
            sb.toString();
            a.mo33986a(str2, str);
        }
        aebl aebl = new aebl();
        aebl.f63097i = str;
        aebl.mo34023a(0);
        aebl.mo34024a(z2 ? 1 : 0, z2);
        aebl.f63070a = j;
        aebl.f63071b = j2;
        aebl.mo34027b(1);
        aebl.f63099k = str2;
        aebl.f63102n = false;
        aebn aebn = new aebn();
        aebn.f63074a = 0;
        aebn.f63075b = (int) cebg.f182212a.mo6606a().mo78728e();
        aebn.f63076c = (int) cebg.f182212a.mo6606a().mo78729f();
        aebl.f63106r = aebn.mo34011a();
        if (bundle != null) {
            aebl.f63107s = bundle;
        }
        a.mo33984a(aebl.mo33974b());
    }
}
