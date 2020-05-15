package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/* renamed from: qvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvi {

    /* renamed from: a */
    public static final sek f42228a = qqu.m32671b("AffiliationManager");

    /* renamed from: b */
    public static final imo f42229b = new qvh();

    /* renamed from: c */
    public final qte f42230c = ((qte) qte.f42092a.mo13145b());

    /* renamed from: d */
    public final qtk f42231d = ((qtk) qtk.f42100a.mo13145b());

    /* renamed from: e */
    public final quw f42232e;

    /* renamed from: f */
    public final Object f42233f;

    /* renamed from: g */
    private final Context f42234g;

    /* renamed from: h */
    private final qta f42235h = ((qta) qta.f42084i.mo13145b());

    /* renamed from: i */
    private final PackageManager f42236i;

    /* renamed from: j */
    private final Random f42237j;

    public qvi(Context context) {
        this.f42234g = context;
        this.f42232e = new quw(context);
        this.f42236i = context.getPackageManager();
        this.f42233f = new Object();
        this.f42237j = new SecureRandom();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f0 A[Catch:{ all -> 0x019b, all -> 0x0196, RuntimeException -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a0 A[Catch:{ all -> 0x019b, all -> 0x0196, RuntimeException -> 0x00de }, DONT_GENERATE] */
    /* renamed from: a */
    public final void mo24284a() {
        bmxv bmxv;
        SQLiteDatabase a;
        SQLiteDatabase a2;
        synchronized (this.f42233f) {
            synchronized (this.f42233f) {
                Long l = (Long) qqv.f41980q.mo58455c();
                if (!l.equals(this.f42235h.mo24253a(acyr.f61086a, qta.f42080e))) {
                    mo24285b();
                    this.f42235h.mo24254a(acyr.f61086a, qta.f42080e, l);
                }
            }
            if (System.currentTimeMillis() > ((Long) this.f42235h.mo24253a(acyr.f61086a, qta.f42079d)).longValue()) {
                try {
                    List<PackageInfo> installedPackages = this.f42236i.getInstalledPackages(0);
                    if (cdda.m132670b()) {
                        if (!soz.m35801d(this.f42234g, "com.google.android.gms").isEmpty()) {
                        }
                        bmxv = bmvz.f131120a;
                        if (bmxv.mo66813a()) {
                            f42228a.mo25414c("Fetching affiliations from the server.", new Object[0]);
                            byuc a3 = this.f42232e.mo24282a((List) bmxv.mo66814b());
                            a = this.f42230c.f42094b.mo24263a();
                            a.beginTransaction();
                            a.delete("affiliation_data", null, new String[0]);
                            a.delete("affiliation_index", null, new String[0]);
                            a.setTransactionSuccessful();
                            a.endTransaction();
                            this.f42230c.mo24261a(bngx.m109368a((Collection) a3.f167760a));
                            a2 = this.f42231d.f42102b.mo24263a();
                            a2.beginTransaction();
                            a2.delete("facet_group_data", null, new String[0]);
                            a2.delete("facet_group_index", null, new String[0]);
                            a2.setTransactionSuccessful();
                            a2.endTransaction();
                            this.f42231d.mo24264a(a3.f167761b);
                            qta qta = this.f42235h;
                            acyr acyr = acyr.f61086a;
                            qty qty = qta.f42079d;
                            long a4 = cdcr.f180503a.mo6606a().mo77269a();
                            long b = cdcr.f180503a.mo6606a().mo77270b();
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = a4 - b;
                            long j2 = a4 + b + 1;
                            double nextDouble = this.f42237j.nextDouble();
                            double d = (double) (j2 - j);
                            Double.isNaN(d);
                            qta.mo24254a(acyr, qty, Long.valueOf(currentTimeMillis + j + Math.round(nextDouble * d)));
                            return;
                        }
                        return;
                    }
                    bngs j3 = bngx.m109377j();
                    for (PackageInfo packageInfo : installedPackages) {
                        if (!cdda.m132670b() || "com.android.vending".equals(this.f42236i.getInstallerPackageName(packageInfo.packageName))) {
                            bmxv a5 = qqt.m32666a(this.f42234g, packageInfo.packageName);
                            if (!a5.mo66813a()) {
                                sek sek = f42228a;
                                String valueOf = String.valueOf(packageInfo.packageName);
                                sek.mo25414c(valueOf.length() == 0 ? new String("Failed to get password domain for package: ") : "Failed to get password domain for package: ".concat(valueOf), new Object[0]);
                            } else {
                                j3.mo67668c((String) a5.mo66814b());
                            }
                        }
                    }
                    if (!cdda.m132670b() || !j3.mo67664a().isEmpty()) {
                        bmxv = bmxv.m108566b(j3.mo67664a());
                        if (bmxv.mo66813a()) {
                        }
                    }
                    bmxv = bmvz.f131120a;
                } catch (RuntimeException e) {
                    f42228a.mo25418e("Installed-packages fetch failed because Binder transaction buffer is full", new Object[0]);
                    bmxv = bmvz.f131120a;
                } catch (Throwable th) {
                    a2.endTransaction();
                    throw th;
                }
                if (bmxv.mo66813a()) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo24285b() {
        this.f42235h.mo24254a(acyr.f61086a, qta.f42079d, 0L);
    }
}
