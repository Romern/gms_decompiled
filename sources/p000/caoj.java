package p000;

/* renamed from: caoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class caoj {

    /* renamed from: a */
    public byte[] f175449a;

    public caoj() {
    }

    /* renamed from: a */
    public final void mo74724a(byte[] bArr) {
        mo74725a(bArr, new byte[]{-112, 0});
    }

    public caoj(byte[] bArr) {
        this.f175449a = bArr;
    }

    /* renamed from: a */
    public final void mo74725a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[(length + length2)];
        this.f175449a = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, this.f175449a, length, length2);
    }

    public caoj(byte[] bArr, byte[] bArr2) {
        mo74725a(bArr, bArr2);
    }
}
