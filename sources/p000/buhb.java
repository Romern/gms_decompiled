package p000;

import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppBinary;
import android.hardware.location.NanoAppFilter;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.ArraySet;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: buhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhb extends buha implements bugn, buhi, buhn {

    /* renamed from: a */
    public static final bugn f153803a = new bugv();

    /* renamed from: b */
    public static final bugr f153804b = new bugw();

    /* renamed from: c */
    public static final Object f153805c = new Object();

    /* renamed from: d */
    public static volatile bugn f153806d;

    /* renamed from: e */
    public final ContextHubManager f153807e;

    /* renamed from: f */
    public final ContextHubInfo f153808f;

    /* renamed from: g */
    public final int f153809g;

    /* renamed from: h */
    public final Handler f153810h;

    /* renamed from: i */
    public final buhj f153811i;

    /* renamed from: j */
    public final buhm f153812j;

    /* renamed from: k */
    public final Object f153813k = new Object();

    /* renamed from: l */
    public final LongSparseArray f153814l = new LongSparseArray();

    /* renamed from: m */
    public final SparseArray f153815m = new SparseArray();

    /* renamed from: n */
    public final boolean f153816n;

    /* renamed from: o */
    public final bgbq f153817o;

    /* renamed from: p */
    private final C1223np f153818p = new C1223np();

    /* renamed from: q */
    private final bugm f153819q;

    /* renamed from: r */
    private long f153820r;

    /* renamed from: s */
    private final LongSparseArray f153821s = new LongSparseArray();

    /* renamed from: t */
    private int f153822t = 0;

    public buhb(ContextHubManager contextHubManager, bugm bugm, Handler handler, bgbq bgbq) {
        super(handler);
        int i;
        boolean enableContexthubApiWrapper = cezb.f183522a.mo6606a().enableContexthubApiWrapper();
        this.f153816n = enableContexthubApiWrapper;
        this.f153807e = contextHubManager;
        this.f153819q = bugm;
        this.f153810h = handler;
        if (enableContexthubApiWrapper) {
            int i2 = Build.VERSION.SDK_INT;
            buhm buhm = new buhm(this, contextHubManager, this, bgbq, handler);
            this.f153812j = buhm;
            List a = buhm.mo72677a();
            if (a == null || a.isEmpty()) {
                throw new IllegalStateException("No ContextHubs were found in the platform.");
            }
            this.f153808f = (ContextHubInfo) a.get(0);
            this.f153809g = 0;
            this.f153811i = null;
        } else {
            this.f153812j = null;
            int[] contextHubHandles = contextHubManager.getContextHubHandles();
            if (contextHubHandles != null) {
                i = contextHubHandles.length;
            } else {
                i = 0;
            }
            if (i != 0) {
                if (i > 1) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append(i);
                    sb.append(" ContextHubs found in the platform, picking the first one.");
                    sb.toString();
                }
                int i3 = contextHubHandles[0];
                this.f153809g = i3;
                ContextHubInfo contextHubInfo = contextHubManager.getContextHubInfo(i3);
                this.f153808f = contextHubInfo;
                if (contextHubInfo != null) {
                    this.f153811i = new buhj(contextHubInfo.getMaxPacketLengthBytes(), contextHubManager, this, "ChreTransfer");
                } else {
                    int i4 = this.f153809g;
                    StringBuilder sb2 = new StringBuilder(51);
                    sb2.append("Unable to query ContextHubInfo for UID: ");
                    sb2.append(i4);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new IllegalStateException("No ContextHubs were found in the platform.");
            }
        }
        this.f153817o = bgbq;
    }

    /* renamed from: a */
    private static void m119492a(StringBuilder sb, bugr bugr) {
        sb.append("    AppId=0x");
        sb.append(Long.toHexString(bugr.mo72639a()));
        sb.append(", UID=");
        sb.append(bugr.mo72644b());
        sb.append(", Version=");
        sb.append(bugr.mo72647c());
        sb.append("'\n");
    }

    /* renamed from: b */
    private static final bugr m119493b(bugr bugr) {
        if (f153804b.equals(bugr)) {
            return null;
        }
        return bugr;
    }

    /* renamed from: c */
    public final void mo72659c() {
        try {
            ContextHubTransaction.Response waitForResponse = this.f153807e.queryNanoApps(this.f153808f).waitForResponse(5, TimeUnit.SECONDS);
            if (waitForResponse == null || waitForResponse.getResult() == 0) {
            }
        } catch (InterruptedException e) {
        } catch (TimeoutException e2) {
        }
    }

    /* renamed from: a */
    public final int mo72626a() {
        return this.f153808f.getPlatformVersion();
    }

    /* renamed from: b */
    public final List mo72635b() {
        if (!this.f153816n) {
            ArrayList arrayList = new ArrayList();
            int[] findNanoAppOnHub = this.f153807e.findNanoAppOnHub(this.f153809g, new NanoAppFilter(-1, 0, -1, -1));
            if (findNanoAppOnHub != null) {
                for (int i : findNanoAppOnHub) {
                    arrayList.add(mo72656a(i));
                }
            }
            return arrayList;
        }
        List<bugr> a = this.f153812j.mo72678a(this.f153808f);
        for (bugr bugr : a) {
            mo72650a(mo72655a(bugr), (buhc) bugr);
        }
        return a;
    }

    /* renamed from: a */
    public final int mo72655a(bugr bugr) {
        int intValue;
        synchronized (this.f153821s) {
            if (this.f153821s.get(bugr.mo72639a()) == null) {
                LongSparseArray longSparseArray = this.f153821s;
                long a = bugr.mo72639a();
                int i = this.f153822t;
                this.f153822t = i + 1;
                longSparseArray.put(a, Integer.valueOf(i));
            }
            intValue = ((Integer) this.f153821s.get(bugr.mo72639a())).intValue();
        }
        return intValue;
    }

    /* renamed from: c */
    public final boolean mo72660c(int i) {
        boolean z;
        if (i == this.f153809g) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Locale locale = Locale.US;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(this.f153809g)};
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = r8.f153807e.getNanoAppInstanceInfo(r9);
        r7 = r8.f153813k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (p000.bugr) r8.f153815m.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (m119493b(r0) == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r2 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r0 = new p000.buhc(r2, r8.f153807e, r8, r8.f153817o, r8.f153810h);
        r1 = r0.f153824b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r1 > 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r2 = java.util.Locale.US;
        r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r9), java.lang.Long.valueOf(r0.f153823a), java.lang.Integer.valueOf(r1)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r8.f153814l.put(r0.f153823a, r0);
        r8.f153815m.put(r9, r0);
        mo72650a(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        r8.f153815m.put(r9, p000.buhb.f153804b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        return null;
     */
    /* renamed from: a */
    public final bugr mo72656a(int i) {
        synchronized (this.f153813k) {
            bugr bugr = (bugr) this.f153815m.get(i);
            if (bugr != null && m119493b(bugr) != null) {
                return bugr;
            }
        }
    }

    /* renamed from: b */
    public final void mo72658b(int i) {
        if (mo72660c(i)) {
            Locale locale = Locale.US;
            new Object[1][0] = Integer.valueOf(i);
            ArraySet arraySet = new ArraySet();
            synchronized (this.f153813k) {
                for (int i2 = 0; i2 < this.f153814l.size(); i2++) {
                    arraySet.add(Long.valueOf(this.f153814l.keyAt(i2)));
                }
                this.f153814l.clear();
                this.f153815m.clear();
            }
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f153816n) {
                mo72659c();
            }
            bugm bugm = this.f153819q;
            ArraySet arraySet2 = new ArraySet();
            for (bugr bugr : mo72635b()) {
                arraySet2.add(Long.valueOf(bugr.mo72639a()));
            }
            bgcz bgcz = (bgcz) bugm;
            bgcz.f116087c.execute(new bgcq(bgcz, arraySet, arraySet2));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f153820r;
            long j2 = 0;
            if (j != 0) {
                j2 = elapsedRealtime - j;
            }
            bgbq bgbq = this.f153817o;
            if (cezb.m138454c()) {
                bxvd da = bpkq.f138003c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpkq bpkq = (bpkq) da.f164949b;
                bpkq.f138005a |= 1;
                bpkq.f138006b = j2;
                bpkq bpkq2 = (bpkq) da.mo74062i();
                bxvd da2 = bpkl.f137979g.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpkl bpkl = (bpkl) da2.f164949b;
                bpkl.f137982b = 2;
                int i4 = 1 | bpkl.f137981a;
                bpkl.f137981a = i4;
                bpkq2.getClass();
                bpkl.f137984d = bpkq2;
                bpkl.f137981a = i4 | 4;
                bgbq.mo62622a(da2);
            }
            this.f153820r = elapsedRealtime;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buhb.a(long, boolean):bugr
     arg types: [long, int]
     candidates:
      buhb.a(java.lang.StringBuilder, bugr):void
      buhb.a(long, byte[]):bugu
      buhb.a(bugo, android.os.Handler):void
      buha.a(bugo, android.os.Handler):bugz
      buha.a(int, bugo):void
      bugn.a(long, byte[]):bugu
      bugn.a(bugo, android.os.Handler):void
      buhb.a(long, boolean):bugr */
    /* renamed from: a */
    public final bugr mo72627a(long j) {
        if (!this.f153816n) {
            return mo72657a(j, false);
        }
        for (bugr bugr : this.f153812j.mo72678a(this.f153808f)) {
            if (bugr.mo72639a() == j) {
                mo72650a(mo72655a(bugr), (buhc) bugr);
                synchronized (this.f153813k) {
                    this.f153814l.put(bugr.mo72639a(), bugr);
                }
                return bugr;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r12.f153807e.findNanoAppOnHub(r12.f153809g, new android.hardware.location.NanoAppFilter(r13, 0, -1, -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1 = 0;
     */
    /* renamed from: a */
    public final bugr mo72657a(long j, boolean z) {
        int[] iArr;
        int i;
        int length;
        synchronized (this.f153813k) {
            bugr bugr = (bugr) this.f153814l.get(j);
            if (bugr != null) {
                bugr b = m119493b(bugr);
                return b;
            }
        }
        int i2 = i2 + 1;
        if (!z || i2 >= 2 || !(iArr == null || iArr.length == 0)) {
            if (iArr == null || (length = iArr.length) == 0) {
                new Object[1][0] = Long.valueOf(j);
                i = -1;
            } else if (length > 1) {
                Object[] objArr = {Arrays.toString(iArr), Long.toHexString(j)};
                i = -1;
            } else {
                i = iArr[0];
            }
            synchronized (this.f153813k) {
                bugr bugr2 = (bugr) this.f153814l.get(j);
                if (bugr2 != null && m119493b(bugr2) != null) {
                    return bugr2;
                }
                if (i != -1) {
                    buhc buhc = new buhc(j, i, this.f153807e, this, this.f153817o, this.f153810h);
                    this.f153814l.put(j, buhc);
                    this.f153815m.put(i, buhc);
                    mo72650a(i, buhc);
                    return buhc;
                }
                this.f153814l.put(j, f153804b);
                return null;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public final void mo72636b(bugo bugo) {
        mo72654d(bugo);
    }

    /* renamed from: b */
    public final void mo72637b(bugs bugs) {
        if (bugs != null) {
            synchronized (this.f153818p) {
                this.f153818p.remove(bugs);
            }
        }
    }

    /* renamed from: a */
    public final bugu mo72628a(long j, byte[] bArr) {
        if (!this.f153816n) {
            buhj buhj = this.f153811i;
            if (bArr.length != 0) {
                buhy buhy = new buhy(buhj, buhj.f153858j, this, j, bArr);
                buhj.f153851c.execute(buhy);
                return buhy;
            }
            throw new IllegalArgumentException("NanoApp Binary cannot be null or empty.");
        }
        buhm buhm = this.f153812j;
        ContextHubInfo contextHubInfo = this.f153808f;
        bmxy.m108581a(contextHubInfo);
        bmxy.m108581a(bArr);
        return new buhp(buhm.f153867a.loadNanoApp(contextHubInfo, new NanoAppBinary(bArr)));
    }

    /* renamed from: a */
    public final void mo72629a(long j, bugl bugl, Handler handler) {
        boolean z;
        NanoAppUpdaterChimeraGcmTaskService.m117277b();
        bugm bugm = this.f153819q;
        Long valueOf = Long.valueOf(j);
        if (mo72627a(j) != null) {
            z = true;
        } else {
            z = false;
        }
        bgcz bgcz = (bgcz) bugm;
        bgcz.f116087c.execute(new bgcl(bgcz, valueOf, bugl, handler, z));
    }

    /* renamed from: a */
    public final void mo72630a(bugl bugl) {
        bgcz bgcz = (bgcz) this.f153819q;
        bgcz.f116087c.execute(new bgcp(bgcz, bugl));
    }

    /* renamed from: a */
    public final void mo72631a(bugo bugo) {
        mo72652c(bugo);
    }

    /* renamed from: a */
    public final void mo72632a(bugo bugo, Handler handler) {
        mo72653c(bugo, handler);
    }

    /* renamed from: a */
    public final void mo72633a(bugs bugs) {
        Handler handler = this.f153810h;
        if (handler != null) {
            synchronized (this.f153818p) {
                this.f153818p.put(bugs, handler);
            }
            return;
        }
        throw new IllegalArgumentException("handler cannot be null.");
    }

    /* renamed from: a */
    public final void mo72634a(PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nContextHub State:\n");
        synchronized (this.f153813k) {
            int size = this.f153814l.size();
            sb.append("  NanoApps by ID:\n");
            for (int i = 0; i < size; i++) {
                long keyAt = this.f153814l.keyAt(i);
                bugr b = m119493b((bugr) this.f153814l.valueAt(i));
                if (b == null) {
                    sb.append("    AppId=0x");
                    sb.append(Long.toHexString(keyAt));
                    sb.append(", <null>\n");
                } else {
                    m119492a(sb, b);
                }
            }
            int size2 = this.f153815m.size();
            sb.append("  NanoApps by UID:\n");
            for (int i2 = 0; i2 < size2; i2++) {
                int keyAt2 = this.f153815m.keyAt(i2);
                bugr b2 = m119493b((bugr) this.f153815m.valueAt(i2));
                if (b2 == null) {
                    sb.append("    UID=");
                    sb.append(keyAt2);
                    sb.append(", <null>\n");
                } else {
                    m119492a(sb, b2);
                }
            }
        }
        buhj buhj = this.f153811i;
        if (buhj != null) {
            sb.append("  Events transferred by type:\n");
            synchronized (buhj.f153853e) {
                ListIterator b3 = buhj.f153853e.iterator();
                while (b3.hasNext()) {
                    b3.next();
                }
                while (b3.hasPrevious()) {
                    sb.append((String) b3.previous());
                    sb.append(10);
                }
            }
        }
        sb.append("\n");
        printWriter.print(sb.toString());
    }
}
