package p000;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import javax.crypto.SecretKey;

/* renamed from: ufe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufe {

    /* renamed from: a */
    public static final sbw f47409a = new sbw("ContentMaintenance", "");

    /* renamed from: b */
    public final Context f47410b;

    /* renamed from: c */
    public final uhn f47411c;

    /* renamed from: d */
    public final vpa f47412d;

    /* renamed from: e */
    public final vcz f47413e;

    /* renamed from: f */
    public final Object f47414f = new Object();

    /* renamed from: g */
    public volatile Collection f47415g = new ArrayList();

    /* renamed from: h */
    long f47416h;

    /* renamed from: i */
    private final uff f47417i;

    /* renamed from: j */
    private final ExecutorService f47418j = snp.m35704b(10);

    /* renamed from: k */
    private vpn f47419k;

    public ufe(Context context, uhn uhn, vpa vpa, uff uff, vcz vcz, sqv sqv) {
        this.f47410b = context;
        sdo.m34959a(uhn);
        this.f47411c = uhn;
        sdo.m34959a(vpa);
        this.f47412d = vpa;
        sdo.m34959a(uff);
        this.f47417i = uff;
        sdo.m34959a(vcz);
        this.f47413e = vcz;
        sdo.m34959a(sqv);
    }

    /* renamed from: b */
    private final synchronized vpn m38264b() {
        if (this.f47419k == null) {
            long longValue = ((Long) twy.f46795F.mo58455c()).longValue();
            f47409a.mo25369a("ContentMaintenance interval %d", Long.valueOf(longValue));
            this.f47419k = new vpn(new ufd(this), longValue, this.f47418j, "ContentMaintenance");
        }
        return this.f47419k;
    }

    /* renamed from: a */
    public final void mo27275a() {
        m38264b().mo28726a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final void mo27276a(long j) {
        uig a;
        sdo.m34974b(j >= 0);
        long c = this.f47412d.mo28715c();
        long i = this.f47411c.mo27449i();
        f47409a.mo25368a("ContentMaintenance", "Internal cache bytes used: %d; limit: %d; download size: %d", Long.valueOf(i), Long.valueOf(c), Long.valueOf(j));
        long max = Math.max(0L, c - j);
        if (i > max) {
            this.f47411c.mo27435d();
            try {
                a = ((ugz) this.f47411c).mo27394a("InternalCachedContentView", uoh.f48391a);
                HashSet hashSet = new HashSet();
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ukp ukp = (ukp) it.next();
                    if (this.f47411c.mo27449i() <= max) {
                        break;
                    } else if (this.f47412d.mo28718f() == null) {
                        f47409a.mo25368a("ContentMaintenance", "Evicting from internal cache: %s at %s", ukp.f48033a, Long.valueOf(ukp.f48037e));
                        hashSet.add(ukp.f48033a);
                        ukp.mo27726u();
                    } else {
                        mo27278a(ukp);
                    }
                }
                this.f47411c.mo27411a(hashSet);
                this.f47411c.mo27442f();
                a.close();
                this.f47411c.mo27439e();
            } catch (Throwable th) {
                this.f47411c.mo27439e();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo27277a(Collection collection) {
        sdo.m34959a(collection);
        this.f47415g = collection;
        f47409a.mo25369a("Open hashes %s", collection);
    }

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
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082 A[Catch:{ all -> 0x010c, all -> 0x00f2, IOException | vov -> 0x0115 }] */
    /* renamed from: a */
    public final void mo27278a(ukp ukp) {
        uhn uhn;
        uff uff;
        String uuid;
        boolean z;
        uhj uhj;
        if (ukp.f48035c != null) {
            f47409a.mo25368a("ContentMaintenance", "Evicting from internal storage (will remain in shared storage): %s", ukp.f48033a);
        } else {
            f47409a.mo25368a("ContentMaintenance", "Moving from internal to shared storage: %s", ukp.f48033a);
        }
        this.f47411c.mo27435d();
        try {
            uff = this.f47417i;
            String str = ukp.f48033a;
            if (uff.f47424e.mo28718f() == null) {
                uff.f47420a.mo25375b("Shared storage is not available; not moving content with hash: %s", str);
            } else {
                uff.f47421b.mo27482h();
                ukp d = uff.f47422c.mo27434d(str);
                if (d == null) {
                    uff.f47420a.mo25375b("Cannot move to shared storage. No content with hash: %s", str);
                    uhj = uff.f47421b;
                } else if (d.f48034b == null) {
                    uhj = uff.f47421b;
                } else if (d.f48035c != null) {
                    d.mo27661a(null);
                    d.mo27725t();
                    uff.f47421b.mo27483i();
                    uhj = uff.f47421b;
                } else {
                    uff.f47421b.mo27484j();
                    if (d != null) {
                        if (vor.f49685a != null) {
                            SecretKey generateKey = vor.f49685a.generateKey();
                            vow vow = new vow(generateKey, "/CBC/PKCS5Padding", generateKey.getEncoded());
                            String str2 = d.f48034b;
                            uuid = UUID.randomUUID().toString();
                            uff.f47422c.mo27440e(uuid);
                            File a = uff.mo27280a(str2, 0);
                            File a2 = uff.mo27280a(uuid, 1);
                            a2.createNewFile();
                            srz.m36168a(new FileInputStream(a), vos.m40949a(vow, new FileOutputStream(a2)), true);
                            ukp d2 = uff.f47422c.mo27434d(str);
                            sdo.m34975b(uuid != null, "encryptionSpec must be set if and only if sharedFilename is set.");
                            if (d2.f48034b != null) {
                                z = true;
                            } else {
                                z = uuid != null;
                            }
                            sdo.m34971a(z, (Object) "internal and shared filenames cannot both be null");
                            d2.f48035c = uuid;
                            d2.f48036d = vow;
                            d2.mo27661a(null);
                            d2.mo27725t();
                            uff.f47422c.mo27443f(uuid);
                        } else {
                            throw new vov("KeyGenerator not initialized.");
                        }
                    }
                }
                uhj.mo27484j();
                d = null;
                if (d != null) {
                }
            }
            this.f47411c.mo27442f();
            uhn = this.f47411c;
        } catch (IOException | vov e) {
            try {
                f47409a.mo25378c("ContentMaintenance", String.format("Failed to move content to shared storage: %s", ukp.f48033a), e);
                uhn = this.f47411c;
            } catch (Throwable th) {
                this.f47411c.mo27439e();
                throw th;
            }
        } catch (Throwable th2) {
            uff.f47422c.mo27443f(uuid);
            throw th2;
        }
        uhn.mo27439e();
    }
}
