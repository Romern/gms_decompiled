package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbmm implements bbmn {

    /* renamed from: a */
    public final bbko f102915a;

    /* renamed from: b */
    public final bbkl f102916b;

    /* renamed from: c */
    public final bmzi f102917c;

    /* renamed from: d */
    private final bmzi f102918d;

    /* renamed from: e */
    private final bmzi f102919e;

    /* renamed from: f */
    private final Executor f102920f;

    /* renamed from: g */
    private final bbja f102921g;

    /* renamed from: h */
    private final bbkj f102922h;

    public bbmm(bbja bbja, bbko bbko, bbkl bbkl, bbkj bbkj, bmzi bmzi, bmzi bmzi2, Executor executor, bmzi bmzi3) {
        this.f102921g = bbja;
        this.f102915a = bbko;
        this.f102916b = bbkl;
        this.f102922h = bbkj;
        this.f102918d = bmzi;
        this.f102919e = bmzi2;
        this.f102920f = executor;
        this.f102917c = bmzi3;
    }

    /* renamed from: a */
    private static btdb m88176a(btdb btdb) {
        if (btdb.f148372a.isEmpty()) {
            return btdb;
        }
        btec btec = (btec) btdb.f148372a.get(0);
        bler bler = btec.f148492a;
        if (bler == null) {
            bler = bler.f126245D;
        }
        bxvd bxvd = (bxvd) btdb.mo74142c(5);
        bxvd.mo73625a((bxvk) btdb);
        btda btda = (btda) bxvd;
        if (btda.f164950c) {
            btda.mo74035c();
            btda.f164950c = false;
        }
        btdb btdb2 = btdb.f148370b;
        ((btdb) btda.f164949b).f148372a = bxvk.m124030de();
        bxvd bxvd2 = (bxvd) btec.mo74142c(5);
        bxvd2.mo73625a((bxvk) btec);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        btec btec2 = btec.f148490c;
        ((btec) bxvd2.f164949b).f148492a = null;
        bxvd bxvd3 = (bxvd) bler.mo74142c(5);
        bxvd3.mo73625a((bxvk) bler);
        bleq bleq = (bleq) bxvd3;
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        ((bler) bleq.f164949b).f126255e = bxvk.m124030de();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bler bler2 = (bler) bleq.mo74062i();
        bler2.getClass();
        ((btec) bxvd2.f164949b).f148492a = bler2;
        btda.mo70743a(bxvd2);
        return (btdb) btda.mo74062i();
    }

    /* renamed from: b */
    private static btdb m88179b(btdb btdb) {
        if (btdb.f148372a.isEmpty()) {
            return btdb;
        }
        btec btec = (btec) btdb.f148372a.get(0);
        bler bler = btec.f148492a;
        if (bler == null) {
            bler = bler.f126245D;
        }
        bxvd bxvd = (bxvd) btdb.mo74142c(5);
        bxvd.mo73625a((bxvk) btdb);
        btda btda = (btda) bxvd;
        if (btda.f164950c) {
            btda.mo74035c();
            btda.f164950c = false;
        }
        btdb btdb2 = btdb.f148370b;
        ((btdb) btda.f164949b).f148372a = bxvk.m124030de();
        bxvd bxvd2 = (bxvd) btec.mo74142c(5);
        bxvd2.mo73625a((bxvk) btec);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        btec btec2 = btec.f148490c;
        ((btec) bxvd2.f164949b).f148492a = null;
        bxvd bxvd3 = (bxvd) bler.mo74142c(5);
        bxvd3.mo73625a((bxvk) bler);
        bleq bleq = (bleq) bxvd3;
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        ((bler) bleq.f164949b).f126255e = bxvk.m124030de();
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler2 = (bler) bleq.f164949b;
        bler2.f126251a &= -257;
        bler2.f126248B = bler.f126245D.f126248B;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bler bler3 = (bler) bleq.mo74062i();
        bler3.getClass();
        ((btec) bxvd2.f164949b).f148492a = bler3;
        btda.mo70743a(bxvd2);
        return (btdb) btda.mo74062i();
    }

    /* renamed from: a */
    private static boolean m88177a(bbjt bbjt) {
        bbjs bbjs = bbjt.f102788c;
        if (bbjs == null) {
            bbjs = bbjs.f102776g;
        }
        return !bbjs.equals(bbjs.f102776g);
    }

    /* renamed from: a */
    private static boolean m88178a(btdb btdb, btdb btdb2) {
        bley a = bbmo.m88189a(btdb);
        bley a2 = bbmo.m88189a(btdb2);
        if (a == null && a2 == null) {
            return false;
        }
        return a == null || a2 == null || !a.f126309e.equals(a2.f126309e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bbjs mo56206a(Exception exc) {
        int b = afsp.m53514b();
        if (b != 0) {
            bnsi c = ((bnsn) this.f102917c.mo6606a()).mo68388c();
            c.mo68402a(b);
            c.mo68437a(exc);
            c.mo68432a("bbmm", "a", 283, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Photo download failed!");
        }
        return bbjs.f102776g;
    }

    /* renamed from: a */
    public final bqgg mo56207a(int i) {
        AtomicReference atomicReference = new AtomicReference();
        return bqdx.m112673a(this.f102921g.mo56161a(new bblq(this, atomicReference, i), bqfb.INSTANCE), new bbmb(this, atomicReference), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56208a(bbjt bbjt, btdb btdb) {
        bqgg bqgg;
        btdb btdb2 = bbjt.f102787b;
        if (btdb2 == null) {
            btdb2 = btdb.f148370b;
        }
        if (m88178a(btdb2, btdb)) {
            bqgg = bqga.m112775a((Object) true);
        } else if (afsp.m53516d() && !m88177a(bbjt)) {
            bqgg = bqga.m112775a((Object) true);
        } else if (!afsp.m53513a() || !m88177a(bbjt)) {
            bqgg = bqga.m112775a((Object) false);
        } else {
            bbjs bbjs = bbjt.f102788c;
            if (bbjs == null) {
                bbjs = bbjs.f102776g;
            }
            bqgg = bqdx.m112673a(bqdf.m112619a(bqga.m112786c(this.f102922h.mo56178a(bbjs, 0), this.f102922h.mo56178a(bbjs, 1), this.f102922h.mo56178a(bbjs, 2), this.f102922h.mo56178a(bbjs, 3), this.f102922h.mo56178a(bbjs, 4)).mo69216a(bblv.f102884a, bqfb.INSTANCE), Exception.class, bblw.f102885a, bqfb.INSTANCE), bblu.f102883a, bqfb.INSTANCE);
        }
        bqgg a = bqdx.m112674a(bqgg, new bbls(this, bbjt, btdb), bqfb.INSTANCE);
        return afsp.m53516d() ? bqdf.m112619a(a, Exception.class, new bblt(this), bqfb.INSTANCE) : a;
    }

    /* renamed from: a */
    public final bqgg mo56209a(btet btet) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return bqdx.m112673a(this.f102921g.mo56161a(new bbmf(this, atomicReference, btet, atomicReference2), bqfb.INSTANCE), new bbmg(this, atomicReference2, atomicReference), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56210a(btev btev) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return bqdx.m112673a(this.f102921g.mo56161a(new bbmd(this, atomicReference, btev, atomicReference2), bqfb.INSTANCE), new bbme(this, atomicReference2, atomicReference), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final boolean mo56211a(bbjt bbjt, bbjt bbjt2) {
        btdb btdb = bbjt2.f102787b;
        if (btdb == null) {
            btdb = btdb.f148370b;
        }
        btdb btdb2 = bbjt.f102787b;
        if (btdb2 == null) {
            btdb2 = btdb.f148370b;
        }
        boolean z = false;
        if (!cfhg.f184087a.mo6606a().mo81244h() ? !m88179b(btdb2).equals(m88179b(btdb)) : !m88176a(btdb2).equals(m88176a(btdb))) {
            bbkr bbkr = (bbkr) this.f102918d.mo6606a();
            if (bbkr != null) {
                Executor executor = this.f102920f;
                bbkr.getClass();
                executor.execute(new bbmh(bbkr));
                z = true;
            } else {
                z = true;
            }
        }
        if (!m88178a(btdb2, btdb)) {
            return z;
        }
        bbkr bbkr2 = (bbkr) this.f102919e.mo6606a();
        if (bbkr2 == null) {
            return true;
        }
        Executor executor2 = this.f102920f;
        bbkr2.getClass();
        executor2.execute(new bbmi(bbkr2));
        return true;
    }
}
