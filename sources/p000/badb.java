package p000;

import java.util.Arrays;

/* renamed from: badb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class badb extends badk {

    /* renamed from: a */
    private final byte[] f100511a;

    /* renamed from: b */
    private final byte[] f100512b;

    /* renamed from: c */
    private final long f100513c;

    public badb(byte[] bArr, byte[] bArr2, long j) {
        if (bArr != null) {
            this.f100511a = bArr;
            this.f100512b = bArr2;
            this.f100513c = j;
            return;
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: a */
    public final byte[] mo55612a() {
        return this.f100511a;
    }

    /* renamed from: b */
    public final byte[] mo55613b() {
        return this.f100512b;
    }

    /* renamed from: c */
    public final long mo55614c() {
        return this.f100513c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof badk)) {
            return false;
        }
        badk badk = (badk) obj;
        boolean z = badk instanceof badb;
        if (Arrays.equals(this.f100511a, z ? ((badb) badk).f100511a : badk.mo55612a())) {
            return Arrays.equals(this.f100512b, z ? ((badb) badk).f100512b : badk.mo55613b()) && this.f100513c == badk.mo55614c();
        }
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f100511a);
        int hashCode2 = Arrays.hashCode(this.f100512b);
        long j = this.f100513c;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f100511a);
        String arrays2 = Arrays.toString(this.f100512b);
        long j = this.f100513c;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 82 + String.valueOf(arrays2).length());
        sb.append("CoreMdhFootprint{data=");
        sb.append(arrays);
        sb.append(", secondaryId=");
        sb.append(arrays2);
        sb.append(", serverEventIdTimestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
