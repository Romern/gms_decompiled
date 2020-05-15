package p000;

/* renamed from: apob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apob extends apoc {

    /* renamed from: a */
    public final int f84757a;

    public apob(int i) {
        this.f84757a = i;
    }

    /* renamed from: a */
    public final int mo47458a() {
        return this.f84757a;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof apoc) && this.f84757a == ((apoc) obj).mo47458a();
        }
        return true;
    }

    public final int hashCode() {
        return this.f84757a ^ 1000003;
    }

    public final String toString() {
        int i = this.f84757a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("DocumentIdHash32{value=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
