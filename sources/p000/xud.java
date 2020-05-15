package p000;

/* renamed from: xud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xud implements Runnable {

    /* renamed from: a */
    final /* synthetic */ xkg f53138a;

    /* renamed from: b */
    final /* synthetic */ xue f53139b;

    public xud(xue xue, xkg xkg) {
        this.f53139b = xue;
        this.f53138a = xkg;
    }

    public final void run() {
        xtt xtt = this.f53139b.f53140a;
        xkg xkg = this.f53138a;
        xtu xtu = xtt.f53087b;
        xtu.f53093e.mo30196a(xtu.f53090b, xkg);
        if (!xkj.CTAP1_ERR_SUCCESS.equals(xkg.f52499a)) {
            xtt.f53087b.f53094f = 4;
        } else {
            xtt.f53087b.f53094f = 3;
        }
        xtt.f53086a.mo69138b(xkg);
    }
}
