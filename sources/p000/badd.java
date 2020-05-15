package p000;

/* renamed from: badd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class badd extends badn {

    /* renamed from: a */
    public final int f100516a;

    /* renamed from: b */
    public final boolean f100517b;

    /* renamed from: c */
    public final boolean f100518c;

    /* renamed from: d */
    public final long f100519d;

    public badd(int i, boolean z, boolean z2, long j) {
        this.f100516a = i;
        this.f100517b = z;
        this.f100518c = z2;
        this.f100519d = j;
    }

    /* renamed from: a */
    public final int mo55623a() {
        return this.f100516a;
    }

    /* renamed from: b */
    public final boolean mo55624b() {
        return this.f100517b;
    }

    /* renamed from: c */
    public final boolean mo55625c() {
        return this.f100518c;
    }

    /* renamed from: d */
    public final long mo55626d() {
        return this.f100519d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof badn) {
            badn badn = (badn) obj;
            return this.f100516a == badn.mo55623a() && this.f100517b == badn.mo55624b() && this.f100518c == badn.mo55625c() && this.f100519d == badn.mo55626d();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((this.f100516a ^ 1000003) * 1000003) ^ (!this.f100517b ? 1237 : 1231)) * 1000003;
        if (this.f100518c) {
            i = 1231;
        }
        long j = this.f100519d;
        return ((i2 ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        int i = this.f100516a;
        boolean z = this.f100517b;
        boolean z2 = this.f100518c;
        long j = this.f100519d;
        StringBuilder sb = new StringBuilder(131);
        sb.append("CoreMdhFootprintsRecordingSetting{corpusGroup=");
        sb.append(i);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", unset=");
        sb.append(z2);
        sb.append(", lastModifiedTimeMicros=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
