package p000;

/* renamed from: cvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cvg extends cvc {

    /* renamed from: c */
    private byte[] f12186c;

    @SafeVarargs
    public cvg(cvf cvf, cvh... cvhArr) {
        super(cvf, cvhArr);
    }

    /* renamed from: a */
    public final byte[] mo8323a() {
        if (this.f12186c == null) {
            byte[][] bArr = new byte[((cvh[]) this.f12181b).length][];
            int i = 0;
            while (true) {
                cvh[] cvhArr = (cvh[]) this.f12181b;
                if (i >= cvhArr.length) {
                    break;
                }
                bArr[i] = cvhArr[i].mo8331d();
                i++;
            }
            this.f12186c = cvz.m7723b(bArr);
        }
        return cvz.m7735j(this.f12186c);
    }
}
