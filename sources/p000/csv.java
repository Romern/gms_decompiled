package p000;

/* renamed from: csv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class csv extends cta {

    /* renamed from: c */
    private byte[] f11951c;

    public csv(csu csu, cta... ctaArr) {
        super(csu, ctaArr);
        czl.m8003a(ctaArr != null, "tlv value cannot be empty");
    }

    /* renamed from: a */
    public csv mo8235a(csu csu) {
        return ctc.m7523a((cta[]) this.f12004b, csu);
    }

    /* renamed from: a */
    public csy mo8236a(csx csx) {
        return ctc.m7524a((cta[]) this.f12004b, csx);
    }

    /* renamed from: a */
    public final byte[] mo8237a() {
        if (this.f11951c == null) {
            byte[][] bArr = new byte[((cta[]) this.f12004b).length][];
            int i = 0;
            while (true) {
                cta[] ctaArr = (cta[]) this.f12004b;
                if (i >= ctaArr.length) {
                    break;
                }
                bArr[i] = ctaArr[i].mo8253d();
                i++;
            }
            this.f11951c = czm.m8022b(bArr);
        }
        return czm.m8028e(this.f11951c);
    }
}
