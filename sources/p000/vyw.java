package p000;

/* renamed from: vyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyw extends Exception {

    /* renamed from: a */
    public final byte[] f50257a;

    public vyw(byte[] bArr, String str) {
        super(str);
        this.f50257a = bArr;
    }

    public vyw(byte[] bArr, String str, Throwable th) {
        super(str, th);
        this.f50257a = bArr;
    }

    public vyw(byte[] bArr, Throwable th) {
        super(th);
        this.f50257a = bArr;
    }
}
