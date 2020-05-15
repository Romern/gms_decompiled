package com.google.android.gms.common.stats;

import android.util.Log;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StatsUploadChimeraService extends aeah {

    /* renamed from: a */
    private static final Map f30355a = new C1223np();

    static {
        m22719a(new ske());
        m22719a(new slv());
        m22719a(new skt());
        m22719a(new sku());
        m22719a(new skv());
    }

    /* renamed from: a */
    static void m22719a(sli sli) {
        f30355a.put(sli.mo25683a(), sli);
    }

    /* renamed from: b */
    public static void m22720b() {
        if (cdkf.m133814b()) {
            m22722c();
        }
    }

    /* renamed from: c */
    private static void m22722c() {
        for (sli sli : f30355a.values()) {
            long c = sli.mo25687c();
            if (c == 0 || !sli.mo25686b()) {
                m22721b(sli);
            } else {
                String a = sli.mo25683a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 50);
                sb.append("Scheduling ");
                sb.append(a);
                sb.append(" upload every ");
                sb.append(c);
                sb.append(" secs");
                Log.i("StatsUploadService", sb.toString());
                aebl aebl = new aebl();
                aebl.f63097i = "com.google.android.gms.common.stats.StatsUploadService";
                aebl.mo34028b(2, 2);
                aebl.mo34024a(1, 1);
                aebl.mo34026a(false);
                aebl.f63102n = true;
                aebl.f63099k = sli.mo25683a();
                if (cdny.m134345j()) {
                    double h = cdnj.m134212h();
                    double d = (double) c;
                    Double.isNaN(d);
                    aebl.mo34008a(c, (long) (h * d), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                } else {
                    aebl.f63070a = c;
                    aebl.f63071b = 600;
                }
                aeat.m51532a(rpr.m34216b()).mo33984a(aebl.mo33974b());
            }
        }
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        if (!cdkf.m133814b()) {
            m22722c();
        }
    }

    /* renamed from: b */
    static void m22721b(sli sli) {
        String a = sli.mo25683a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 19);
        sb.append("Turn off ");
        sb.append(a);
        sb.append(" uploading");
        Log.i("StatsUploadService", sb.toString());
        aeat.m51532a(rpr.m34216b()).mo33986a(sli.mo25683a(), "com.google.android.gms.common.stats.StatsUploadService");
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        sli sli = (sli) f30355a.get(str);
        if (sli == null) {
            String valueOf = String.valueOf(str);
            Log.w("StatsUploadService", valueOf.length() == 0 ? new String("Could not find StatsUploadTask: ") : "Could not find StatsUploadTask: ".concat(valueOf));
            return 2;
        } else if (!sli.mo25686b()) {
            m22721b(sli);
            return 0;
        } else {
            sli.mo25699a(getApplication());
            return 0;
        }
    }
}
