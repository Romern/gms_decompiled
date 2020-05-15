package p000;

import java.util.function.Function;

/* renamed from: kkx */
final /* synthetic */ class kkx implements Function {

    /* renamed from: a */
    private final klf f24389a;

    /* renamed from: b */
    private final kjr f24390b;

    /* renamed from: c */
    private final bqgj f24391c;

    public kkx(klf klf, kjr kjr, bqgj bqgj) {
        this.f24389a = klf;
        this.f24390b = kjr;
        this.f24391c = bqgj;
    }

    public final Object apply(Object obj) {
        klf klf = this.f24389a;
        kjr kjr = this.f24390b;
        bqgj bqgj = this.f24391c;
        koq koq = (koq) obj;
        kjx kjx = kjr.f24274b;
        kck kck = kjr.f24273a;
        if (!klf.f24419f) {
            return bqgj.mo25819b(new kle(klf, koq, kjx, kck));
        }
        bqgg b = bqgj.mo25819b(new kkz(klf, koq));
        bqgg a = bqdx.m112673a(b, new kla(klf), bqgj);
        bqgg a2 = bqdx.m112674a(a, new klb(klf, b, kjx, bqgj), bqgj);
        return bqdx.m112674a(bqdx.m112673a(a2, new klc(klf), bqgj), new kld(klf, a2, a, koq, kck), bqgj);
    }
}
