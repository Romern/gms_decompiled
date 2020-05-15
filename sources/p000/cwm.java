package p000;

/* renamed from: cwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwm {

    /* renamed from: a */
    private final byte[] f12264a;

    public cwm(byte[] bArr) {
        this.f12264a = bArr;
    }

    /* renamed from: a */
    public final boolean mo8361a(int i, byte b, byte b2) {
        return (this.f12264a[i + -1] & b2) == (b & b2);
    }

    /* renamed from: a */
    public final boolean mo8362a(cwl cwl) {
        int a = cwl.mo8359a();
        byte[] bArr = this.f12264a;
        return bArr.length > a && cvz.m7708a(bArr[a], cwl.mo8360b());
    }
}
