package p000;

/* renamed from: akye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akye implements bqfp {

    /* renamed from: a */
    final /* synthetic */ boolean f73103a;

    /* renamed from: b */
    final /* synthetic */ int f73104b;

    /* renamed from: c */
    final /* synthetic */ akyf f73105c;

    public akye(akyf akyf, boolean z, int i) {
        this.f73105c = akyf;
        this.f73103a = z;
        this.f73104b = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bxqg bxqg = (bxqg) obj;
        akyf.m60679a(this.f73105c.f73109b, this.f73103a, this.f73104b);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        akyf.f73106d.mo25417e("call to updateActivityControlsSettings failed", th, new Object[0]);
        akyf.m60676a(this.f73105c.f73109b, this.f73104b);
    }
}
