package p000;

import android.accounts.Account;
import android.util.Pair;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.SyncStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: acgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgf {

    /* renamed from: a */
    public final Map f59756a = new IdentityHashMap();

    /* renamed from: b */
    public final achw f59757b;

    /* renamed from: c */
    private final baok f59758c;

    /* renamed from: d */
    private final bafj f59759d;

    /* renamed from: e */
    private final azzy f59760e;

    /* renamed from: f */
    private final babm f59761f;

    /* renamed from: g */
    private final cayo f59762g;

    public acgf(achw achw, baok baok, bafj bafj, azzy azzy, cayo cayo, babm babm) {
        boolean z;
        if (((babn) babm).f100438b.f166412a == 2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Cannot instantiate LatestFootprintsListenersHandler for non-Footprints channel");
        this.f59757b = achw;
        this.f59758c = baok;
        this.f59759d = bafj;
        this.f59760e = azzy;
        this.f59762g = cayo;
        this.f59761f = babm;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0180, code lost:
        r6 = r1.f59756a.values().iterator();
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02db A[SYNTHETIC, Splitter:B:155:0x02db] */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo32726a() {
        byhn byhn;
        byhn byhn2;
        Throwable th;
        Throwable th2;
        bany b;
        Throwable th3;
        bany b2;
        Throwable th4;
        LatestFootprintFilter latestFootprintFilter;
        byte[] bArr;
        MdhFootprint mdhFootprint;
        badj badj;
        try {
            bafj bafj = this.f59759d;
            babm babm = this.f59761f;
            Account account = ((babn) babm).f100437a;
            bygz bygz = ((babn) babm).f100438b;
            if (bygz.f166412a == 2) {
                byhn = (byhn) bygz.f166413b;
            } else {
                byhn = byhn.f166478e;
            }
            int i = byhn.f166481b;
            bygz bygz2 = ((babn) this.f59761f).f100438b;
            if (bygz2.f166412a == 2) {
                byhn2 = (byhn) bygz2.f166413b;
            } else {
                byhn2 = byhn.f166478e;
            }
            bafl a = bafj.mo55662a(account, i, byhn2.f166482c);
            try {
                synchronized (this.f59756a) {
                    Iterator it = this.f59756a.values().iterator();
                    while (it.hasNext()) {
                        if (!((acgd) it.next()).f59746b.f59740a.asBinder().isBinderAlive()) {
                            it.remove();
                        }
                    }
                    for (acgd acgd : this.f59756a.values()) {
                        String str = acgd.f59745a;
                        baok baok = this.f59758c;
                        babm babm2 = this.f59761f;
                        baog b3 = baok.mo55832b(str, ((babn) babm2).f100437a, ((babn) babm2).f100438b);
                        if (b3 != null) {
                            badj = bafi.m86736a(b3.mo55818e());
                        } else {
                            badj = badj.f100527a;
                        }
                        if (!badj.equals(acgd.f59747c)) {
                            acgd.f59747c = badj;
                            acgd.mo32725a();
                        }
                    }
                    while (true) {
                        banx a2 = a.mo55677c().mo55798a();
                        try {
                            bamm b4 = a.mo55664a().mo55764b(a2);
                            a2.close();
                            Iterator it2 = b4.f101270a.iterator();
                            while (true) {
                                int i2 = 1;
                                if (!it2.hasNext()) {
                                    break;
                                }
                                byhr byhr = (byhr) it2.next();
                                for (acgd acgd2 : this.f59756a.values()) {
                                    if (acgd2.f59750f != i2) {
                                        bxtx a3 = a.mo55665a(byhr.f166499d);
                                        if (a3 != null) {
                                            bArr = a3.mo73780k();
                                        } else {
                                            bArr = null;
                                        }
                                        if (!acgd2.f59747c.mo55647a(bArr)) {
                                            i2 = 1;
                                        } else if (acgd2.f59748d.mo55647a(bArr)) {
                                            byhq a4 = byhq.m124822a(byhr.f166497b);
                                            if (a4 == null) {
                                                a4 = byhq.UNKNOWN;
                                            }
                                            if ((byhr.f166496a & 2) != 0) {
                                                mdhFootprint = new MdhFootprint(byhr.f166498c.mo73780k(), bArr, byhr.f166500e);
                                            } else {
                                                mdhFootprint = null;
                                            }
                                            acgd2.f59746b.mo32724a(new acge(a4, mdhFootprint));
                                            i2 = 1;
                                        } else {
                                            i2 = 1;
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                }
                                bnia bnia = new bnia();
                                azzy azzy = this.f59760e;
                                babm babm3 = this.f59761f;
                                for (Pair pair : azzy.mo55538a(((babn) babm3).f100438b, ((babn) babm3).f100437a)) {
                                    if (((baac) pair.second).mo55534a().f166403a == i2) {
                                        badj a5 = bafi.m86736a(((baac) pair.second).mo55534a());
                                        bxtx a6 = a.mo55665a(byhr.f166499d);
                                        if (a5.mo55647a(a6 != null ? a6.mo73780k() : null)) {
                                            bnia.mo67629b((baab) pair.first);
                                        }
                                    }
                                }
                                bnic a7 = bnia.mo67751a();
                                if (!a7.isEmpty()) {
                                    this.f59760e.mo55541a(a7);
                                }
                            }
                            b = a.mo55677c().mo55799b();
                            b4.mo55760a(b);
                            b.mo55796b();
                            b.close();
                            b2 = a.mo55677c().mo55799b();
                            if (a.mo55664a().mo55763a(b2)) {
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
                for (acgd acgd3 : this.f59756a.values()) {
                    try {
                        if (acgd3.f59750f == 1) {
                            acgd3.f59750f = 2;
                            bngs j = bngx.m109377j();
                            try {
                                for (badk badk : a.mo55667a(b2, acgd3.f59748d, null)) {
                                    if (acgd3.f59747c.mo55647a(badk.mo55613b())) {
                                        j.mo67668c(acfw.m49038a(badk));
                                    }
                                }
                                badj badj2 = acgd3.f59747c;
                                if (badj2 != null) {
                                    afkp a8 = LatestFootprintFilter.m67177a();
                                    bnre i3 = badj2.mo55608a().listIterator();
                                    while (i3.hasNext()) {
                                        badp badp = (badp) i3.next();
                                        a8.mo34926a(badp.mo55630a(), badp.mo55631b());
                                    }
                                    latestFootprintFilter = a8.mo34925a();
                                } else {
                                    latestFootprintFilter = null;
                                }
                                acgd3.f59746b.mo32724a(new acge(latestFootprintFilter, j.mo67664a()));
                            } catch (IOException e2) {
                                acgd3.mo32725a();
                            }
                        }
                        if (acgd3.f59750f != 1) {
                            badj b5 = a.mo55673b((banx) b2);
                            badj badj3 = acgd3.f59747c;
                            ArrayList arrayList = new ArrayList(b5.mo55608a());
                            ArrayList arrayList2 = new ArrayList(badj3.mo55608a());
                            Collections.sort(arrayList, bado.f100535a);
                            Collections.sort(arrayList2, bado.f100535a);
                            Iterator it3 = arrayList.iterator();
                            Iterator it4 = arrayList2.iterator();
                            if (it3.hasNext()) {
                                badp badp2 = (badp) it3.next();
                                while (true) {
                                    if (it4.hasNext()) {
                                        badp badp3 = (badp) it4.next();
                                        while (true) {
                                            if (bado.f100535a.compare(badp2, badp3) > 0) {
                                                break;
                                            }
                                            if (bacy.m86614a(badp2.mo55630a(), badp3.mo55630a())) {
                                                if (badp2.mo55631b() == 2) {
                                                    break;
                                                } else if (badp2.mo55630a().length == badp3.mo55630a().length) {
                                                    if (badp3.mo55631b() == 1) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                            }
                                            try {
                                                if (!it3.hasNext()) {
                                                    break;
                                                }
                                                badp2 = (badp) it3.next();
                                            } catch (IOException e3) {
                                                acgd3.mo32725a();
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            } else if (it4.hasNext()) {
                            }
                            SyncStatus a9 = accu.m48909a(a.mo55676c(b2));
                            if (acgd3.f59750f == 3) {
                                if (a9.equals(acgd3.f59749e)) {
                                }
                            }
                            acgd3.f59749e = a9;
                            acgd3.f59750f = 3;
                            acgd3.f59746b.mo32724a(new acge(a9));
                        }
                    } catch (IOException e4) {
                        acgd3.mo32725a();
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
        } catch (IOException e5) {
            this.f59757b.mo25418e("Trigger listeners failed", new Object[0]);
            ((acdc) this.f59762g.mo16713a()).mo32707a("MDH Trigger listeners failed", e5);
            synchronized (this.f59756a) {
                for (acgd acgd4 : this.f59756a.values()) {
                    acgd4.mo32725a();
                }
            }
        } catch (Throwable th7) {
            bqye.m113761a(th, th7);
        }
    }
}
