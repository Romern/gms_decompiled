package p000;

/* renamed from: llw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class llw implements bqfp {

    /* renamed from: a */
    final /* synthetic */ llz f26333a;

    public llw(llz llz) {
        this.f26333a = llz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        if (bmxv != null && bmxv.mo66813a()) {
            this.f26333a.f26349p.setText((CharSequence) bmxv.mo66814b());
            this.f26333a.f26350q.setVisibility(0);
        }
        this.f26333a.mo15263i();
        if (this.f26333a.f26351r.isShowing()) {
            llz llz = this.f26333a;
            if (llz.f26352s) {
                llz.mo15262h();
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) llz.f26337d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68405a("Failed to fetch name.");
        this.f26333a.mo15263i();
        if (this.f26333a.f26351r.isShowing()) {
            llz llz = this.f26333a;
            if (llz.f26352s) {
                llz.mo15262h();
            }
        }
    }
}
