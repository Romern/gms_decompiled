package p000;

/* renamed from: qtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qtp {

    /* renamed from: a */
    public String f42106a;

    /* renamed from: b */
    public ByteString f42107b;

    /* renamed from: c */
    public ByteString f42108c;

    /* renamed from: d */
    public boolean f42109d;

    /* renamed from: e */
    public boolean f42110e;

    /* renamed from: f */
    private Integer f42111f;

    public qtp() {
        this.f42111f = -1;
        this.f42106a = "";
        this.f42107b = ByteString.f164797b;
        this.f42108c = ByteString.f164797b;
        this.f42109d = false;
        this.f42110e = false;
    }

    /* renamed from: a */
    public final qtq mo24267a() {
        boolean z;
        if (this.f42111f.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34977c(this.f42106a);
        sdo.m34974b(!this.f42107b.mo73779j());
        return new qtq(this.f42111f.intValue(), this.f42106a, this.f42107b, this.f42108c, this.f42109d, this.f42110e);
    }

    /* renamed from: a */
    public final void mo24268a(int i) {
        this.f42111f = Integer.valueOf(i);
    }

    public qtp(qtq qtq) {
        bnic bnic = qtq.f42112a;
        this.f42111f = Integer.valueOf(qtq.f42113b);
        this.f42106a = qtq.f42114c;
        this.f42107b = qtq.f42115d;
        this.f42108c = qtq.f42116e;
        this.f42109d = qtq.f42117f;
        this.f42110e = qtq.f42118g;
    }
}
