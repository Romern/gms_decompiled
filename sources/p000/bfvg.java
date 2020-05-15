package p000;

/* renamed from: bfvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfvg extends bfve {

    /* renamed from: a */
    protected final bfsa f115405a;

    /* renamed from: b */
    protected final bfpj f115406b;

    /* renamed from: c */
    private boolean f115407c = false;

    public bfvg(bfsa bfsa, bfpj bfpj) {
        this.f115405a = bfsa;
        this.f115406b = bfpj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62293a() {
        this.f115405a.f115098l = this.f115431x;
        if (this.f115428u && this.f115429v) {
            this.f115406b.mo26010a(20, bfpj.m97500a(this.f115402r));
            this.f115405a.mo62198a(this.f115430w);
            bfsa bfsa = this.f115405a;
            long j = this.f115402r;
            long j2 = this.f115404t;
            boolean z = this.f115403s;
            synchronized (bfsa.f115085a) {
                bfsa.f115086b = true;
                bfsa.mo62196a(j, j2, z);
            }
            return;
        }
        this.f115406b.mo26009a(21);
        this.f115405a.mo62198a(bngx.m109376e());
        bfsa bfsa2 = this.f115405a;
        synchronized (bfsa.f115085a) {
            bfsa.f115086b = false;
            bfsa2.mo62195a();
        }
    }

    /* renamed from: c */
    public final void mo62311c() {
        mo62325g();
        mo62324f();
    }

    /* renamed from: d */
    public final void mo62312d() {
        if (!this.f115407c) {
            this.f115407c = true;
            mo62325g();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Nlp[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62307a(StringBuilder sb) {
        super.mo62307a(sb);
        sb.append(", debug info=");
        sb.append(this.f115407c);
    }
}
