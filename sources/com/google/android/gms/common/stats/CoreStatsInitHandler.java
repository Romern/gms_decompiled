package com.google.android.gms.common.stats;

import android.content.Intent;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CoreStatsInitHandler extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = i & 4;
        int i3 = i & 8;
        if ((i & 2) != 0 || i2 != 0 || i3 != 0) {
            if (!(i2 == 0 && i3 == 0)) {
                GmsCoreStatsChimeraService.m22711a(this);
            }
            Intent component = new Intent().setComponent(skr.f44644a);
            component.setAction("com.google.android.gms.common.stats.START");
            startService(component);
            aeat a = aeat.m51532a(this);
            int i4 = Build.VERSION.SDK_INT;
            if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                long longValue = ((Long) skj.f44623f.mo58455c()).longValue();
                if (longValue <= 0) {
                    a.mo33986a("NetworkReportServicePartialReportsForToday", "com.google.android.gms.common.stats.net.NetworkReportService");
                } else {
                    aebl aebl = new aebl();
                    aebl.f63097i = "com.google.android.gms.common.stats.net.NetworkReportService";
                    aebl.mo34028b(2, 2);
                    aebl.mo34024a(0, 0);
                    aebl.mo34026a(false);
                    aebl.f63099k = "NetworkReportServicePartialReportsForToday";
                    aebl.f63102n = true;
                    aebl.mo34027b(1);
                    if (cdny.m134345j()) {
                        double h = cdnj.m134212h();
                        double d = (double) longValue;
                        Double.isNaN(d);
                        aebl.mo34008a(longValue, (long) (h * d), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                    } else {
                        aebl.f63070a = longValue;
                    }
                    a.mo33984a(aebl.mo33974b());
                    if (cdkf.f181108a.mo6606a().mo77792c()) {
                        aebl aebl2 = new aebl();
                        aebl2.f63097i = "com.google.android.gms.common.stats.net.NetworkReportService";
                        aebl2.mo34028b(2, 2);
                        aebl2.mo34024a(1, 1);
                        aebl2.mo34026a(false);
                        aebl2.f63099k = "NetworkReportServiceYesterdaysReport";
                        aebl2.f63102n = true;
                        aebl2.mo34027b(1);
                        if (!cdny.m134345j()) {
                            aebl2.f63070a = 86400;
                        } else {
                            aebl2.mo34009a(aebh.EVERY_DAY);
                        }
                        a.mo33984a(aebl2.mo33974b());
                    }
                }
                a.mo33986a("NetworkReportService", "com.google.android.gms.common.stats.net.NetworkReportService");
            } else {
                long longValue2 = ((Long) skj.f44619b.mo58455c()).longValue();
                if (longValue2 <= 0) {
                    a.mo33986a("NetworkReportService", "com.google.android.gms.common.stats.net.NetworkReportService");
                } else {
                    aebl aebl3 = new aebl();
                    aebl3.f63097i = "com.google.android.gms.common.stats.net.NetworkReportService";
                    aebl3.mo34028b(2, 2);
                    aebl3.mo34024a(0, 0);
                    aebl3.mo34026a(false);
                    aebl3.f63099k = "NetworkReportService";
                    aebl3.f63102n = true;
                    aebl3.mo34027b(1);
                    if (cdny.m134345j()) {
                        double h2 = cdnj.m134212h();
                        double d2 = (double) longValue2;
                        Double.isNaN(d2);
                        aebl3.mo34008a(longValue2, (long) (h2 * d2), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                    } else {
                        aebl3.f63071b = ((Long) skj.f44620c.mo58455c()).longValue();
                        aebl3.f63070a = longValue2;
                    }
                    a.mo33984a(aebl3.mo33974b());
                }
            }
            StatsUploadChimeraService.m22720b();
        }
    }
}
