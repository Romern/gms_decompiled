package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/* renamed from: klf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class klf implements kju {

    /* renamed from: a */
    public final bngx f24414a;

    /* renamed from: b */
    public final kpk f24415b;

    /* renamed from: c */
    public final klq f24416c;

    /* renamed from: d */
    public final klx f24417d;

    /* renamed from: e */
    public final klo f24418e;

    /* renamed from: f */
    public final boolean f24419f;

    /* renamed from: g */
    public final boolean f24420g;

    /* renamed from: h */
    public final kli f24421h;

    public klf(kkp kkp, Iterable iterable, kpk kpk, klq klq, klx klx, klo klo) {
        this.f24419f = kkp.mo14606x();
        this.f24420g = kkp.mo14607y();
        this.f24414a = bngx.m109355a(iterable);
        this.f24415b = kpk;
        this.f24416c = klq;
        this.f24417d = klx;
        this.f24418e = klo;
        bqgs.m112811a(adzl.f62962b.mo25874a());
        this.f24421h = kkp.mo14608z().mo14627a(getClass());
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static List m18101a(Collection r8, bmxv bmxv, Map map, kor kor) {
        bmxv bmxv2;
        kjo kjo;
        if (r8.isEmpty()) {
            return bngx.m109376e();
        }
        Optional max = map.entrySet().stream().max(Comparator.comparingInt(kkt.f24384a));
        if (max.isPresent()) {
            Map.Entry entry = (Map.Entry) max.get();
            bmxv2 = bmxv.m108566b(kka.m17968a(((kkb) entry.getValue()).f24295a, ((Integer) entry.getKey()).intValue()));
        } else {
            bmxv2 = bmvz.f131120a;
        }
        HashMap hashMap = new HashMap();
        int size = r8.size();
        for (int i = 0; i < size; i++) {
            kjl kjl = (kjl) r8.get(i);
            kcv a = kor.mo14758a(kjl.mo14516a());
            kjo kjo2 = (kjo) hashMap.get(a);
            if (kjo2 == null) {
                kjo2 = kjp.m17947a(a);
                hashMap.put(a, kjo2);
                if (bmxv2.mo66813a()) {
                    kjo2.f24262d = (kka) bmxv2.mo66814b();
                }
            }
            kjo2.f24259a.mo67667b((Object[]) new kjl[]{kjl});
            if (kjl.mo14516a().f24620s) {
                kjo2.f24260b = kjl;
            }
        }
        if (bmxv.mo66813a() && (kjo = (kjo) hashMap.get(kor.mo14758a(((kjj) bmxv.mo66814b()).mo14510a()))) != null) {
            kjo.f24261c = (kjj) bmxv.mo66814b();
        }
        return (List) hashMap.values().stream().map(kku.f24385a).collect(Collectors.toList());
    }

    /* renamed from: a */
    public final bqgg mo14544a(kjr kjr, bqgj bqgj) {
        if (this.f24420g) {
            bqgj.mo25812a(new kkr(this, kjr));
        }
        List list = (List) kjr.f24275c.stream().filter(kkw.f24388a).map(new kkx(this, kjr, bqgj)).collect(Collectors.toList());
        return bqga.m112782b(list).mo69214a(new kky(this, bqgj, kjr, list), bqgj);
    }

    /* renamed from: a */
    public final kjl mo14674a(kjl kjl, Map map) {
        int i;
        bngs b = bngx.m109371b(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            bnzb bnzb = (bnzb) ((kkb) entry.getValue()).f24296b.get(kjl.mo14516a());
            if (bnzb != null) {
                b.mo67668c(kka.m17968a(bnzb, ((Integer) entry.getKey()).intValue()));
            } else {
                this.f24421h.mo14630b("Missing hash code for node in version %d", entry.getKey());
            }
        }
        bngx a = b.mo67664a();
        kjk f = kjl.mo14534f();
        f.f24253b = bnhe.m109414h();
        int size = a.size();
        for (i = 0; i < size; i++) {
            kka kka = (kka) a.get(i);
            f.f24253b.mo67695b(Integer.valueOf(kka.mo14555b()), kka);
        }
        return f.mo14524a();
    }

    /* renamed from: a */
    public final kor mo14675a(kom kom, kck kck) {
        kor kor = new kor();
        kow.m18270a(kom, new kov(new kks(this, kor, kck), kor));
        return kor;
    }
}
