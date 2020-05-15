package com.google.android.gms.ipa.base;

import android.content.Context;
import android.os.Build;
import android.provider.MediaStore;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.BatchIndexingIntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.CorporaMaintenanceIntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IpaGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    private static final aeab f79254a = new aeab(MediaStore.Files.getContentUri("external"), 1);

    /* renamed from: b */
    private static final aeab f79255b = new aeab(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, 1);

    /* renamed from: c */
    private static final aeab f79256c = new aeab(adta.f62681c, 1);

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    private static aebm m66798a(boolean z) {
        long seconds = TimeUnit.DAYS.toSeconds(ceqm.m137885p());
        long seconds2 = TimeUnit.HOURS.toSeconds(ceqm.m137884o());
        aebl aebl = new aebl();
        aebl.f63099k = "MediaStoreCorporaMaintenance";
        aebl.mo34026a(ceqm.m137887r());
        aebl.mo34023a(2);
        aebl.mo34024a(1, 1);
        aebl.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        aebl.mo34029b(z);
        if (!cdny.m134348m()) {
            aebl.f63070a = seconds;
            aebl.f63071b = seconds2;
        } else {
            aebl.mo34009a(aebh.m51568a(seconds));
        }
        return aebl.mo33974b();
    }

    /* renamed from: b */
    private static aead m66800b() {
        aeac aeac = new aeac();
        aeac.f63099k = "MediaStoreInstantIndexTask";
        aeac.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        aeac.mo34027b(1);
        aeac.mo34024a(0, 0);
        aeac.mo33972a(f79254a);
        if (ceqm.m137874e()) {
            aeac.mo33972a(f79255b);
        }
        return aeac.mo33974b();
    }

    /* renamed from: c */
    private static aead m66801c() {
        aeac aeac = new aeac();
        aeac.f63099k = "SmsCorpusInstantIndexingTask";
        aeac.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        aeac.mo34027b(1);
        aeac.mo34024a(0, 0);
        aeac.mo33972a(f79256c);
        return aeac.mo33974b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00d4  */
    /* renamed from: a */
    public static void m66799a(Context context) {
        aeat a = aeat.m51532a(context);
        if (adqn.m51003a(context)) {
            if (ceqm.f183265a.mo6606a().mo79607T()) {
                String string = new adqr(context.getSharedPreferences("MediastoreIndexerSharedPrefs", 0)).f62516a.getString("maintenance_task_config", "");
                String a2 = adqn.m51001a(ceqm.m137885p(), ceqm.m137884o(), Boolean.valueOf(ceqm.m137887r()));
                if (string == null || string.equals(a2)) {
                    a.mo33984a(m66798a(false));
                    long seconds = TimeUnit.HOURS.toSeconds(ceqm.f183265a.mo6606a().mo79589B());
                    long seconds2 = TimeUnit.MINUTES.toSeconds(ceqm.f183265a.mo6606a().mo79588A());
                    aebl aebl = new aebl();
                    aebl.f63099k = "MediaStoreBatchIndexingTask";
                    aebl.mo34026a(ceqm.f183265a.mo6606a().mo79603P());
                    aebl.mo34023a(2);
                    aebl.mo34024a(1, 1);
                    aebl.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
                    aebl.mo34027b(1);
                    if (cdny.m134348m()) {
                        aebl.f63070a = seconds;
                        aebl.f63071b = seconds2;
                    } else {
                        aebl.mo34009a(aebh.m51568a(seconds));
                    }
                    a.mo33984a(aebl.mo33974b());
                }
            }
            a.mo33984a(m66798a(true));
            adqr adqr = new adqr(context.getSharedPreferences("MediastoreIndexerSharedPrefs", 0));
            adqr.f62516a.edit().putString("maintenance_task_config", adqn.m51001a(ceqm.m137885p(), ceqm.m137884o(), Boolean.valueOf(ceqm.m137887r()))).commit();
            long seconds3 = TimeUnit.HOURS.toSeconds(ceqm.f183265a.mo6606a().mo79589B());
            long seconds22 = TimeUnit.MINUTES.toSeconds(ceqm.f183265a.mo6606a().mo79588A());
            aebl aebl2 = new aebl();
            aebl2.f63099k = "MediaStoreBatchIndexingTask";
            aebl2.mo34026a(ceqm.f183265a.mo6606a().mo79603P());
            aebl2.mo34023a(2);
            aebl2.mo34024a(1, 1);
            aebl2.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
            aebl2.mo34027b(1);
            if (cdny.m134348m()) {
            }
            a.mo33984a(aebl2.mo33974b());
        }
        if (adta.m51152a(context)) {
            long Y = ceqm.f183265a.mo6606a().mo79612Y();
            long X = ceqm.f183265a.mo6606a().mo79611X();
            aebl aebl3 = new aebl();
            aebl3.f63099k = "SmsCorpusUpdateIndexTask";
            aebl3.mo34026a(ceqm.f183265a.mo6606a().mo79606S());
            aebl3.mo34023a(2);
            aebl3.mo34024a(1, 1);
            aebl3.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
            aebl3.mo34027b(1);
            if (!cdny.m134348m()) {
                aebl3.f63070a = Y;
                aebl3.f63071b = X;
            } else {
                aebl3.mo34009a(aebh.m51568a(Y));
            }
            a.mo33984a(aebl3.mo33974b());
            long V = ceqm.f183265a.mo6606a().mo79609V();
            long U = ceqm.f183265a.mo6606a().mo79608U();
            aebl aebl4 = new aebl();
            aebl4.f63099k = "SmsCorpusBatchIndexingTask";
            aebl4.mo34026a(ceqm.f183265a.mo6606a().mo79605R());
            aebl4.mo34023a(2);
            aebl4.mo34024a(1, 1);
            aebl4.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
            aebl4.mo34027b(1);
            if (!cdny.m134348m()) {
                aebl4.f63070a = V;
                aebl4.f63071b = U;
            } else {
                aebl4.mo34009a(aebh.m51568a(V));
            }
            a.mo33984a(aebl4.mo33974b());
        }
        if (ceqm.m137876g()) {
            if (adqn.m51003a(context)) {
                a.mo33984a(m66800b());
            }
            int i = Build.VERSION.SDK_INT;
            if (adta.m51152a(context)) {
                a.mo33984a(m66801c());
            }
        }
        if (ceqm.m137873d()) {
            long seconds4 = TimeUnit.HOURS.toSeconds(ceqm.f183265a.mo6606a().mo79619d());
            long seconds5 = TimeUnit.MINUTES.toSeconds(ceqm.f183265a.mo6606a().mo79618c());
            aebl aebl5 = new aebl();
            aebl5.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
            aebl5.f63099k = "AppsCorpusMaintenance";
            aebl5.mo34026a(true);
            aebl5.mo34023a(2);
            aebl5.mo34024a(1, 1);
            aebl5.mo34029b(ceqm.f183265a.mo6606a().mo79602O());
            if (!cdny.m134348m()) {
                aebl5.f63070a = seconds4;
                aebl5.f63071b = seconds5;
            } else {
                aebl5.mo34009a(aebh.m51568a(seconds4));
            }
            a.mo33984a(aebl5.mo33974b());
            if (ceqm.m137872c()) {
                long seconds6 = TimeUnit.HOURS.toSeconds(ceqm.f183265a.mo6606a().mo79617b());
                long seconds7 = TimeUnit.MINUTES.toSeconds(ceqm.f183265a.mo6606a().mo79614a());
                aebl aebl6 = new aebl();
                aebl6.f63097i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
                aebl6.f63099k = "AppUsageReportGeneration";
                aebl6.mo34024a(0, cdny.m134339d() ? 1 : 0);
                aebl6.mo34023a(2);
                aebl6.mo34027b(1);
                if (!cdny.m134348m()) {
                    aebl6.f63070a = seconds6;
                    aebl6.f63071b = seconds7;
                } else {
                    aebl6.mo34009a(aebh.m51568a(seconds6));
                }
                a.mo33984a(aebl6.mo33974b());
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adta.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      adta.a(android.content.Context, boolean):void
      adta.a(boolean, boolean):void */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        boolean g;
        boolean a;
        String str = aecc.f63128a;
        switch (str.hashCode()) {
            case -1952457874:
                if (str.equals("SmsCorpusBatchIndexingTask")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1102736980:
                if (str.equals("AppUsageReportGeneration")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -636879915:
                if (str.equals("SmsCorpusInstantIndexingTask")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -245101092:
                if (str.equals("MediaStoreCorporaMaintenance")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 420331021:
                if (str.equals("SmsCorpusUpdateIndexTask")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1884131794:
                if (str.equals("MediaStoreBatchIndexingTask")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1994427955:
                if (str.equals("MediaStoreInstantIndexTask")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2117151161:
                if (str.equals("AppsCorpusMaintenance")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                startService(IntentOperation.getStartIntent(this, CorporaMaintenanceIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.REINDEX"));
                break;
            case 1:
                startService(IntentOperation.getStartIntent(this, BatchIndexingIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.BATCH_INDEX"));
                break;
            case 2:
                try {
                    adpm.m50941a(this);
                    aeat a2 = aeat.m51532a(this);
                    if (ceqm.m137876g() && ceqm.m137878i()) {
                        a2.mo33984a(m66800b());
                        break;
                    }
                } catch (Throwable th) {
                    aeat a3 = aeat.m51532a(this);
                    if (ceqm.m137876g() && ceqm.m137878i()) {
                        a3.mo33984a(m66800b());
                    }
                    throw th;
                }
            case 3:
                try {
                    adsu.m51143c(this);
                    if (g && a) {
                        break;
                    }
                } finally {
                    int i = Build.VERSION.SDK_INT;
                    if (ceqm.m137876g() && adta.m51152a(this)) {
                        aeat.m51532a(this).mo33984a(m66801c());
                    }
                }
            case 4:
                adta c2 = adta.m51154c(this);
                if (c2 != null) {
                    c2.mo33794a(false, true);
                    break;
                }
                break;
            case 5:
                adta c3 = adta.m51154c(this);
                if (c3 != null) {
                    c3.mo33794a(true, true);
                    break;
                }
                break;
            case 6:
                adnv.m50879a().mo33695a(new adnl(this));
                break;
            case 7:
                adnv.m50879a().mo33695a(new adnm(this));
                break;
            default:
                adnt.m50875c("Unrecognized task tag: %s", str);
                break;
        }
        return 0;
    }
}
