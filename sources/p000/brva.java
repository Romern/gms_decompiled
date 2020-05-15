package p000;

/* renamed from: brva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brva extends bruw {

    /* renamed from: b */
    private final String f143437b;

    public brva(String str) {
        if (str != null) {
            this.f143437b = str;
            return;
        }
        throw new NullPointerException("Null identifier");
    }

    /* renamed from: a */
    public final String mo69993a() {
        return this.f143437b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bruw) {
            return this.f143437b.equals(((bruw) obj).mo69993a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f143437b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f143437b;
        StringBuilder sb = new StringBuilder(str.length() + 24);
        sb.append("AuthContext{identifier=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
