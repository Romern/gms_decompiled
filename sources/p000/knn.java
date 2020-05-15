package p000;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: knn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class knn implements klx {

    /* renamed from: a */
    private final boolean f24529a;

    /* renamed from: b */
    private final boolean f24530b;

    /* renamed from: c */
    private final kzn f24531c;

    /* renamed from: d */
    private final long f24532d;

    /* renamed from: e */
    private final kli f24533e;

    /* renamed from: f */
    private final Map f24534f = new ConcurrentHashMap();

    /* renamed from: a */
    private final bmxv m18210a(String str, bmxv bmxv) {
        bqgg bqgg = (bqgg) this.f24534f.get(str);
        if (bqgg == null) {
            bqgg = this.f24531c.mo14951a(str);
        }
        try {
            bmxv bmxv2 = (bmxv) bqgg.get(this.f24532d, TimeUnit.MILLISECONDS);
            if (!bmxv2.mo66813a()) {
                return bmxv.m108566b(knm.m18207c());
            }
            bngs j = bngx.m109377j();
            bxwc bxwc = ((kzd) bmxv2.mo66814b()).f25443a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                kzt kzt = (kzt) bxwc.get(i);
                if (bmxv.mo66813a() && bnzb.m110869a(kzt.f25473a).equals(bmxv.mo66814b())) {
                    j.mo67668c(kzt);
                }
            }
            return bmxv.m108566b(new kmt(true, j.mo67664a()));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f24533e.mo14629a(e, "Failed to retrieve prediction data.", new Object[0]);
            return bmxv.m108566b(knm.m18207c());
        }
    }

    /* renamed from: a */
    public final bqgg mo14691a(klu klu, bqgj bqgj) {
        return klr.m18129a(this, klu, bqgj);
    }

    /* renamed from: b */
    public final void mo14694b(kjx kjx) {
        this.f24534f.remove(((kjv) kjx).f24281a);
    }

    public knn(kkp kkp, kzn kzn) {
        this.f24529a = kkp.mo14599r();
        this.f24530b = kkp.mo14600s();
        this.f24533e = kkp.mo14608z().mo14627a(getClass());
        this.f24531c = kzn;
        this.f24532d = kkp.mo14605w();
    }

    /* renamed from: a */
    private final bngx m18211a(bmxv bmxv, bmxv bmxv2, bngx bngx) {
        if (!this.f24529a) {
            return bngx.m109376e();
        }
        boolean a = bmxv.mo66813a();
        boolean z = false;
        boolean z2 = true;
        if (!bngx.isEmpty()) {
            z = true;
        } else if (!bmxv2.mo66813a() || !((knm) bmxv2.mo66814b()).mo14708a()) {
            z2 = false;
        }
        return bngx.m109356a(new kms(lbc.SERVER_TRUTH_DATA, a, z2, z));
    }

    /* renamed from: a */
    private final Collection m18212a(kom kom, kkb kkb, bnht bnht) {
        bnzb bnzb = (bnzb) kkb.f24296b.get(kom);
        if (bnzb != null) {
            return bnht.mo67692g(bnzb.m110868a(bnzb.mo68741c()));
        }
        this.f24533e.mo14630b("Node fingerprint missing from input", new Object[0]);
        return bngx.m109376e();
    }

    /* renamed from: a */
    public final klw mo14692a(klu klu) {
        bmxv bmxv;
        bngx bngx;
        bngx bngx2;
        int i;
        klu klu2 = klu;
        kjx kjx = klu2.f24441c;
        if (klu2.mo14690b(4)) {
            bmxv = bmxv.m108566b((kkb) klu2.mo14688a(4).mo66814b());
        } else if (klu2.mo14690b(3)) {
            bmxv = bmxv.m108566b((kkb) klu2.mo14688a(3).mo66814b());
        } else {
            bmxv = klu2.mo14690b(2) ? bmxv.m108566b((kkb) klu2.mo14688a(2).mo66814b()) : bmvz.f131120a;
        }
        if (!bmxv.mo66813a()) {
            return new klw(bngx.m109376e(), klu2.f24439a, bmvz.f131120a, m18211a(bmxv, m18210a(((kjv) kjx).f24281a, bmvz.f131120a), bngx.m109376e()));
        }
        kkb kkb = (kkb) bmxv.mo66814b();
        bnhp b = bnht.m109442b();
        bmxv a = m18210a(((kjv) kjx).f24281a, bmxv.m108566b(kkb.f24295a));
        if (a.mo66813a()) {
            bngx = ((knm) a.mo66814b()).mo14709b();
        } else {
            bngx = bngx.m109376e();
        }
        bnre i2 = bngx.listIterator();
        while (i2.hasNext()) {
            bxwc bxwc = ((kzt) i2.next()).f25474b;
            int size = bxwc.size();
            int i3 = 0;
            while (i3 < size) {
                bxwc bxwc2 = ((kzg) bxwc.get(i3)).f25451a;
                int size2 = bxwc2.size();
                int i4 = 0;
                while (true) {
                    i = i3 + 1;
                    if (i4 >= size2) {
                        break;
                    }
                    kzf kzf = (kzf) bxwc2.get(i4);
                    b.mo67728a(bnzb.m110868a(kzf.f25447a), new bxvv(kzf.f25448b, kzf.f25444c));
                    i4++;
                    i2 = i2;
                    bxwc = bxwc;
                }
                i3 = i;
            }
        }
        bnht c = b.mo67731c();
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        bnre i5 = klu2.f24439a.listIterator();
        while (i5.hasNext()) {
            kom kom = (kom) i5.next();
            Collection a2 = m18212a(kom, kkb, c);
            if (a2.isEmpty()) {
                j2.mo67668c(kom);
            } else {
                kjk a3 = kjl.m17933a(kom);
                a3.mo14527b(a2);
                a3.mo14526a(lbc.SERVER_TRUTH_DATA);
                j.mo67668c(a3.mo14524a());
            }
        }
        bmxv bmxv2 = bmvz.f131120a;
        bnre i6 = klu2.f24440b.listIterator();
        while (i6.hasNext()) {
            kom kom2 = (kom) i6.next();
            Collection a4 = m18212a(kom2, kkb, c);
            if (a4.contains(kpb.SUBMIT)) {
                if (a4.size() != 1) {
                    this.f24533e.mo14630b("More than 1 field type for field marked as SUBMIT, field ignored.", new Object[0]);
                } else {
                    lbc lbc = lbc.SERVER_TRUTH_DATA;
                    bmxy.m108581a(kom2);
                    bmxv2 = bmxv.m108566b(new kjh(kom2, lbc, 0));
                }
            }
        }
        bngx a5 = j.mo67664a();
        bngs j3 = bngx.m109377j();
        j3.mo67666b((Iterable) m18211a(bmxv, a, bngx));
        if (!this.f24530b) {
            bngx2 = bngx.m109376e();
        } else {
            bngs j4 = bngx.m109377j();
            int size3 = a5.size();
            for (int i7 = 0; i7 < size3; i7++) {
                kjl kjl = (kjl) a5.get(i7);
                j4.mo67668c(klv.m18138a(kjl.mo14518c(), kjl.mo14516a(), kjl.mo14517b()));
            }
            bngx2 = j4.mo67664a();
        }
        j3.mo67666b((Iterable) bngx2);
        return new klw(a5, j2.mo67664a(), bmxv2, j3.mo67664a());
    }

    /* renamed from: a */
    public final void mo14693a(kjx kjx) {
        String str = ((kjv) kjx).f24281a;
        this.f24534f.put(str, this.f24531c.mo14951a(str));
    }
}
