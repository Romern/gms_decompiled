package p000;

import java.util.Collections;

/* renamed from: bfut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfut extends bfvg {
    public bfut(bfsa bfsa, bfpj bfpj) {
        super(bfsa, bfpj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62293a() {
        if (this.f115428u && this.f115429v) {
            ((bfvg) this).f115405a.mo62198a(this.f115430w);
            bfsa bfsa = ((bfvg) this).f115405a;
            long j = this.f115402r;
            boolean z = this.f115403s;
            synchronized (bfsa.f115085a) {
                bfsa.f115088d = true;
                bfsa.mo62197a(j, z);
            }
            return;
        }
        ((bfvg) this).f115405a.mo62198a(Collections.emptyList());
        bfsa bfsa2 = ((bfvg) this).f115405a;
        synchronized (bfsa.f115085a) {
            bfsa.f115088d = false;
            bfsa2.mo62201c();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityRecognition[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }
}
