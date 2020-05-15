package p000;

/* renamed from: bclr */
final /* synthetic */ class bclr implements bmxj {

    /* renamed from: a */
    private final bcoh f104443a;

    /* renamed from: b */
    private final String f104444b;

    /* renamed from: c */
    private final bcnt f104445c;

    public bclr(bcoh bcoh, String str, bcnt bcnt) {
        this.f104443a = bcoh;
        this.f104444b = str;
        this.f104445c = bcnt;
    }

    public final Object apply(Object obj) {
        bcoh bcoh = this.f104443a;
        String str = this.f104444b;
        bcnt bcnt = this.f104445c;
        cbgd cbgd = (cbgd) obj;
        bcuc e = bcud.m90006e();
        e.mo57567b(cbgd.f177018a);
        e.mo57565a(cbgd.f177019b);
        e.mo57566a(bbow.m88301a(cbgd.f177020c, new bclv(bcoh, str, bcnt)));
        return e.mo57564a();
    }
}
