package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Random;

/* renamed from: aaaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaaw {

    /* renamed from: a */
    private final short[] f27861a = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: b */
    private final short[] f27862b = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: c */
    private final int f27863c;

    /* renamed from: d */
    private long f27864d;

    /* renamed from: e */
    private final long f27865e;

    public aaaw(Random random, long j) {
        this.f27863c = (random.nextInt() & -131075) | 65537;
        this.f27864d = 0;
        this.f27865e = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(int, int):int}
     arg types: [short, short]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int} */
    /* renamed from: a */
    private final int m21035a(String str, int i, int i2) {
        int hashCode = str.hashCode() * this.f27863c;
        char c = 0;
        if (!str.isEmpty()) {
            c = str.charAt(0);
        }
        int i3 = ((hashCode >>> 24) + c) & 255;
        int length = ((hashCode >>> 16) + str.length()) & 255;
        int min = Math.min((int) this.f27861a[i3], (int) this.f27862b[length]);
        int i4 = (i * min) + i2;
        short min2 = (short) Math.min(32767, i4);
        short[] sArr = this.f27861a;
        if (sArr[i3] == min) {
            sArr[i3] = min2;
        }
        short[] sArr2 = this.f27862b;
        if (sArr2[length] == min) {
            sArr2[length] = min2;
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo16670a(String str, long j, int i) {
        long j2 = j - this.f27864d;
        long j3 = this.f27865e;
        if (j2 >= j3) {
            long j4 = j2 / j3;
            long j5 = 15;
            if (j4 <= 15) {
                j5 = j4;
            }
            for (int i2 = 0; i2 < 256; i2++) {
                short[] sArr = this.f27861a;
                int i3 = (int) j5;
                int i4 = sArr[i2] >> i3;
                sArr[i2] = (short) i4;
                this.f27862b[i2] = (short) (i4 >> i3);
            }
            this.f27864d += j4 * this.f27865e;
        }
        return m21035a(str, 1, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16671a(String str) {
        m21035a(str, 0, 0);
    }
}
