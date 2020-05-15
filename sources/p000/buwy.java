package p000;

/* renamed from: buwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwy implements bvcd {

    /* renamed from: a */
    final /* synthetic */ buxb f155199a;

    /* renamed from: b */
    private buxt f155200b;

    public buwy(buxb buxb) {
        this.f155199a = buxb;
    }

    /* renamed from: a */
    public final void mo73218a(bvcb bvcb) {
        if (this.f155200b == null) {
            buxb buxb = this.f155199a;
            buxv buxv = buxb.f155210h;
            buxv.getClass();
            this.f155200b = new buxt(buxv, buxb.f155219q, buxb.f155220r);
            this.f155199a.mo73221a(buxb.m120647a(bvcb), this.f155200b);
        }
    }

    /* renamed from: a */
    public final void mo73219a(bvcc bvcc) {
        if (this.f155200b != null) {
            this.f155199a.mo73221a(buxb.m120648a(bvcc), this.f155200b.f155251b);
            this.f155200b = null;
        }
    }
}
