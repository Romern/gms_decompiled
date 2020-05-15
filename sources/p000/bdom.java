package p000;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bdom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdom extends bdok implements bdhy, bdez, bdkj {

    /* renamed from: a */
    public static final bnrt f106140a = bnrt.m110178a("bdom");

    /* renamed from: b */
    public static final long f106141b = TimeUnit.HOURS.toMillis(12);

    /* renamed from: c */
    public final bdkg f106142c;

    /* renamed from: d */
    public final Application f106143d;

    /* renamed from: e */
    public final SharedPreferences f106144e;

    /* renamed from: f */
    public final boolean f106145f;

    /* renamed from: g */
    public final boolean f106146g;

    /* renamed from: h */
    public final int f106147h;

    /* renamed from: i */
    public final bngx f106148i;

    /* renamed from: j */
    private final cijl f106149j;

    /* renamed from: k */
    private final bdfd f106150k;

    /* renamed from: l */
    private final bdpz f106151l = bdpz.m91271a();

    public bdom(bdkh bdkh, Application application, cijl cijl, bmxv bmxv, SharedPreferences sharedPreferences) {
        boolean z;
        this.f106142c = bdkh.mo58105a(bqfb.INSTANCE, this.f106151l);
        this.f106143d = application;
        this.f106149j = cijl;
        if (!bmxv.mo66813a() || !((bdoj) bmxv.mo66814b()).mo58226a() || !((bdoj) bmxv.mo66814b()).mo58227b()) {
            z = false;
        } else {
            z = true;
        }
        this.f106146g = z;
        if (!bmxv.mo66813a() || !((bdoj) bmxv.mo66814b()).mo58228c().mo66813a()) {
            this.f106145f = false;
            this.f106147h = -1;
            this.f106148i = bngx.m109376e();
        } else {
            bdof bdof = (bdof) ((bdoj) bmxv.mo66814b()).mo58228c().mo66814b();
            this.f106145f = bdof.mo58232a();
            this.f106147h = bdof.mo58233b();
            this.f106148i = bdof.mo58234c();
        }
        this.f106144e = sharedPreferences;
        this.f106150k = bdfd.m90662a(application);
    }

    /* renamed from: a */
    public final void mo58063a() {
    }

    /* renamed from: b */
    public final void mo58031b() {
        this.f106150k.mo57956b(this);
    }

    /* renamed from: c */
    public final void mo58086c() {
        this.f106150k.mo57955a(this);
    }

    /* renamed from: d */
    public final bqgg mo58237d() {
        if (!this.f106146g) {
            return bqga.m112775a((Object) null);
        }
        return mo58239e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final bqgg mo58239e() {
        return bqga.m112776a(new bdol(this), (Executor) this.f106149j.mo6445a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo58240f() {
        bngx bngx;
        File file;
        PackageStats packageStats = PackageStatsCapture.getPackageStats(this.f106143d);
        if (packageStats == null) {
            bnrq bnrq = (bnrq) f106140a.mo68388c();
            bnrq.mo68432a("bdom", "f", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("PackageStats capture failed.");
            return;
        }
        bxvd da = cios.f191113s.mo74144da();
        bmxy.m108581a(packageStats);
        ciok ciok = (ciok) ciom.f191083k.mo74144da();
        long j = packageStats.cacheSize;
        if (ciok.f164950c) {
            ciok.mo74035c();
            ciok.f164950c = false;
        }
        ciom ciom = (ciom) ciok.f164949b;
        ciom.f191085a |= 1;
        ciom.f191086b = j;
        long j2 = packageStats.codeSize;
        if (ciok.f164950c) {
            ciok.mo74035c();
            ciok.f164950c = false;
        }
        ciom ciom2 = (ciom) ciok.f164949b;
        ciom2.f191085a |= 2;
        ciom2.f191087c = j2;
        long j3 = packageStats.dataSize;
        if (ciok.f164950c) {
            ciok.mo74035c();
            ciok.f164950c = false;
        }
        ciom ciom3 = (ciom) ciok.f164949b;
        ciom3.f191085a |= 4;
        ciom3.f191088d = j3;
        long j4 = packageStats.externalCacheSize;
        if (ciok.f164950c) {
            ciok.mo74035c();
            ciok.f164950c = false;
        }
        ciom ciom4 = (ciom) ciok.f164949b;
        ciom4.f191085a |= 8;
        ciom4.f191089e = j4;
        long j5 = packageStats.externalCodeSize;
        if (ciok.f164950c) {
            ciok.mo74035c();
            ciok.f164950c = false;
        }
        ciom ciom5 = (ciom) ciok.f164949b;
        ciom5.f191085a |= 16;
        ciom5.f191090f = j5;
        long j6 = packageStats.externalDataSize;
        if (ciok.f164950c) {
            ciok.mo74035c();
            ciok.f164950c = false;
        }
        ciom ciom6 = (ciom) ciok.f164949b;
        ciom6.f191085a |= 32;
        ciom6.f191091g = j6;
        long j7 = packageStats.externalMediaSize;
        if (ciok.f164950c) {
            ciok.mo74035c();
            ciok.f164950c = false;
        }
        ciom ciom7 = (ciom) ciok.f164949b;
        ciom7.f191085a |= 64;
        ciom7.f191092h = j7;
        long j8 = packageStats.externalObbSize;
        if (ciok.f164950c) {
            ciok.mo74035c();
            ciok.f164950c = false;
        }
        ciom ciom8 = (ciom) ciok.f164949b;
        ciom8.f191085a |= 128;
        ciom8.f191093i = j8;
        ciom ciom9 = (ciom) ciok.mo74062i();
        bxvd bxvd = (bxvd) ciom9.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) ciom9);
        ciok ciok2 = (ciok) bxvd;
        if (this.f106145f) {
            if (ciok2.f164950c) {
                ciok2.mo74035c();
                ciok2.f164950c = false;
            }
            ((ciom) ciok2.f164949b).f191094j = GeneratedMessageLite.m124030de();
            Application application = this.f106143d;
            int i = this.f106147h;
            bngx bngx2 = this.f106148i;
            beel.m91856c();
            ArrayList arrayList = new ArrayList();
            try {
                file = new File(application.getPackageManager().getApplicationInfo(application.getPackageName(), 0).dataDir);
            } catch (PackageManager.NameNotFoundException e) {
                try {
                    bnrq bnrq2 = (bnrq) bdiz.f105719a.mo68388c();
                    bnrq2.mo68432a("bdiz", "a", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq2.mo68405a("Failed to use package manager getting data directory from context instead.");
                    File filesDir = application.getFilesDir();
                    if (filesDir != null) {
                        file = filesDir.getParentFile();
                    } else {
                        file = null;
                    }
                } catch (Exception e2) {
                    bnrq bnrq3 = (bnrq) bdiz.f105719a.mo68388c();
                    bnrq3.mo68437a(e2);
                    bnrq3.mo68432a("bdiz", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq3.mo68405a("Failed to retrieve DirStats.");
                    bngx = bngx.m109376e();
                }
            }
            if (file == null) {
                bngx = bngx.m109376e();
            } else {
                bdiz.m90884a(file, arrayList, i, bngx2);
                bngx = bngx.m109368a((Collection) arrayList);
            }
            ciok2.mo86263a(bngx);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cios cios = (cios) da.f164949b;
        ciom ciom10 = (ciom) ciok2.mo74062i();
        ciom10.getClass();
        cios.f191123i = ciom10;
        cios.f191115a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f106142c.mo58102a((cios) da.mo74062i());
        this.f106144e.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit();
    }

    /* renamed from: b */
    public final void mo57952b(Activity activity) {
        this.f106150k.mo57956b(this);
        bdhp.m90826a(mo58239e());
    }
}
