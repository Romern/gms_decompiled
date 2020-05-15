package p000;

import android.content.Context;
import android.content.SyncResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: vcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vcg {

    /* renamed from: a */
    public static final sbw f49015a = new sbw("SyncScheduler", "");

    /* renamed from: b */
    public final Context f49016b;

    /* renamed from: c */
    public final ExecutorService f49017c;

    /* renamed from: d */
    public final vfp f49018d;

    /* renamed from: e */
    public final ufe f49019e;

    /* renamed from: f */
    public volatile vcf f49020f;

    /* renamed from: g */
    private final Map f49021g = new HashMap();

    /* renamed from: h */
    private final sqv f49022h;

    /* renamed from: i */
    private final vff f49023i;

    /* renamed from: j */
    private final ExecutorService f49024j = snp.m35704b(10);

    /* renamed from: k */
    private final veg f49025k;

    public vcg(Context context, veg veg, sqv sqv, vff vff, vfp vfp, ufe ufe) {
        this.f49016b = context;
        this.f49025k = veg;
        this.f49022h = sqv;
        this.f49023i = vff;
        this.f49017c = sne.m35694a(((Integer) twy.f46830aN.mo58455c()).intValue(), 10);
        sdo.m34959a(vfp);
        this.f49018d = vfp;
        sdo.m34959a(ufe);
        this.f49019e = ufe;
    }

    /* renamed from: a */
    private final vpi m39957a(String str, String str2, bdyx bdyx, bdyx bdyx2) {
        sdo.m34959a((Object) str);
        String valueOf = String.valueOf(str);
        return new vpi(this.f49022h, this.f49023i, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), bdyx, bdyx2);
    }

    /* renamed from: b */
    private final synchronized void m39958b(String str, SyncResult syncResult) {
        vce d;
        List list;
        if (m39959c(str) == 2 && (list = (d = m39960d(str)).f49014f) != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f49024j.submit(new vcc((vcd) list.get(i), syncResult));
            }
            d.f49014f = null;
        }
    }

    /* renamed from: c */
    private final synchronized int m39959c(String str) {
        sdo.m34959a((Object) str);
        return m39960d(str).f49013e;
    }

    /* renamed from: d */
    private final synchronized vce m39960d(String str) {
        vce vce = (vce) this.f49021g.get(str);
        if (vce != null) {
            return vce;
        }
        vce vce2 = new vce(m39957a(str, "SyncScheduler.rateLimiter.", twy.f46833aQ, twy.f46834aR), m39957a(str, "SyncScheduler.firstPartyRateLimiter.", twy.f46828aL, twy.f46829aM), m39957a(str, "SyncScheduler.onConnectRateLimiter.", twy.f46831aO, twy.f46832aP));
        this.f49021g.put(str, vce2);
        return vce2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r0 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = new p000.vcb(r11, "drive", r12, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
        if (p000.cdqd.m134662b() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        p000.skh.m35531a().mo25691a(r11.f49016b, "SyncScheduler", new android.content.Intent().setClassName(r11.f49016b, "com.google.android.gms.drive.metadata.sync.syncadapter.MetadataSyncService"), r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        ((p000.soc) r11.f49017c).submit(new p000.vbz(r11, r0, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        mo28220a(r12, 2, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00df, code lost:
        mo28220a(r12, 2, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e2, code lost:
        throw r14;
     */
    /* renamed from: a */
    public final int mo28218a(String str, int i, int i2, List list) {
        vpo vpo;
        synchronized (this) {
            if (voo.m40937a(this.f49016b, str) == null) {
                f49015a.mo25374b("SyncScheduler", "%s account does not exist.", "Ignoring sync request: ");
                return 4;
            } else if (!this.f49025k.mo28343a()) {
                f49015a.mo25374b("SyncScheduler", "%s device offline.", "Ignoring sync request: ");
                return 3;
            } else {
                vce d = m39960d(str);
                if (d.f49013e != 2) {
                    f49015a.mo25369a("%s already syncing.", "Ignoring sync request: ");
                    return 1;
                }
                if (i != 103) {
                    vpo = d.f49011c;
                } else {
                    vpo = d.f49010b;
                }
                boolean d2 = vpo.mo28703d();
                boolean d3 = d.f49009a.mo28703d();
                if (i == 102) {
                    if (!d2) {
                    }
                    f49015a.mo25371b("Rate limit exceeded but proceeding anyway with non-rate-limited sync");
                } else if (!d2) {
                    f49015a.mo25369a("%s rate limited (normal limit)", "Ignoring sync request: ");
                    return 2;
                } else if (i == 101) {
                    if (!d3) {
                        f49015a.mo25369a("%s rate limited (on connection limit)", "Ignoring sync request: ");
                        return 2;
                    }
                }
                mo28220a(str, 0, null);
            }
        }
        return 0;
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
    /* renamed from: b */
    public final synchronized void mo28224b(String str) {
        vce d = m39960d(str);
        sdo.m34971a(d.f49012d > 0, (Object) "Sync not started?");
        d.f49012d--;
    }

    /* renamed from: a */
    public final synchronized void mo28219a(String str) {
        m39960d(str).f49012d++;
    }

    /* renamed from: a */
    public final synchronized void mo28220a(String str, int i, SyncResult syncResult) {
        sdo.m34959a((Object) str);
        sdo.m34959a(Integer.valueOf(i));
        m39960d(str).f49013e = i;
        m39958b(str, syncResult);
    }

    /* renamed from: a */
    public final void mo28221a(String str, SyncResult syncResult) {
        if (this.f49020f != null) {
            var a = ((vav) this.f49020f).mo28181a(str);
            boolean z = false;
            if (syncResult != null && !syncResult.hasError()) {
                z = true;
            }
            a.mo28175a(z);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28222a(String str, vcd vcd) {
        vce d = m39960d(str);
        if (d.f49014f == null) {
            d.f49014f = new ArrayList();
        }
        d.f49014f.add(vcd);
        m39958b(str, new SyncResult());
    }

    /* renamed from: a */
    public final synchronized boolean mo28223a(String str, int i, int i2, SyncResult syncResult) {
        boolean z;
        Integer valueOf = Integer.valueOf(i);
        sdo.m34959a(valueOf);
        Integer valueOf2 = Integer.valueOf(i2);
        sdo.m34959a(valueOf2);
        int c = m39959c(str);
        if (c == i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f49015a.mo25375b("Current sync status %s != %s, not setting to %s", Integer.valueOf(c), valueOf, valueOf2);
        } else {
            mo28220a(str, i2, syncResult);
        }
        return z;
    }
}
