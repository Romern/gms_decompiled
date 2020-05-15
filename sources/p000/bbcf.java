package p000;

/* renamed from: bbcf */
final /* synthetic */ class bbcf implements bqeh {

    /* renamed from: a */
    private final bbch f102308a;

    /* renamed from: b */
    private final bauy f102309b;

    /* renamed from: c */
    private final bavd f102310c;

    public bbcf(bbch bbch, bauy bauy, bavd bavd) {
        this.f102308a = bbch;
        this.f102309b = bauy;
        this.f102310c = bavd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbch bbch = this.f102308a;
        bauy bauy = this.f102309b;
        Void voidR = (Void) obj;
        int a = bavb.m87594a(this.f102310c.f101876f);
        if (a == 0) {
            a = 1;
        }
        try {
            return bqdx.m112673a(bbch.f102319f.mo56075b(bbdd.m87829a(bauy, a)), new bbbt(bauy), bbch.f102327n);
        } catch (bbdb e) {
            bbch.f102322i.mo55999a("Shared file not found for downloaded group", e);
            return bqga.m112777a((Throwable) e);
        }
    }
}
