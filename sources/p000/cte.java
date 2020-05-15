package p000;

/* renamed from: cte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cte extends cta {

    /* renamed from: c */
    private byte[] f12009c;

    @SafeVarargs
    public cte(ctd ctd, ctf... ctfArr) {
        super(ctd, ctfArr);
    }

    /* renamed from: a */
    public final byte[] mo8237a() {
        if (this.f12009c == null) {
            byte[][] bArr = new byte[((ctf[]) this.f12004b).length][];
            int i = 0;
            while (true) {
                ctf[] ctfArr = (ctf[]) this.f12004b;
                if (i >= ctfArr.length) {
                    break;
                }
                bArr[i] = ctfArr[i].mo8253d();
                i++;
            }
            this.f12009c = czm.m8022b(bArr);
        }
        return czm.m8028e(this.f12009c);
    }
}
