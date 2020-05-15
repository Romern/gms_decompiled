package p000;

/* renamed from: abwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abwn {

    /* renamed from: a */
    final /* synthetic */ abwo f58633a;

    /* renamed from: b */
    public int f58634b = 1;

    public abwn(abwo abwo) {
        this.f58633a = abwo;
    }

    /* renamed from: a */
    public final void mo32384a() {
        boolean z = true;
        if (this.f58634b != 1) {
            z = false;
        }
        sdo.m34970a(z);
        this.f58634b = 2;
        abwo abwo = this.f58633a;
        abwo.f58638d.mo32389a(abwo);
    }

    /* renamed from: b */
    public final boolean mo32385b() {
        boolean z;
        if (this.f58634b == 1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        abwq abwq = this.f58633a.f58636b;
        if (abwq == null || abwq.f58646a >= 10) {
            return false;
        }
        this.f58634b = 3;
        return true;
    }
}
