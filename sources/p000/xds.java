package p000;

import java.security.Signature;
import java.security.SignatureException;
import java.util.Date;

/* renamed from: xds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xds implements xeg {

    /* renamed from: a */
    final /* synthetic */ xjx f52018a;

    /* renamed from: b */
    final /* synthetic */ byte[] f52019b;

    /* renamed from: c */
    final /* synthetic */ xdx f52020c;

    /* renamed from: d */
    final /* synthetic */ xeb f52021d;

    public xds(xdx xdx, xeb xeb, xjx xjx, byte[] bArr) {
        this.f52020c = xdx;
        this.f52021d = xeb;
        this.f52018a = xjx;
        this.f52019b = bArr;
    }

    /* renamed from: a */
    public final void mo29667a(xma xma) {
        this.f52021d.mo29677a(xma);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: xdx.a(xjx, boolean):java.security.Signature
     arg types: [xjx, int]
     candidates:
      xdx.a(java.lang.String, xkb):boolean
      xdx.a(xkb, java.lang.String):boolean
      xdx.a(xjx, boolean):java.security.Signature */
    /* renamed from: a */
    public final void mo29668a(xpj xpj) {
        try {
            Signature a = this.f52020c.mo29670a(this.f52018a, false);
            a.update(this.f52019b);
            byte[] sign = a.sign();
            xdx xdx = this.f52020c;
            xdl xdl = xdx.f52035a;
            xjx xjx = this.f52018a;
            sqv sqv = xdx.f52036b;
            xdl.mo29654a(xjx, new Date(System.currentTimeMillis()));
            this.f52021d.mo29678a(sign, xpj);
        } catch (SignatureException | xdk e) {
            this.f52021d.mo29677a(new xma(e));
        } catch (xma e2) {
            this.f52021d.mo29677a(e2);
        }
    }
}
