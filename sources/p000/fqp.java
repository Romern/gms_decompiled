package p000;

/* renamed from: fqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fqp extends acpn {

    /* renamed from: a */
    final /* synthetic */ String[] f17143a;

    /* renamed from: b */
    final /* synthetic */ fqq f17144b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fqp(fqq fqq, bqbd bqbd, String str, String[] strArr) {
        super(bqbd, 2, str);
        this.f17144b = fqq;
        this.f17143a = strArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        for (String str : this.f17143a) {
            abyv d = this.f17144b.f17145a.f58077m.mo32506d(str);
            if (d != null) {
                acrl acrl = d.f58763d;
                String str2 = d.f58761b;
                synchronized (acrl.f60625g) {
                    abul d2 = acrl.mo33026d(str2);
                    bxvd bxvd = (bxvd) d2.mo74142c(5);
                    bxvd.mo73625a((bxvk) d2);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    abul abul = (abul) bxvd.f164949b;
                    abul abul2 = abul.f58412n;
                    abul.f58414a &= -3;
                    abul.f58416c = false;
                    acrl.mo33020a(str2, (abul) bxvd.mo74062i());
                }
            }
        }
        return null;
    }
}
