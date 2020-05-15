package p000;

/* renamed from: bnom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnom extends bnhy {

    /* renamed from: a */
    static final bnom f131919a = new bnom(new bnnx());

    /* renamed from: b */
    final transient bnnx f131920b;

    /* renamed from: c */
    private final transient int f131921c;

    /* renamed from: d */
    private transient bnic f131922d;

    public bnom(bnnx bnnx) {
        this.f131920b = bnnx;
        long j = 0;
        for (int i = 0; i < bnnx.f131884c; i++) {
            j += (long) bnnx.mo68153c(i);
        }
        this.f131921c = bqcn.m112585b(j);
    }

    /* renamed from: a */
    public final int mo67285a(Object obj) {
        return this.f131920b.mo68151b(obj);
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return false;
    }

    /* renamed from: i */
    public final bnic mo67323d() {
        bnic bnic = this.f131922d;
        if (bnic != null) {
            return bnic;
        }
        bnok bnok = new bnok(this);
        this.f131922d = bnok;
        return bnok;
    }

    public final int size() {
        return this.f131921c;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnol(this);
    }

    /* renamed from: a */
    public final bnno mo67745a(int i) {
        return this.f131920b.mo68158h(i);
    }
}
