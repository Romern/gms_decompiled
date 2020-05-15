package com.google.android.gms.mdi.download.service;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MddGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    private static boolean f80022a = false;

    /* renamed from: a */
    private static void m67181a(aeat aeat, SharedPreferences sharedPreferences, String str, long j, int i) {
        boolean z;
        if (j > 0) {
            if (sharedPreferences.getLong(str, 0) != j) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j);
                edit.apply();
                z = true;
            } else {
                z = false;
            }
            if (!ceni.f183073a.mo6606a().mo79438o() || z || !f80022a) {
                aebl aebl = new aebl();
                aebl.f63099k = str;
                double d = (double) j;
                Double.isNaN(d);
                aebl.mo34008a(j, (long) (d * 0.1d), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                aebl.mo34023a(i);
                aebl.mo34024a(1, 1);
                aebl.mo34026a(true);
                aebl.mo34029b(z);
                aebl.f63102n = true;
                aebl.f63097i = "com.google.android.gms.mdi.download.service.MddGcmTaskService";
                aeat.mo33984a(aebl.mo33974b());
                return;
            }
            return;
        }
        aeat.mo33986a(str, "com.google.android.gms.mdi.download.service.MddGcmTaskService");
    }

    /* renamed from: b */
    public static void m67182b() {
        rpr b = rpr.m34216b();
        aeat a = aeat.m51532a(b);
        SharedPreferences sharedPreferences = b.getSharedPreferences("gms_icing_mdd_gcm_task_periods", 0);
        m67181a(a, sharedPreferences, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", cens.f183115a.mo6606a().mo79464c(), 2);
        if (ceni.m137522f()) {
            m67181a(a, sharedPreferences, "MDD.CHARGING.PERIODIC.TASK", cens.f183115a.mo6606a().mo79463b(), 2);
            m67181a(a, sharedPreferences, "MDD.CELLULAR.CHARGING.PERIODIC.TASK", cens.f183115a.mo6606a().mo79462a(), 0);
            m67181a(a, sharedPreferences, "MDD.WIFI.CHARGING.PERIODIC.TASK", cens.f183115a.mo6606a().mo79465d(), 1);
        } else if (ceni.m137520d()) {
            a.mo33986a("MDD.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
            a.mo33986a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
            a.mo33986a("MDD.WIFI.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
        f80022a = true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        String str = aecc.f63128a;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2105562759:
                if (str.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1202768674:
                if (str.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -69128772:
                if (str.equals("MDD.CHARGING.PERIODIC.TASK")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 437964371:
                if (str.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            rpr b = rpr.m34216b();
            rjx b2 = afkf.m53199b(b);
            ArrayList arrayList = new ArrayList();
            String str2 = aecc.f63128a;
            switch (str2.hashCode()) {
                case -2105562759:
                    if (str2.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1202768674:
                    if (str2.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -69128772:
                    if (str2.equals("MDD.CHARGING.PERIODIC.TASK")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 437964371:
                    if (str2.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        if (c2 == 3 && ceni.m137522f()) {
                            arrayList.add(b2.mo24761o());
                            arrayList.add(b2.mo24705a(true));
                        }
                    } else if (ceni.m137522f()) {
                        arrayList.add(b2.mo24761o());
                        arrayList.add(b2.mo24705a(false));
                    }
                } else if (ceni.m137522f()) {
                    afol.m53356a(b, new afoq(b, new bbfi(b), afor.m53373a(b)));
                    arrayList.add(b2.mo24762p());
                }
            } else if (ceni.m137522f()) {
                arrayList.add(b2.mo24763q());
            } else if (ceni.m137520d()) {
                arrayList.add(b2.mo24764r());
            }
            try {
                aucu.m76782a(aucu.m76779a((Collection) arrayList));
            } catch (InterruptedException | ExecutionException e) {
                bbev.m87907a(e, "Exception while waiting for mdd tasks to complete");
                new afoq(b, new bbfi(b), afor.m53373a(b)).mo34988b(1044);
            }
        } else {
            bbev.m87906a("%s: MddGcmTaskChimeraService gets unexpected gcm task %s -- Ignored", "MddGcmTaskChimeraService", str);
        }
        return 0;
    }
}
