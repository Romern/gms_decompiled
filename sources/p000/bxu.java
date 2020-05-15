package p000;

/* renamed from: bxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxu {

    /* renamed from: a */
    public int f6039a;

    /* renamed from: b */
    public int f6040b;

    /* renamed from: c */
    public int f6041c;

    public bxu(byte[] bArr) {
        int length = bArr.length;
        if (length == 4) {
            this.f6039a = bArr[0] >>> 3;
            byte b = bArr[1] & 255;
            this.f6040b = b;
            if (b != 0) {
                byte b2 = bArr[2] & 255;
                this.f6041c = b2;
                if (b2 >= b) {
                    byte b3 = bArr[3];
                    return;
                }
                StringBuilder sb = new StringBuilder(95);
                sb.append("Applicaton Elementary File: End Record number (");
                sb.append((int) b2);
                sb.append(") < Start Record number (");
                sb.append((int) b);
                sb.append(")");
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException("Applicaton Elementary File: Start Record number cannot be 0");
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("Applicaton Elementary File length must be equal to 4. Data length=");
        sb2.append(length);
        throw new IllegalStateException(sb2.toString());
    }
}
