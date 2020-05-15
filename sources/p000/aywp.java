package p000;

/* renamed from: aywp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywp {

    /* renamed from: d */
    public static final aywl f98635d = new aywl();

    /* renamed from: a */
    public final ayxj f98636a;

    /* renamed from: b */
    public ayxi f98637b;

    /* renamed from: c */
    public int f98638c = -1;

    /* renamed from: e */
    public final bxvf f98639e;

    /* renamed from: f */
    private final aywl f98640f;

    public aywp(bxvf bxvf, aywl aywl, ayxj ayxj) {
        this.f98639e = bxvf;
        this.f98640f = aywl;
        this.f98636a = ayxj;
    }

    /* renamed from: a */
    public final aywu mo54483a() {
        return (aywu) this.f98639e.mo74062i();
    }

    /* renamed from: b */
    public final boolean mo54485b() {
        bptu bptu = ((aywu) this.f98639e.f164949b).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        return (bptu.f139181a & 8) != 0;
    }

    /* renamed from: c */
    public final boolean mo54486c() {
        bptu bptu = ((aywu) this.f98639e.f164949b).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        return (bptu.f139181a & 2048) != 0;
    }

    /* renamed from: d */
    public final int mo54487d() {
        return ((ayww) this.f98637b).mo54499i();
    }

    public final String toString() {
        String str;
        ayxi ayxi = this.f98637b;
        if (ayxi != null) {
            String valueOf = String.valueOf(ayxi.getClass().getSimpleName());
            str = valueOf.length() == 0 ? new String(".") : ".".concat(valueOf);
        } else {
            str = "";
        }
        bptu bptu = ((aywu) this.f98639e.f164949b).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        int i = bptu.f139183c;
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(hexString).length());
        sb.append("CVE");
        sb.append(str);
        sb.append("#");
        sb.append(i);
        sb.append(" [");
        sb.append(hexString);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54484a(aywp aywp) {
        boolean z;
        boolean z2 = false;
        if (aywp.f98637b == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        bmxy.m108600b(!mo54485b());
        if (this.f98640f == aywp.f98640f) {
            z2 = true;
        }
        bmxy.m108600b(z2);
        boolean z3 = ((ayww) this.f98637b).f98665g;
        if (z3) {
            this.f98636a.mo54513b(this);
        }
        bxvf bxvf = this.f98639e;
        bxvf.f164949b = (GeneratedMessageLite) bxvf.f164949b.mo74142c(4);
        this.f98639e.mo73625a((GeneratedMessageLite) ((aywu) aywp.f98639e.mo74062i()));
        if (z3) {
            this.f98636a.mo54511a(this);
        }
    }
}
