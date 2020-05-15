package p000;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: bkts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkts extends bktj {

    /* renamed from: a */
    private static final List f125275a = new bkwy(new blgr[]{bksz.f125255a, bksz.f125256b, bksz.f125257c, null, bksz.f125258d});

    /* renamed from: b */
    private final Map f125276b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [blgq, int]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    public bkts() {
        super(7);
        EnumMap enumMap = new EnumMap(blgq.class);
        this.f125276b = enumMap;
        enumMap.put((Object) blgq.MAP, (Object) 0);
        this.f125276b.put(blgq.LIST, 1);
        this.f125276b.put(blgq.STRING, 2);
        this.f125276b.put(blgq.INDEX_REFERENCE, 4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        String g = bkxi.mo66434g();
        blgm blgm = (blgm) bkxi.mo66427a(bkqh.f125111a);
        if (blgm.f126445b == blgl.STRING_VALUE) {
            return bksz.m106575a(g, blgm.mo66491b());
        }
        return bksz.m106570a(g, (blgr) f125275a.get((int) blgm.mo66490a()));
    }

    /* renamed from: a */
    public final void mo66346a(bkxh bkxh, blhg blhg) {
        blgr a = blhg.mo66530a();
        mo66348a(bkxh);
        bkxh.mo66422b(blhg.f126523c);
        blgq blgq = a.f126464b;
        if (blgq == blgq.CUSTOM) {
            bkxh.mo66422b(a.mo66505a().f126529b);
        } else {
            Integer num = (Integer) this.f125276b.get(blgq);
            if (num != null) {
                bkxh.mo66418a(num.intValue());
            } else {
                throw new IllegalArgumentException();
            }
        }
        bkxh.mo66421b();
    }
}
