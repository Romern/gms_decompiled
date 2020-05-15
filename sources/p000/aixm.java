package p000;

/* renamed from: aixm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aixm implements bvat {

    /* renamed from: a */
    final /* synthetic */ aixn f69991a;

    /* renamed from: b */
    private boolean f69992b = false;

    public aixm(aixn aixn) {
        this.f69991a = aixn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        bvaa bvaa = ((buyr) bxxc).f155334b;
        if (bvaa == null) {
            bvaa = bvaa.f155448d;
        }
        bvac a = bvac.m120825a(bvaa.f155452c);
        if (a == null) {
            a = bvac.OPERATION_STATUS_UNKNOWN;
        }
        if (a == bvac.OPERATION_STATUS_ACTIVE && !this.f69992b) {
            aixn aixn = this.f69991a;
            if (aixn.f69996d != null) {
                aixn.f69997e.f70018e.mo72987c(new aixl(this, "AdvertiseSuccess"));
                this.f69992b = true;
            }
        }
    }
}
