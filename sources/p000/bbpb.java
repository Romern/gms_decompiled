package p000;

/* renamed from: bbpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbpb extends bbpp {

    /* renamed from: a */
    private final int f103034a;

    public bbpb(int i) {
        this.f103034a = i;
    }

    /* renamed from: a */
    public final int mo56289a() {
        return this.f103034a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbpp)) {
            return false;
        }
        int i = this.f103034a;
        if (i != ((bbpp) obj).mo56289a()) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f103034a;
        if (i != 0) {
            return i ^ 1000003;
        }
        throw null;
    }

    public final String toString() {
        int i = this.f103034a;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NEED_VERIFY" : "FAILURE" : "SUCCESS" : "UNKNOWN";
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("RegisterResult{status=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
