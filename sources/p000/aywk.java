package p000;

/* renamed from: aywk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aywk {

    /* renamed from: a */
    private final ayxj f98625a;

    /* renamed from: b */
    private aywp f98626b = null;

    /* renamed from: c */
    private final aywl f98627c = aywp.f98635d;

    /* renamed from: d */
    private final bxvf f98628d;

    /* renamed from: e */
    private final bxvd f98629e;

    protected aywk(aywo aywo, ayxj ayxj) {
        this.f98625a = ayxj;
        this.f98628d = (bxvf) aywu.f98650f.mo74144da();
        this.f98629e = aywo.f98634a;
    }

    /* renamed from: a */
    public final void mo54480a(aywm aywm) {
        boolean z;
        boolean z2;
        if (this.f98626b == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        bptu bptu = ((aywu) this.f98628d.f164949b).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        if ((bptu.f139181a & 2048) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108600b(!z2);
        if (!this.f98628d.mo74131a(aywm.f98630a)) {
            bxvf bxvf = this.f98628d;
            int a = aywm.f98630a.mo73900a();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            aywu aywu = (aywu) bxvf.f164949b;
            aywu aywu2 = aywu.f98650f;
            if (!aywu.f98653b.mo73666a()) {
                aywu.f98653b = GeneratedMessageLite.m124019a(aywu.f98653b);
            }
            aywu.f98653b.mo74153d(a);
        }
        this.f98628d.mo74125a(aywm.f98630a, aywm.f98631b);
        mo54479b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo54479b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final aywp mo54482c() {
        boolean z;
        if (this.f98626b == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Cannot create CVE twice.");
        bxvf bxvf = this.f98628d;
        bxvd bxvd = this.f98629e;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        aywu aywu = (aywu) bxvf.f164949b;
        bptu bptu = (bptu) bxvd.mo74062i();
        aywu aywu2 = aywu.f98650f;
        bptu.getClass();
        aywu.f98654c = bptu;
        aywu.f98652a = 1 | aywu.f98652a;
        aywp aywp = new aywp(this.f98628d, this.f98627c, this.f98625a);
        this.f98626b = aywp;
        ayxj ayxj = aywp.f98636a;
        if (!ayxj.f98680a.isEmpty()) {
            for (ayxh ayxh : ayxj.f98680a) {
                ayxh.mo54506a();
            }
        }
        return this.f98626b;
    }

    /* renamed from: a */
    public final void mo54481a(aywn aywn) {
        boolean z;
        if (this.f98626b == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        this.f98628d.mo74125a(aywn.f98632a, aywn.f98633b);
        mo54479b();
    }
}
