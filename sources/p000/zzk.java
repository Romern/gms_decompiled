package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: zzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zzk extends aeah {

    /* renamed from: a */
    private static final Object f56301a = new Object();

    /* renamed from: a */
    private final void m46753a(int i) {
        zzi.f56267a.mo31621a(getApplicationContext()).mo31587a(9, i, "com.google.android.gms.fonts.update");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo19211b();

    /* renamed from: a */
    public static void m46754a(zzi zzi, Context context) {
        try {
            aebl aebl = new aebl();
            if (zzi.f56280n <= 0) {
                zzi.mo31629d();
            }
            aebl.f63070a = zzi.f56280n;
            aebl.f63071b = TimeUnit.HOURS.toSeconds(6);
            aebl.f63102n = true;
            aebl.f63097i = "com.google.android.gms.fonts.update.UpdateSchedulerService";
            aebl.mo34024a(1, 1);
            aebl.mo34023a(1);
            aebl.mo34027b(1);
            aebl.f63099k = "FontsUpdateCheck";
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
            zyh.m46683c("FontsUpdateScheduler", "Update scheduled", new Object[0]);
        } catch (Exception e) {
            zyh.m46681a("FontsUpdateScheduler", e, "Unable to schedule update check", new Object[0]);
            zzi.mo31621a(context).mo31587a(9, 23503, "com.google.android.gms.fonts.update");
        }
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        zxw zxw;
        String str;
        int i = 2;
        if (zzj.m46748a()) {
            zyh.m46680a("FontsUpdateScheduler", "Update Runner is already running", new Object[0]);
            return 2;
        } else if (!ceal.m135826d()) {
            zyh.m46680a("FontsUpdateScheduler", "Update Runner fired but directory updates are not enabled", new Object[0]);
            return 2;
        } else {
            mo19211b();
            synchronized (f56301a) {
                try {
                    int c = (int) ceal.m135825c();
                    zxe zxe = zzi.f56267a.mo31628d(getApplicationContext()).f56231a;
                    boolean z = true;
                    if (c <= zxe.f56082b) {
                        zyh.m46680a("FontsUpdateScheduler", "New version from GServices %d is less than or equal to current version %d", Integer.valueOf(c), Integer.valueOf(zxe.f56082b));
                    } else {
                        String b = ceal.m135824b();
                        if (!bmxx.m108577a(b)) {
                            if (b.length() == 64) {
                                zyh.m46682b("FontsUpdateScheduler", "Starting Update process", new Object[0]);
                                zzi zzi = zzi.f56267a;
                                synchronized (zzi.f56268b) {
                                    zxw = zzi.f56275i;
                                }
                                if (zxw != null) {
                                    Context applicationContext = getApplicationContext();
                                    zxf a = zzd.m46727a();
                                    if (zzi.f56267a.mo31627c(applicationContext).mo31574b(a.f56088c)) {
                                        zxv c2 = zzi.mo31627c(applicationContext);
                                        zyv d = zzi.mo31628d(applicationContext);
                                        synchronized (zzj.f56287a) {
                                            if (zzj.f56288b == null) {
                                                zzj.f56288b = new zzj(c2, zxw, a, d, applicationContext);
                                            } else {
                                                z = false;
                                            }
                                            zzj.f56288b.mo31631b();
                                        }
                                        if (!z) {
                                            str = "failed";
                                        } else {
                                            str = "succeeded";
                                        }
                                        zyh.m46682b("FontsUpdateScheduler", str.length() == 0 ? new String("Update scheduler ") : "Update scheduler ".concat(str), new Object[0]);
                                        if (z) {
                                            i = 0;
                                        }
                                    } else {
                                        zyh.m46680a("FontsUpdateScheduler", "Not enough disk space to process update.", new Object[0]);
                                    }
                                } else {
                                    zyh.m46680a("FontsUpdateScheduler", "No downloader, SharedState not initialized. Bailing out.", new Object[0]);
                                    m46753a(23502);
                                }
                                try {
                                    return i;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        zyh.m46680a("FontsUpdateScheduler", "gServices value for directory hash is invalid: %s", b);
                    }
                    zyh.m46682b("FontsUpdateScheduler", "Did not start update", new Object[0]);
                    return 0;
                } catch (Exception e) {
                    zyh.m46681a("FontsUpdateScheduler", e, "Update process failed due to an exception", new Object[0]);
                    m46753a(23501);
                    return 2;
                }
            }
        }
    }
}
