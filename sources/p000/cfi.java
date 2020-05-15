package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: cfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfi implements Runnable, Comparable, cfa, crj {

    /* renamed from: A */
    private volatile boolean f6675A;

    /* renamed from: B */
    private int f6676B;

    /* renamed from: C */
    private int f6677C;

    /* renamed from: a */
    public final cfc f6678a = new cfc();

    /* renamed from: b */
    public final cff f6679b = new cff();

    /* renamed from: c */
    public final cfg f6680c = new cfg();

    /* renamed from: d */
    public cbr f6681d;

    /* renamed from: e */
    public cdg f6682e;

    /* renamed from: f */
    public cbs f6683f;

    /* renamed from: g */
    public cga f6684g;

    /* renamed from: h */
    public int f6685h;

    /* renamed from: i */
    public int f6686i;

    /* renamed from: j */
    public cfn f6687j;

    /* renamed from: k */
    public cdk f6688k;

    /* renamed from: l */
    public cfd f6689l;

    /* renamed from: m */
    public int f6690m;

    /* renamed from: n */
    public boolean f6691n;

    /* renamed from: o */
    public cdg f6692o;

    /* renamed from: p */
    public volatile cfb f6693p;

    /* renamed from: q */
    public volatile boolean f6694q;

    /* renamed from: r */
    public int f6695r;

    /* renamed from: s */
    public final cfs f6696s;

    /* renamed from: t */
    private final List f6697t = new ArrayList();

    /* renamed from: u */
    private final crm f6698u = crm.m7411a();

    /* renamed from: v */
    private final C1241og f6699v;

    /* renamed from: w */
    private Thread f6700w;

    /* renamed from: x */
    private cdg f6701x;

    /* renamed from: y */
    private Object f6702y;

    /* renamed from: z */
    private cdt f6703z;

    public cfi(cfs cfs, C1241og ogVar) {
        this.f6696s = cfs;
        this.f6699v = ogVar;
    }

    /* renamed from: d */
    private final int m4115d() {
        return this.f6683f.ordinal();
    }

    /* renamed from: e */
    private final cfb m4116e() {
        int i = this.f6676B;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return new cgk(this.f6678a, this);
        } else {
            if (i2 == 2) {
                cfc cfc = this.f6678a;
                return new cex(cfc.mo3802d(), cfc, this);
            } else if (i2 == 3) {
                return new cgp(this.f6678a, this);
            } else {
                if (i2 == 5) {
                    return null;
                }
                String a = cfh.m4114a(i);
                StringBuilder sb = new StringBuilder(a.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: f */
    private final void m4117f() {
        this.f6700w = Thread.currentThread();
        cqw.m7370a();
        boolean z = false;
        while (!this.f6694q && this.f6693p != null && !(z = this.f6693p.mo3788a())) {
            this.f6676B = mo3809a(this.f6676B);
            this.f6693p = m4116e();
            if (this.f6676B == 4) {
                mo3794c();
                return;
            }
        }
        if ((this.f6676B == 6 || this.f6694q) && !z) {
            m4118g();
        }
    }

    /* renamed from: g */
    private final void m4118g() {
        m4119h();
        cgd cgd = new cgd("Failed to load resource", new ArrayList(this.f6697t));
        cfd cfd = this.f6689l;
        synchronized (cfd) {
            ((cfz) cfd).f6749h = cgd;
        }
        synchronized (cfd) {
            ((cfz) cfd).f6743b.mo8190b();
            if (((cfz) cfd).f6752k) {
                ((cfz) cfd).mo3839c();
            } else if (((cfz) cfd).f6742a.mo3828a()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!((cfz) cfd).f6750i) {
                ((cfz) cfd).f6750i = true;
                cdg cdg = ((cfz) cfd).f6744c;
                cfy c = ((cfz) cfd).f6742a.mo3831c();
                ((cfz) cfd).mo3834a(c.mo3830b() + 1);
                cfz cfz = (cfz) cfd;
                cfz.f6755n.mo3823a(cfz, cdg, null);
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    cfx cfx = (cfx) it.next();
                    cfx.f6740b.execute(new cfv(cfz, cfx.f6739a));
                }
                cfz.mo3833a();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        if (this.f6680c.mo3806b()) {
            mo3810a();
        }
    }

    /* renamed from: h */
    private final void m4119h() {
        Throwable th;
        this.f6698u.mo8190b();
        if (this.f6675A) {
            if (!this.f6697t.isEmpty()) {
                List list = this.f6697t;
                th = (Throwable) list.get(list.size() - 1);
            } else {
                th = null;
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f6675A = true;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:54:0x0116 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:37:0x00bf */
    /* JADX WARN: Type inference failed for: r17v4, assign insn: PHI: (r17v4 ?) = (r17v3 java.util.List), (r17v3 java.util.List), (r17v8 ?), (r17v10 ?) binds: [B:30:0x009c, B:32:0x00a0, B:54:0x0116, B:37:0x00bf] */
    /* JADX WARN: Type inference failed for: r17v8, assign insn: PHI: (r17v8 ?) = (r17v9 ?), (r17v10 ?) binds: [B:39:0x00c8, B:38:?] */
    /* JADX WARN: Type inference failed for: r0v81, types: [cgj], assign insn: 0x01b9: INVOKE  (r0v81 ? I:cgj) = (r0v80 coi), (r3v11 cgj), (r7v4 cdk) type: INTERFACE call: coi.a(cgj, cdk):cgj */
    /* JADX WARN: Type inference failed for: r17v9, assign insn: 0x00c8: MOVE  (r17v9 ? I:?[OBJECT, ARRAY]) = (r3v9 cfe) */
    /* JADX WARN: Type inference failed for: r17v10, assign insn: 0x00bd: MOVE  (r17v10 ? I:?[OBJECT, ARRAY]) = (r3v9 cfe) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f7 A[LOOP:0: B:25:0x0077->B:105:0x01f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0209 A[SYNTHETIC, Splitter:B:107:0x0209] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x021a A[SYNTHETIC, Splitter:B:114:0x021a] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0207 A[EDGE_INSN: B:203:0x0207->B:106:0x0207 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[Catch:{ all -> 0x0227, all -> 0x022e }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    private final void m4120i() {
        cgi cgi;
        cfi cfi;
        cgi cgi2;
        cff cff;
        boolean z;
        cdv a;
        List list;
        int size;
        int i;
        cgi cgi3;
        int i2;
        int i3;
        int i4;
        int i5;
        List list2;
        cgj a2;
        cdo cdo;
        cgj cgj;
        int i6;
        cdn cdn;
        boolean z2;
        cgi cgi4;
        cdg cdg;
        String str;
        try {
            cdt cdt = this.f6703z;
            Object obj = this.f6702y;
            int i7 = this.f6677C;
            if (obj != null) {
                try {
                    cqw.m7370a();
                    cgg b = this.f6678a.mo3798b(obj.getClass());
                    cdk cdk = this.f6688k;
                    int i8 = Build.VERSION.SDK_INT;
                    int i9 = 4;
                    if (i7 == 4 || this.f6678a.f6665q) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean bool = (Boolean) cdk.mo3739a(cme.f7050d);
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            if (z) {
                            }
                        }
                        a = this.f6681d.f6425c.f6440e.mo3767a(obj);
                        int i10 = this.f6685h;
                        int i11 = this.f6686i;
                        cfe cfe = new cfe(this, i7);
                        list = (List) b.f6787a.mo8188a();
                        crb.m7382a((Object) list);
                        size = b.f6788b.size();
                        i = 0;
                        cgi3 = null;
                        while (i < size) {
                            cfj cfj = (cfj) b.f6788b.get(i);
                            try {
                                List list3 = (List) cfj.f6705b.mo8188a();
                                crb.m7382a((Object) list3);
                                i5 = i;
                                i4 = size;
                                cfe cfe2 = cfe;
                                i3 = i11;
                                list2 = list3;
                                try {
                                    a2 = cfj.mo3814a(a, i10, i11, cdk, list2);
                                } catch (cgd e) {
                                    e = e;
                                    list2 = list2;
                                    list.add(e);
                                    if (cgi3 != null) {
                                    }
                                } catch (Throwable th) {
                                    Throwable th2 = th;
                                    cfj.f6705b.mo8189a(list3);
                                    throw th2;
                                }
                                try {
                                    cfj.f6705b.mo8189a(list3);
                                    cfi cfi2 = cfe2.f6667a;
                                    int i12 = cfe2.f6668b;
                                    Class<?> cls = a2.mo3842b().getClass();
                                    if (i12 != i9) {
                                        cdo c = cfi2.f6678a.mo3800c(cls);
                                        list2 = cfe2;
                                        try {
                                            cdo = c;
                                            cgj = c.mo3746a(cfi2.f6681d, a2, cfi2.f6685h, cfi2.f6686i);
                                        } catch (cgd e2) {
                                            e = e2;
                                            i2 = i10;
                                            list2 = list2;
                                            list.add(e);
                                            if (cgi3 != null) {
                                            }
                                        }
                                    } else {
                                        list2 = cfe2;
                                        cgj = a2;
                                        cdo = null;
                                    }
                                    if (!a2.equals(cgj)) {
                                        a2.mo3844d();
                                    }
                                    if (cfi2.f6678a.f6651c.f6425c.f6439d.mo8093a(cgj.mo3841a()) != null) {
                                        cdn = cfi2.f6678a.f6651c.f6425c.f6439d.mo8093a(cgj.mo3841a());
                                        if (cdn != null) {
                                            i6 = cdn.mo3745a();
                                        } else {
                                            throw new cbw(cgj.mo3841a());
                                        }
                                    } else {
                                        cdn = null;
                                        i6 = 3;
                                    }
                                    cfc cfc = cfi2.f6678a;
                                    cdg cdg2 = cfi2.f6692o;
                                    List c2 = cfc.mo3801c();
                                    i2 = i10;
                                    int size2 = c2.size();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= size2) {
                                            z2 = false;
                                            break;
                                        }
                                        int i14 = size2;
                                        if (((cjp) c2.get(i13)).f6948a.equals(cdg2)) {
                                            z2 = true;
                                            break;
                                        } else {
                                            i13++;
                                            size2 = i14;
                                        }
                                    }
                                    if (!cfi2.f6687j.mo3818a(!z2, i12, i6)) {
                                        cgi4 = cgj;
                                    } else if (cdn != null) {
                                        int i15 = i6 - 1;
                                        if (i6 != 0) {
                                            if (i15 == 0) {
                                                cdg = new cey(cfi2.f6692o, cfi2.f6682e);
                                            } else if (i15 != 1) {
                                                if (i6 != 1) {
                                                    str = i6 != 2 ? i6 != 3 ? "null" : "NONE" : "TRANSFORMED";
                                                } else {
                                                    str = "SOURCE";
                                                }
                                                StringBuilder sb = new StringBuilder(str.length() + 18);
                                                sb.append("Unknown strategy: ");
                                                sb.append(str);
                                                throw new IllegalArgumentException(sb.toString());
                                            } else {
                                                cdg = new cgl(cfi2.f6678a.mo3799b(), cfi2.f6692o, cfi2.f6682e, cfi2.f6685h, cfi2.f6686i, cdo, cls, cfi2.f6688k);
                                            }
                                            cgi a3 = cgi.m4182a(cgj);
                                            cff cff2 = cfi2.f6679b;
                                            cff2.f6669a = cdg;
                                            cff2.f6670b = cdn;
                                            cff2.f6671c = a3;
                                            cgi4 = a3;
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw new cbw(cgj.mo3842b().getClass());
                                    }
                                    cgi3 = cfj.f6704a.mo4032a(cgi4, cdk);
                                } catch (cgd e3) {
                                    e = e3;
                                    list2 = cfe2;
                                    i2 = i10;
                                    list2 = list2;
                                    list.add(e);
                                    if (cgi3 != null) {
                                    }
                                }
                            } catch (cgd e4) {
                                e = e4;
                                i2 = i10;
                                i5 = i;
                                i4 = size;
                                list2 = cfe;
                                i3 = i11;
                                list.add(e);
                                if (cgi3 != null) {
                                }
                            }
                            if (cgi3 != null) {
                                break;
                            }
                            i = i5 + 1;
                            i9 = 4;
                            cfe = list2;
                            size = i4;
                            i11 = i3;
                            i10 = i2;
                        }
                        if (cgi3 == null) {
                            b.f6787a.mo8189a(list);
                            a.mo3766b();
                            cgi = null;
                            cfi = this;
                            cgi2 = cgi3;
                        } else {
                            throw new cgd(b.f6789c, new ArrayList(list));
                        }
                    }
                    cdk = new cdk();
                    cdk.mo3741a(this.f6688k);
                    cdk.mo3740a(cme.f7050d, Boolean.valueOf(z));
                    a = this.f6681d.f6425c.f6440e.mo3767a(obj);
                    try {
                        int i102 = this.f6685h;
                        int i112 = this.f6686i;
                        cfe cfe3 = new cfe(this, i7);
                        list = (List) b.f6787a.mo8188a();
                        crb.m7382a((Object) list);
                        size = b.f6788b.size();
                        i = 0;
                        cgi3 = null;
                        while (i < size) {
                        }
                        if (cgi3 == null) {
                        }
                    } catch (Throwable th3) {
                        a.mo3766b();
                        throw th3;
                    }
                } finally {
                    cdt.mo3753b();
                }
            } else {
                cdt.mo3753b();
                cgi2 = null;
                cgi = null;
                cfi = this;
            }
        } catch (cgd e5) {
            cfi = this;
            cgi = null;
            e5.mo3852a(cfi.f6701x, cfi.f6677C, null);
            cfi.f6697t.add(e5);
            cgi2 = null;
        }
        if (cgi2 != null) {
            int i16 = cfi.f6677C;
            if (cgi2 instanceof cge) {
                ((cge) cgi2).mo3858e();
            }
            if (cfi.f6679b.mo3804a()) {
                cgi2 = cgi.m4182a(cgi2);
                cgi = cgi2;
            }
            m4119h();
            cfd cfd = cfi.f6689l;
            synchronized (cfd) {
                ((cfz) cfd).f6747f = cgi2;
                ((cfz) cfd).f6753l = i16;
            }
            synchronized (cfd) {
                ((cfz) cfd).f6743b.mo8190b();
                if (((cfz) cfd).f6752k) {
                    ((cfz) cfd).f6747f.mo3844d();
                    ((cfz) cfd).mo3839c();
                } else if (((cfz) cfd).f6742a.mo3828a()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                } else if (!((cfz) cfd).f6748g) {
                    ((cfz) cfd).f6751j = new cgb(((cfz) cfd).f6747f, ((cfz) cfd).f6745d, ((cfz) cfd).f6744c, ((cfz) cfd).f6754m);
                    ((cfz) cfd).f6748g = true;
                    cfy c3 = ((cfz) cfd).f6742a.mo3831c();
                    ((cfz) cfd).mo3834a(c3.mo3830b() + 1);
                    cdg cdg3 = ((cfz) cfd).f6744c;
                    cgb cgb = ((cfz) cfd).f6751j;
                    cfz cfz = (cfz) cfd;
                    cfz.f6755n.mo3823a(cfz, cdg3, cgb);
                    Iterator it = c3.iterator();
                    while (it.hasNext()) {
                        cfx cfx = (cfx) it.next();
                        cfx.f6740b.execute(new cfw(cfz, cfx.f6739a));
                    }
                    cfz.mo3833a();
                } else {
                    throw new IllegalStateException("Already have resource");
                }
            }
            cfi.f6676B = 5;
            try {
                if (cfi.f6679b.mo3804a()) {
                    cff = cfi.f6679b;
                    cfi.f6696s.mo3821a().mo3903a(cff.f6669a, new cez(cff.f6670b, cff.f6671c, cfi.f6688k));
                    cff.f6671c.mo3861e();
                }
                if (cgi != null) {
                    cgi.mo3861e();
                }
                if (cfi.f6680c.mo3805a()) {
                    mo3810a();
                }
            } catch (Throwable th4) {
                if (cgi != null) {
                    cgi.mo3861e();
                }
                throw th4;
            }
        } else {
            m4117f();
        }
    }

    /* renamed from: a */
    public final int mo3809a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return 4;
                }
                if (i2 == 3 || i2 == 5) {
                    return 6;
                }
                String a = cfh.m4114a(i);
                StringBuilder sb = new StringBuilder(a.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.f6687j.mo3819b()) {
                return mo3809a(3);
            } else {
                return 3;
            }
        } else if (!this.f6687j.mo3816a()) {
            return mo3809a(2);
        } else {
            return 2;
        }
    }

    /* renamed from: aQ */
    public final crm mo3811aQ() {
        return this.f6698u;
    }

    /* renamed from: c */
    public final void mo3794c() {
        this.f6695r = 2;
        this.f6689l.mo3803a(this);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cfi cfi = (cfi) obj;
        int d = m4115d() - cfi.m4115d();
        return d == 0 ? this.f6690m - cfi.f6690m : d;
    }

    public final void run() {
        String str;
        cdt cdt = this.f6703z;
        try {
            if (!this.f6694q) {
                int i = this.f6695r;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 == 0) {
                        this.f6676B = mo3809a(1);
                        this.f6693p = m4116e();
                        m4117f();
                    } else if (i2 == 1) {
                        m4117f();
                    } else if (i2 != 2) {
                        if (i != 1) {
                            str = i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE";
                        } else {
                            str = "INITIALIZE";
                        }
                        StringBuilder sb = new StringBuilder(str.length() + 25);
                        sb.append("Unrecognized run reason: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    } else {
                        m4120i();
                    }
                    if (cdt == null) {
                        return;
                    }
                } else {
                    throw null;
                }
            } else {
                m4118g();
                if (cdt == null) {
                    return;
                }
            }
            cdt.mo3753b();
        } catch (cew e) {
            throw e;
        } catch (Throwable th) {
            if (cdt != null) {
                cdt.mo3753b();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo3810a() {
        this.f6680c.mo3807c();
        cff cff = this.f6679b;
        cff.f6669a = null;
        cff.f6670b = null;
        cff.f6671c = null;
        cfc cfc = this.f6678a;
        cfc.f6651c = null;
        cfc.f6652d = null;
        cfc.f6661m = null;
        cfc.f6655g = null;
        cfc.f6658j = null;
        cfc.f6656h = null;
        cfc.f6662n = null;
        cfc.f6657i = null;
        cfc.f6663o = null;
        cfc.f6649a.clear();
        cfc.f6659k = false;
        cfc.f6650b.clear();
        cfc.f6660l = false;
        this.f6675A = false;
        this.f6681d = null;
        this.f6682e = null;
        this.f6688k = null;
        this.f6683f = null;
        this.f6684g = null;
        this.f6689l = null;
        this.f6676B = 0;
        this.f6693p = null;
        this.f6700w = null;
        this.f6692o = null;
        this.f6702y = null;
        this.f6677C = 0;
        this.f6703z = null;
        this.f6694q = false;
        this.f6697t.clear();
        this.f6699v.mo8189a(this);
    }

    /* renamed from: a */
    public final void mo3792a(cdg cdg, Exception exc, cdt cdt, int i) {
        cdt.mo3753b();
        cgd cgd = new cgd("Fetching data failed", Collections.singletonList(exc));
        cgd.mo3852a(cdg, i, cdt.mo3747a());
        this.f6697t.add(cgd);
        if (Thread.currentThread() != this.f6700w) {
            this.f6695r = 2;
            this.f6689l.mo3803a(this);
            return;
        }
        m4117f();
    }

    /* renamed from: a */
    public final void mo3793a(cdg cdg, Object obj, cdt cdt, int i, cdg cdg2) {
        this.f6692o = cdg;
        this.f6702y = obj;
        this.f6703z = cdt;
        this.f6677C = i;
        this.f6701x = cdg2;
        if (Thread.currentThread() != this.f6700w) {
            this.f6695r = 3;
            this.f6689l.mo3803a(this);
            return;
        }
        m4120i();
    }
}
