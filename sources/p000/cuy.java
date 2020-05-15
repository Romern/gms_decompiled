package p000;

/* renamed from: cuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cuy implements cvb {

    /* renamed from: a */
    private final byte[] f12105a;

    public cuy(byte... bArr) {
        this.f12105a = bArr;
    }

    /* renamed from: b */
    public static cuy m7637b(byte... bArr) {
        return new cuy(bArr);
    }

    /* renamed from: a */
    public final cux mo8324a(cvc... cvcArr) {
        return new cux(this, cve.m7669b(cvcArr));
    }

    /* renamed from: c */
    public final cva mo8318a(byte... bArr) {
        return new cva(this, bArr);
    }

    /* renamed from: a */
    public final cva mo8325a(String str) {
        if (str != null) {
            return new cva(this, cvz.m7720b(str));
        }
        return null;
    }

    /* renamed from: b */
    public final int mo8321b() {
        return cvz.m7731f(this.f12105a);
    }

    /* renamed from: a */
    public final cvh mo8319a(int i) {
        return new cvh(this, i);
    }

    /* renamed from: a */
    public final byte[] mo8320a() {
        return cvz.m7735j(this.f12105a);
    }
}
