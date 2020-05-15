package p000;

/* renamed from: bcrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrj extends bcsh {

    /* renamed from: a */
    private final boolean f104707a;

    public bcrj(boolean z) {
        this.f104707a = z;
    }

    /* renamed from: a */
    public final boolean mo57298a() {
        return this.f104707a;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bcsh) && this.f104707a == ((bcsh) obj).mo57298a();
        }
        return true;
    }

    public final int hashCode() {
        return (!this.f104707a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f104707a;
        StringBuilder sb = new StringBuilder(20);
        sb.append("Block{blocked=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
