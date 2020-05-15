package p000;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: bkws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkws {

    /* renamed from: a */
    public static final bkws f125357a = new bkws(false);

    /* renamed from: b */
    public static final bkws f125358b = new bkws(true);

    /* renamed from: c */
    private static final Map f125359c = new EnumMap(blhf.class);

    /* renamed from: d */
    private final bkwk f125360d = new bkwj(this);

    private bkws(boolean z) {
        blhf blhf = blhf.INSERT;
        m106773a(blhf, blhf, new bkwb());
        blhf blhf2 = blhf.DELETE;
        m106773a(blhf2, blhf2, new bkvp());
        blhf blhf3 = blhf.UPDATE;
        m106773a(blhf3, blhf3, new bkwt());
        blhf blhf4 = blhf.SET;
        m106773a(blhf4, blhf4, new bkwl());
        blhf blhf5 = blhf.INDEX;
        m106773a(blhf5, blhf5, new bkvz());
        m106773a(blhf.DELETE, blhf.SET, new bkvs());
        m106773a(blhf.INSERT, blhf.SET, new bkwc());
        m106773a(blhf.DELETE, blhf.INSERT, new bkvr());
        m106773a(blhf.INSERT, blhf.INDEX, new bkwa());
        m106773a(blhf.DELETE, blhf.INDEX, new bkvq());
        m106773a(blhf.MOVE, blhf.DELETE, new bkwd());
        m106773a(blhf.MOVE, blhf.INDEX, new bkwe());
        m106773a(blhf.MOVE, blhf.INSERT, new bkwf());
        m106773a(blhf.MOVE, blhf.MOVE, new bkwg(z));
        m106773a(blhf.MOVE, blhf.SET, new bkwh());
        m106773a(blhf.DESTROY_OBJECT, blhf.CREATE, new bkvt());
        m106773a(blhf.DESTROY_OBJECT, blhf.DELETE, new bkvt());
        m106773a(blhf.DESTROY_OBJECT, blhf.DESTROY_OBJECT, new bkvt());
        m106773a(blhf.DESTROY_OBJECT, blhf.INDEX, new bkvu());
        m106773a(blhf.DESTROY_OBJECT, blhf.INSERT, new bkvv());
        m106773a(blhf.DESTROY_OBJECT, blhf.MOVE, new bkvw());
        m106773a(blhf.DESTROY_OBJECT, blhf.SET, new bkvx());
        m106773a(blhf.DESTROY_OBJECT, blhf.UPDATE, new bkvy());
    }

    /* renamed from: a */
    private final bkwk m106772a(blhf blhf, blhf blhf2) {
        if (blhf == blhf.COMPOUND || blhf2 == blhf.COMPOUND) {
            return this.f125360d;
        }
        Map map = (Map) f125359c.get(blhf);
        if (map != null) {
            return (bkwk) map.get(blhf2);
        }
        return null;
    }

    /* renamed from: a */
    private static final void m106773a(blhf blhf, blhf blhf2, bkwk bkwk) {
        Map map = (Map) f125359c.get(blhf);
        if (map == null) {
            map = new EnumMap(blhf.class);
            f125359c.put(blhf, map);
        }
        map.put(blhf2, bkwk);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkws.a(bkwq, bkwq):void
     arg types: [bkwo, bkwr]
     candidates:
      bkws.a(blhf, blhf):bkwk
      bkws.a(java.util.List, blhg):blhg
      bkws.a(bkwp, bkwq):void
      bkws.a(bkwq, bkwq):void */
    /* renamed from: a */
    public final blhg mo66394a(List list, blhg blhg) {
        bkwo bkwo = new bkwo(list);
        bkwr bkwr = new bkwr(blhg);
        while (bkwo.f125352a != null) {
            mo66396a((bkwq) bkwo, (bkwq) bkwr);
            bkwo.mo66391d();
        }
        return bkwr.f125355a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkws.a(bkwq, bkwq):void
     arg types: [bkwp, bkwq]
     candidates:
      bkws.a(blhf, blhf):bkwk
      bkws.a(java.util.List, blhg):blhg
      bkws.a(bkwp, bkwq):void
      bkws.a(bkwq, bkwq):void */
    /* renamed from: a */
    public final void mo66395a(bkwp bkwp, bkwq bkwq) {
        while (bkwp.mo66389b() != null) {
            mo66396a((bkwq) bkwp, bkwq);
            bkwp.mo66391d();
        }
    }

    /* renamed from: a */
    public final void mo66396a(bkwq bkwq, bkwq bkwq2) {
        blhf f = bkwq.mo66393f();
        blhf f2 = bkwq2.mo66393f();
        bkwk a = m106772a(f, f2);
        if (a != null) {
            a.mo66386a(bkwq, bkwq2);
            return;
        }
        bkwk a2 = m106772a(f2, f);
        if (a2 != null) {
            a2.mo66386a(bkwq2, bkwq);
        }
    }
}
