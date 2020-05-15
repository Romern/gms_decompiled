package p000;

/* renamed from: odc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class odc implements ocz {

    /* renamed from: a */
    public static final odc f37214a = new odc();

    /* renamed from: b */
    public final bmzq f37215b;

    /* renamed from: c */
    public long f37216c;

    /* renamed from: d */
    private final bnhe f37217d;

    private odc() {
        bmzq bmzq = bmvy.f131119a;
        bmxy.m108581a(bmzq);
        this.f37215b = bmzq;
        bnha h = bnhe.m109414h();
        bpcy[] values = bpcy.values();
        for (bpcy bpcy : values) {
            h.mo67695b(bpcy, new odb(this, bpcy));
        }
        this.f37217d = bnmt.m109791a(h.mo67618b());
    }

    /* renamed from: a */
    public final bngx mo21979a() {
        bngs bngs = new bngs();
        bnrd a = this.f37217d.values().iterator();
        while (a.hasNext()) {
            odb odb = (odb) a.next();
            bngs.getClass();
            oda oda = new oda(bngs);
            if (odb.mo21985b()) {
                oda.f37209a.mo67668c(odb.f37210a);
            }
        }
        return bngs.mo67664a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21980a(bpcy bpcy) {
        odb odb = (odb) this.f37217d.get(bpcy);
        bmxy.m108581a(odb);
        return odb.mo21984a();
    }
}
