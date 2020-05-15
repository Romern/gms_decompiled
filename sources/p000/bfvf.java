package p000;

/* renamed from: bfvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvf extends bfvg {
    public bfvf(bfsa bfsa, bfpj bfpj) {
        super(bfsa, bfpj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62293a() {
        ((bfvg) this).f115405a.f115098l = this.f115431x;
        if (this.f115428u && this.f115429v) {
            ((bfvg) this).f115406b.mo26010a(22, bfpj.m97500a(this.f115402r));
            ((bfvg) this).f115405a.mo62198a(this.f115430w);
            bfsa bfsa = ((bfvg) this).f115405a;
            long j = this.f115402r;
            long j2 = this.f115404t;
            boolean z = this.f115403s;
            synchronized (bfsa.f115085a) {
                bfsa.f115087c = true;
                bfsa.mo62200b(j, j2, z);
            }
            return;
        }
        ((bfvg) this).f115406b.mo26009a(23);
        ((bfvg) this).f115405a.mo62198a(bngx.m109376e());
        bfsa bfsa2 = ((bfvg) this).f115405a;
        synchronized (bfsa.f115085a) {
            bfsa.f115087c = false;
            bfsa2.mo62199b();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NlpLowPower[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }
}
