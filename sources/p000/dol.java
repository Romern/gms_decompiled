package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.HashMap;

/* renamed from: dol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dol {

    /* renamed from: a */
    public final doh f13709a;

    /* renamed from: b */
    public HashMap f13710b;

    /* renamed from: c */
    protected bxga f13711c;

    /* renamed from: d */
    private HashMap f13712d;

    /* renamed from: e */
    private long f13713e = 0;

    public dol(doh doh) {
        this.f13709a = doh;
        m8945b();
    }

    /* renamed from: b */
    private final void m8945b() {
        this.f13712d = new HashMap();
        this.f13710b = new HashMap();
    }

    /* renamed from: a */
    public final int mo9346a(int i, int i2, ContextManagerClientInfo contextManagerClientInfo) {
        boolean z;
        boolean z2;
        int i3;
        bxfw bxfw;
        int i4 = i;
        ContextManagerClientInfo contextManagerClientInfo2 = contextManagerClientInfo;
        if (i2 > 99999) {
            return 1;
        }
        if (cdgp.f180782a.mo6606a().mo77559ad() && !contextManagerClientInfo.mo18070e() && (i4 == 0 || i4 == 3)) {
            return 1;
        }
        dok dok = (dok) this.f13712d.get(doj.m8942a(tiq.m37051b(i2)));
        if (!"com.google.android.gms".equals(contextManagerClientInfo2.f30678b)) {
            z = false;
        } else {
            z = i4 == 0 || i4 == 1;
        }
        if (dok == null && z) {
            dok = new dok(tiq.m37051b(i2));
        }
        if (cdgf.f180769a.mo6606a().mo77505d() && z) {
            return dok.mo9344a(i4, contextManagerClientInfo2);
        }
        if (i4 == 2) {
            z2 = false;
        } else if (i4 != 1) {
            if (dwq.m9665i().mo20505a() - this.f13713e > cdgp.f180782a.mo6606a().mo77583c()) {
                mo9347a();
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z) {
                dok = (dok) this.f13712d.get(doj.m8942a(tiq.m37051b(i2)));
            }
        } else {
            z2 = false;
        }
        if (dok == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dol", "a", 502, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("[AclManager] null policy map (%s) %s, clientInfo=%s", Integer.toString(i), Integer.toString(i2), contextManagerClientInfo2);
            if (!z2) {
                new Object[1][0] = this.f13709a;
                mo9347a();
            }
            return 3;
        }
        if (z) {
            i3 = dok.mo9344a(i4, contextManagerClientInfo2);
        } else {
            int a = dok.mo9344a(i4, contextManagerClientInfo2);
            i3 = (!(a == 1 || a == 6) || dok.f13706a[i4] || ((bxfw = (bxfw) dok.f13707b.get(contextManagerClientInfo2.f30678b)) != null && don.m8955a(i4, bxfw))) ? a : 3;
        }
        if (!(i4 == 2 || i3 == 1 || i3 == 6)) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("dol", "a", 523, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68427a("[AclManager] No %s for %s. Was: %s for %s, %s", Integer.toString(i), contextManagerClientInfo, Integer.toString(i3), Integer.toString(i2), this.f13709a);
        }
        return i3;
    }

    /* renamed from: a */
    public final void mo9347a() {
        bxga bxga;
        int i;
        doh doh = this.f13709a;
        if (!doh.mo9338b() && !dwq.m9681y().mo9334b(doh)) {
            new Object[1][0] = doh;
            long a = dwq.m9665i().mo20505a();
            bxfz bxfz = (bxfz) bxga.f163216d.mo74144da();
            if (bxfz.f164950c) {
                bxfz.mo74035c();
                bxfz.f164950c = false;
            }
            bxga bxga2 = (bxga) bxfz.f164949b;
            bxga2.f163218a |= 1;
            bxga2.f163220c = a;
            bxga = (bxga) bxfz.mo74062i();
        } else if (doh.mo9338b()) {
            if (!cdgf.m133171b().f163219b.isEmpty()) {
                bxga b = cdgf.m133171b();
                bxvd bxvd = (bxvd) b.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) b);
                bxfz bxfz2 = (bxfz) bxvd;
                long a2 = dwq.m9665i().mo20505a();
                if (bxfz2.f164950c) {
                    bxfz2.mo74035c();
                    bxfz2.f164950c = false;
                }
                bxga bxga3 = (bxga) bxfz2.f164949b;
                bxga bxga4 = bxga.f163216d;
                bxga3.f163218a |= 1;
                bxga3.f163220c = a2;
                bxga = (bxga) bxfz2.mo74062i();
            } else {
                bxga = doz.m9000b();
            }
        } else if (!cdgf.m133172c().f163219b.isEmpty()) {
            bxga c = cdgf.m133172c();
            bxvd bxvd2 = (bxvd) c.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) c);
            bxfz bxfz3 = (bxfz) bxvd2;
            long a3 = dwq.m9665i().mo20505a();
            if (bxfz3.f164950c) {
                bxfz3.mo74035c();
                bxfz3.f164950c = false;
            }
            bxga bxga5 = (bxga) bxfz3.f164949b;
            bxga bxga6 = bxga.f163216d;
            bxga5.f163218a |= 1;
            bxga5.f163220c = a3;
            bxga = (bxga) bxfz3.mo74062i();
        } else {
            bxga = doz.m8999a();
        }
        bxga bxga7 = this.f13711c;
        if (bxga7 == null || !bxga.f163219b.equals(bxga7.f163219b)) {
            this.f13711c = bxga;
            m8945b();
            bxga bxga8 = this.f13711c;
            bxwc bxwc = bxga8.f163219b;
            int size = bxwc.size();
            int i2 = 0;
            while (i2 < size) {
                bxhp bxhp = (bxhp) bxwc.get(i2);
                bxhr bxhr = bxhp.f163448b;
                if (bxhr == null) {
                    bxhr = bxhr.f163456d;
                }
                bxco a4 = bxco.m122577a(bxhr.f163460c);
                if (a4 == null) {
                    a4 = bxco.UNKNOWN_CONTEXT_NAME;
                }
                bxhr bxhr2 = bxhp.f163448b;
                if (bxhr2 == null) {
                    bxhr2 = bxhr.f163456d;
                }
                int a5 = bxch.m122566a(bxhr2.f163459b);
                if (a5 == 0) {
                    a5 = 1;
                }
                doj doj = new doj(a4, a5);
                dok dok = (dok) this.f13712d.get(doj);
                HashMap hashMap = this.f13710b;
                bxjo bxjo = bxhp.f163450d;
                if (bxjo == null) {
                    bxjo = bxjo.f163657c;
                }
                bxjq a6 = bxjq.m122779a(bxjo.f163660b);
                if (a6 == null) {
                    a6 = bxjq.UNKNOWN_SYNC_TYPE;
                }
                hashMap.put(doj, a6);
                if (dok == null) {
                    bxhr bxhr3 = bxhp.f163448b;
                    if (bxhr3 == null) {
                        bxhr3 = bxhr.f163456d;
                    }
                    bxco a7 = bxco.m122577a(bxhr3.f163460c);
                    if (a7 == null) {
                        a7 = bxco.UNKNOWN_CONTEXT_NAME;
                    }
                    dok = new dok(a7);
                    this.f13712d.put(doj, dok);
                }
                dok.mo9345a();
                bxwc bxwc2 = bxhp.f163449c;
                int size2 = bxwc2.size();
                int i3 = 0;
                while (true) {
                    i = i2 + 1;
                    if (i3 >= size2) {
                        break;
                    }
                    bxfy bxfy = (bxfy) bxwc2.get(i3);
                    bxhw bxhw = bxfy.f163214b;
                    if (bxhw == null) {
                        bxhw = bxhw.f163474d;
                    }
                    int a8 = bxhv.m122730a(bxhw.f163477b);
                    if (a8 == 0) {
                        a8 = 1;
                    }
                    bxfu bxfu = bxfy.f163215c;
                    if (bxfu == null) {
                        bxfu = bxfu.f163194c;
                    }
                    bxfw a9 = bxfw.m122671a(bxfu.f163197b);
                    if (a9 == null) {
                        a9 = bxfw.UNKNOWN_ACCESS_TYPE;
                    }
                    if (a8 != 3) {
                        HashMap hashMap2 = dok.f13707b;
                        bxhw bxhw2 = bxfy.f163214b;
                        if (bxhw2 == null) {
                            bxhw2 = bxhw.f163474d;
                        }
                        hashMap2.put(bxhw2.f163478c, a9);
                    } else {
                        for (int i4 = 0; i4 < 5; i4++) {
                            if (don.m8955a(i4, a9)) {
                                dok.f13706a[i4] = true;
                            }
                        }
                    }
                    i3++;
                }
                i2 = i;
            }
            this.f13713e = bxga8.f163220c;
        }
    }

    /* renamed from: a */
    public final boolean mo9348a(bxco bxco) {
        int ordinal;
        bxjq bxjq = (bxjq) this.f13710b.get(doj.m8942a(bxco));
        if (bxjq == null || (ordinal = bxjq.ordinal()) == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return this.f13709a.mo9338b();
        }
        if (ordinal != 4) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dol", "a", 450, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[AclManager] Unknown SyncType %s", bxjq);
            return false;
        } else if (!this.f13709a.mo9338b()) {
            return true;
        } else {
            return false;
        }
    }
}
