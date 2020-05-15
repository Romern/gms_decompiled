package p000;

/* renamed from: bbxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbxx extends bbyg {

    /* renamed from: a */
    private final long f103732a;

    /* renamed from: b */
    private final int f103733b;

    public bbxx(long j, int i) {
        this.f103732a = j;
        this.f103733b = i;
    }

    /* renamed from: a */
    public final long mo56503a() {
        return this.f103732a;
    }

    /* renamed from: b */
    public final int mo56504b() {
        return this.f103733b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbyg) {
            bbyg bbyg = (bbyg) obj;
            if (this.f103732a == bbyg.mo56503a()) {
                int i = this.f103733b;
                int b = bbyg.mo56504b();
                if (i == 0) {
                    throw null;
                } else if (i == b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f103732a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = this.f103733b;
        if (i2 != 0) {
            return i2 ^ i;
        }
        throw null;
    }

    public final String toString() {
        long j = this.f103732a;
        int i = this.f103733b;
        String str = i != 1 ? i != 2 ? "null" : "SUCCESS" : "UNSUPPORTED";
        StringBuilder sb = new StringBuilder(str.length() + 69);
        sb.append("DeleteConversationResult{timestampUsec=");
        sb.append(j);
        sb.append(", status=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
