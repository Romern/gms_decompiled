package p000;

import java.util.concurrent.TimeoutException;

/* renamed from: bvbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvbp extends buqn {

    /* renamed from: a */
    final /* synthetic */ bvbq f155548a;

    /* renamed from: b */
    private int f155549b = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bvbp(bvbq bvbq, String str) {
        super(str);
        this.f155548a = bvbq;
    }

    public final void run() {
        bvbq bvbq = this.f155548a;
        int i = bvbq.f155550i;
        bvbq.f155555e.mo72984b();
        if (this.f155548a.f155554d.get() != 2) {
            int i2 = this.f155549b;
            if (i2 > 30) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68437a(new TimeoutException());
                bnsl.mo68432a("bvbp", "run", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s timeout when starting", this.f154716m);
                this.f155548a.mo73287c();
                return;
            }
            this.f155549b = i2 + 1;
            bvbq bvbq2 = this.f155548a;
            bvbq2.f155555e.mo72983a(bvbq2.f155558h, 200);
            return;
        }
        this.f155548a.mo73287c();
    }
}
