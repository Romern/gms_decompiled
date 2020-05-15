package p000;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: jkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jkw {

    /* renamed from: a */
    public final byte[] f22722a;

    /* renamed from: b */
    public final long f22723b;

    /* renamed from: c */
    public final long f22724c;

    public jkw(byte[] bArr, long j, long j2) {
        this.f22722a = bArr;
        this.f22723b = j;
        this.f22724c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jkw) {
            jkw jkw = (jkw) obj;
            if (Arrays.equals(this.f22722a, jkw.f22722a) && this.f22723b == jkw.f22723b && this.f22724c == jkw.f22724c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f22722a)), Long.valueOf(this.f22723b), Long.valueOf(this.f22724c));
    }
}
