package p000;

/* renamed from: cux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cux extends cvc {

    /* renamed from: c */
    private byte[] f12104c;

    public cux(cvb cvb, cvc... cvcArr) {
        super(cvb, cvcArr);
        cvx.m7697a(cvcArr != null, "tlv value cannot be empty");
    }

    /* renamed from: a */
    public cux mo8322a(cuw cuw) {
        return cve.m7664a((cvc[]) this.f12181b, cuw);
    }

    /* renamed from: a */
    public final byte[] mo8323a() {
        if (this.f12104c == null) {
            this.f12104c = cve.m7667a((cvc[]) this.f12181b);
        }
        return cvz.m7735j(this.f12104c);
    }
}
