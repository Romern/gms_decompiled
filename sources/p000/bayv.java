package p000;

/* renamed from: bayv */
final /* synthetic */ class bayv implements bqeh {

    /* renamed from: a */
    private final bbav f102127a;

    /* renamed from: b */
    private final bavd f102128b;

    /* renamed from: c */
    private final int f102129c;

    /* renamed from: d */
    private final int f102130d;

    public bayv(bbav bbav, bavd bavd, int i, int i2) {
        this.f102127a = bbav;
        this.f102128b = bavd;
        this.f102129c = i;
        this.f102130d = i2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102127a;
        bavd bavd = this.f102128b;
        int i = this.f102129c;
        int i2 = this.f102130d;
        if (((Boolean) obj).booleanValue()) {
            return bbav.mo56042a(bavd, i + 1, i2);
        }
        bbev.m87906a("%s: Subscribing to file failed for group: %s", "FileGroupManager", bavd.f101873c);
        return bqga.m112775a((Object) false);
    }
}
