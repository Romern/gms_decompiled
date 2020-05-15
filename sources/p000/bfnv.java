package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;

/* renamed from: bfnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnv extends bfoa {

    /* renamed from: a */
    public final byte[] f114514a;

    /* renamed from: b */
    public final boolean f114515b;

    /* renamed from: c */
    public final bfnz[] f114516c;

    /* renamed from: d */
    private int f114517d;

    public bfnv(byte[] bArr) {
        this(bArr, null, false);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:9:0x0012 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:8:0x0012 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v2, types: [int, byte], assign insn: 0x000b: AGET  (r2v2 byte A[IMMUTABLE_TYPE]) = (r4v0 byte[] A[IMMUTABLE_TYPE]), (wrap: int : 0x0009: ARITH  (r2v1 int) = (r6v2 int) + (r5v0 int)) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    static long m97362a(byte[] bArr, int i, int i2) {
        long j = 0;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            long j2 = j << 8;
            int i4 = bArr[i3 + i];
            if (i4 < 0) {
                i4 += PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            j = j2 | ((long) i4);
        }
        return j;
    }

    /* renamed from: e */
    private final void m97365e(int i) {
        if (i >= mo62006b()) {
            throw new IllegalArgumentException(String.format("Index (%d) out of range [0, %d)", Integer.valueOf(i), Integer.valueOf(mo62006b())));
        }
    }

    /* renamed from: b */
    public final byte mo62005b(int i) {
        m97365e(i);
        return this.f114514a[(i * 9) + 15];
    }

    /* renamed from: c */
    public final byte mo62007c() {
        byte[] bArr = this.f114514a;
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        return bArr[0];
    }

    /* renamed from: d */
    public final long mo62009d() {
        return m97362a(this.f114514a, 1, 8);
    }

    /* renamed from: e */
    public final bfnz[] mo62011e() {
        return this.f114516c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bfnv)) {
            return false;
        }
        bfnv bfnv = (bfnv) obj;
        return Arrays.equals(bfnv.f114514a, this.f114514a) && bfnv.f114515b == this.f114515b;
    }

    /* renamed from: f */
    public final boolean mo62013f() {
        bfnz[] bfnzArr = this.f114516c;
        return bfnzArr != null && bfnzArr.length > 0;
    }

    public final int hashCode() {
        int i = this.f114517d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((Arrays.hashCode(this.f114514a) + 31) * 31) + (!this.f114515b ? 1237 : 1231);
        this.f114517d = hashCode;
        return hashCode;
    }

    public final String toString() {
        int b = mo62006b();
        StringBuilder sb = new StringBuilder(b * 40);
        sb.append("WifiCompressedScan [");
        if (mo62004a()) {
            sb.append("deliveryTime=");
            sb.append(mo62009d());
            sb.append(", version=");
            sb.append((int) mo62007c());
            sb.append(", len=");
            sb.append(this.f114514a.length);
            sb.append(", devices=[");
            for (int i = 0; i < b; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append("[mac=");
                sb.append(mo62003a(i));
                sb.append(", rssi=");
                sb.append((int) mo62005b(i));
                sb.append(", frequency=");
                sb.append(mo62008c(i));
                sb.append("]");
            }
            bfnz[] bfnzArr = this.f114516c;
            if (bfnzArr != null) {
                for (bfnz bfnz : bfnzArr) {
                    sb.append(", [rttMac=");
                    sb.append(bfnz.f114529a);
                    sb.append(", distanceCm=");
                    sb.append(bfnz.f114533e);
                    sb.append(", distanceSdCm=");
                    sb.append(bfnz.f114534f);
                    sb.append(", numSuccessFrames=");
                    sb.append(bfnz.f114537i);
                    sb.append(", rssi=");
                    sb.append(bfnz.f114532d);
                    sb.append(", timestamp=");
                    sb.append(bfnz.f114531c);
                    sb.append("]");
                }
            }
        } else {
            sb.append("corrupted");
        }
        sb.append("]");
        return sb.toString();
    }

    public bfnv(byte[] bArr, bfnz[] bfnzArr, boolean z) {
        this.f114514a = bArr;
        this.f114515b = z;
        this.f114516c = bfnzArr;
    }

    /* renamed from: a */
    public static bfnv m97363a(long j) {
        return new bfnu(j, 0).mo62001a(null, false);
    }

    /* renamed from: c */
    public final int mo62008c(int i) {
        m97365e(i);
        int i2 = this.f114514a[(i * 9) + 16] + 128;
        if (i2 <= 0) {
            return 0;
        }
        if ((i2 >= 7 && i2 <= 12) || i2 < 7 || i2 == 13) {
            return ((i2 - 1) * 5) + 2412;
        }
        if (i2 == 14) {
            return 2484;
        }
        if (i2 >= 183 && i2 <= 196) {
            return ((i2 - 183) * 5) + 4915;
        }
        if (i2 > 200) {
            return 0;
        }
        return (i2 * 5) + 5000;
    }

    /* renamed from: d */
    public final byte[] mo62010d(int i) {
        return i < mo62006b() ? Arrays.copyOf(this.f114514a, (i * 9) + 9) : this.f114514a;
    }

    /* renamed from: a */
    static void m97364a(long j, byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            bArr[i3] = (byte) ((int) j);
            j >>= 8;
        }
    }

    /* renamed from: b */
    public final int mo62006b() {
        return Math.max(0, (this.f114514a.length - 9) / 9);
    }

    /* renamed from: a */
    public final long mo62003a(int i) {
        m97365e(i);
        return m97362a(this.f114514a, (i * 9) + 9, 6);
    }

    /* renamed from: a */
    public final boolean mo62004a() {
        byte[] bArr = this.f114514a;
        if (bArr != null) {
            int length = bArr.length;
            if (length != 9) {
                return length == (mo62006b() * 9) + 9 && mo62007c() == 0;
            }
            if (mo62007c() == 0) {
                return true;
            }
        }
        return false;
    }
}
