package p000;

/* renamed from: xgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xgu implements bqfp {

    /* renamed from: a */
    final /* synthetic */ xgv f52225a;

    /* renamed from: b */
    final /* synthetic */ int f52226b;

    public xgu(xgv xgv, int i) {
        this.f52225a = xgv;
        this.f52226b = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        xgv xgv = this.f52225a;
        xgv.f52231c = (bmxv) obj;
        xgv.mo29738b(this.f52226b);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        xgv.f52227e.mo25417e("getCryptoObject failed", th, new Object[0]);
        this.f52225a.f52231c = bmvz.f131120a;
        this.f52225a.mo29738b(this.f52226b);
    }
}
