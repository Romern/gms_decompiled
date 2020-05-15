package p000;

/* renamed from: bfuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfuu extends bfvo {

    /* renamed from: a */
    private final bftw f115370a;

    /* renamed from: b */
    private final bfpj f115371b;

    public bfuu(bftw bftw, bfpj bfpj) {
        this.f115370a = bftw;
        this.f115371b = bfpj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62293a() {
        beyv beyv;
        beyw b;
        beyv beyv2;
        if (this.f115428u && this.f115429v) {
            bftw bftw = this.f115370a;
            if (bftw != null) {
                if (!bftw.f115269b && cevt.m138310b() && (b = beyw.m96098b(bftw.f115270c)) != null && (beyv2 = b.f113065a) != null) {
                    beyv2.mo61261a(bftw);
                    bftw.f115269b = true;
                }
                this.f115371b.mo26009a(39);
                return;
            }
            return;
        }
        bftw bftw2 = this.f115370a;
        if (bftw2 != null) {
            if (bftw2.f115269b) {
                bftw2.f115269b = false;
                beyw b2 = beyw.m96098b(bftw2.f115270c);
                if (!(b2 == null || (beyv = b2.f113065a) == null || !beyv.f113044g)) {
                    beyv.f113038a.execute(new beyj(beyv, bftw2));
                }
            }
            this.f115371b.mo26009a(40);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bluesky[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }
}
