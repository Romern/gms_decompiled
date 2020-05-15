package p000;

/* renamed from: bktp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bktp extends bktj {

    /* renamed from: a */
    private final bkum f125272a = new bkum();

    public bktp() {
        super(26);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        int b = bkxi.mo66429b();
        long parseLong = Long.parseLong(bkxi.mo66434g(), 16);
        bkxi.mo66434g();
        String g = bkxi.mo66434g();
        blhg blhg = (blhg) bkti.m106597a(bkxi);
        int b2 = bkxi.mo66429b();
        String g2 = bkxi.mo66434g();
        return new bkps(blhg, parseLong, b, g, b2, (g2 == null || g2.isEmpty()) ? null : Long.valueOf(Long.parseLong(g2, 16)));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66346a(bkxh bkxh, Object obj) {
        bkps bkps = (bkps) obj;
        mo66348a(bkxh);
        bkxh.mo66418a(bkps.f125087c);
        bkxh.mo66422b(Long.toHexString(bkps.f125086b));
        bkxh.mo66422b("");
        String str = bkps.f125088d;
        if (str != null) {
            bkxh.mo66422b(str);
        } else {
            bkxh.mo66425e();
        }
        this.f125272a.mo66346a(bkxh, bkps.f125085a);
        bkxh.mo66418a(bkps.f125089e);
        Long l = bkps.f125090f;
        if (l != null) {
            bkxh.mo66422b(Long.toHexString(l.longValue()));
        } else {
            bkxh.mo66425e();
        }
        bkxh.mo66421b();
    }
}
