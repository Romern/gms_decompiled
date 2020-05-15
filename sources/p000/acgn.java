package p000;

import android.accounts.Account;
import android.util.Pair;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: acgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgn {

    /* renamed from: a */
    public final Map f59789a = new IdentityHashMap();

    /* renamed from: b */
    public final achw f59790b;

    /* renamed from: c */
    private final baok f59791c;

    /* renamed from: d */
    private final bafu f59792d;

    /* renamed from: e */
    private final azzy f59793e;

    /* renamed from: f */
    private final babm f59794f;

    /* renamed from: g */
    private long f59795g;

    /* renamed from: h */
    private final cayo f59796h;

    public acgn(achw achw, baok baok, bafu bafu, azzy azzy, cayo cayo, babm babm) {
        boolean z;
        byhn byhn;
        babn babn = (babn) babm;
        boolean z2 = true;
        if (babn.f100438b.f166412a == 2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Cannot instantiate TimeSeriesFootprintsListenersHandler for non-Footprints channel.");
        bygz bygz = babn.f100438b;
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        byhm a = byhm.m124816a(byhn.f166483d);
        bmxy.m108589a((a == null ? byhm.UNKNOWN : a) != byhm.SYNC_FULL_SNAPSHOT ? false : z2, "Cannot instantiate TimeSeriesFootprintsListenersHandler for wrong sync variant.");
        this.f59790b = achw;
        this.f59791c = baok;
        this.f59792d = bafu;
        this.f59793e = azzy;
        this.f59796h = cayo;
        this.f59794f = babm;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019d, code lost:
        r6 = r1.f59789a.values().iterator();
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0307 A[SYNTHETIC, Splitter:B:152:0x0307] */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo32739a() {
        byhn byhn;
        byhn byhn2;
        Throwable th;
        Throwable th2;
        TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter;
        int i;
        bany b;
        Throwable th3;
        bany b2;
        Throwable th4;
        TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter2;
        int i2;
        long j;
        long j2;
        TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter3;
        long j3;
        long j4;
        MdhFootprint mdhFootprint;
        badr badr;
        try {
            bafu bafu = this.f59792d;
            babm babm = this.f59794f;
            Account account = ((babn) babm).f100437a;
            bygz bygz = ((babn) babm).f100438b;
            if (bygz.f166412a == 2) {
                byhn = (byhn) bygz.f166413b;
            } else {
                byhn = byhn.f166478e;
            }
            int i3 = byhn.f166481b;
            bygz bygz2 = ((babn) this.f59794f).f100438b;
            if (bygz2.f166412a == 2) {
                byhn2 = (byhn) bygz2.f166413b;
            } else {
                byhn2 = byhn.f166478e;
            }
            bafv a = bafu.mo55681a(account, i3, byhn2.f166482c);
            try {
                synchronized (this.f59789a) {
                    Iterator it = this.f59789a.values().iterator();
                    while (it.hasNext()) {
                        if (!((acgl) it.next()).f59780b.f59775b.f12819a.isBinderAlive()) {
                            it.remove();
                        }
                    }
                    for (acgl acgl : this.f59789a.values()) {
                        String str = acgl.f59779a;
                        baok baok = this.f59791c;
                        babm babm2 = this.f59794f;
                        baog b3 = baok.mo55832b(str, ((babn) babm2).f100437a, ((babn) babm2).f100438b);
                        if (b3 != null) {
                            badr = bafi.m86745b(b3.mo55818e());
                        } else {
                            badr = badr.f100536a;
                        }
                        if (!badr.equals(acgl.f59781c)) {
                            acgl.f59781c = badr;
                            acgl.mo32738a();
                        }
                    }
                    while (true) {
                        banx a2 = a.mo55696c().mo55798a();
                        try {
                            bamm b4 = a.mo55683a().mo55764b(a2);
                            long c = a.mo55695c(a2);
                            a2.close();
                            if (this.f59795g != c) {
                                this.f59795g = c;
                                for (acgl acgl2 : this.f59789a.values()) {
                                    acgl2.mo32738a();
                                }
                            }
                            Iterator it2 = b4.f101270a.iterator();
                            while (true) {
                                timeSeriesFootprintsSubscriptionFilter = null;
                                i = 1;
                                if (!it2.hasNext()) {
                                    break;
                                }
                                byhy byhy = (byhy) it2.next();
                                for (acgl acgl3 : this.f59789a.values()) {
                                    if (acgl3.f59783e != 1) {
                                        if (acgl3.f59781c.mo55637c() != null) {
                                            j3 = acgl3.f59781c.mo55637c().longValue() + c;
                                        } else {
                                            j3 = Long.MAX_VALUE;
                                        }
                                        if (acgl3.f59781c.mo55636b() != null) {
                                            j4 = c + acgl3.f59781c.mo55636b().longValue();
                                        } else {
                                            j4 = Long.MIN_VALUE;
                                        }
                                        long j5 = c;
                                        long j6 = byhy.f166533d;
                                        if (j6 <= j4 || j6 > j3) {
                                            c = j5;
                                        } else {
                                            acgk acgk = acgl3.f59780b;
                                            byhx a3 = byhx.m124831a(byhy.f166531b);
                                            if (a3 == null) {
                                                a3 = byhx.UNKNOWN;
                                            }
                                            if ((byhy.f166530a & 2) != 0) {
                                                mdhFootprint = new MdhFootprint(byhy.f166532c.mo73780k(), null, j6);
                                            } else {
                                                mdhFootprint = null;
                                            }
                                            acgk.mo32737a(new acgm(a3, mdhFootprint));
                                            c = j5;
                                        }
                                    }
                                }
                                bnia bnia = new bnia();
                                azzy azzy = this.f59793e;
                                babm babm3 = this.f59794f;
                                for (Pair pair : azzy.mo55538a(((babn) babm3).f100438b, ((babn) babm3).f100437a)) {
                                    bnia.mo67629b((baab) pair.first);
                                }
                                bnic a4 = bnia.mo67751a();
                                if (!a4.isEmpty()) {
                                    this.f59793e.mo55541a(a4);
                                }
                            }
                            b = a.mo55696c().mo55799b();
                            b4.mo55760a(b);
                            b.mo55796b();
                            b.close();
                            b2 = a.mo55696c().mo55799b();
                            if (a.mo55683a().mo55763a(b2)) {
                                break;
                            }
                            b2.close();
                        } catch (IOException e) {
                            throw new banv("Exception occurred while processing BroadcastListener subscriptions", e);
                        } catch (Throwable th5) {
                            bqye.m113761a(th4, th5);
                        }
                    }
                }
                if (a == null) {
                    a.close();
                    return;
                }
                return;
                throw th2;
                for (acgl acgl4 : this.f59789a.values()) {
                    try {
                        if (acgl4.f59783e != i) {
                            timeSeriesFootprintsSubscriptionFilter2 = timeSeriesFootprintsSubscriptionFilter;
                            i2 = 1;
                        } else {
                            acgl4.f59783e = 2;
                            bngs j7 = bngx.m109377j();
                            long c2 = a.mo55695c(b2);
                            if (acgl4.f59781c.mo55637c() != null) {
                                j = acgl4.f59781c.mo55637c().longValue() + c2;
                            } else {
                                j = Long.MAX_VALUE;
                            }
                            if (acgl4.f59781c.mo55636b() != null) {
                                j2 = c2 + acgl4.f59781c.mo55636b().longValue();
                            } else {
                                j2 = Long.MIN_VALUE;
                            }
                            i2 = 1;
                            long j8 = j2;
                            timeSeriesFootprintsSubscriptionFilter2 = timeSeriesFootprintsSubscriptionFilter;
                            try {
                                List a5 = a.mo55685a(b2, j, j8, (String) null);
                                for (badk badk : a5.subList(0, Math.min(a5.size(), acgl4.f59781c.mo55635a()))) {
                                    j7.mo67668c(acfw.m49038a(badk));
                                }
                                acgk acgk2 = acgl4.f59780b;
                                badr badr2 = acgl4.f59781c;
                                if (badr2 != null) {
                                    timeSeriesFootprintsSubscriptionFilter3 = new TimeSeriesFootprintsSubscriptionFilter(badr2.mo55635a(), badr2.mo55636b(), badr2.mo55637c());
                                } else {
                                    timeSeriesFootprintsSubscriptionFilter3 = timeSeriesFootprintsSubscriptionFilter2;
                                }
                                acgk2.mo32737a(new acgm(timeSeriesFootprintsSubscriptionFilter3, j7.mo67664a()));
                            } catch (IOException e2) {
                                acgl4.mo32738a();
                                timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                                i = 1;
                            }
                        }
                        badr b5 = a.mo55692b((banx) b2);
                        bacv d = a.mo55698d(b2);
                        if (acgl4.f59783e != i2) {
                            badr badr3 = acgl4.f59781c;
                            if (b5.mo55635a() >= badr3.mo55635a()) {
                                if (b5.mo55637c() != null) {
                                    if (badr3.mo55637c() == null) {
                                        timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                                        i = 1;
                                    } else if (b5.mo55637c().longValue() < badr3.mo55637c().longValue()) {
                                        timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                                        i = 1;
                                    }
                                }
                                if (b5.mo55636b() != null) {
                                    if (badr3.mo55636b() == null) {
                                        timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                                        i = 1;
                                    } else if (b5.mo55636b().longValue() > badr3.mo55636b().longValue()) {
                                        timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                                        i = 1;
                                    }
                                }
                                if (acgl4.f59783e == 3) {
                                    if (d.equals(acgl4.f59782d)) {
                                        timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                                        i = 1;
                                    }
                                }
                                acgl4.f59782d = d;
                                acgl4.f59783e = 3;
                                acgl4.f59780b.mo32737a(new acgm(d));
                                timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                                i = 1;
                            } else {
                                timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                                i = 1;
                            }
                        } else {
                            timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                            i = 1;
                        }
                    } catch (IOException e3) {
                        timeSeriesFootprintsSubscriptionFilter2 = timeSeriesFootprintsSubscriptionFilter;
                        acgl4.mo32738a();
                        timeSeriesFootprintsSubscriptionFilter = timeSeriesFootprintsSubscriptionFilter2;
                        i = 1;
                    }
                }
                b2.close();
                if (a == null) {
                }
                throw th3;
                throw th4;
            } catch (Throwable th6) {
                th = th6;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (IOException e4) {
            this.f59790b.mo25418e("Trigger listeners failed", new Object[0]);
            ((acdc) this.f59796h.mo16713a()).mo32707a("MDH Trigger listeners failed", e4);
            synchronized (this.f59789a) {
                for (acgl acgl5 : this.f59789a.values()) {
                    acgl5.mo32738a();
                }
            }
        } catch (Throwable th7) {
            bqye.m113761a(th, th7);
        }
    }
}
