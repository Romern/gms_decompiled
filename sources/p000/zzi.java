package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzi {

    /* renamed from: a */
    public static final zzi f56267a = new zzi(null);

    /* renamed from: b */
    public final Object f56268b;

    /* renamed from: c */
    protected zyg f56269c;

    /* renamed from: d */
    public zxv f56270d;

    /* renamed from: e */
    public zyn f56271e;

    /* renamed from: f */
    protected zxq f56272f;

    /* renamed from: g */
    protected ExecutorService f56273g;

    /* renamed from: h */
    protected ScheduledExecutorService f56274h;

    /* renamed from: i */
    public zxw f56275i;

    /* renamed from: j */
    protected zxn f56276j;

    /* renamed from: k */
    protected zzh f56277k;

    /* renamed from: l */
    public boolean f56278l;

    /* renamed from: m */
    public boolean f56279m;

    /* renamed from: n */
    public long f56280n;

    /* renamed from: o */
    public long f56281o;

    /* renamed from: p */
    public boolean f56282p;

    /* renamed from: q */
    protected zyv f56283q;

    /* renamed from: r */
    protected zyw f56284r;

    /* renamed from: s */
    protected zyw f56285s;

    /* renamed from: t */
    private zze f56286t;

    public zzi() {
    }

    /* renamed from: a */
    public static void m46734a(Context context, bmza bmza, int i, int i2) {
        zyg a = f56267a.mo31621a(context);
        long a2 = bmza.mo66928a(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(54);
        sb.append("com.google.android.gms.fonts.state.bundled.");
        sb.append(i2);
        a.mo31588a(zyg.m46676a(1, i, sb.toString(), a2));
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        objArr[0] = i != 0 ? "failed or no action" : "succeeded";
        objArr[1] = Long.valueOf(a2);
        zyh.m46683c("FontsSharedState", String.format(locale, "Extracting bundled assets %s in %d ms", objArr), new Object[0]);
    }

    /* renamed from: b */
    public final ExecutorService mo31624b() {
        ExecutorService executorService;
        synchronized (this.f56268b) {
            if (this.f56273g == null) {
                this.f56273g = sne.m35694a(4, 10);
            }
            executorService = this.f56273g;
        }
        return executorService;
    }

    /* renamed from: c */
    public final ScheduledExecutorService mo31626c() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.f56268b) {
            if (this.f56274h == null) {
                this.f56274h = snp.m35703a(1, 10);
            }
            scheduledExecutorService = this.f56274h;
        }
        return scheduledExecutorService;
    }

    /* renamed from: d */
    public final zyv mo31628d(Context context) {
        zyv zyv;
        sdo.checkIfNull(context, "context");
        synchronized (this.f56268b) {
            zyv = this.f56283q;
        }
        if (zyv.mo31610a()) {
            zyv = mo31630e(context);
        }
        if (zyv.mo31610a()) {
            this.f56277k.mo31598a();
        }
        return zyv;
    }

    /* renamed from: e */
    public final zyv mo31630e(Context context) {
        zyv zyv;
        synchronized (this.f56268b) {
            zyv = this.f56283q;
        }
        Context applicationContext = context.getApplicationContext();
        int i = zyv.f56231a.f56082b;
        zxv c = mo31627c(applicationContext);
        zxe zxe = null;
        if (c.f56134b.exists()) {
            File[] listFiles = c.f56134b.listFiles(zxt.f56132a);
            if (listFiles != null) {
                Arrays.sort(listFiles, new zxu());
                int length = listFiles.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    File file = listFiles[i2];
                    File file2 = new File(file, "directory.pb");
                    zyh.m46683c("FontDisk", "Consider %s", file2);
                    try {
                        int parseInt = Integer.parseInt(file.getName());
                        if (file2.exists() && parseInt > i) {
                            zyh.m46683c("FontDisk", "Checking %s", file2);
                            try {
                                zxe = zyo.m46707a(bobi.m111041b(file2));
                                break;
                            } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException e) {
                                zyh.m46681a("FontDisk", e, "Directory parsing failed for %s", file2.getPath());
                            }
                        }
                    } catch (NumberFormatException e2) {
                        zyh.m46680a("FontDisk", "Invalid directory %s exists", file);
                    }
                    i2++;
                }
            } else {
                zyh.m46683c("FontDisk", "Directory path is deemed invalid: %s", c.f56134b);
            }
        } else {
            zyh.m46683c("FontDisk", "No directory at %s", c.f56134b);
        }
        if (zxe != null) {
            zyh.m46682b("FontsSharedState", "Updating from directory version %d to %d from disk", Integer.valueOf(i), Integer.valueOf(zxe.f56082b));
            zyv = new zyv(zxe);
        } else {
            zyh.m46682b("FontsSharedState", "No directory on disk newer than version %d", Integer.valueOf(i));
        }
        synchronized (this.f56268b) {
            int i3 = zyv.f56231a.f56082b;
            zyv zyv2 = this.f56283q;
            int i4 = zyv2.f56231a.f56082b;
            if (i3 <= i4) {
                return zyv2;
            }
            zyh.m46683c("FontsSharedState", "Updating directory from v%d to v%d", Integer.valueOf(i4), Integer.valueOf(zyv.f56231a.f56082b));
            this.f56283q = zyv;
            zyw zyw = new zyw(this.f56283q);
            this.f56284r = zyw;
            zyn zyn = this.f56271e;
            if (zyn != null) {
                zyn.mo31602a(zyw);
            }
            zyv zyv3 = this.f56283q;
            return zyv3;
        }
    }

    public zzi(byte[] bArr) {
        this.f56268b = new Object();
        this.f56283q = new zyv(zxe.f56079c);
    }

    /* renamed from: c */
    public final zxv mo31627c(Context context) {
        zxv zxv;
        sdo.checkIfNull(context, "context");
        synchronized (this.f56268b) {
            if (this.f56270d == null) {
                Context applicationContext = context.getApplicationContext();
                this.f56270d = new zxv(applicationContext, mo31625b(applicationContext), mo31624b(), mo31621a(applicationContext), ceao.m135839d(), ceao.f182169a.mo6606a().mo78695i(), ceao.m135838c());
            }
            zxv = this.f56270d;
        }
        return zxv;
    }

    /* renamed from: b */
    public final zxq mo31625b(Context context) {
        zxq zxq;
        synchronized (this.f56268b) {
            if (this.f56272f == null) {
                this.f56272f = new zxq(context.getApplicationContext());
            }
            zxq = this.f56272f;
        }
        return zxq;
    }

    /* renamed from: d */
    public final void mo31629d() {
        this.f56278l = ceal.m135826d();
        this.f56280n = ceao.f182169a.mo6606a().mo78692f();
        this.f56279m = ceao.m135838c();
        this.f56281o = ceao.m135839d();
        this.f56282p = ceai.m135819b();
    }

    /* renamed from: a */
    public final zyg mo31621a(Context context) {
        zyg zyg;
        sdo.checkIfNull(context, "context");
        synchronized (this.f56268b) {
            if (this.f56269c == null) {
                this.f56269c = new zyg(context.getApplicationContext());
            }
            zyg = this.f56269c;
        }
        return zyg;
    }

    /* renamed from: a */
    public final zyn mo31622a() {
        zyn zyn;
        synchronized (this.f56268b) {
            zyn = this.f56271e;
        }
        return zyn;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zxv.a(zxi, zxh, boolean):java.io.File
     arg types: [zxi, zxh, int]
     candidates:
      zxv.a(java.io.File, zxi, zxh):java.io.File
      zxv.a(long, java.io.File, java.io.File):boolean
      zxv.a(zxi, zxh, boolean):java.io.File */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4 = r1.f56275i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r4 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new p000.zya(r15, r2, r10, r0);
        r1.f56275i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r4 = r1.f56268b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r1.f56277k != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r1.f56277k = new p000.zzh(r1, r9, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r0 = r1.f56277k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        r14 = mo31621a(r10);
        r12 = mo31627c(r10);
        r3 = r1.f56268b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (p000.ceai.m135819b() != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        r4 = r1.f56276j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        if (r4 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        r1.f56276j = new p000.zxm(r15, r2, r12, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        r2 = r1.f56276j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006c, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006e, code lost:
        mo31629d();
        r2 = r1.f56268b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
        if (r1.f56271e != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007a, code lost:
        p000.zyh.m46683c("FontsSharedState", "Creating a FontServer using %s for downloads", r13.getClass().getSimpleName());
        r3 = new p000.zyn(r12, r13, r14, r15, r0, r1.f56285s, r18);
        r1.f56271e = r3;
        r0 = r1.f56284r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009f, code lost:
        r3.mo31602a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a7, code lost:
        if (p000.ceai.m135819b() == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        p000.zyh.m46683c("FontsSharedState", "Starting pre extraction of bundled fonts", new java.lang.Object[0]);
        r11 = p000.bmza.m108659b(p000.bmvy.f131119a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2 = new p000.zyv(p000.zyo.m46707a(p000.boav.m111020a(r25.getResources().getAssets().open("googlesansdirectory.pb"))));
        r3 = r2.f56231a.f56082b;
        r4 = new java.lang.StringBuilder(40);
        r4.append("Bundled directory version is ");
        r4.append(r3);
        p000.zyh.m46683c("FontsSharedState", r4.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        p000.zyh.m46681a("FontsSharedState", r0, "Exception in extracting bundled directory", new java.lang.Object[0]);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r15 = mo31624b();
        r2 = mo31626c();
        r3 = r1.f56268b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        monitor-enter(r3);
     */
    /* renamed from: a */
    public final void mo31623a(Context context, Runnable runnable) {
        bmza b;
        zyv zyv;
        zxn zxn;
        int i;
        int i2;
        int i3;
        List list;
        Context context2 = context;
        Runnable runnable2 = runnable;
        sdo.checkIfNull(context2, "context");
        Context applicationContext = context.getApplicationContext();
        synchronized (this.f56268b) {
            if (this.f56271e == null) {
                sdo.checkIfNull(runnable2, "resultPump");
            } else {
                return;
            }
        }
        if (zyv != null) {
            zyw zyw = new zyw(zyv);
            sdo.checkIfNull(context2, "context");
            synchronized (this.f56268b) {
                zxn = this.f56276j;
            }
            ExecutorService b2 = mo31624b();
            zxv c = mo31627c(context);
            ArrayList arrayList = new ArrayList();
            List c2 = bmyx.m108640a(',').mo66917a().mo66920b().mo66925c((CharSequence) ceao.f182169a.mo6606a().mo78688b());
            bxwc bxwc = zyv.f56231a.f56081a;
            int size = bxwc.size();
            int i4 = 0;
            while (i4 < size) {
                zxi zxi = (zxi) bxwc.get(i4);
                bxwc bxwc2 = zxi.f56107d;
                bxwc bxwc3 = bxwc;
                int size2 = bxwc2.size();
                int i5 = size;
                int i6 = 0;
                while (true) {
                    i2 = i4 + 1;
                    if (i6 >= size2) {
                        break;
                    }
                    int i7 = size2;
                    zxh zxh = (zxh) bxwc2.get(i6);
                    bxwc bxwc4 = bxwc2;
                    String a = zxv.m46649a(zxi.f56105b, zxh);
                    if (!c2.contains(a)) {
                        list = c2;
                        i3 = i4;
                    } else {
                        list = c2;
                        i3 = i4;
                        if (mo31627c(context).mo31570a(zxi, zxh, true) != null) {
                            zyh.m46683c("FontsSharedState", "%s already present on disk; extraction not required", a);
                        } else {
                            arrayList.add(new C1240of(zxi, zxh));
                        }
                    }
                    i6++;
                    size2 = i7;
                    bxwc2 = bxwc4;
                    c2 = list;
                    i4 = i3;
                }
                bxwc = bxwc3;
                size = i5;
                i4 = i2;
            }
            zze zze = new zze(zxn, b2, c, context, b, arrayList);
            synchronized (this.f56268b) {
                zze zze2 = this.f56286t;
                if (zze2 != null) {
                    synchronized (zze2.f56247b) {
                        i = zze2.f56249d;
                    }
                    if (i == 0) {
                    }
                }
                this.f56285s = zyw;
                zyn zyn = this.f56271e;
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(zyw == null);
                zyh.m46683c("FontsServer", "setResolver. Null? %s", objArr);
                synchronized (zyn.f56204e) {
                    zyn.f56210k = zyw;
                }
                zyn zyn2 = this.f56271e;
                long b3 = ceao.m135837b();
                synchronized (zyn2.f56204e) {
                    zyn2.f56208i = b3;
                }
                this.f56286t = zze;
                ScheduledExecutorService c3 = mo31626c();
                if (zze.f56246a.isEmpty()) {
                    zze.mo31617a(23515);
                    m46734a(context2, b, 23515, 0);
                } else {
                    zze.f56248c = c3.schedule(new zzf(zze), 30000, TimeUnit.MILLISECONDS);
                    zze.mo31616a();
                }
            }
        } else {
            m46734a(context2, b, 23514, 0);
        }
        mo31628d(applicationContext);
    }
}
