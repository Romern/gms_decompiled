package p000;

/* renamed from: bsqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqf extends bsqg {

    /* renamed from: a */
    public final String f146633a;

    public bsqf(String str) {
        if (str != null) {
            this.f146633a = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: a */
    public final String mo70699a() {
        return this.f146633a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsqg) {
            return this.f146633a.equals(((bsqg) obj).mo70699a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f146633a.hashCode() ^ 1000003;
    }
}
