package p000;

/* renamed from: fqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fqo extends acpn {

    /* renamed from: a */
    final /* synthetic */ String[] f17141a;

    /* renamed from: b */
    final /* synthetic */ fqq f17142b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fqo(fqq fqq, bqbd bqbd, String str, String[] strArr) {
        super(bqbd, 2, str);
        this.f17142b = fqq;
        this.f17141a = strArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        for (String str : this.f17141a) {
            abyv c = this.f17142b.f17145a.f58077m.mo32505c(str);
            acrl acrl = c.f58763d;
            String str2 = c.f58761b;
            synchronized (acrl.f60625g) {
                abul d = acrl.mo33026d(str2);
                bxvd bxvd = (bxvd) d.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) d);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abul.m48284a((abul) bxvd.f164949b);
                acrl.mo33020a(str2, (abul) bxvd.mo74062i());
            }
            this.f17142b.f17145a.mo32312a(c);
        }
        abuw h = this.f17142b.f17145a.f58078n.mo43413h();
        if (h == null) {
            return null;
        }
        abrv abrv = this.f17142b.f17145a;
        if (!abvc.m48308a(h)) {
            return null;
        }
        this.f17142b.f17145a.mo32324g();
        return null;
    }
}
