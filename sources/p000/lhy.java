package p000;

/* renamed from: lhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lhy extends lib {

    /* renamed from: a */
    private final String f26130a;

    /* renamed from: b */
    private final int f26131b;

    public lhy(String str, int i) {
        this.f26130a = str;
        this.f26131b = i;
    }

    /* renamed from: a */
    public final String mo15148a() {
        return this.f26130a;
    }

    /* renamed from: b */
    public final int mo15149b() {
        return this.f26131b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lib)) {
            return false;
        }
        lib lib = (lib) obj;
        String str = this.f26130a;
        if (str == null ? lib.mo15148a() == null : str.equals(lib.mo15148a())) {
            if (this.f26131b == lib.mo15149b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26130a;
        return (((str != null ? str.hashCode() : 0) ^ 1000003) * 1000003) ^ this.f26131b;
    }

    public final String toString() {
        String str = this.f26130a;
        int i = this.f26131b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append("Result{otpCode=");
        sb.append(str);
        sb.append(", statusCode=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
