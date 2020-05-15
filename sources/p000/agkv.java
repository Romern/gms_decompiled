package p000;

/* renamed from: agkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agkt f65828a;

    /* renamed from: b */
    final /* synthetic */ long f65829b;

    /* renamed from: c */
    final /* synthetic */ agkw f65830c;

    public agkv(agkw agkw, agkt agkt, long j) {
        this.f65830c = agkw;
        this.f65828a = agkt;
        this.f65829b = j;
    }

    public final void run() {
        agkw agkw = this.f65830c;
        agkt agkt = this.f65828a;
        long j = this.f65829b;
        agkw.mo35240g().mo35230a(agkw.mo35534A().mo20506b());
        if (agkw.mo35234a().mo35651a(agkt.f65824d, false, j)) {
            agkt.f65824d = false;
        }
        agkw agkw2 = this.f65830c;
        agkw2.f65831b = null;
        agkw2.mo35237d().mo35618a((agkt) null);
    }
}
