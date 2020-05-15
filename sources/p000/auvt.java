package p000;

/* renamed from: auvt */
final /* synthetic */ class auvt implements aubt {

    /* renamed from: a */
    private final auwc f92623a;

    public auvt(auwc auwc) {
        this.f92623a = auwc;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        auwc auwc = this.f92623a;
        aunx aunx = auwc.f92631a;
        boolean z = auwc.f92646p;
        StringBuilder sb = new StringBuilder(17);
        sb.append("is register:");
        sb.append(z);
        aunx.mo50711a(sb.toString(), new Object[0]);
        if (auwc.f92646p) {
            auwc.f92631a.mo50711a("Unable to request activity updates.", new Object[0]).mo50706a();
            auwc.f92637g = false;
            auwc.f92635e.mo50983a(false);
        }
    }
}
