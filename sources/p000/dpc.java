package p000;

/* renamed from: dpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dpc extends dqi {

    /* renamed from: a */
    final /* synthetic */ doh f13727a;

    /* renamed from: b */
    final /* synthetic */ dpe f13728b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dpc(dpe dpe, String str, Object[] objArr, doh doh) {
        super(str, objArr);
        this.f13728b = dpe;
        this.f13727a = doh;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        int i;
        int i2;
        rkj rkj = (rkj) obj;
        dpd dpd = (dpd) this.f13728b.f13734c.get(this.f13727a);
        if (!rkj.mo24823q()) {
            i = 2;
        } else {
            i = 1;
        }
        dpd.f13730b = i;
        dpd dpd2 = (dpd) this.f13728b.f13734c.get(this.f13727a);
        if (!rkj.mo24822p()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        dpd2.f13731c = i2;
        Object[] objArr = {Integer.valueOf(((dpd) this.f13728b.f13734c.get(this.f13727a)).f13730b), Integer.valueOf(((dpd) this.f13728b.f13734c.get(this.f13727a)).f13731c)};
    }
}
