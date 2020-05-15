package p000;

import java.io.IOException;

/* renamed from: cvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cvf implements cvb {
    PDOL;
    

    /* renamed from: b */
    private final byte[] f12185b;

    private cvf() {
        this.f12185b = cvz.m7720b(r3);
    }

    /* renamed from: a */
    public final cvc mo8318a(byte... bArr) {
        try {
            return new cvg(this, cve.m7670b(bArr));
        } catch (IOException e) {
            throw new cvl(e, cuu.UNKNOWN_ERROR_RESPONSE);
        }
    }

    /* renamed from: b */
    public final int mo8321b() {
        return cvz.m7731f(this.f12185b);
    }

    /* renamed from: a */
    public final cvg mo8333a(cvh... cvhArr) {
        return new cvg(this, cvhArr);
    }

    /* renamed from: a */
    public final cvh mo8319a(int i) {
        return new cvh(this, i);
    }

    /* renamed from: a */
    public final byte[] mo8320a() {
        return cvz.m7735j(this.f12185b);
    }
}
