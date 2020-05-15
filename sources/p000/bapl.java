package p000;

import android.accounts.Account;
import android.os.SystemClock;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: bapl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bapl implements Closeable, baqf {

    /* renamed from: a */
    public final cayo f101499a;

    /* renamed from: b */
    public final bamc f101500b;

    /* renamed from: c */
    public final baok f101501c;

    /* renamed from: d */
    public final Map f101502d;

    /* renamed from: e */
    public final Map f101503e;

    /* renamed from: f */
    public final cayo f101504f;

    /* renamed from: g */
    public final barw f101505g;

    /* renamed from: h */
    public final cayo f101506h;

    /* renamed from: i */
    public final cayo f101507i;

    /* renamed from: j */
    public final Object f101508j = new Object();

    /* renamed from: k */
    public final Map f101509k = new HashMap();

    /* renamed from: l */
    public boolean f101510l;

    /* renamed from: m */
    public long f101511m;

    /* renamed from: n */
    public final babr f101512n;

    /* renamed from: o */
    public final baqv f101513o;

    /* renamed from: p */
    private final baqb f101514p;

    /* renamed from: q */
    private final cayo f101515q;

    /* renamed from: r */
    private final Map f101516r;

    /* renamed from: s */
    private final barb f101517s;

    /* renamed from: t */
    private final acbs f101518t;

    public bapl(acbs acbs, cayo cayo, baqv baqv, baqb baqb, bamc bamc, cayo cayo2, Map map, Map map2, Map map3, baok baok, barb barb, cayo cayo3, barw barw, cayo cayo4, cayo cayo5, babr babr) {
        this.f101518t = acbs;
        this.f101499a = cayo;
        this.f101513o = baqv;
        this.f101514p = baqb;
        this.f101500b = bamc;
        this.f101501c = baok;
        this.f101516r = map;
        this.f101515q = cayo2;
        this.f101502d = map2;
        this.f101503e = map3;
        this.f101517s = barb;
        this.f101504f = cayo3;
        this.f101505g = barw;
        this.f101506h = cayo4;
        this.f101507i = cayo5;
        this.f101512n = babr;
        m87337b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (p000.ceon.f183153a.mo79492b().mo79493a() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        throw new p000.banv("Missing channel config");
     */
    /* renamed from: a */
    private final bapk m87336a(babm babm) {
        bygv bygv;
        bapk bapk = (bapk) this.f101509k.get(babm);
        if (bapk != null) {
            return bapk;
        }
        baqc a = this.f101514p.mo55845a(babm.mo55557a(), babm.mo55558b());
        try {
            baqk baqk = (baqk) this.f101516r.get(bygy.m124802a(babm.mo55558b().f166412a));
            bygz b = babm.mo55558b();
            if (!this.f101512n.mo32691m()) {
                if (!this.f101512n.mo32692n()) {
                    bygv = null;
                    bapk bapk2 = new bapk(this, a, baqk, bygv, babm.mo55558b(), babm.mo55557a(), (long) ((Integer) this.f101517s.mo32621a()).intValue());
                    this.f101509k.put(babm, bapk2);
                    return bapk2;
                }
            }
            if (((bqgg) this.f101515q.mo16713a()).isDone()) {
                try {
                    Iterator it = ((bygw) ((bqgg) this.f101515q.mo16713a()).get()).f166400a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        bygv bygv2 = (bygv) it.next();
                        bygz bygz = bygv2.f166392c;
                        if (bygz == null) {
                            bygz = bygz.f166410c;
                        }
                        if (bygz.equals(b)) {
                            bygv = bygv2;
                            break;
                        }
                    }
                    bapk bapk22 = new bapk(this, a, baqk, bygv, babm.mo55558b(), babm.mo55557a(), (long) ((Integer) this.f101517s.mo32621a()).intValue());
                    this.f101509k.put(babm, bapk22);
                    return bapk22;
                } catch (ExecutionException e) {
                    e = e;
                    throw new banv("Failed to access channel config", e);
                } catch (InterruptedException e2) {
                    e = e2;
                    throw new banv("Failed to access channel config", e);
                }
            } else {
                throw new banv("Channel config not available.");
            }
        } catch (IOException e3) {
            try {
                a.close();
            } catch (IOException e4) {
                ((achw) this.f101499a.mo16713a()).mo25418e("Failure cleaning up MdhSyncStateStorage after ChannelSync creation failed", new Object[0]);
            }
            throw banv.m87235a(e3);
        }
    }

    /* renamed from: b */
    private final void m87337b() {
        this.f101510l = false;
    }

    /* renamed from: c */
    public final bapk mo55879c(bygz bygz, Account account) {
        return m87336a(babm.m86492a(account, bygz));
    }

    public final void close() {
        synchronized (this.f101508j) {
            for (Map.Entry entry : this.f101509k.entrySet()) {
                ((bapk) entry.getValue()).close();
            }
            this.f101509k.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc A[Catch:{ banv -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fd A[Catch:{ banv -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0117 A[Catch:{ banv -> 0x0136 }] */
    /* renamed from: b */
    public final void mo55877b(String str, bygz bygz, Account account) {
        Integer num;
        boolean z;
        int i;
        long j;
        String str2 = str;
        synchronized (this.f101508j) {
            bapk c = mo55879c(bygz, account);
            baog a = c.mo55858a(str2);
            if (a != null) {
                baqg a2 = baqg.m87393a(a.mo55817d());
                boolean a3 = ((babo) c.f101495k.f101503e.get(bygy.m124802a(c.f101487c.f166412a))).mo55562a(c.f101487c, c.f101488d);
                Integer valueOf = Integer.valueOf((int) c.f101495k.f101512n.mo32688j());
                byjh byjh = a2.f101554a;
                num = baqg.m87395a(byjh, byjh.f166654d, a3, valueOf);
            } else {
                ((bads) c.f101495k.f101504f.mo16713a()).mo32744a(10015, baqz.m87422a(c.f101487c));
                num = Integer.valueOf((int) c.f101495k.f101512n.mo32688j());
            }
            if (num != null) {
                if (c.f101495k.f101512n.mo32691m()) {
                    bygv bygv = c.f101489e;
                    if (bygv != null) {
                        byjl byjl = bapk.m87324a(bygv, str2).f166372d;
                        if (byjl == null) {
                            byjl = byjl.f166668e;
                        }
                        byjk byjk = byjl.f166671b;
                        if (byjk == null) {
                            byjk = byjk.f166662e;
                        }
                        if (c.f101495k.f101512n.mo32681c()) {
                            if (a != null) {
                                byjk = baqs.m87414a(byjk, a.mo55817d());
                            }
                        }
                        int b = bapk.m87325b(byjk);
                        boolean z2 = byjk.f166665b;
                        i = b;
                        z = z2;
                        j = Math.max(((long) num.intValue()) * 1000, bapk.m87322a(byjk));
                        double d = (double) j;
                        babr babr = c.f101495k.f101512n;
                        double doubleValue = ((Double) abzv.f59028o.mo58455c()).doubleValue();
                        Double.isNaN(d);
                        long j2 = (long) (d * doubleValue);
                        long max = Math.max(j, 1000 + j2);
                        if (!c.f101495k.f101512n.mo32682d()) {
                            c.mo55864a(bqao.SYNC_TRIGGER_WRITE);
                        }
                        babr babr2 = c.f101495k.f101512n;
                        boolean booleanValue = ((Boolean) abzv.f59031r.mo58455c()).booleanValue();
                        if (c.f101496l != 4) {
                            baqa baqa = c.f101490f;
                            bapz d2 = baqa.mo55841d();
                            d2.mo55884b(baqa.mo55839b() + 1);
                            c.f101490f = d2.mo55881a();
                            try {
                                c.f101485a.mo55850a(c.f101490f);
                            } catch (banv e) {
                                ((achw) c.f101495k.f101499a.mo16713a()).mo25418e("Storing channel state failed", new Object[0]);
                            }
                        }
                        c.mo55865a(booleanValue, j2, max, i, z);
                    }
                }
                int a4 = c.f101495k.mo55869a();
                j = ((long) num.intValue()) * 1000;
                z = false;
                i = a4;
                double d3 = (double) j;
                babr babr3 = c.f101495k.f101512n;
                double doubleValue2 = ((Double) abzv.f59028o.mo58455c()).doubleValue();
                Double.isNaN(d3);
                long j22 = (long) (d3 * doubleValue2);
                long max2 = Math.max(j, 1000 + j22);
                if (!c.f101495k.f101512n.mo32682d()) {
                }
                babr babr22 = c.f101495k.f101512n;
                boolean booleanValue2 = ((Boolean) abzv.f59031r.mo58455c()).booleanValue();
                if (c.f101496l != 4) {
                }
                c.mo55865a(booleanValue2, j22, max2, i, z);
            }
        }
    }

    /* renamed from: a */
    public final int mo55869a() {
        return this.f101512n.mo32685g() ? 1 : 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d7 A[Catch:{ Exception -> 0x0358 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02e5 A[Catch:{ Exception -> 0x0358 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0384 A[Catch:{ banv -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0385 A[Catch:{ banv -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03a0 A[Catch:{ banv -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03a1 A[Catch:{ banv -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d3 A[Catch:{ all -> 0x0151, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8 A[Catch:{ all -> 0x0151, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da A[Catch:{ all -> 0x0151, all -> 0x0159 }] */
    /* renamed from: a */
    public final bqgg mo55870a(boolean z) {
        Long l;
        bapk bapk;
        baqa baqa;
        baqa baqa2;
        Long l2;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        bapk bapk2;
        bxvd da;
        bqgg bqgg;
        bapi bapi;
        bapk bapk3;
        byjh byjh;
        int i = 1;
        try {
            List<baog> a = this.f101501c.mo55825a();
            bndu r = bndu.m109109r();
            for (baog baog : a) {
                r.mo67268a(babm.m86492a(baog.mo55815b(), baog.mo55816c()), baog);
            }
            synchronized (this.f101508j) {
                try {
                    HashSet<babm> hashSet = new HashSet(this.f101509k.keySet());
                    for (Map.Entry entry : r.mo67318q().entrySet()) {
                        bygz b = ((babm) entry.getKey()).mo55558b();
                        boolean a2 = ((babo) this.f101503e.get(bygy.m124802a(b.f166412a))).mo55562a(b, ((babm) entry.getKey()).mo55557a());
                        boolean z6 = false;
                        boolean z7 = false;
                        boolean z8 = false;
                        for (baog baog2 : (Collection) entry.getValue()) {
                            baqg a3 = baqg.m87393a(baog2.mo55817d());
                            if (!z6 && ((Boolean) acaw.f59304ah.mo32596a()).booleanValue()) {
                                byjh byjh2 = a3.f101554a;
                                if (!baqg.m87396a(byjh2, byjh2.f166653c, a2)) {
                                    z6 = false;
                                    if (!z7 && ((Boolean) acaw.f59309am.mo32596a()).booleanValue()) {
                                        byjh = a3.f101554a;
                                        if (!baqg.m87396a(byjh, byjh.f166654d, a2)) {
                                            z7 = false;
                                            if (z8) {
                                                z8 = true;
                                            } else {
                                                z8 = (baog2.mo55817d().f166651a & 2) != 0;
                                            }
                                        }
                                    }
                                    z7 = true;
                                    if (z8) {
                                    }
                                }
                            }
                            z6 = true;
                            byjh = a3.f101554a;
                            if (!baqg.m87396a(byjh, byjh.f166654d, a2)) {
                            }
                            z7 = true;
                            if (z8) {
                            }
                        }
                        if (!z6) {
                            if (!z7) {
                            }
                        }
                        hashSet.remove(entry.getKey());
                        bapk a4 = m87336a((babm) entry.getKey());
                        if (z) {
                            if (a4.f101495k.f101512n.mo32682d()) {
                                a4.mo55864a(bqao.SYNC_TRIGGER_TIMER);
                            }
                        }
                        if (a4.f101496l == 3) {
                            a4.mo55860a(2);
                        }
                        a4.f101492h = z6;
                        a4.f101493i = z7;
                        a4.f101494j = z8;
                    }
                    for (babm babm : hashSet) {
                        bapk bapk4 = (bapk) this.f101509k.get(babm);
                        int i2 = bapk4.f101496l;
                        int i3 = i2 - 1;
                        if (i2 == 0) {
                            l = null;
                            throw null;
                        } else if (i3 == 0) {
                            bapk4.mo55863a(babm);
                        } else if (i3 == 1) {
                            bapk4.mo55860a(3);
                        }
                    }
                    l = null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } catch (banv | baoh e) {
            e = e;
            l = null;
            if (ceny.f183130a.mo6606a().mo79478d()) {
                return bqga.m112777a(e);
            }
            ((achw) this.f101499a.mo16713a()).mo25416d("Subscribed channels refresh failed", new Object[0]);
            ArrayList arrayList = new ArrayList();
            synchronized (this.f101508j) {
                m87337b();
                for (bapk bapk5 : new ArrayList(this.f101509k.values())) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (bapk5.f101496l != i) {
                        achw achw = (achw) bapk5.f101495k.f101499a.mo16713a();
                        Object[] objArr = new Object[2];
                        objArr[0] = bapk5.f101488d;
                        objArr[i] = bapk5.f101487c;
                    } else {
                        if (z) {
                            if (bapk5.mo55866a(elapsedRealtime, bapk5.f101495k.f101512n.mo32689k() * 1000)) {
                                bapk = bapk5;
                                achw achw2 = (achw) bapk.f101495k.f101499a.mo16713a();
                                i = 1;
                                Object[] objArr2 = {bapk.f101488d, bapk.f101487c};
                                l = null;
                            }
                        } else if (!bapk5.f101492h || !baqa.m87367a(bapk5.f101490f, bapk5.f101491g)) {
                            if (!bapk5.f101493i) {
                                bapk = bapk5;
                            } else if (!baqa.m87368b(bapk5.f101490f, bapk5.f101491g)) {
                                bapk = bapk5;
                            }
                            achw achw22 = (achw) bapk.f101495k.f101499a.mo16713a();
                            i = 1;
                            Object[] objArr22 = {bapk.f101488d, bapk.f101487c};
                            l = null;
                        }
                        boolean z9 = bapk5.f101494j;
                        bapz e2 = baqa.m87370e();
                        if (!bapk5.f101492h) {
                            baqa = bapk5.f101491g;
                        } else {
                            baqa = bapk5.f101490f;
                        }
                        e2.mo55882a(baqa.mo55838a());
                        if (!bapk5.f101493i) {
                            baqa2 = bapk5.f101491g;
                        } else {
                            baqa2 = bapk5.f101490f;
                        }
                        e2.mo55884b(baqa2.mo55839b());
                        e2.mo55883a(bapk5.f101490f.mo55840c());
                        baqa a5 = e2.mo55881a();
                        if (bapk5.f101495k.f101512n.mo32682d()) {
                            try {
                                l2 = bapk5.f101485a.mo55855e();
                            } catch (banv e3) {
                                achw achw3 = (achw) bapk5.f101495k.f101499a.mo16713a();
                                ((acdc) bapk5.f101495k.f101506h.mo16713a()).mo32707a("Failed to retrieve push notification timestamp!", e3);
                                l2 = l;
                            }
                        } else {
                            l2 = l;
                        }
                        if (bapk5.f101495k.f101512n.mo32683e()) {
                            try {
                                if (((bakr) bapk5.f101495k.f101507i.mo16713a()).mo55732d(bapk5.f101488d)) {
                                    z2 = true;
                                    z3 = bapk5.f101492h;
                                    bapk5.f101495k.f101505g.mo55910a(bapk5.f101488d, bapk5.f101487c);
                                    bapk5.mo55860a(2);
                                    bqgg a6 = bqdx.m112673a(bapk5.f101486b.mo55652a(bapk5.f101487c, bapk5.f101488d, bapk5.f101492h, bapk5.f101493i), new bape(bapk5), bqfb.INSTANCE);
                                    babr babr = bapk5.f101495k.f101512n;
                                    if (!ceob.f183137a.mo6606a().mo79481a()) {
                                        bqgg = bqdf.m112620a(a6, Exception.class, new bapf(), bqfb.INSTANCE);
                                    } else {
                                        bqgg = bqdf.m112619a(bqdf.m112619a(a6, babw.class, bapg.f101470a, bqfb.INSTANCE), baqd.class, new baph(), bqfb.INSTANCE);
                                    }
                                    z5 = z3;
                                    bapi bapi2 = bapi;
                                    z4 = z9;
                                    j = elapsedRealtime;
                                    bapk3 = bapk5;
                                    bapi = new bapi(bapk5, elapsedRealtime, z9, a5, l2, z2, z5);
                                    arrayList.add(bqdx.m112673a(bqdf.m112620a(bqgg, Exception.class, bapi2, bqfb.INSTANCE), new bapj(bapk3, j, z4, a5, l2, z2, z5), bqfb.INSTANCE));
                                    bapk2 = bapk3;
                                    try {
                                        ((achw) bapk2.f101495k.f101499a.mo16713a()).logVerbose("Sync started", new Object[0]);
                                        l = null;
                                        i = 1;
                                    } catch (Exception e4) {
                                        e = e4;
                                        ((achw) bapk2.f101495k.f101499a.mo16713a()).mo25418e("Sync trigger failed", new Object[0]);
                                        da = bpyi.f139852o.mo74144da();
                                        String name = e.getClass().getName();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bpyi bpyi = (bpyi) da.f164949b;
                                        name.getClass();
                                        bpyi.f139854a |= 4;
                                        bpyi.f139857d = name;
                                        bqaq bqaq = bqaq.NOT_STARTED;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bpyi bpyi2 = (bpyi) da.f164949b;
                                        bpyi2.f139856c = bqaq.mo3214a();
                                        bpyi2.f139854a |= 2;
                                        bapk2.mo55862a(j, z4, a5, l2, z2, z5, da);
                                        arrayList.add(bqga.m112777a((Throwable) e));
                                        l = null;
                                        i = 1;
                                    }
                                }
                            } catch (IOException e5) {
                                achw achw4 = (achw) bapk5.f101495k.f101499a.mo16713a();
                                ((acdc) bapk5.f101495k.f101506h.mo16713a()).mo32707a("Failed to retrieve registration status!", e5);
                                z2 = false;
                            }
                        }
                        z2 = false;
                        z3 = bapk5.f101492h;
                        bapk5.f101495k.f101505g.mo55910a(bapk5.f101488d, bapk5.f101487c);
                        bapk5.mo55860a(2);
                        try {
                            bqgg a62 = bqdx.m112673a(bapk5.f101486b.mo55652a(bapk5.f101487c, bapk5.f101488d, bapk5.f101492h, bapk5.f101493i), new bape(bapk5), bqfb.INSTANCE);
                            babr babr2 = bapk5.f101495k.f101512n;
                            if (!ceob.f183137a.mo6606a().mo79481a()) {
                            }
                            z5 = z3;
                            bapi bapi22 = bapi;
                            z4 = z9;
                            j = elapsedRealtime;
                            bapk3 = bapk5;
                            try {
                                bapi = new bapi(bapk5, elapsedRealtime, z9, a5, l2, z2, z5);
                                arrayList.add(bqdx.m112673a(bqdf.m112620a(bqgg, Exception.class, bapi22, bqfb.INSTANCE), new bapj(bapk3, j, z4, a5, l2, z2, z5), bqfb.INSTANCE));
                                bapk2 = bapk3;
                                ((achw) bapk2.f101495k.f101499a.mo16713a()).logVerbose("Sync started", new Object[0]);
                                l = null;
                                i = 1;
                            } catch (Exception e6) {
                                e = e6;
                                bapk2 = bapk3;
                                ((achw) bapk2.f101495k.f101499a.mo16713a()).mo25418e("Sync trigger failed", new Object[0]);
                                da = bpyi.f139852o.mo74144da();
                                String name2 = e.getClass().getName();
                                if (da.f164950c) {
                                }
                                bpyi bpyi3 = (bpyi) da.f164949b;
                                name2.getClass();
                                bpyi3.f139854a |= 4;
                                bpyi3.f139857d = name2;
                                bqaq bqaq2 = bqaq.NOT_STARTED;
                                if (da.f164950c) {
                                }
                                bpyi bpyi22 = (bpyi) da.f164949b;
                                bpyi22.f139856c = bqaq2.mo3214a();
                                bpyi22.f139854a |= 2;
                                bapk2.mo55862a(j, z4, a5, l2, z2, z5, da);
                                arrayList.add(bqga.m112777a((Throwable) e));
                                l = null;
                                i = 1;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            z5 = z3;
                            z4 = z9;
                            j = elapsedRealtime;
                            bapk2 = bapk5;
                            ((achw) bapk2.f101495k.f101499a.mo16713a()).mo25418e("Sync trigger failed", new Object[0]);
                            da = bpyi.f139852o.mo74144da();
                            String name22 = e.getClass().getName();
                            if (da.f164950c) {
                            }
                            bpyi bpyi32 = (bpyi) da.f164949b;
                            name22.getClass();
                            bpyi32.f139854a |= 4;
                            bpyi32.f139857d = name22;
                            bqaq bqaq22 = bqaq.NOT_STARTED;
                            if (da.f164950c) {
                            }
                            bpyi bpyi222 = (bpyi) da.f164949b;
                            bpyi222.f139856c = bqaq22.mo3214a();
                            bpyi222.f139854a |= 2;
                            bapk2.mo55862a(j, z4, a5, l2, z2, z5, da);
                            arrayList.add(bqga.m112777a((Throwable) e));
                            l = null;
                            i = 1;
                        }
                    }
                }
            }
            return bqga.m112782b(arrayList).mo69216a(new bapd(this, arrayList), this.f101518t);
        }
    }

    /* renamed from: b */
    public final boolean mo55878b(bygz bygz, Account account) {
        boolean c;
        synchronized (this.f101508j) {
            bapk c2 = mo55879c(bygz, account);
            c = baqa.m87369c(c2.f101490f, c2.f101491g);
        }
        return c;
    }

    /* renamed from: a */
    public final void mo55871a(long j, int i, boolean z) {
        this.f101510l = true;
        this.f101511m = j;
        this.f101500b.mo32789a(true, i, z, null);
    }

    /* renamed from: a */
    public final void mo55872a(bygz bygz, Account account) {
        synchronized (this.f101508j) {
            bapk c = mo55879c(bygz, account);
            if (c.f101496l != 4) {
                try {
                    c.f101485a.mo55856f();
                    if (c.f101496l != 1) {
                        c.mo55860a(4);
                    } else {
                        c.mo55859a();
                    }
                } catch (banv e) {
                    ((achw) c.f101495k.f101499a.mo16713a()).mo25418e("Sync state delete failed", new Object[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x012e A[Catch:{ baoh -> 0x00ec }] */
    /* renamed from: a */
    public final void mo55873a(bygz bygz, Account account, boolean z, boolean z2) {
        boolean z3;
        int i;
        long j;
        byjk byjk;
        byjk byjk2;
        synchronized (this.f101508j) {
            bapk c = mo55879c(bygz, account);
            if (c.f101495k.f101512n.mo32692n()) {
                if (c.f101489e != null) {
                    if (!z) {
                        if (!z2) {
                            ((bads) c.f101495k.f101504f.mo16713a()).mo32744a(10016, baqz.m87422a(c.f101487c));
                        }
                    }
                    try {
                        byjk byjk3 = null;
                        for (baog baog : c.f101495k.f101501c.mo55826a(c.f101488d, c.f101487c)) {
                            if (bard.m87434a(baog.mo55817d())) {
                                byjl byjl = bapk.m87324a(c.f101489e, baog.mo55814a()).f166372d;
                                if (byjl == null) {
                                    byjl = byjl.f166668e;
                                }
                                if (z) {
                                    if (c.f101495k.f101512n.mo32681c()) {
                                        byjk byjk4 = byjl.f166672c;
                                        if (byjk4 == null) {
                                            byjk4 = byjk.f166662e;
                                        }
                                        byjk2 = baqs.m87414a(byjk4, baog.mo55817d());
                                    } else {
                                        byjk2 = byjl.f166672c;
                                        if (byjk2 == null) {
                                            byjk2 = byjk.f166662e;
                                        }
                                    }
                                    byjk3 = baqs.m87415a(byjk3, byjk2);
                                }
                                if (z2) {
                                    if (c.f101495k.f101512n.mo32681c()) {
                                        byjk byjk5 = byjl.f166673d;
                                        if (byjk5 == null) {
                                            byjk5 = byjk.f166662e;
                                        }
                                        byjk = baqs.m87414a(byjk5, baog.mo55817d());
                                    } else {
                                        byjk = byjl.f166673d;
                                        if (byjk == null) {
                                            byjk = byjk.f166662e;
                                        }
                                    }
                                    byjk3 = baqs.m87415a(byjk3, byjk);
                                }
                            }
                        }
                        if (byjk3 != null) {
                            int b = bapk.m87325b(byjk3);
                            boolean z4 = byjk3.f166665b;
                            j = Math.max(c.f101495k.f101512n.mo32687i() * 1000, bapk.m87322a(byjk3));
                            i = b;
                            z3 = z4;
                            double d = (double) j;
                            babr babr = c.f101495k.f101512n;
                            double doubleValue = ((Double) abzv.f59030q.mo58455c()).doubleValue();
                            Double.isNaN(d);
                            long j2 = (long) (d * doubleValue);
                            long max = Math.max(j, 1000 + j2);
                            if (c.f101495k.f101512n.mo32682d()) {
                                baqc baqc = c.f101485a;
                                baqv baqv = c.f101495k.f101513o;
                                baqc.mo55847a(SystemClock.elapsedRealtime());
                                c.mo55864a(bqao.SYNC_TRIGGER_PUSH_NOTIFICATION);
                            }
                            c.mo55867b();
                            c.mo55865a(true, j2, max, i, z3);
                        } else {
                            ((bads) c.f101495k.f101504f.mo16713a()).mo32744a(10017, baqz.m87422a(c.f101487c));
                        }
                    } catch (baoh e) {
                        throw new banv("Unable to retrieve subscriptions", e);
                    }
                }
            }
            int a = c.f101495k.mo55869a();
            j = c.f101495k.f101512n.mo32687i() * 1000;
            i = a;
            z3 = false;
            double d2 = (double) j;
            babr babr2 = c.f101495k.f101512n;
            double doubleValue2 = ((Double) abzv.f59030q.mo58455c()).doubleValue();
            Double.isNaN(d2);
            long j22 = (long) (d2 * doubleValue2);
            long max2 = Math.max(j, 1000 + j22);
            if (c.f101495k.f101512n.mo32682d()) {
            }
            c.mo55867b();
            c.mo55865a(true, j22, max2, i, z3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* renamed from: a */
    public final void mo55874a(String str, bygz bygz, Account account) {
        Integer num;
        int i;
        long j;
        boolean z;
        synchronized (this.f101508j) {
            bapk c = mo55879c(bygz, account);
            baog a = c.mo55858a(str);
            if (a != null) {
                num = baqg.m87393a(a.mo55817d()).mo55886a(((babo) c.f101495k.f101503e.get(bygy.m124802a(c.f101487c.f166412a))).mo55562a(c.f101487c, c.f101488d), Integer.valueOf((int) c.f101495k.f101512n.mo32686h()));
            } else {
                ((bads) c.f101495k.f101504f.mo16713a()).mo32744a(10014, baqz.m87422a(c.f101487c));
                num = Integer.valueOf((int) c.f101495k.f101512n.mo32686h());
            }
            if (num != null) {
                if (c.f101495k.f101512n.mo32691m()) {
                    bygv bygv = c.f101489e;
                    if (bygv != null) {
                        byjl byjl = bapk.m87324a(bygv, str).f166372d;
                        if (byjl == null) {
                            byjl = byjl.f166668e;
                        }
                        byjk byjk = byjl.f166670a;
                        if (byjk == null) {
                            byjk = byjk.f166662e;
                        }
                        if (c.f101495k.f101512n.mo32681c()) {
                            if (a != null) {
                                byjk = baqs.m87414a(byjk, a.mo55817d());
                            }
                        }
                        i = bapk.m87325b(byjk);
                        z = byjk.f166665b;
                        j = Math.max(((long) num.intValue()) * 1000, bapk.m87322a(byjk));
                        if (c.f101495k.f101512n.mo32682d()) {
                            c.mo55864a(bqao.SYNC_TRIGGER_READ);
                        }
                        c.mo55861a(j, i, z);
                    }
                }
                i = c.f101495k.mo55869a();
                j = Math.max(((long) num.intValue()) * 1000, c.f101495k.f101512n.mo32690l());
                z = false;
                if (c.f101495k.f101512n.mo32682d()) {
                }
                c.mo55861a(j, i, z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo55875a(long j) {
        return this.f101510l && j - this.f101511m > ((Long) abzv.f59033t.mo58455c()).longValue() * 1000;
    }

    /* renamed from: a */
    public final boolean mo55876a(long j, long j2) {
        return this.f101510l && this.f101511m - j <= j2 && !mo55875a(j);
    }
}
