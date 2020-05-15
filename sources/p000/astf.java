package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: astf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class astf {

    /* renamed from: a */
    public final int f89655a;

    /* renamed from: b */
    private final byte[] f89656b;

    /* renamed from: c */
    private final long f89657c;

    static {
        m74754a(27013);
        m74754a(27270);
        m74754a(27266);
        m74754a(27392);
        m74754a(27264);
        m74754a(26368);
        m74754a(28160);
        m74754a(27904);
        m74754a(27266);
        m74754a(28416);
    }

    public astf(byte[] bArr, int i, long j) {
        this.f89656b = bArr;
        this.f89655a = i;
        this.f89657c = j;
    }

    /* renamed from: a */
    public static astf m74754a(int i) {
        bmxy.m108588a((i >> 16) == 0);
        return m74755a(bqct.m112602a((short) i));
    }

    /* renamed from: b */
    public final byte[] mo49462b() {
        return bqce.m112562a(this.f89656b, bqct.m112602a((short) this.f89655a));
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            astf astf = (astf) obj;
            return Arrays.equals(this.f89656b, astf.f89656b) && this.f89655a == astf.f89655a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f89656b)), Integer.valueOf(this.f89655a)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response: ");
        byte[] bArr = this.f89656b;
        if (bArr.length > 0) {
            sb.append(asti.m74760a(bArr));
            sb.append(", ");
        }
        sb.append(String.format("SW=%04x", Integer.valueOf(this.f89655a)));
        if (this.f89657c > -1) {
            sb.append(String.format(Locale.US, ", elapsed: %dms", Long.valueOf(this.f89657c)));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static astf m74755a(byte[] bArr) {
        boolean z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bmxy.m108581a(bArr);
        int length = bArr.length;
        long millis = timeUnit.toMillis(-1);
        if (length >= 2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108595a(z, "Invalid response APDU after %sms. Must be at least 2 bytes long: [%s]", millis, asti.m74760a(bArr));
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = length - 2;
        byte[] bArr2 = new byte[i];
        wrap.get(bArr2, 0, i);
        return new astf(bArr2, (char) wrap.getShort(), millis);
    }

    /* renamed from: a */
    public static astf m74756a(byte[] bArr, int i) {
        bmxy.m108588a(true);
        return m74755a(bqce.m112562a(bArr, bqct.m112602a((short) i)));
    }

    /* renamed from: a */
    public final byte[] mo49461a() {
        return (byte[]) this.f89656b.clone();
    }
}
