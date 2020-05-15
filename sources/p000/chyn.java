package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* renamed from: chyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chyn implements cidb {

    /* renamed from: a */
    public final Object f189521a = new Object();

    /* renamed from: b */
    public final chvc f189522b;

    /* renamed from: c */
    public Runnable f189523c;

    /* renamed from: d */
    public Runnable f189524d;

    /* renamed from: e */
    public Runnable f189525e;

    /* renamed from: f */
    public cida f189526f;

    /* renamed from: g */
    public Collection f189527g = new LinkedHashSet();

    /* renamed from: h */
    public chuv f189528h;

    /* renamed from: i */
    private final chse f189529i = chse.m149479a(chyn.class, (String) null);

    /* renamed from: j */
    private final Executor f189530j;

    /* renamed from: k */
    private chst f189531k;

    /* renamed from: l */
    private long f189532l;

    public chyn(Executor executor, chvc chvc) {
        this.f189530j = executor;
        this.f189522b = chvc;
    }

    /* renamed from: a */
    private final chym m149806a(chsp chsp) {
        int size;
        chym chym = new chym(this, chsp);
        this.f189527g.add(chym);
        synchronized (this.f189521a) {
            size = this.f189527g.size();
        }
        if (size == 1) {
            this.f189522b.mo85704a(this.f189523c);
        }
        return chym;
    }

    /* renamed from: a */
    public final Runnable mo85745a(cida cida) {
        throw null;
    }

    /* renamed from: b */
    public final chse mo85595b() {
        return this.f189529i;
    }

    /* renamed from: b */
    public final void mo85748b(chuv chuv) {
        Collection<chym> collection;
        Runnable runnable;
        mo85746a(chuv);
        synchronized (this.f189521a) {
            collection = this.f189527g;
            runnable = this.f189525e;
            this.f189525e = null;
            if (!collection.isEmpty()) {
                this.f189527g = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (chym chym : collection) {
                chym.mo85764b(chuv);
            }
            this.f189522b.execute(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r7 = new p000.chzr(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        r8 = r6.f189522b;
     */
    /* renamed from: a */
    public final chxs mo85744a(chtv chtv, chtr chtr, chqo chqo) {
        chxs chzr;
        chvc chvc;
        try {
            cidu cidu = new cidu(chtv, chtr, chqo);
            chst chst = null;
            long j = -1;
            while (true) {
                synchronized (this.f189521a) {
                    chuv chuv = this.f189528h;
                    if (chuv != null) {
                        break;
                    }
                    chst chst2 = this.f189531k;
                    if (chst2 == null) {
                        chzr = m149806a(cidu);
                        chvc = this.f189522b;
                        break;
                    }
                    if (chst != null) {
                        if (j == this.f189532l) {
                            chzr = m149806a(cidu);
                            chvc = this.f189522b;
                            break;
                        }
                    }
                    j = this.f189532l;
                    chxv a = ciag.m149909a(chst2.mo85609a(), chqo.mo85549a());
                    if (a != null) {
                        chzr = a.mo85744a(cidu.f189934c, cidu.f189933b, cidu.f189932a);
                        chvc = this.f189522b;
                        break;
                    }
                    chst = chst2;
                }
            }
            chvc.mo85703a();
            return chzr;
        } catch (Throwable th) {
            this.f189522b.mo85703a();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r3 >= r2) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r4 = (p000.chym) r1.get(r3);
        r5 = r4.f189518a;
        r5 = r9.mo85609a();
        r6 = ((p000.cidu) r4.f189518a).f189932a;
        r5 = p000.ciag.m149909a(r5, r6.mo85549a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r5 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r7 = r8.f189530j;
        r6 = r6.f189008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r6 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r7.execute(new p000.chyl(r4, r5));
        r0.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r9 = r8.f189521a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (mo85822a() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        r8.f189527g.removeAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r8.f189527g.isEmpty() == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r8.f189527g = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (mo85822a() != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        r8.f189522b.mo85704a(r8.f189524d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r8.f189528h == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r0 = r8.f189525e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r0 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        r8.f189522b.mo85704a(r0);
        r8.f189525e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        r8.f189522b.mo85703a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r0 = new java.util.ArrayList();
        r2 = r1.size();
        r3 = 0;
     */
    /* renamed from: a */
    public final void mo85821a(chst chst) {
        synchronized (this.f189521a) {
            this.f189531k = chst;
            this.f189532l++;
            if (chst != null && mo85822a()) {
                ArrayList arrayList = new ArrayList(this.f189527g);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r2.f189522b.mo85703a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo85746a(chuv chuv) {
        Runnable runnable;
        synchronized (this.f189521a) {
            if (this.f189528h == null) {
                this.f189528h = chuv;
                this.f189522b.mo85704a(new chyk(this));
                if (!mo85822a() && (runnable = this.f189525e) != null) {
                    this.f189522b.mo85704a(runnable);
                    this.f189525e = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo85822a() {
        boolean z;
        synchronized (this.f189521a) {
            z = !this.f189527g.isEmpty();
        }
        return z;
    }
}
