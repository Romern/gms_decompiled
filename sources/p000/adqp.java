package p000;

/* renamed from: adqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqp implements bqfp {

    /* renamed from: a */
    private final bqgg f62512a;

    /* renamed from: b */
    private final adqo f62513b;

    public adqp(bqgg bqgg, adqo adqo) {
        this.f62512a = bqgg;
        this.f62513b = adqo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            adqo adqo = this.f62513b;
            adqo.mo33710b();
            adqo.mo33711b(3);
        } else {
            adqo adqo2 = this.f62513b;
            adqo2.mo33710b();
            adqo2.mo33711b(4);
            adqo2.mo33708a(16);
        }
        adns.m50862a().mo33692a(this.f62513b.mo33707a());
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (this.f62512a.isCancelled()) {
            adqo adqo = this.f62513b;
            adqo.mo33710b();
            adqo.mo33711b(5);
        } else {
            adqo adqo2 = this.f62513b;
            adqo2.mo33710b();
            adqo2.mo33711b(4);
            adqo2.mo33708a(17);
        }
        adns.m50862a().mo33692a(this.f62513b.mo33707a());
    }
}
