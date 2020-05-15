package p000;

/* renamed from: avgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avgj implements bmzi {

    /* renamed from: a */
    private final Object f93126a = new Object();

    /* renamed from: b */
    private final bmxj f93127b;

    /* renamed from: c */
    private bqbu f93128c;

    /* renamed from: d */
    private adym f93129d;

    public avgj(bmxj bmxj) {
        this.f93127b = bmxj;
        bqbu c = avgm.m78467c();
        this.f93128c = c;
        this.f93129d = (adym) bmxj.apply(c);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        adym adym;
        synchronized (this.f93126a) {
            bqbu c = avgm.m78467c();
            if (!c.equals(this.f93128c)) {
                this.f93128c = c;
                this.f93129d = (adym) this.f93127b.apply(c);
            }
            adym = this.f93129d;
        }
        return adym;
    }
}
