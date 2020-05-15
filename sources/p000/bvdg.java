package p000;

/* renamed from: bvdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvdg extends buqn {

    /* renamed from: a */
    final /* synthetic */ bvdi f155645a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bvdg(bvdi bvdi, String str) {
        super(str);
        this.f155645a = bvdi;
    }

    public final void run() {
        if (this.f155645a.f155652d.mo73325i()) {
            try {
                bvdi bvdi = this.f155645a;
                int i = bvdi.f155648g;
                bvdi.f155649a.mo73122a(new bvdf(this));
            } catch (Exception e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("bvdg", "run", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s ERROR stopping operation!", this.f154716m);
                bvdi bvdi2 = this.f155645a;
                int i2 = bvdi.f155648g;
                bvdi2.f155654f = true;
            }
            bvdi bvdi3 = this.f155645a;
            if (bvdi3.f155654f) {
                bvdi3.f155652d.mo73321e();
            }
        }
    }
}
