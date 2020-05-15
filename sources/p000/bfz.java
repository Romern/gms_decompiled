package p000;

/* renamed from: bfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfz {

    /* renamed from: a */
    public byte f3145a;

    /* renamed from: b */
    public byte f3146b;

    /* renamed from: c */
    public byte f3147c;

    /* renamed from: d */
    public byte f3148d;

    /* renamed from: e */
    public byte f3149e;

    /* renamed from: f */
    public byte[] f3150f;

    /* renamed from: g */
    public byte f3151g;

    /* renamed from: h */
    private byte f3152h;

    public bfz() {
    }

    public final String toString() {
        byte b = this.f3145a;
        byte b2 = this.f3146b;
        byte b3 = this.f3147c;
        byte b4 = this.f3148d;
        byte b5 = this.f3149e;
        String valueOf = String.valueOf(this.f3150f);
        byte b6 = this.f3152h;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97);
        sb.append("CommandAPDU{bCLA='");
        sb.append((int) b);
        sb.append("', bINS='");
        sb.append((int) b2);
        sb.append("', bP1='");
        sb.append((int) b3);
        sb.append("', bP2='");
        sb.append((int) b4);
        sb.append("', bLc='");
        sb.append((int) b5);
        sb.append("', baCdata='");
        sb.append(valueOf);
        sb.append("', bLe='");
        sb.append((int) b6);
        sb.append("'}");
        return sb.toString();
    }

    public bfz(byte[] bArr, bfr bfr) {
        int length;
        if (bArr == null || (length = bArr.length) < 4) {
            bfr.f3127b = 28416;
            throw new bfq("Invalid APDU");
        }
        this.f3145a = bArr[0];
        this.f3146b = bArr[1];
        this.f3147c = bArr[2];
        this.f3148d = bArr[3];
        this.f3151g = 1;
        if (length > 5) {
            this.f3151g = 3;
            byte b = bArr[4];
            this.f3149e = b;
            if (length == b + 5 || length == b + 6) {
                byte[] bArr2 = new byte[b];
                this.f3150f = bArr2;
                System.arraycopy(bArr, 5, bArr2, 0, b);
                if (length > this.f3149e + 5) {
                    this.f3151g = 4;
                    this.f3152h = bArr[length - 1];
                    return;
                }
                return;
            }
            bfr.f3127b = 26368;
            throw new bfq("Invalid APDU");
        } else if (length == 5) {
            this.f3151g = 2;
            this.f3152h = bArr[4];
        }
    }
}
