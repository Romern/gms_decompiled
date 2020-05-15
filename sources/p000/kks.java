package p000;

/* renamed from: kks */
final /* synthetic */ class kks implements bmxj {

    /* renamed from: a */
    private final klf f24381a;

    /* renamed from: b */
    private final kck f24382b;

    /* renamed from: c */
    private final kor f24383c;

    public kks(klf klf, kor kor, kck kck) {
        this.f24381a = klf;
        this.f24383c = kor;
        this.f24382b = kck;
    }

    public final Object apply(Object obj) {
        klf klf = this.f24381a;
        kor kor = this.f24383c;
        kck kck = this.f24382b;
        kom kom = (kom) obj;
        String str = kom.f24622u;
        if (str != null && !str.isEmpty()) {
            try {
                return klf.f24415b.mo14763a(str.length() == 0 ? new String("https://") : "https://".concat(str));
            } catch (kpi e) {
                throw new RuntimeException(e);
            }
        } else {
            bmxv bmxv = kom.f24625x;
            return bmxv.mo66813a() ? kor.mo14758a((kom) bmxv.mo66814b()) : kck;
        }
    }
}
