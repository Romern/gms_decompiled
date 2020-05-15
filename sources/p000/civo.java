package p000;

/* renamed from: civo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civo {

    /* renamed from: a */
    public final String f191537a;

    public civo(String str) {
        this.f191537a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof civo) || !this.f191537a.equals(((civo) obj).f191537a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f191537a.hashCode();
    }

    public final String toString() {
        String str = this.f191537a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(":0");
        return sb.toString();
    }
}
