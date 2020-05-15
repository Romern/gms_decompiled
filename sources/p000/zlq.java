package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: zlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zlq extends zck {

    /* renamed from: a */
    final /* synthetic */ zgh f55398a;

    /* renamed from: b */
    final /* synthetic */ bqgy f55399b;

    /* renamed from: c */
    final /* synthetic */ zlu f55400c;

    public zlq(zlu zlu, zgh zgh, bqgy bqgy) {
        this.f55400c = zlu;
        this.f55398a = zgh;
        this.f55399b = bqgy;
    }

    /* renamed from: a */
    public final void mo30933a(Status status) {
        caae caae;
        zlu zlu = this.f55400c;
        zgh zgh = this.f55398a;
        srn srn = zlu.f55408a;
        if (status.mo17710c() && (caae = (caae) zlu.f55410c.put(zgh.f55012b, zgh.f55011a)) != null) {
            bnsl bnsl = (bnsl) zlu.f55408a.mo68388c();
            bnsl.mo68432a("zlu", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("Updating the data source for listener %s from %s to %s", zgh.f55012b, caae.f172326b, zgh.f55011a.f172326b);
        }
        this.f55399b.mo69138b(Boolean.valueOf(status.mo17710c()));
    }
}
