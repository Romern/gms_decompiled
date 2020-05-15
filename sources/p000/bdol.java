package p000;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: bdol */
final /* synthetic */ class bdol implements Runnable {

    /* renamed from: a */
    private final bdom f106139a;

    public bdol(bdom bdom) {
        this.f106139a = bdom;
    }

    public final void run() {
        bngx bngx;
        File file;
        bdom bdom = this.f106139a;
        beel.m91856c();
        if (!bdqb.m91276a(bdom.f106144e, "primes.packageMetric.lastSendTime", bdom.f106141b)) {
            PackageStats packageStats = PackageStatsCapture.getPackageStats(bdom.f106143d);
            if (packageStats == null) {
                bnrq bnrq = (bnrq) bdom.f106140a.mo68388c();
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
            bxvd.mo73625a((bxvk) ciom9);
            ciok ciok2 = (ciok) bxvd;
            if (bdom.f106145f) {
                if (ciok2.f164950c) {
                    ciok2.mo74035c();
                    ciok2.f164950c = false;
                }
                ((ciom) ciok2.f164949b).f191094j = bxvk.m124030de();
                Application application = bdom.f106143d;
                int i = bdom.f106147h;
                bngx bngx2 = bdom.f106148i;
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
            bdom.f106142c.mo58102a((cios) da.mo74062i());
            if (bdom.f106144e.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
            }
        }
    }
}
