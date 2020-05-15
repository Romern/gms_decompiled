package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeriodicRebuildIndexChimeraService extends abwj {

    /* renamed from: a */
    private static final Charset f79066a = Charset.forName("UTF-8");

    /* renamed from: a */
    private static long m66672a(long j, long j2) {
        long j3 = j % j2;
        return j3 < 0 ? j3 + Math.abs(j2) : j3;
    }

    /* renamed from: a */
    public static void m66673a(aeat aeat) {
        int i;
        if (!((Boolean) abzt.f58867aH.mo58455c()).booleanValue()) {
            absg.m48184a("UPDATE_INDEX Periodic Scheduling Disabled.");
            return;
        }
        aebl aebl = new aebl();
        aebl.f63099k = "PeriodicIndexRebuild";
        aebl.f63102n = true;
        aebl.mo34026a(((Boolean) abzt.f58984d.mo58455c()).booleanValue());
        aebl.mo34023a(((Integer) abzt.f58937bY.mo58455c()).intValue());
        boolean booleanValue = ((Boolean) abzt.f58936bX.mo58455c()).booleanValue();
        if (cdny.m134338c() || ((Boolean) abzt.f58936bX.mo58455c()).booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        aebl.mo34024a(booleanValue ? 1 : 0, i);
        aebl.f63097i = "com.google.android.gms.icing.indexapi.PeriodicRebuildIndexService";
        aebl.mo34027b(1);
        long longValue = ((Long) abzt.f58932bT.mo58455c()).longValue();
        long longValue2 = ((Long) abzt.f58933bU.mo58455c()).longValue();
        if (!cdny.m134346k()) {
            aebl.f63070a = longValue;
            aebl.f63071b = longValue2;
        } else {
            aebl.mo34009a(aebh.m51568a(longValue));
        }
        aeat.mo33984a(aebl.mo33974b());
        absg.m48184a("Task scheduled.");
    }

    /* renamed from: a */
    public final int mo32383a(aecc aecc, abvs abvs) {
        String str;
        String string;
        abvs abvs2 = abvs;
        if (!((Boolean) abzt.f58868aI.mo58455c()).booleanValue()) {
            absg.m48184a("UPDATE_INDEX Periodic Task Disabled.");
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Context context = abvs2.f58561a;
        acrl acrl = abvs2.f58562b;
        abym abym = abvs2.f58563c;
        long j = acrl.f60620b.getLong("last-periodic-rebuild", 0);
        Set<String> a = abvs.m48361a(context);
        String string2 = acrl.f60620b.getString("instance-id", null);
        if (string2 == null) {
            synchronized (acrl.f60625g) {
                string = acrl.f60620b.getString("instance-id", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    acrl.f60620b.edit().putString("instance-id", string).commit();
                }
            }
            str = string;
        } else {
            str = string2;
        }
        absg.m48185a("Considering %d packages for index rebuild.", Integer.valueOf(a.size()));
        for (String str2 : a) {
            if (m66672a(m66672a(abwi.m48393a(abwi.m48393a(-3750763034362895579L, str2.getBytes(f79066a)), str.getBytes(f79066a)), ((Long) abzt.f58934bV.mo58455c()).longValue()) - m66672a(j, ((Long) abzt.f58934bV.mo58455c()).longValue()), ((Long) abzt.f58934bV.mo58455c()).longValue()) + j >= currentTimeMillis) {
                absg.m48185a("Skipping package %s because it is not scheduled in the current window.", str2);
            } else {
                long p = currentTimeMillis - acrl.mo33045p(str2);
                if (p < ((Long) abzt.f58935bW.mo58455c()).longValue()) {
                    absg.m48186a("Skipping package %s because we just indexed it %d minutes ago.", str2, Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(p)));
                    abym.mo32449a(str2, bpzu.PERIODIC, bpzs.THROTTLED);
                } else {
                    String str3 = str2;
                    if (!abvs.mo32366a(str2, currentTimeMillis, bpzu.PERIODIC, false)) {
                        absg.m48185a("Failed to send index request to package %s.", str3);
                    } else {
                        absg.m48185a("Sent index request to package %s.", str3);
                    }
                }
            }
        }
        acrl.f60620b.edit().putLong("last-periodic-rebuild", currentTimeMillis).commit();
        return 0;
    }
}
