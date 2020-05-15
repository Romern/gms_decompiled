package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aplb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aplb implements aphv {

    /* renamed from: A */
    private final List f84653A = new ArrayList();

    /* renamed from: B */
    private final aecm f84654B = new aecm(apky.f84649a);

    /* renamed from: a */
    public final List f84655a = new ArrayList();

    /* renamed from: b */
    public final SparseArray f84656b = new SparseArray();

    /* renamed from: c */
    public final aphw f84657c;

    /* renamed from: d */
    public final apln f84658d;

    /* renamed from: e */
    public final asfb f84659e;

    /* renamed from: f */
    public final aabl f84660f;

    /* renamed from: g */
    public boolean f84661g = false;

    /* renamed from: h */
    public final apia f84662h;

    /* renamed from: i */
    public final apkg f84663i;

    /* renamed from: j */
    public final apku f84664j;

    /* renamed from: k */
    public final apku f84665k;

    /* renamed from: l */
    public final aphn f84666l;

    /* renamed from: m */
    private final Set f84667m = new HashSet();

    /* renamed from: n */
    private final aakq f84668n = new apla(this);

    /* renamed from: o */
    private final apib[] f84669o;

    /* renamed from: p */
    private final Context f84670p;

    /* renamed from: q */
    private final apje f84671q;

    /* renamed from: r */
    private final ExecutorService f84672r;

    /* renamed from: s */
    private long f84673s;

    /* renamed from: t */
    private boolean f84674t = false;

    /* renamed from: u */
    private final apkq f84675u;

    /* renamed from: v */
    private final apli f84676v;

    /* renamed from: w */
    private final aamf f84677w;

    /* renamed from: x */
    private final Looper f84678x;

    /* renamed from: y */
    private Handler f84679y;

    /* renamed from: z */
    private final apij f84680z = new apkx(this);

    public aplb(Context context, apje apje, apkq apkq, apln apln, ExecutorService executorService, Looper looper, apib[] apibArr, aamf aamf, aphw aphw, apia apia, apli apli, apkg apkg) {
        apkm apkm = new apkm(aamf);
        aphn aphn = new aphn(context);
        apku apku = new apku(apkm, 2, apkg, aphn);
        apku apku2 = new apku(apkm, 1, apkg, aphn);
        this.f84670p = context;
        this.f84671q = apje;
        this.f84675u = apkq;
        this.f84658d = apln;
        this.f84669o = apibArr;
        this.f84672r = executorService;
        this.f84678x = looper;
        this.f84677w = aamf;
        this.f84657c = aphw;
        this.f84662h = apia;
        this.f84676v = apli;
        this.f84663i = apkg;
        this.f84666l = aphn;
        this.f84665k = apku;
        this.f84664j = apku2;
        this.f84659e = new asfb(context, 1, "*gms_scheduler*:internal", "scheduler", "com.google.android.gms", "GCM");
        if (cdob.m134415b()) {
            this.f84660f = new aabl(getClass(), 16, "StandaloneSchedulingEngine", "scheduler");
        } else {
            this.f84660f = new aabl(getClass(), 16, "scheduler");
        }
    }

    /* renamed from: a */
    private static final int m70573a(Map map) {
        int i = 0;
        for (apid apid : map.keySet()) {
            if (apid.mo47278o()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    private final void m70577b(apid apid, apid apid2, int i) {
        synchronized (this.f84655a) {
            apib[] apibArr = this.f84669o;
            int length = apibArr.length;
            apibArr[0].mo47257a(apid, apid2, i);
        }
    }

    /* renamed from: c */
    private final int m70578c(apid apid) {
        int i;
        aeco a = apid.mo47273j().mo17015a();
        synchronized (this.f84655a) {
            i = 0;
            for (apid apid2 : this.f84655a) {
                if (a.mo6527a(apid2.mo47281r())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    private final apkr m70579e() {
        synchronized (this.f84655a) {
            apib[] apibArr = this.f84669o;
            int length = apibArr.length;
            apib apib = apibArr[0];
            if (!(apib instanceof apkr)) {
                return null;
            }
            apkr apkr = (apkr) apib;
            return apkr;
        }
    }

    /* renamed from: b */
    public final aakq mo47233b() {
        return this.f84668n;
    }

    /* renamed from: d */
    public final aapu mo47386d() {
        bxvd da = aapu.f28835d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapu aapu = (aapu) da.f164949b;
        aapu.f28838b = 2;
        aapu.f28837a |= 1;
        bxun a = bxzr.m124575a(SystemClock.elapsedRealtime() - this.f84673s);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapu aapu2 = (aapu) da.f164949b;
        a.getClass();
        aapu2.f28839c = a;
        aapu2.f28837a |= 2;
        return (aapu) da.mo74062i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0155, code lost:
        return;
     */
    /* renamed from: a */
    private final void m70574a(apid apid, int i) {
        bmxv c;
        bmxv b;
        synchronized (this.f84655a) {
            synchronized (this.f84655a) {
                mo47383b((int) apid.f84431a.f28809e);
                c = bmxv.m108567c((apik) ((Map) this.f84656b.get((int) apid.f84431a.f28809e)).get(apid));
            }
            bmxv bmxv = bmvz.f131120a;
            int i2 = 2;
            if (c.mo66813a()) {
                apik apik = (apik) c.mo66814b();
                if (apid.mo47278o()) {
                    if (apik.f84466h.f62983a && apid.mo47275l() >= 18000000) {
                        synchronized (this.f84667m) {
                            if (((long) this.f84667m.size()) >= cdnj.f181319a.mo6606a().mo77979B()) {
                                Log.e("NetworkScheduler", "Too many postponed requests - dropping this one");
                            } else {
                                this.f84667m.add(apid);
                            }
                        }
                        return;
                    }
                }
                apik apik2 = (apik) c.mo66814b();
                synchronized (this.f84655a) {
                    ((Map) this.f84656b.get((int) apik2.f84459a.f84431a.f28809e)).remove(apik2.f84459a);
                    this.f84671q.mo47341a(apik2, 1);
                    b = bmxv.m108566b(apik2.f84459a);
                }
                bmxv = b;
                i2 = 4;
            } else {
                int indexOf = this.f84655a.indexOf(apid);
                if (indexOf != -1) {
                    bmxv = bmxv.m108566b((apid) this.f84655a.get(indexOf));
                    if (i == 0) {
                        return;
                    }
                    if (i == 2) {
                        if (apid.f84444n.equals(((apid) ((bmyg) bmxv).f131198a).f84444n)) {
                            return;
                        }
                    }
                } else {
                    i2 = 1;
                }
            }
            mo47382a(apid, (apid) bmxv.mo66815c(), i2);
            this.f84663i.mo47361a(this.f84655a);
            if (apid.f84433c) {
                boolean z = false;
                if (i2 != 4 && bmxv.mo66813a()) {
                    apid apid2 = (apid) bmxv.mo66814b();
                    if (!apid.f84432b.equals(apid2.f84432b) || !apid.f84443m.equals(apid2.f84443m)) {
                        z = true;
                    }
                }
                if (i2 != 1) {
                    if (!z) {
                        String valueOf = String.valueOf(apid);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 96);
                        sb.append("Immediate task was not started ");
                        sb.append(valueOf);
                        sb.append(". Rescheduling immediate tasks can cause excessive battery drain.");
                        Log.w("NetworkScheduler", sb.toString());
                    }
                }
                bljb a = blkh.m107281a("trigger_CLIENT_LIB");
                try {
                    mo47228a(aapx.CLIENT_LIB);
                    if (a != null) {
                        a.close();
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo47383b(int i) {
        synchronized (this.f84655a) {
            if (this.f84656b.get(i) == null) {
                this.f84656b.put(i, new C1223np((int) ceea.m136358b()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r1 = (p000.apid) r0.next();
        m70574a(r1, r1.f84444n.f63116i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = r1.listIterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0.hasNext() == false) goto L_0x002f;
     */
    /* renamed from: c */
    public final void mo47385c() {
        synchronized (this.f84667m) {
            if (!this.f84667m.isEmpty()) {
                bngx a = bngx.m109368a((Collection) this.f84667m);
                this.f84667m.clear();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [aapx, java.lang.Long]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: b */
    public final void mo47234b(aapx aapx) {
        sgf sgf;
        sgf sgf2;
        apli apli = this.f84676v;
        if (aapx != aapx.EXECUTION_CALLBACK) {
            bmzi a = bmzn.m108681a(aple.f84686a);
            synchronized (apli.f84691a) {
                int ordinal = aapx.ordinal();
                if (ordinal == 1) {
                    a = bmzn.m108681a(aplf.f84687a);
                } else if (ordinal == 2) {
                    a = bmzn.m108681a(aplg.f84688a);
                } else if (ordinal == 3) {
                    a = bmzn.m108681a(aplh.f84689a);
                }
                if (aapx != aapx.GOOGLE_HTTP_CLIENT) {
                    if (!(aapx == aapx.CLOUD_MESSAGE_SENT || aapx == aapx.CLOUD_MESSAGE_RECEIVED)) {
                        apli.f84691a.remove(aapx);
                        sgf = sgf.f44164a;
                    }
                }
                if (!apli.f84691a.containsKey(aapx) || !((String) ((Pair) apli.f84691a.get(aapx)).first).equals(a.mo6606a())) {
                    Map map = apli.f84691a;
                    String str = (String) a.mo6606a();
                    String str2 = (String) a.mo6606a();
                    List c = bmyx.m108640a(',').mo66920b().mo66925c((CharSequence) str2);
                    if (c.size() != 3) {
                        String valueOf = String.valueOf(str2);
                        Log.e("NetworkScheduler.Wakeup", valueOf.length() == 0 ? new String("Flag does not have three values: ") : "Flag does not have three values: ".concat(valueOf));
                        sgf2 = sgf.f44164a;
                    } else {
                        try {
                            int i = apli.f84690c;
                            sgf2 = new sgf(Integer.parseInt((String) c.get(0)), Integer.parseInt((String) c.get(1)), Integer.parseInt((String) c.get(2)));
                        } catch (NumberFormatException e) {
                            String valueOf2 = String.valueOf(str2);
                            Log.e("NetworkScheduler.Wakeup", valueOf2.length() == 0 ? new String("Flag does not have correct format: ") : "Flag does not have correct format: ".concat(valueOf2));
                            sgf2 = sgf.f44164a;
                        }
                    }
                    map.put(aapx, Pair.create(str, sgf2));
                }
                sgf = (sgf) ((Pair) apli.f84691a.get(aapx)).second;
            }
            if (sgf.mo25492a()) {
                synchronized (apli.f84692b) {
                    apli.f84692b.put((Enum) aapx, (Object) Long.valueOf(SystemClock.elapsedRealtime()));
                }
            } else {
                apia apia = this.f84662h;
                aapu d = mo47386d();
                bxvd da = aapz.f28865f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aapz aapz = (aapz) da.f164949b;
                aapz.f28868b = aapx.f28863p;
                int i2 = aapz.f28867a | 1;
                aapz.f28867a = i2;
                aapz.f28871e = 3;
                aapz.f28867a = i2 | 8;
                apia.mo47244a(d, (aapz) da.mo74062i());
                return;
            }
        }
        if (!ceea.f182428a.mo6606a().mo78919d()) {
            synchronized (this.f84655a) {
                aphl a2 = aphm.m70301a(this.f84670p);
                for (int i3 = 0; i3 < this.f84656b.size(); i3++) {
                    int keyAt = this.f84656b.keyAt(i3);
                    if (aajg.m21345d(keyAt)) {
                        Map map2 = (Map) this.f84656b.get(keyAt);
                        if (map2.size() >= a2.f84387a) {
                            if (a2.f84388b <= 0) {
                                continue;
                            } else if (m70573a(map2) >= a2.f84388b) {
                            }
                        }
                    }
                }
                return;
            }
        }
        if (this.f84676v.mo47394e() > SystemClock.elapsedRealtime()) {
            apia apia2 = this.f84662h;
            aapu d2 = mo47386d();
            bxvd da2 = aapz.f28865f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aapz aapz2 = (aapz) da2.f164949b;
            aapz2.f28868b = aapx.f28863p;
            int i4 = aapz2.f28867a | 1;
            aapz2.f28867a = i4;
            aapz2.f28871e = 5;
            int i5 = i4 | 8;
            aapz2.f28867a = i5;
            aapz2.f28867a = i5 | 4;
            aapz2.f28870d = 0;
            apia2.mo47244a(d2, (aapz) da2.mo74062i());
            return;
        }
        this.f84679y.removeMessages(0);
        Message obtain = Message.obtain(this.f84679y, 0);
        obtain.arg1 = aapx.f28863p;
        obtain.sendToTarget();
    }

    /* renamed from: c */
    public final void mo47236c(aapx aapx) {
        this.f84679y.removeMessages(2);
        Message.obtain(this.f84679y, 2, aapx.f28863p, 0).sendToTarget();
    }

    /* renamed from: a */
    private final void m70575a(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f84655a) {
            long currentTimeMillis = System.currentTimeMillis() - (cedr.m136298f() * 1000);
            for (int i = 0; i < this.f84656b.size(); i++) {
                Iterator it = ((Map) this.f84656b.valueAt(i)).values().iterator();
                while (it.hasNext()) {
                    apik apik = (apik) it.next();
                    if (apik.f84459a.f84437g <= currentTimeMillis) {
                        if (cdnj.f181319a.mo6606a().mo78007k()) {
                            if (apik.f84459a.f84441k) {
                                it.remove();
                            }
                        }
                        this.f84671q.mo47341a(apik, 3);
                        it.remove();
                        arrayList.add(apik);
                    }
                }
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            apik apik2 = (apik) arrayList.get(i2);
            apid apid = apik2.f84459a;
            if (apid.mo47278o() && z && this.f84654B.mo6527a(apid.mo47281r())) {
                apid apid2 = apik2.f84459a;
                if (apid2.f84445o == 1) {
                    m70574a(aphw.m70332b(apid2), 1);
                } else {
                    synchronized (this.f84655a) {
                        this.f84655a.remove(apik2.f84459a);
                        if (cdnj.m134209e()) {
                            this.f84676v.mo47388a(apik2.f84459a);
                        }
                        mo47384b(apik2.f84459a);
                    }
                }
            } else {
                m70574a(aphw.m70333c(apik2.f84459a), 0);
            }
            this.f84662h.mo47246a(apik2.f84459a, 3);
            this.f84662h.mo47245a(mo47386d(), apik2, 5);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aplb.a(boolean, aeco):void
     arg types: [int, aeco]
     candidates:
      aplb.a(apid, int):void
      aplb.a(apku, aapx):int
      aplb.a(int, apik):void
      aplb.a(java.io.PrintWriter, java.lang.String[]):void
      aphv.a(java.io.PrintWriter, java.lang.String[]):void
      aplb.a(boolean, aeco):void */
    /* renamed from: b */
    public final void mo47235b(aeco aeco) {
        m70576a(true, aeco);
    }

    /* renamed from: b */
    public final void mo47384b(apid apid) {
        synchronized (this.f84655a) {
            apib[] apibArr = this.f84669o;
            int length = apibArr.length;
            apibArr[0].mo47256a(apid);
        }
        this.f84658d.mo47398a(apid);
    }

    /* renamed from: a */
    private final void m70576a(boolean z, aeco aeco) {
        String str;
        bljb a;
        if (!z) {
            str = "nts:standalone:cancel";
        } else {
            str = "nts:standalone:cancelAll";
        }
        if (aeco != null) {
            aech aech = new aech(str);
            try {
                bljb a2 = blkh.m107281a("scheduler_cancel");
                try {
                    synchronized (this.f84655a) {
                        Iterator it = this.f84655a.iterator();
                        boolean z2 = false;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            apid apid = (apid) it.next();
                            if (aeco.mo6527a(apid.mo47281r())) {
                                it.remove();
                                if (cdnj.m134209e()) {
                                    this.f84676v.mo47388a(apid);
                                }
                                mo47384b(apid);
                                z2 = true;
                                if (!z) {
                                    break;
                                }
                            }
                        }
                        Map map = (Map) this.f84656b.get(aeco.f63159a);
                        if (map != null) {
                            for (apik apik : map.values()) {
                                if (aeco.mo6527a(apik.f84459a.mo47281r())) {
                                    apik.f84459a.f84441k = true;
                                    this.f84671q.mo47341a(apik, 2);
                                    if (!z) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (z2) {
                            this.f84663i.mo47361a(this.f84655a);
                        }
                    }
                    if (this.f84676v.mo47392c()) {
                        a = blkh.m107281a("trigger_CLIENT_LIB");
                        mo47228a(aapx.CLIENT_LIB);
                        if (a != null) {
                            a.close();
                        }
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    aech.close();
                    return;
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    aech.close();
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
                throw th2;
            }
        } else {
            return;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47380a(apku apku, aapx aapx) {
        int i;
        int i2;
        long j;
        long j2;
        apid apid;
        apku apku2 = apku;
        aapx aapx2 = aapx;
        synchronized (this.f84655a) {
            bljb a = blkh.m107281a("checkActiveTasksTimeout");
            try {
                int i3 = 1;
                if (cdnj.f181319a.mo6606a().mo77986I()) {
                    synchronized (this.f84655a) {
                        m70575a(true);
                    }
                } else {
                    m70575a(false);
                }
                if (a != null) {
                    a.close();
                }
                mo47385c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int a2 = apku2.mo47375a(this.f84670p);
                Collections.sort(this.f84655a, apku2);
                this.f84676v.mo47387a();
                Iterator it = this.f84655a.iterator();
                i = 0;
                while (it.hasNext()) {
                    apid apid2 = (apid) it.next();
                    apid2.f84442l = 2;
                    if (aapx2 != aapx.INVOKE_ALL) {
                        i2 = apku2.mo47376a(apid2);
                    } else {
                        i2 = 1;
                    }
                    if (i2 == 0) {
                        apid = apid2;
                        j2 = elapsedRealtime;
                        int i4 = apid.f84442l;
                        if (i4 == 8) {
                            this.f84661g = true;
                            j = j2;
                        } else {
                            if (i4 == 3) {
                                j = j2;
                            } else if (i4 == 7) {
                                j = j2;
                            } else if (i4 == 10 || i4 == 12 || i4 == 5 || i4 == 11 || i4 == 13 || i4 == 15 || i4 == 16) {
                                j = j2;
                            }
                            this.f84675u.mo47371a(this.f84670p, i4);
                        }
                        apku2 = apku;
                        elapsedRealtime = j;
                        i3 = 1;
                    } else if (i2 != i3) {
                        it.remove();
                        mo47384b(apid2);
                        j = elapsedRealtime;
                        apku2 = apku;
                        elapsedRealtime = j;
                        i3 = 1;
                    } else {
                        aphl a3 = aphm.m70301a(this.f84670p);
                        synchronized (this.f84655a) {
                            mo47383b((int) apid2.f84431a.f28809e);
                            Map map = (Map) this.f84656b.get((int) apid2.f84431a.f28809e);
                            if (map.get(apid2) == null) {
                                if (map.size() >= a3.f84387a) {
                                    if (apid2.mo47278o()) {
                                        if (a3.f84388b > 0 && m70573a(map) < a3.f84388b) {
                                        }
                                    }
                                    apid2.f84442l = 4;
                                    apid = apid2;
                                    j2 = elapsedRealtime;
                                }
                                PackageManager c = this.f84677w.mo17013c((int) apid2.f84431a.f28809e);
                                if (c != null) {
                                    apid = apid2;
                                    apik apik = r10;
                                    j2 = elapsedRealtime;
                                    apik apik2 = new apik(apid2, this.f84670p, this.f84680z, this.f84672r, c, this.f84662h, apik.m70394a(), aapx, a2);
                                    apid.f84437g = System.currentTimeMillis();
                                    synchronized (this.f84655a) {
                                        mo47383b((int) apid.f84431a.f28809e);
                                        ((Map) this.f84656b.get((int) apid.f84431a.f28809e)).put(apid, apik);
                                    }
                                    aucb a4 = this.f84671q.mo47340a(this.f84670p, apik);
                                    aphm aphm = apht.m70315a().f84401a;
                                    if (aphm != null) {
                                        a4.mo50378a(aphm.f84391b, new apkv(this, apik, aapx2));
                                        it.remove();
                                        i++;
                                        apku2 = apku;
                                        elapsedRealtime = j2;
                                        i3 = 1;
                                    }
                                } else {
                                    apid = apid2;
                                    j2 = elapsedRealtime;
                                    apid.f84442l = 14;
                                }
                            } else {
                                apid = apid2;
                                j2 = elapsedRealtime;
                                apid.f84442l = 6;
                            }
                        }
                    }
                    j = j2;
                    this.f84676v.mo47390a(j, apid);
                    apku2 = apku;
                    elapsedRealtime = j;
                    i3 = 1;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable th3) {
                        bqye.m113761a(th2, th3);
                    }
                }
                throw th2;
            }
        }
        this.f84676v.mo47393d();
        this.f84662h.mo47253b(aapx2);
        return i;
    }

    /* renamed from: a */
    public final void mo47226a() {
        ArrayList<apid> arrayList;
        blji b = this.f84660f.mo16696b("init");
        try {
            synchronized (this.f84655a) {
                if (!this.f84674t) {
                    this.f84673s = SystemClock.elapsedRealtime();
                    aech aech = new aech("nts:standalone:init");
                    try {
                        adzt adzt = new adzt(this.f84678x);
                        apib[] apibArr = this.f84669o;
                        int length = apibArr.length;
                        apibArr[0].mo47255a(adzt);
                        this.f84679y = new apkw(this.f84678x, this.f84659e, this);
                        arrayList = new ArrayList();
                        arrayList.addAll(this.f84658d.mo47402c());
                    } catch (aplo e) {
                        if (cdnj.f181319a.mo6606a().mo77997a()) {
                            Log.e("NetworkScheduler", null, e);
                            if (cdnj.m134206b()) {
                                this.f84653A.add(e.f84705a);
                            }
                        } else {
                            throw e.f84705a;
                        }
                    } catch (Throwable th) {
                        try {
                            aech.close();
                        } catch (Throwable th2) {
                            bqye.m113761a(th, th2);
                        }
                        throw th;
                    }
                    ArrayList<apid> arrayList2 = new ArrayList();
                    for (apid apid : arrayList) {
                        if (!this.f84657c.mo47239a(apid, m70578c(apid))) {
                            arrayList2.add(apid);
                        }
                    }
                    for (apid apid2 : arrayList2) {
                        this.f84658d.mo47398a(apid2);
                    }
                    arrayList.removeAll(arrayList2);
                    int size = arrayList2.size();
                    for (apid apid3 : arrayList) {
                        m70577b(apid3, null, 1);
                    }
                    this.f84655a.addAll(arrayList);
                    this.f84663i.mo47361a(this.f84655a);
                    aape e2 = this.f84658d.mo47404e();
                    List a = apka.m70507a(this.f84655a);
                    bxun a2 = bxzr.m124575a(SystemClock.elapsedRealtime() - this.f84673s);
                    apia apia = this.f84662h;
                    aapu d = mo47386d();
                    bxvd da = aapk.f28782g.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aapk aapk = (aapk) da.f164949b;
                    e2.getClass();
                    aapk.f28789f = e2;
                    int i = aapk.f28784a | 8;
                    aapk.f28784a = i;
                    int i2 = i | 2;
                    aapk.f28784a = i2;
                    aapk.f28786c = (long) size;
                    a2.getClass();
                    aapk.f28785b = a2;
                    aapk.f28784a = i2 | 1;
                    da.mo73945H(a);
                    apia.mo47243a(d, (aapk) da.mo74062i());
                    this.f84674t = true;
                    aech.close();
                }
            }
            if (b != null) {
                b.close();
            }
        } catch (Throwable th3) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th4) {
                    bqye.m113761a(th3, th4);
                }
            }
            throw th3;
        }
    }

    /* renamed from: a */
    public final void mo47227a(int i) {
        apkr e = m70579e();
        if (e != null) {
            e.mo47373a(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1.remove(r7.f84459a) == null) goto L_0x001a;
     */
    /* renamed from: a */
    public final void mo47381a(int i, apik apik) {
        synchronized (this.f84655a) {
            Map map = (Map) this.f84656b.get(apik.mo47305k());
            if (map == null) {
            }
            String valueOf = String.valueOf(apik);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("No record of active task ");
            sb.append(valueOf);
            Log.w("NetworkScheduler", sb.toString());
        }
        if (apje.m70446a(i)) {
            apid c = aphw.m70333c(apik.f84459a);
            c.f84442l = 2;
            synchronized (this.f84655a) {
                this.f84655a.add(c);
            }
            return;
        }
        mo47384b(apik.f84459a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [aapx, java.lang.Long]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r0 = r10.f84662h;
        r1 = mo47386d();
        r3 = p000.aapz.f28865f.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (r3.f164950c != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r4 = (p000.aapz) r3.f164949b;
        r4.f28868b = r11.f28863p;
        r11 = r4.f28867a | 1;
        r4.f28867a = r11;
        r4.f28871e = 4;
        r4.f28867a = r11 | 8;
        r0.mo47244a(r1, (p000.aapz) r3.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo47228a(aapx aapx) {
        apli apli = this.f84676v;
        if (ceea.f182428a.mo6606a().mo78920e()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (apli.f84692b) {
                Long l = (Long) apli.f84692b.get(aapx);
                long millis = TimeUnit.SECONDS.toMillis(ceea.f182428a.mo6606a().mo78928m());
                if (l != null) {
                    if (elapsedRealtime < l.longValue() + millis) {
                    }
                }
                apli.f84692b.put((Enum) aapx, (Object) Long.valueOf(elapsedRealtime));
            }
        }
        this.f84679y.removeMessages(1);
        Message obtain = Message.obtain(this.f84679y, 1);
        obtain.arg1 = aapx.f28863p;
        obtain.sendToTarget();
    }

    /* renamed from: a */
    public final void mo47229a(aeab aeab, Uri uri, int i) {
        apkr e = m70579e();
        if (e != null && aeab != null) {
            e.mo47374a(aeab, uri, i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aplb.a(boolean, aeco):void
     arg types: [int, aeco]
     candidates:
      aplb.a(apid, int):void
      aplb.a(apku, aapx):int
      aplb.a(int, apik):void
      aplb.a(java.io.PrintWriter, java.lang.String[]):void
      aphv.a(java.io.PrintWriter, java.lang.String[]):void
      aplb.a(boolean, aeco):void */
    /* renamed from: a */
    public final void mo47230a(aeco aeco) {
        m70576a(false, aeco);
    }

    /* renamed from: a */
    public final void mo47231a(apid apid) {
        bljb a;
        String valueOf = String.valueOf(apid.mo47266e());
        aech aech = new aech(valueOf.length() == 0 ? new String("nts:standalone:schedule:") : "nts:standalone:schedule:".concat(valueOf));
        try {
            a = blkh.m107281a("schedule");
            if (this.f84657c.mo47239a(apid, m70578c(apid))) {
                this.f84657c.mo47238a(apid);
                m70574a(apid, apid.f84444n.f63116i);
                if (a != null) {
                    a.close();
                }
            } else if (a != null) {
                a.close();
            }
            aech.close();
            return;
        } catch (Throwable th) {
            try {
                aech.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo47382a(apid apid, apid apid2, int i) {
        synchronized (this.f84655a) {
            if (apid2 != null) {
                this.f84655a.remove(apid2);
                if (cdnj.m134209e()) {
                    this.f84676v.mo47388a(apid2);
                }
            }
            apid.f84442l = 2;
            this.f84655a.add(apid);
            m70577b(apid, apid2, i);
            this.f84658d.mo47399a(apid, apid2);
            if (this.f84676v.mo47390a(SystemClock.elapsedRealtime(), apid)) {
                this.f84676v.mo47393d();
            }
        }
    }

    /* renamed from: a */
    public final void mo47232a(PrintWriter printWriter, String[] strArr) {
        printWriter.println();
        if (cdnj.m134206b()) {
            printWriter.println("Previous initialization errors:");
            List list = this.f84653A;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bqye.m113760a((Throwable) list.get(i), printWriter);
                printWriter.println();
            }
        }
        printWriter.println("Global GmsTaskScheduler stats:");
        synchronized (this.f84655a) {
            this.f84676v.mo47389a(printWriter);
            printWriter.println("\nActive tasks:");
            synchronized (this.f84655a) {
                boolean z = false;
                for (int i2 = 0; i2 < this.f84656b.size(); i2++) {
                    for (apik apik : ((Map) this.f84656b.valueAt(i2)).values()) {
                        apik.mo47294a(printWriter);
                        z = true;
                    }
                }
                if (!z) {
                    printWriter.println("   none.");
                }
            }
            printWriter.println();
            this.f84675u.mo47372a(printWriter);
        }
        synchronized (this.f84655a) {
            this.f84663i.mo47360a(printWriter);
            aphw.m70331a(printWriter, strArr, Collections.unmodifiableList(this.f84655a), this.f84662h);
        }
    }
}
