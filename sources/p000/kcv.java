package p000;

/* renamed from: kcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class kcv {

    /* renamed from: b */
    public final String f23841b;

    public kcv(String str) {
        this.f23841b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kcv) {
            return this.f23841b.equals(((kcv) obj).f23841b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23841b.hashCode();
    }

    public final String toString() {
        return String.format("Domain[authenticationDomain=%s]", this.f23841b);
    }
}
