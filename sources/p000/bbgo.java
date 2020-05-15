package p000;

/* renamed from: bbgo */
final /* synthetic */ class bbgo implements bmxj {

    /* renamed from: a */
    private final bnhe f102598a;

    /* renamed from: b */
    private final bbfz f102599b;

    public bbgo(bnhe bnhe, bbfz bbfz) {
        this.f102598a = bnhe;
        this.f102599b = bbfz;
    }

    public final Object apply(Object obj) {
        return (bbfz) this.f102598a.getOrDefault((ByteString) obj, this.f102599b);
    }
}
