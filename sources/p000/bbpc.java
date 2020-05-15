package p000;

/* renamed from: bbpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbpc extends bbpr {

    /* renamed from: a */
    private final int f103035a;

    public bbpc(int i) {
        this.f103035a = i;
    }

    /* renamed from: a */
    public final int mo56293a() {
        return this.f103035a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbpr)) {
            return false;
        }
        int i = this.f103035a;
        if (i != ((bbpr) obj).mo56293a()) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f103035a;
        if (i != 0) {
            return i ^ 1000003;
        }
        throw null;
    }

    public final String toString() {
        int i = this.f103035a;
        String str = i != 1 ? i != 2 ? "null" : "FAILURE" : "SUCCESS";
        StringBuilder sb = new StringBuilder(str.length() + 25);
        sb.append("UnregisterResult{status=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
