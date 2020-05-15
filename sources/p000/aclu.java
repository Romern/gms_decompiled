package p000;

/* renamed from: aclu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aclu implements aubq {

    /* renamed from: a */
    final /* synthetic */ aclv f60129a;

    /* renamed from: b */
    private final aucf f60130b;

    public aclu(aclv aclv, aucf aucf) {
        this.f60129a = aclv;
        this.f60130b = aucf;
        aclv.f60134d++;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f60130b.mo50391a(aucb.mo50386d());
        } else {
            Exception e = aucb.mo50387e();
            if (e != null) {
                this.f60130b.mo50390a(e);
            }
        }
        synchronized (this.f60129a) {
            aclv aclv = this.f60129a;
            int i = aclv.f60134d - 1;
            aclv.f60134d = i;
            if (i == 0) {
                if (!aclv.f60132b.isEmpty()) {
                    this.f60129a.mo32871a();
                } else if (!this.f60129a.f60133c.isEmpty()) {
                    this.f60129a.mo32874b();
                }
            }
        }
    }
}
