package p000;

/* renamed from: beec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beec {

    /* renamed from: a */
    public static final byte[] f107010a = {0};

    /* renamed from: b */
    public static final byte[] f107011b = {1};

    /* renamed from: a */
    public static bedl m91844a(byte[] bArr) {
        boolean z;
        int length = bArr.length;
        boolean z2 = true;
        if (length == 1) {
            byte b = bArr[0];
            if ((b & -4) != 0) {
                String valueOf = String.valueOf(Integer.toHexString(b));
                throw new bedq(valueOf.length() == 0 ? new String("Incorrect value: ") : "Incorrect value: ".concat(valueOf));
            }
            byte b2 = b & 1;
            if ((b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (b2 == 0) {
                z2 = false;
            }
            return new bedl(z2, z);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Incorrect message length: ");
        sb.append(length);
        throw new bedq(sb.toString());
    }
}
