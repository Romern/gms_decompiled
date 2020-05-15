package p000;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: chwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chwh implements chyc {

    /* renamed from: a */
    public final String f189356a;

    /* renamed from: b */
    public cida f189357b;

    /* renamed from: c */
    public final Object f189358c = new Object();

    /* renamed from: d */
    public final Set f189359d = new HashSet();

    /* renamed from: e */
    public final Executor f189360e;

    /* renamed from: f */
    public final int f189361f;

    /* renamed from: g */
    public final boolean f189362g;

    /* renamed from: h */
    public final cifh f189363h;

    /* renamed from: i */
    public final boolean f189364i;

    /* renamed from: j */
    public final boolean f189365j;

    /* renamed from: k */
    public boolean f189366k;

    /* renamed from: l */
    public chuv f189367l;

    /* renamed from: m */
    public boolean f189368m;

    /* renamed from: n */
    public final chvx f189369n;

    /* renamed from: o */
    private final chse f189370o;

    /* renamed from: p */
    private final InetSocketAddress f189371p;

    /* renamed from: q */
    private final String f189372q;

    /* renamed from: r */
    private final chqh f189373r;

    /* renamed from: s */
    private boolean f189374s;

    /* renamed from: t */
    private boolean f189375t;

    public chwh(chvx chvx, InetSocketAddress inetSocketAddress, String str, String str2, chqh chqh, Executor executor, cifh cifh) {
        bmxy.m108582a(inetSocketAddress, "address");
        this.f189371p = inetSocketAddress;
        this.f189370o = chse.m149479a(getClass(), inetSocketAddress.toString());
        this.f189372q = str;
        this.f189356a = ciag.m149911a("cronet", str2);
        this.f189361f = 4194304;
        this.f189362g = false;
        bmxy.m108582a(executor, "executor");
        this.f189360e = executor;
        bmxy.m108582a(chvx, "streamFactory");
        this.f189369n = chvx;
        bmxy.m108582a(cifh, "transportTracer");
        this.f189363h = cifh;
        chqf a = chqh.m149395a();
        a.mo85532a(chzz.f189624a, chuo.PRIVACY_AND_INTEGRITY);
        a.mo85532a(chzz.f189625b, chqh);
        this.f189373r = a.mo85531a();
        this.f189364i = false;
        this.f189365j = false;
    }

    /* renamed from: a */
    public final chqh mo85743a() {
        return this.f189373r;
    }

    /* renamed from: b */
    public final chse mo85595b() {
        return this.f189370o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo85749c() {
        synchronized (this.f189358c) {
            if (this.f189366k && !this.f189375t && this.f189359d.size() == 0) {
                this.f189375t = true;
                this.f189357b.mo85894b();
            }
        }
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f189371p);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo85748b(chuv chuv) {
        ArrayList arrayList;
        mo85746a(chuv);
        synchronized (this.f189358c) {
            arrayList = new ArrayList(this.f189359d);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((chwe) arrayList.get(i)).mo85764b(chuv);
        }
        mo85749c();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ chxs mo85744a(chtv chtv, chtr chtr, chqo chqo) {
        bmxy.m108582a(chtv, "method");
        bmxy.m108582a(chtr, "headers");
        String valueOf = String.valueOf(chtv.f189150b);
        String str = valueOf.length() == 0 ? new String("/") : "/".concat(valueOf);
        String str2 = this.f189372q;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(str2);
        sb.append(str);
        return new chwg(this, sb.toString(), chtr, chtv, ciez.m150148a(chqo, this.f189373r), chqo).f189349a;
    }

    /* renamed from: a */
    public final Runnable mo85745a(cida cida) {
        bmxy.m108582a(cida, "listener");
        this.f189357b = cida;
        synchronized (this.f189358c) {
            this.f189368m = true;
        }
        return new chwf(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000d, code lost:
        if (r3.f189374s != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        r3.f189374s = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
        r3.f189357b.mo85892a(r4);
        r2 = r3.f189358c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f189366k = true;
        r3.f189367l = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        mo85749c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0008, code lost:
        r1 = r3.f189358c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000a, code lost:
        monitor-enter(r1);
     */
    /* renamed from: a */
    public final void mo85746a(chuv chuv) {
        synchronized (this.f189358c) {
            if (this.f189366k) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85747a(chwe chwe, chuv chuv) {
        synchronized (this.f189358c) {
            if (this.f189359d.remove(chwe)) {
                boolean z = true;
                if (!(chuv.f189233s == chus.CANCELLED || chuv.f189233s == chus.DEADLINE_EXCEEDED)) {
                    z = false;
                }
                chwe.f189345o.mo85777b(chuv, z, new chtr());
                mo85749c();
            }
        }
    }
}
