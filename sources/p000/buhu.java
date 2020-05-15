package p000;

/* renamed from: buhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buhu {

    /* renamed from: a */
    private final byte[] f153893a;

    /* renamed from: b */
    private final int f153894b;

    /* renamed from: c */
    private final int f153895c;

    /* renamed from: d */
    private final int f153896d;

    /* renamed from: e */
    private final int f153897e;

    /* renamed from: f */
    private int f153898f;

    /* renamed from: g */
    private int f153899g = 0;

    /* renamed from: h */
    private int f153900h = 0;

    public buhu(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        this.f153893a = bArr;
        this.f153894b = i;
        this.f153895c = i2;
        this.f153896d = i3;
        this.f153898f = (bArr != null ? bArr.length : i5) + 4;
        this.f153897e = i4 - 4;
    }

    /* renamed from: a */
    private static int m119549a(int i) {
        return i == 0 ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean mo72693a() {
        return this.f153898f > 0;
    }

    /* renamed from: b */
    public final byte[] mo72694b() {
        byte[] bArr;
        if (mo72693a()) {
            int min = Math.min(this.f153897e, this.f153898f);
            this.f153898f -= min;
            if (buhs.m119544a(this.f153900h)) {
                min -= 4;
            }
            int a = m119549a(this.f153898f);
            if (min != 0) {
                int i = this.f153894b;
                int i2 = this.f153900h;
                int a2 = m119549a(this.f153898f);
                int i3 = this.f153895c;
                int i4 = this.f153896d;
                byte[] bArr2 = this.f153893a;
                int i5 = this.f153899g;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    if (length == 0) {
                        throw new IllegalArgumentException("'data' cannot be empty.");
                    } else if (i5 < 0) {
                        throw new IllegalArgumentException("'dataOffset' cannot be negative.");
                    } else if (min > 0) {
                        int i6 = i5 + min;
                        if (length >= i6) {
                            bArr = buhs.m119545a(i, i2, a2, i3, i4, bArr2, i5, min);
                        } else {
                            StringBuilder sb = new StringBuilder(90);
                            sb.append("Requested data sub-array overflows. TotalDataLength=");
                            sb.append(length);
                            sb.append(", Length+Offset=");
                            sb.append(i6);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("'dataLength' must be positive and non-zero");
                    }
                } else {
                    throw new IllegalArgumentException("'data' cannot be null.");
                }
            } else {
                bArr = buhs.m119545a(this.f153894b, this.f153900h, a, this.f153895c, this.f153896d, null, 0, 0);
            }
            this.f153899g += min;
            this.f153900h++;
            return bArr;
        }
        throw new IllegalStateException("Cannot invoke getNextFragment() when no fragments exist");
    }
}
