package p000;

/* renamed from: bktm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bktm extends bktj {
    public bktm() {
        super(38);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        bkpp bkpp;
        Object obj;
        String g = bkxi.mo66434g();
        bkpp[] values = bkpp.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bkpp = bkpp.UNKNOWN;
                break;
            }
            bkpp = values[i];
            if (bkpp.f125081c.equals(g)) {
                break;
            }
            i++;
        }
        blgm blgm = (blgm) bkxi.mo66427a(bkqh.f125111a);
        blgl blgl = blgl.KIND_NOT_SET;
        int ordinal = blgm.f126445b.ordinal();
        if (ordinal == 1) {
            obj = null;
        } else if (ordinal == 2) {
            obj = Double.valueOf(blgm.mo66490a());
        } else if (ordinal == 3) {
            obj = blgm.mo66491b();
        } else if (ordinal == 4) {
            obj = Boolean.valueOf(blgm.mo66492c());
        } else {
            throw new IllegalArgumentException();
        }
        return new bkpq(bkpp, obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66346a(bkxh bkxh, Object obj) {
        bkpq bkpq = (bkpq) obj;
        mo66348a(bkxh);
        bkxh.mo66422b(bkpq.f125082a.f125081c);
        Object obj2 = bkpq.f125083b;
        if (obj2 instanceof Boolean) {
            bkxh.mo66420a(((Boolean) obj2).booleanValue());
            bkxh.mo66421b();
            return;
        }
        throw new IllegalArgumentException();
    }
}
