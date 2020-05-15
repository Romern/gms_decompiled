package p000;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ufd */
final /* synthetic */ class ufd implements Runnable {

    /* renamed from: a */
    private final ufe f47408a;

    public ufd(ufe ufe) {
        this.f47408a = ufe;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public final void run() {
        uig k;
        ufe ufe = this.f47408a;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (ufe.f47414f) {
            uhn uhn = ufe.f47411c;
            Collection collection = ufe.f47415g;
            String a = ukr.CONTENT_HASH.f48050k.mo27700a();
            String a2 = ugz.m38421a(collection, ",");
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 45 + String.valueOf(a).length() + String.valueOf(a2).length());
            sb.append(a);
            sb.append(" IN WipeoutFileContentHashView AND ");
            sb.append(a);
            sb.append(" NOT IN (");
            sb.append(a2);
            sb.append(")");
            ((ugx) uhn).f47578a.mo27465a(uks.f48051a, uoh.m39060a(sb.toString()));
        }
        ufe.mo27276a(0);
        if (ufe.f47412d.mo28718f() != null) {
            vpa vpa = ufe.f47412d;
            long longValue = ((Long) twy.f46790A.mo58455c()).longValue();
            double doubleValue = ((Double) twy.f46791B.mo58455c()).doubleValue();
            double b = (double) vpa.mo28714b();
            Double.isNaN(b);
            long min = Math.min(longValue, (long) (doubleValue * b));
            long j = ufe.f47411c.mo27451j();
            ufe.f47409a.mo25369a("Shared cache bytes used: %d; limit: %d", Long.valueOf(j), Long.valueOf(min));
            if (j > min) {
                ufe.f47411c.mo27435d();
                try {
                    k = ufe.f47411c.mo27452k();
                    HashSet hashSet = new HashSet();
                    Iterator it = k.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ukp ukp = (ukp) it.next();
                        if (ufe.f47411c.mo27451j() <= min) {
                            break;
                        }
                        if (ufe.f47412d.mo28718f() == null) {
                            ufe.f47409a.mo25372b("ContentMaintenance", "External storage removed while pruning shared cache; aborting");
                        }
                        ufe.f47409a.mo25369a("Evicting from shared cache: %s", ukp.f48033a);
                        hashSet.add(ukp.f48033a);
                        ukp.mo27726u();
                    }
                    ufe.f47411c.mo27411a(hashSet);
                    ufe.f47411c.mo27442f();
                    k.close();
                    ufe.f47411c.mo27439e();
                } catch (Throwable th) {
                    ufe.f47411c.mo27439e();
                    throw th;
                }
            }
        }
        if (ufe.f47412d.mo28718f() != null) {
            vpa vpa2 = ufe.f47412d;
            long longValue2 = ((Long) twy.f46792C.mo58455c()).longValue();
            double doubleValue2 = ((Double) twy.f46793D.mo58455c()).doubleValue();
            long b2 = vpa2.mo28714b();
            long max = Math.max(0L, vpa2.mo28713a() - ((Long) twy.f46794E.mo58455c()).longValue());
            double d = (double) b2;
            Double.isNaN(d);
            long min2 = Math.min(Math.min(longValue2, (long) (doubleValue2 * d)), max);
            if (ufe.f47411c.mo27447h() > min2) {
                uig a3 = ((ugz) ufe.f47411c).mo27394a("InternalContentView", uoh.f48391a);
                try {
                    Iterator it2 = a3.iterator();
                    while (it2.hasNext()) {
                        ukp ukp2 = (ukp) it2.next();
                        if (ufe.f47411c.mo27447h() <= min2) {
                            break;
                        }
                        ufe.mo27278a(ukp2);
                    }
                } finally {
                    a3.close();
                }
            }
        }
        sdo.m34971a(!ufe.f47411c.mo27382b(), (Object) "collectGarbage() must not be run while in a database transaction");
        try {
            File[] listFiles = ufe.f47412d.mo28717e().listFiles();
            for (File file : listFiles) {
                if (ufe.f47411c.mo27446g(file.getName())) {
                    file.delete();
                }
            }
        } catch (IOException e) {
            ufe.f47409a.mo25378c("ContentMaintenance", "Unable to open internal content directory; skipping internal content garbage collection.", e);
        }
        File f = ufe.f47412d.mo28718f();
        if (f != null) {
            File[] listFiles2 = f.listFiles();
            for (File file2 : listFiles2) {
                if (ufe.f47411c.mo27446g(file2.getName())) {
                    file2.delete();
                }
            }
        }
        vhr.m40449a(ufe.f47410b, ufe.f47411c);
        if (ufe.f47416h + ((Long) twy.f46797H.mo58455c()).longValue() <= System.currentTimeMillis()) {
            ufe.f47416h = System.currentTimeMillis();
            vcy c = ufe.f47413e.mo28312c();
            c.mo28309j();
            c.mo28300c(1, 24);
            c.mo28280a(ufe.f47412d.mo28715c(), ufe.f47411c.mo27449i());
            c.mo28274a();
        }
        ufe.f47409a.mo25369a("Content maintenance completed successfully in %d ms (uptime)", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
    }
}
