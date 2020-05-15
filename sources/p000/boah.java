package p000;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: boah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boah {

    /* renamed from: a */
    public final String f132454a;

    /* renamed from: b */
    public final char[] f132455b;

    /* renamed from: c */
    final int f132456c;

    /* renamed from: d */
    public final int f132457d;

    /* renamed from: e */
    final int f132458e;

    /* renamed from: f */
    final int f132459f;

    /* renamed from: g */
    public final byte[] f132460g;

    /* renamed from: h */
    private final boolean[] f132461h;

    public boah(String str, char[] cArr) {
        bmxy.m108581a(str);
        this.f132454a = str;
        this.f132455b = (char[]) bmxy.m108581a(cArr);
        try {
            int length = cArr.length;
            int a = bqbr.m112523a(length, RoundingMode.UNNECESSARY);
            this.f132457d = a;
            int min = Math.min(8, Integer.lowestOneBit(a));
            try {
                this.f132458e = 8 / min;
                this.f132459f = this.f132457d / min;
                this.f132456c = length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    bmxy.m108590a(c < 128, "Non-ASCII character: %s", c);
                    if (bArr[c] != -1) {
                        z = false;
                    }
                    bmxy.m108590a(z, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.f132460g = bArr;
                boolean[] zArr = new boolean[this.f132458e];
                for (int i2 = 0; i2 < this.f132459f; i2++) {
                    zArr[bqbr.m112522a(i2 * 8, this.f132457d, RoundingMode.CEILING)] = true;
                }
                this.f132461h = zArr;
            } catch (ArithmeticException e) {
                String str2 = new String(cArr);
                throw new IllegalArgumentException(str2.length() == 0 ? new String("Illegal alphabet ") : "Illegal alphabet ".concat(str2), e);
            }
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final char mo68770a(int i) {
        return this.f132455b[i];
    }

    /* renamed from: b */
    public final boolean mo68773b() {
        for (char c : this.f132455b) {
            if (bmwb.m108446c(c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof boah) {
            return Arrays.equals(this.f132455b, ((boah) obj).f132455b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f132455b);
    }

    public final String toString() {
        return this.f132454a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo68771a(char c) {
        if (c > 127) {
            String valueOf = String.valueOf(Integer.toHexString(c));
            throw new boak(valueOf.length() == 0 ? new String("Unrecognized character: 0x") : "Unrecognized character: 0x".concat(valueOf));
        }
        byte b = this.f132460g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c);
            throw new boak(sb.toString());
        }
        String valueOf2 = String.valueOf(Integer.toHexString(c));
        throw new boak(valueOf2.length() == 0 ? new String("Unrecognized character: 0x") : "Unrecognized character: 0x".concat(valueOf2));
    }

    /* renamed from: b */
    public final boolean mo68774b(char c) {
        byte[] bArr = this.f132460g;
        return c < bArr.length && bArr[c] != -1;
    }

    /* renamed from: b */
    public final boolean mo68775b(int i) {
        return this.f132461h[i % this.f132458e];
    }

    /* renamed from: a */
    public final boolean mo68772a() {
        for (char c : this.f132455b) {
            if (bmwb.m108445b(c)) {
                return true;
            }
        }
        return false;
    }
}
