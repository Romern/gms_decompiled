package p000;

/* renamed from: ajfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajfa extends buqn {

    /* renamed from: a */
    final /* synthetic */ bxxc f70493a;

    /* renamed from: b */
    final /* synthetic */ ajfc f70494b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfa(ajfc ajfc, String str, bxxc bxxc) {
        super(str);
        this.f70494b = ajfc;
        this.f70493a = bxxc;
    }

    public final void run() {
        bzcm a;
        ajfc ajfc = this.f70494b;
        bxxc bxxc = this.f70493a;
        if (bxxc != null && (a = ajfc.f70496a.mo38552a(bxxc)) != null && (a.f169371a & 4) != 0) {
            ajat ajat = ajfc.f70496a.f70505i;
            byyg byyg = a.f169373c;
            if (byyg == null) {
                byyg = byyg.f168916p;
            }
            ajat.f70275c = ajat.m58381a(ajat.f70275c, byyg, "server");
            ajat.mo38415a("server", ajat.f70275c);
            ajat.mo38416b();
        }
    }
}
