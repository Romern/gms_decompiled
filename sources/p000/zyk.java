package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyk {

    /* renamed from: a */
    public static final Status f56183a = new Status(13);

    /* renamed from: b */
    public final Object f56184b;

    /* renamed from: c */
    public final FontMatchSpec f56185c;

    /* renamed from: d */
    public final zyu f56186d;

    /* renamed from: e */
    public final String f56187e;

    /* renamed from: f */
    public int f56188f;

    /* renamed from: g */
    public final long f56189g;

    /* renamed from: h */
    private final zyn f56190h;

    /* renamed from: i */
    private final String f56191i;

    /* renamed from: j */
    private final zxf f56192j;

    /* renamed from: k */
    private List f56193k;

    /* renamed from: l */
    private Status f56194l;

    /* renamed from: m */
    private bmza f56195m;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public zyk(zyn zyn, FontMatchSpec fontMatchSpec, zyu zyu, bqgy bqgy, String str) {
        this.f56184b = new Object();
        this.f56188f = 0;
        this.f56189g = 0;
        sdo.m34966a(zyn, "server");
        this.f56190h = zyn;
        sdo.m34966a(fontMatchSpec, "spec");
        this.f56185c = fontMatchSpec;
        sdo.m34966a(zyu, "resolvedFont");
        this.f56186d = zyu;
        zxf zxf = zyu.f56229c.f56097a;
        this.f56192j = zxp.m46641a(zxf == null ? zxf.f56084e : zxf);
        sdo.m34966a((Object) str, (Object) "requestingPackage");
        this.f56187e = str;
        this.f56191i = zyb.m46671a(zyu.f56229c);
        ArrayList arrayList = new ArrayList(1);
        this.f56193k = arrayList;
        sdo.m34966a(bqgy, "pendingResult");
        arrayList.add(bqgy);
        this.f56194l = new Status(23509);
        this.f56195m = bmza.m108659b(bmvy.f131119a);
    }

    /* renamed from: a */
    static FontMatchSpec m46689a(zxi zxi, zxh zxh) {
        String str = zxi.f56105b;
        zxg zxg = zxh.f56099c;
        if (zxg == null) {
            zxg = zxg.f56090c;
        }
        float f = zxg.f56092a;
        zxj zxj = zxh.f56098b;
        if (zxj == null) {
            zxj = zxj.f56108c;
        }
        int i = zxj.f56110a;
        zxg zxg2 = zxh.f56100d;
        if (zxg2 == null) {
            zxg2 = zxg.f56090c;
        }
        return new FontMatchSpec(str, f, i, zxg2.f56092a, false);
    }

    /* renamed from: b */
    public final long mo31596b() {
        long a;
        synchronized (this.f56184b) {
            a = this.f56195m.mo66928a(TimeUnit.MILLISECONDS);
        }
        return a;
    }

    /* renamed from: c */
    public final Status mo31597c() {
        Status status;
        synchronized (this.f56184b) {
            status = this.f56194l;
        }
        return status;
    }

    /* renamed from: a */
    private final void m46690a(zxw zxw, FontFetchResult fontFetchResult) {
        mo31594a(fontFetchResult);
        zxw.mo31578a(this.f56191i, this.f56192j.f56087b);
    }

    public zyk(zyn zyn, FontMatchSpec fontMatchSpec, zyu zyu, bqgy bqgy, String str, long j) {
        this(zyn, fontMatchSpec, zyu, bqgy, str);
        boolean z;
        this.f56189g = j;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34972a(z, "invalid timeout value %d", Long.valueOf(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r0 = r10.mo31576a(r8.f56191i, r8.f56192j);
        p000.zyh.m46683c("FontFetch", "Check status of %s: is %s, previous %s", r8.f56191i, r0, r8.f56194l);
        r1 = r0.f30115i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r1 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r1 == 23509) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        p000.zyh.m46680a("FontFetch", "%s %s; declaring failure", r8.f56191i, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r0.mo17710c() == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r0 = p000.zyk.f56183a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        m46690a(r10, com.google.android.gms.fonts.FontFetchResult.m23827a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        r1 = r10.mo31577a(r8.f56192j.f56087b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2 = r8.f56186d;
        r9 = r9.mo31568a(r1, r2.f56228b, r2.f56229c);
        r1 = r8.f56186d;
        r9 = com.google.android.gms.fonts.FontFetchResult.m23828a(m46689a(r1.f56228b, r1.f56229c), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r9 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        r9 = com.google.android.gms.fonts.FontFetchResult.m23827a(p000.zyk.f56183a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        p000.zyh.m46681a("FontFetch", r9, "Disk encountered an error taking font.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r0.mo17710c() != false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        r0 = p000.zyk.f56183a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r9 = com.google.android.gms.fonts.FontFetchResult.m23827a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        m46690a(r10, com.google.android.gms.fonts.FontFetchResult.m23827a(p000.zyk.f56183a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        throw r9;
     */
    /* renamed from: a */
    public final Status mo31592a(zxv zxv, zxw zxw) {
        Status a;
        FontFetchResult fontFetchResult;
        sdo.m34966a(zxv, "disk");
        sdo.m34966a(zxw, "downloader");
        synchronized (this.f56184b) {
            Status status = this.f56194l;
            if (status.f30115i != 23509) {
                zyh.m46683c("FontFetch", "Status check nop; finished at %s", status);
                Status status2 = this.f56194l;
                return status2;
            }
            List<bqgg> list = this.f56193k;
            if (list != null) {
                for (bqgg bqgg : list) {
                    if (!bqgg.isCancelled()) {
                    }
                }
            }
            zyh.m46683c("FontFetch", "Nobody is waiting for %s, fail checkStatus", this.f56191i);
            this.f56193k = null;
            Status status3 = Status.f30109c;
            return status3;
        }
        m46690a(zxw, fontFetchResult);
        return a;
    }

    /* renamed from: a */
    public final void mo31593a() {
        synchronized (this.f56184b) {
            this.f56188f++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r5.f56190h.mo31601a(r5);
        r1 = r5.f56184b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r5.f56193k;
        r5.f56193k = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r1 = r0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r3 >= r1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        ((p000.bqgy) r0.get(r3)).mo69138b(r6);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo31594a(FontFetchResult fontFetchResult) {
        synchronized (this.f56184b) {
            bmza bmza = this.f56195m;
            int i = 0;
            if (!bmza.f131251a) {
                zyh.m46683c("FontFetch", "End fetch nop; %s already ended with status %s", this.f56185c, this.f56194l);
                return;
            }
            bmza.mo66931e();
            this.f56194l = fontFetchResult.f32459b;
        }
    }

    /* renamed from: a */
    public final boolean mo31595a(bqgy bqgy) {
        sdo.m34966a(bqgy, "pendingResult");
        synchronized (this.f56184b) {
            List list = this.f56193k;
            if (list == null) {
                return false;
            }
            list.add(bqgy);
            return true;
        }
    }
}
