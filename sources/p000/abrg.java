package p000;

/* renamed from: abrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abrg extends acpn {

    /* renamed from: a */
    final /* synthetic */ long f58033a;

    /* renamed from: b */
    final /* synthetic */ abrv f58034b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abrg(abrv abrv, bqbd bqbd, long j) {
        super(bqbd);
        this.f58034b = abrv;
        this.f58033a = j;
    }

    /* renamed from: b */
    public final void mo32291b() {
        if (!this.f58034b.mo32320d()) {
            absg.m48191b("Indexing retry skipped because init failed");
            return;
        }
        acaf acaf = this.f58034b.f58079o;
        long j = this.f58033a;
        bnrd a = acaf.f59082d.f58793b.mo32523a(abza.f58784a).f58821a.iterator();
        while (a.hasNext()) {
            acaf.mo32579a((acak) a.next(), j + j);
        }
    }
}
