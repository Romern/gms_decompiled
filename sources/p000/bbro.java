package p000;

/* renamed from: bbro */
final /* synthetic */ class bbro implements bmxj {

    /* renamed from: a */
    private final bbrr f103225a;

    /* renamed from: b */
    private final bcoh f103226b;

    public bbro(bbrr bbrr, bcoh bcoh) {
        this.f103225a = bbrr;
        this.f103226b = bcoh;
    }

    public final Object apply(Object obj) {
        bbrr bbrr = this.f103225a;
        return Long.valueOf(((Long) obj).longValue() + Long.valueOf(bbrr.f103236d.mo56674a(this.f103226b).getLong("BLOCK_LAST_SYNC_KEY", 0)).longValue());
    }
}
