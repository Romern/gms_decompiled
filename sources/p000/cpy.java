package p000;

import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: cpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cpy implements cpv, cqe, cpx {

    /* renamed from: a */
    public final Object f11814a;

    /* renamed from: b */
    public final Object f11815b;

    /* renamed from: c */
    public final Class f11816c;

    /* renamed from: d */
    public final cpu f11817d;

    /* renamed from: e */
    public final int f11818e;

    /* renamed from: f */
    public final int f11819f;

    /* renamed from: g */
    public final cbs f11820g;

    /* renamed from: h */
    public final List f11821h;

    /* renamed from: i */
    private final crm f11822i = crm.m7411a();

    /* renamed from: j */
    private final cbr f11823j;

    /* renamed from: k */
    private final cqf f11824k;

    /* renamed from: l */
    private final Executor f11825l;

    /* renamed from: m */
    private cgj f11826m;

    /* renamed from: n */
    private cft f11827n;

    /* renamed from: o */
    private long f11828o;

    /* renamed from: p */
    private volatile cfu f11829p;

    /* renamed from: q */
    private int f11830q;

    /* renamed from: r */
    private int f11831r;

    /* renamed from: s */
    private boolean f11832s;

    /* renamed from: t */
    private int f11833t;

    public cpy(cbr cbr, Object obj, Object obj2, Class cls, cpu cpu, int i, int i2, cbs cbs, cqf cqf, List list, cfu cfu, Executor executor) {
        this.f11814a = obj;
        this.f11823j = cbr;
        this.f11815b = obj2;
        this.f11816c = cls;
        this.f11817d = cpu;
        this.f11818e = i;
        this.f11819f = i2;
        this.f11820g = cbs;
        this.f11824k = cqf;
        this.f11821h = list;
        this.f11829p = cfu;
        this.f11825l = executor;
        this.f11833t = 1;
    }

    /* renamed from: a */
    private static int m7296a(int i, float f) {
        if (i != Integer.MIN_VALUE) {
            return Math.round(f * ((float) i));
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00aa, code lost:
        if (r1 == false) goto L_0x00ac;
     */
    /* renamed from: b */
    private final void m7297b(cgd cgd) {
        this.f11822i.mo8190b();
        synchronized (this.f11814a) {
            int i = this.f11823j.f6429g;
            String valueOf = String.valueOf(this.f11815b);
            int i2 = this.f11830q;
            int i3 = this.f11831r;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Load failed for ");
            sb.append(valueOf);
            sb.append(" with size [");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("]");
            Log.w("Glide", sb.toString(), cgd);
            List a = cgd.mo3851a();
            int size = a.size();
            int i4 = 0;
            while (i4 < size) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Root cause (");
                int i5 = i4 + 1;
                sb2.append(i5);
                sb2.append(" of ");
                sb2.append(size);
                sb2.append(")");
                Log.i("Glide", sb2.toString(), (Throwable) a.get(i4));
                i4 = i5;
            }
            this.f11827n = null;
            this.f11833t = 5;
            this.f11832s = true;
            try {
                List<cpw> list = this.f11821h;
                if (list != null) {
                    boolean z = false;
                    for (cpw cpw : list) {
                        z |= cpw.mo8117a();
                    }
                }
                this.f11824k.mo8126f();
            } finally {
                this.f11832s = false;
            }
        }
    }

    /* renamed from: h */
    private final void m7298h() {
        if (this.f11832s) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: c */
    public final void mo8113c() {
        synchronized (this.f11814a) {
            if (mo8114d()) {
                mo8112b();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo8114d() {
        boolean z;
        synchronized (this.f11814a) {
            int i = this.f11833t;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo8115e() {
        boolean z;
        synchronized (this.f11814a) {
            z = this.f11833t == 4;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo8116f() {
        boolean z;
        synchronized (this.f11814a) {
            z = this.f11833t == 6;
        }
        return z;
    }

    /* renamed from: g */
    public final Object mo8121g() {
        this.f11822i.mo8190b();
        return this.f11814a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo8111a() {
        synchronized (this.f11814a) {
            m7298h();
            this.f11822i.mo8190b();
            this.f11828o = cqw.m7370a();
            if (this.f11815b == null) {
                if (crd.m7394a(this.f11818e, this.f11819f)) {
                    this.f11830q = this.f11818e;
                    this.f11831r = this.f11819f;
                }
                m7297b(new cgd("Received null model"));
                return;
            }
            int i = this.f11833t;
            if (i == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            } else if (i == 4) {
                mo8120a(this.f11826m, 5);
            } else {
                this.f11833t = 3;
                if (crd.m7394a(this.f11818e, this.f11819f)) {
                    mo8122a(this.f11818e, this.f11819f);
                } else {
                    this.f11824k.mo8131a((cqe) this);
                }
                int i2 = this.f11833t;
                if (i2 != 2) {
                    if (i2 != 3) {
                    }
                }
                this.f11824k.mo8127g();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        p000.cfu.m4147a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* renamed from: b */
    public final void mo8112b() {
        synchronized (this.f11814a) {
            m7298h();
            this.f11822i.mo8190b();
            if (this.f11833t != 6) {
                m7298h();
                this.f11822i.mo8190b();
                this.f11824k.mo8132b(this);
                cft cft = this.f11827n;
                cgj cgj = null;
                if (cft != null) {
                    synchronized (cft.f6727c) {
                        cft.f6725a.mo3836a(cft.f6726b);
                    }
                    this.f11827n = null;
                }
                cgj cgj2 = this.f11826m;
                if (cgj2 != null) {
                    this.f11826m = null;
                    cgj = cgj2;
                }
                this.f11824k.mo8125b();
                this.f11833t = 6;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.mo8120a(r7, 5);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0169, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo8122a(int i, int i2) {
        cgb cgb;
        cpy cpy;
        cft cft;
        this.f11822i.mo8190b();
        synchronized (this.f11814a) {
            try {
                if (this.f11833t == 3) {
                    this.f11833t = 2;
                    float f = this.f11817d.f11789b;
                    this.f11830q = m7296a(i, f);
                    this.f11831r = m7296a(i2, f);
                    cfu cfu = this.f11829p;
                    cbr cbr = this.f11823j;
                    Object obj = this.f11815b;
                    cpu cpu = this.f11817d;
                    cdg cdg = cpu.f11795h;
                    int i3 = this.f11830q;
                    int i4 = this.f11831r;
                    Class cls = cpu.f11800m;
                    Class cls2 = this.f11816c;
                    cbs cbs = this.f11820g;
                    cfn cfn = cpu.f11790c;
                    Map map = cpu.f11799l;
                    boolean z = cpu.f11796i;
                    boolean z2 = cpu.f11803p;
                    cdk cdk = cpu.f11798k;
                    cbr cbr2 = cbr;
                    boolean z3 = cpu.f11792e;
                    boolean z4 = cpu.f11804q;
                    boolean z5 = z3;
                    Executor executor = this.f11825l;
                    boolean z6 = z4;
                    boolean z7 = z;
                    Map map2 = map;
                    cfn cfn2 = cfn;
                    cbs cbs2 = cbs;
                    Class cls3 = cls2;
                    Class cls4 = cls;
                    int i5 = i4;
                    int i6 = i3;
                    cga cga = new cga(obj, cdg, i3, i4, map2, cls, cls3, cdk);
                    synchronized (cfu) {
                        if (z5) {
                            try {
                                cgb = cfu.f6732e.mo3787b(cga);
                                if (cgb != null) {
                                    cgb.mo3845e();
                                }
                                if (cgb == null) {
                                    cgj a = cfu.f6733f.mo3906a((cdg) cga);
                                    if (a != null) {
                                        cgb = !(a instanceof cgb) ? new cgb(a, true, cga, cfu) : (cgb) a;
                                    } else {
                                        cgb = null;
                                    }
                                    if (cgb != null) {
                                        cgb.mo3845e();
                                        cfu.f6732e.mo3785a(cga, cgb);
                                    }
                                    if (cgb == null) {
                                        cgb = null;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } else {
                            cgb = null;
                        }
                        if (cgb == null) {
                            cfz cfz = (cfz) cfu.f6728a.f6786a.get(cga);
                            if (cfz == null) {
                                cfz cfz2 = (cfz) cfu.f6729b.f6720d.mo8188a();
                                crb.m7382a(cfz2);
                                cfz2.mo3835a(cga, z5, z6);
                                cfp cfp = cfu.f6731d;
                                cfi cfi = (cfi) cfp.f6713a.mo8188a();
                                crb.m7382a(cfi);
                                int i7 = cfp.f6714b;
                                cfp.f6714b = i7 + 1;
                                cfc cfc = cfi.f6678a;
                                cfs cfs = cfi.f6696s;
                                cfc.f6651c = cbr2;
                                cfc.f6652d = obj;
                                cfc.f6661m = cdg;
                                cfc.f6653e = i6;
                                cfc.f6654f = i5;
                                cfc.f6663o = cfn2;
                                cfc.f6655g = cls4;
                                cfc.f6666r = cfs;
                                cfc.f6658j = cls3;
                                cfc.f6662n = cbs2;
                                cfc.f6656h = cdk;
                                cfc.f6657i = map2;
                                cfc.f6664p = z7;
                                cfc.f6665q = z2;
                                cfi.f6681d = cbr2;
                                cfi.f6682e = cdg;
                                cfi.f6683f = cbs2;
                                cfi.f6684g = cga;
                                cfi.f6685h = i6;
                                cfi.f6686i = i5;
                                cfi.f6687j = cfn2;
                                cfi.f6691n = false;
                                cfi.f6688k = cdk;
                                cfi.f6689l = cfz2;
                                cfi.f6690m = i7;
                                cfi.f6695r = 1;
                                cgf cgf = cfu.f6728a;
                                boolean z8 = cfz2.f6746e;
                                cgf.f6786a.put(cga, cfz2);
                                cpy = this;
                                try {
                                    cfz2.mo3837a(cpy, executor);
                                    cfz2.mo3838b(cfi);
                                    cft = new cft(cfu, cpy, cfz2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                cpy = this;
                                cfz.mo3837a(cpy, executor);
                                cft = new cft(cfu, cpy, cfz);
                            }
                        } else {
                            cpy = this;
                        }
                        cpy.f11827n = cft;
                        if (cpy.f11833t != 2) {
                            cpy.f11827n = null;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo8119a(cgd cgd) {
        m7297b(cgd);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f4, code lost:
        if (r3 == false) goto L_0x00f6;
     */
    /* renamed from: a */
    public final void mo8120a(cgj cgj, int i) {
        Throwable th;
        Object obj;
        String str;
        this.f11822i.mo8190b();
        cgj cgj2 = null;
        try {
            synchronized (this.f11814a) {
                try {
                    this.f11827n = null;
                    if (cgj == null) {
                        String valueOf = String.valueOf(this.f11816c);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
                        sb.append("Expected to receive a Resource<R> with an object of ");
                        sb.append(valueOf);
                        sb.append(" inside, but instead got null.");
                        mo8119a(new cgd(sb.toString()));
                        return;
                    }
                    Object b = cgj.mo3842b();
                    if (b == null || !this.f11816c.isAssignableFrom(b.getClass())) {
                        try {
                            this.f11826m = null;
                            String valueOf2 = String.valueOf(this.f11816c);
                            if (b == null) {
                                obj = "";
                            } else {
                                obj = b.getClass();
                            }
                            String valueOf3 = String.valueOf(obj);
                            String valueOf4 = String.valueOf(b);
                            String valueOf5 = String.valueOf(cgj);
                            if (b == null) {
                                str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                            } else {
                                str = "";
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 71 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + str.length());
                            sb2.append("Expected to receive an object of ");
                            sb2.append(valueOf2);
                            sb2.append(" but instead got ");
                            sb2.append(valueOf3);
                            sb2.append("{");
                            sb2.append(valueOf4);
                            sb2.append("} inside Resource{");
                            sb2.append(valueOf5);
                            sb2.append("}.");
                            sb2.append(str);
                            mo8119a(new cgd(sb2.toString()));
                            cfu.m4147a(cgj);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                                cgj2 = cgj;
                            }
                        }
                    } else {
                        this.f11833t = 4;
                        this.f11826m = cgj;
                        if (this.f11823j.f6429g <= 3) {
                            String simpleName = b.getClass().getSimpleName();
                            String a = C0074cct.m3975a(i);
                            String valueOf6 = String.valueOf(this.f11815b);
                            int i2 = this.f11830q;
                            int i3 = this.f11831r;
                            double a2 = (double) (cqw.m7370a() - this.f11828o);
                            double d = cqw.f11866a;
                            Double.isNaN(a2);
                            double d2 = a2 * d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(simpleName).length() + 95 + a.length() + String.valueOf(valueOf6).length());
                            sb3.append("Finished loading ");
                            sb3.append(simpleName);
                            sb3.append(" from ");
                            sb3.append(a);
                            sb3.append(" for ");
                            sb3.append(valueOf6);
                            sb3.append(" with size [");
                            sb3.append(i2);
                            sb3.append("x");
                            sb3.append(i3);
                            sb3.append("] in ");
                            sb3.append(d2);
                            sb3.append(" ms");
                            sb3.toString();
                        }
                        this.f11832s = true;
                        List<cpw> list = this.f11821h;
                        if (list != null) {
                            boolean z = false;
                            for (cpw cpw : list) {
                                z |= cpw.mo8118b();
                            }
                        }
                        this.f11824k.mo8133k(b);
                        this.f11832s = false;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cgj = null;
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            if (cgj2 != null) {
                cfu.m4147a(cgj2);
            }
            throw th;
        }
    }
}
