package p000;

/* renamed from: ahwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahwi extends buqn {

    /* renamed from: a */
    final /* synthetic */ ahwk f68223a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahwi(ahwk ahwk, String str) {
        super(str);
        this.f68223a = ahwk;
    }

    public final void run() {
        synchronized (this.f68223a) {
            if (this.f68223a.f68228d != null) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairBattery: Dismiss battery notification after timeout");
                ahwk ahwk = this.f68223a;
                ahwk.mo37234a(ahwk.mo37236b(ahwk.f68228d));
            }
        }
    }
}
