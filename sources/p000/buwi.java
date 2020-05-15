package p000;

/* renamed from: buwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwi extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f155144a;

    /* renamed from: b */
    final /* synthetic */ buwk f155145b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buwi(buwk buwk, String str, String str2) {
        super(str);
        this.f155145b = buwk;
        this.f155144a = str2;
    }

    public final void run() {
        buwo buwo = this.f155145b.f155148a;
        String str = this.f155144a;
        if (buwo.mo73188g()) {
            for (buwm buwm : buwo.f155158e.keySet()) {
                buwm.mo73155a(str);
            }
        }
    }
}
