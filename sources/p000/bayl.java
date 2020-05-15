package p000;

/* renamed from: bayl */
final /* synthetic */ class bayl implements bqeh {

    /* renamed from: a */
    private final bbav f102103a;

    /* renamed from: b */
    private final bauy f102104b;

    /* renamed from: c */
    private final bavd f102105c;

    /* renamed from: d */
    private final boolean f102106d;

    /* renamed from: e */
    private final boolean f102107e;

    /* renamed from: f */
    private final int f102108f;

    /* renamed from: g */
    private final int f102109g;

    public bayl(bbav bbav, bauy bauy, bavd bavd, boolean z, boolean z2, int i, int i2) {
        this.f102103a = bbav;
        this.f102104b = bauy;
        this.f102105c = bavd;
        this.f102106d = z;
        this.f102107e = z2;
        this.f102108f = i;
        this.f102109g = i2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102103a;
        bauy bauy = this.f102104b;
        bavd bavd = this.f102105c;
        boolean z = this.f102106d;
        boolean z2 = this.f102107e;
        int i = this.f102108f;
        int i2 = this.f102109g;
        bavq bavq = (bavq) obj;
        if (bavq == bavq.DOWNLOAD_COMPLETE) {
            Object[] objArr = {"FileGroupManager", bauy.f101850b, bavd.f101873c};
            return bbav.mo56043a(bavd, z, z2, i + 1, i2);
        } else if (bavq == bavq.SUBSCRIBED || bavq == bavq.DOWNLOAD_IN_PROGRESS) {
            Object[] objArr2 = {"FileGroupManager", bauy.f101850b, bavd.f101873c};
            return bbav.mo56043a(bavd, z, true, i + 1, i2);
        } else {
            Object[] objArr3 = {"FileGroupManager", bauy.f101850b, bavd.f101873c};
            return bbav.mo56043a(bavd, true, z2, i + 1, i2);
        }
    }
}
