package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bblp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bblp implements bbks {

    /* renamed from: a */
    public final bbko f102866a;

    /* renamed from: b */
    public final bbkl f102867b;

    /* renamed from: c */
    public final bmzi f102868c;

    /* renamed from: d */
    private final bmzi f102869d;

    /* renamed from: e */
    private final bmzi f102870e;

    /* renamed from: f */
    private final Executor f102871f;

    /* renamed from: g */
    private final bbja f102872g;

    /* renamed from: h */
    private final bbkj f102873h;

    public bblp(bbja bbja, bbko bbko, bbkl bbkl, bbkj bbkj, bmzi bmzi, bmzi bmzi2, Executor executor, bmzi bmzi3) {
        this.f102872g = bbja;
        this.f102866a = bbko;
        this.f102867b = bbkl;
        this.f102873h = bbkj;
        this.f102869d = bmzi;
        this.f102870e = bmzi2;
        this.f102871f = executor;
        this.f102868c = bmzi3;
    }

    /* renamed from: a */
    private static btdb m88157a(btdb btdb) {
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

    /* renamed from: a */
    private static boolean m88158a(bbjt bbjt) {
        bbjs bbjs = bbjt.f102788c;
        if (bbjs == null) {
            bbjs = bbjs.f102776g;
        }
        return !bbjs.equals(bbjs.f102776g);
    }

    /* renamed from: a */
    private static boolean m88159a(btdb btdb, btdb btdb2) {
        bley a = bbmo.m88189a(btdb);
        bley a2 = bbmo.m88189a(btdb2);
        if (a == null && a2 == null) {
            return false;
        }
        return a == null || a2 == null || !a.f126309e.equals(a2.f126309e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bbjs mo56200a(Exception exc) {
        int b = afsp.m53514b();
        if (b != 0) {
            bnsi c = ((bnsn) this.f102868c.mo6606a()).mo68388c();
            c.mo68402a(b);
            c.mo68437a(exc);
            c.mo68432a("bblp", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Photo download failed!");
        }
        return bbjs.f102776g;
    }

    /* renamed from: a */
    public final bqgg mo56194a(int i) {
        AtomicReference atomicReference = new AtomicReference();
        return bqdx.m112673a(this.f102872g.mo56161a(new bbkt(this, atomicReference, i), bqfb.INSTANCE), new bble(this, atomicReference), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56201a(bbjt bbjt, btdb btdb) {
        bqgg bqgg;
        btdb btdb2 = bbjt.f102787b;
        if (btdb2 == null) {
            btdb2 = btdb.f148370b;
        }
        if (m88159a(btdb2, btdb)) {
            bqgg = bqga.m112775a((Object) true);
        } else if (afsp.m53516d() && !m88158a(bbjt)) {
            bqgg = bqga.m112775a((Object) true);
        } else if (!afsp.m53513a() || !m88158a(bbjt)) {
            bqgg = bqga.m112775a((Object) false);
        } else {
            bbjs bbjs = bbjt.f102788c;
            if (bbjs == null) {
                bbjs = bbjs.f102776g;
            }
            bqgg = bqdx.m112673a(bqdf.m112619a(bqga.m112786c(this.f102873h.mo56178a(bbjs, 0), this.f102873h.mo56178a(bbjs, 1), this.f102873h.mo56178a(bbjs, 2), this.f102873h.mo56178a(bbjs, 3), this.f102873h.mo56178a(bbjs, 4)).mo69216a(bbky.f102835a, bqfb.INSTANCE), Exception.class, bbkz.f102836a, bqfb.INSTANCE), bbkx.f102834a, bqfb.INSTANCE);
        }
        bqgg a = bqdx.m112674a(bqgg, new bbkv(this, bbjt, btdb), bqfb.INSTANCE);
        return afsp.m53516d() ? bqdf.m112619a(a, Exception.class, new bbkw(this), bqfb.INSTANCE) : a;
    }

    /* renamed from: a */
    public final bqgg mo56195a(btet btet) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return bqdx.m112673a(this.f102872g.mo56161a(new bbli(this, atomicReference, btet, atomicReference2), bqfb.INSTANCE), new bblj(this, atomicReference, atomicReference2), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56196a(btev btev) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return bqdx.m112673a(this.f102872g.mo56161a(new bblg(this, atomicReference, btev, atomicReference2), bqfb.INSTANCE), new bblh(this, atomicReference, atomicReference2), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo56202a(bbjt bbjt, bbjt bbjt2) {
        bbkr bbkr;
        bbkr bbkr2;
        btdb btdb = bbjt2.f102787b;
        if (btdb == null) {
            btdb = btdb.f148370b;
        }
        btdb btdb2 = bbjt.f102787b;
        if (btdb2 == null) {
            btdb2 = btdb.f148370b;
        }
        if (!m88157a(btdb2).equals(m88157a(btdb)) && (bbkr2 = (bbkr) this.f102869d.mo6606a()) != null) {
            Executor executor = this.f102871f;
            bbkr2.getClass();
            executor.execute(new bblk(bbkr2));
        }
        if (m88159a(btdb2, btdb) && (bbkr = (bbkr) this.f102870e.mo6606a()) != null) {
            Executor executor2 = this.f102871f;
            bbkr.getClass();
            executor2.execute(new bbll(bbkr));
        }
    }
}
