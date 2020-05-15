package p000;

import java.security.Signature;
import java.security.SignatureException;

/* renamed from: xdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xdv implements xeg {

    /* renamed from: a */
    final /* synthetic */ Signature f52026a;

    /* renamed from: b */
    final /* synthetic */ xkb f52027b;

    /* renamed from: c */
    final /* synthetic */ byte[] f52028c;

    /* renamed from: d */
    final /* synthetic */ xeb f52029d;

    public xdv(xeb xeb, Signature signature, xkb xkb, byte[] bArr) {
        this.f52029d = xeb;
        this.f52026a = signature;
        this.f52027b = xkb;
        this.f52028c = bArr;
    }

    /* renamed from: a */
    public final void mo29667a(xma xma) {
        this.f52029d.mo29677a(xma);
    }

    /* renamed from: a */
    public final void mo29668a(xpj xpj) {
        try {
            Signature signature = this.f52026a;
            if (signature == null) {
                aucb a = inl.m15759a(rpr.m34216b()).mo24701a((rpa) new iom(this.f52027b.mo29855a(), "SHA256withECDSA", this.f52028c));
                a.mo50373a(new xdt(a, this.f52029d, xpj));
                a.mo50372a(new xdu(this.f52029d));
                return;
            }
            try {
                signature.update(this.f52028c);
                this.f52029d.mo29678a(this.f52026a.sign(), xpj);
            } catch (SignatureException e) {
                this.f52029d.mo29677a(new xma(e));
            }
        } catch (xma e2) {
            this.f52029d.mo29677a(e2);
        }
    }
}
