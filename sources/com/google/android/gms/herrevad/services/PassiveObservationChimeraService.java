package com.google.android.gms.herrevad.services;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.herrevad.NetworkQualityReport;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PassiveObservationChimeraService extends aeah {

    /* renamed from: a */
    public static final String f79059a = String.format("%s.%s", "com.google.android.gms", "herrevad.services.PassiveObservationService");

    /* renamed from: b */
    static final long f79060b = TimeUnit.MINUTES.toSeconds(30);

    /* renamed from: a */
    public static void m66660a(Context context) {
        long j;
        aeat a = aeat.m51532a(context);
        aebl aebl = new aebl();
        long d = cekn.f182848a.mo6606a().mo79231d();
        if (d >= f79060b || cekn.f182848a.mo6606a().mo79228a()) {
            j = d;
        } else {
            j = f79060b;
        }
        if (cdny.f181385a.mo6606a().mo78049t()) {
            double h = cdnj.m134212h();
            double d2 = (double) j;
            Double.isNaN(d2);
            aebl.mo34008a(j, (long) (h * d2), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        } else {
            aebl.f63070a = j;
        }
        if (!cekn.f182848a.mo6606a().mo79235h()) {
            aebl.mo34023a(0);
        } else {
            aebl.mo34028b(2, 2);
        }
        aebl.f63097i = f79059a;
        aebl.f63099k = "PASSIVE_OBSERVATION_TASK";
        aebl.mo34029b(true);
        aebm a2 = aebl.mo33974b();
        new Object[1][0] = Long.valueOf(j);
        int i = eoa.f15378a;
        a.mo33984a(a2);
    }

    /* renamed from: b */
    public static void m66661b(Context context) {
        int i = eoa.f15378a;
        aeat.m51532a(context).mo33986a("PASSIVE_OBSERVATION_TASK", f79059a);
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i = spn.f44932a;
        Context applicationContext = getApplicationContext();
        if (!"PASSIVE_OBSERVATION_TASK".equals(aecc.f63128a)) {
            return 2;
        }
        if (!abna.m47937b(applicationContext)) {
            int i2 = eoa.f15378a;
            m66661b(applicationContext);
        } else if (!cekn.f182848a.mo6606a().mo79230c() || abob.m47970a(applicationContext) == 0) {
            int i3 = eoa.f15378a;
            NetworkQualityReport networkQualityReport = new NetworkQualityReport();
            networkQualityReport.mo43386a("overriding_package", "com.google.android.gms.herrevad");
            networkQualityReport.f79053e = 1;
            networkQualityReport.mo43385a("report_realtime_ts_millis", SystemClock.elapsedRealtime());
            networkQualityReport.mo43385a("report_uptime_ts_millis", SystemClock.uptimeMillis());
            abne a = abne.m47947a("PASSIVE_LIGHTWEIGHT_NETWORK_QUALITY_DURATION");
            try {
                aucb a2 = ablz.m47892a(getApplicationContext()).mo32210a(networkQualityReport);
                a2.mo50373a(abmq.f57707a);
                a2.mo50372a(abmr.f57708a);
                a.close();
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            ((beon) abnd.m47941a().f97908j.mo6606a()).mo60861b("not-cellular");
            new Object[1][0] = "not-cellular";
            int i4 = eoa.f15378a;
        }
        return 0;
        throw th;
    }
}
