package p000;

/* renamed from: aglb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglb extends agdo {

    /* renamed from: b */
    final /* synthetic */ agln f65848b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aglb(agln agln, agjw agjw) {
        super(agjw);
        this.f65848b = agln;
    }

    /* renamed from: a */
    public final void mo35367a() {
        agln agln = this.f65848b;
        agln.mo35241h();
        if (agln.mo35622o()) {
            agln.mo35497E().f65572k.mo35435a("Inactivity, disconnecting from the service");
            agln.mo35627t();
        }
    }
}
