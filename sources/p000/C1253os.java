package p000;

/* renamed from: os */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1253os {

    /* renamed from: a */
    private final Object f26822a;

    public C1253os(Object obj) {
        this.f26822a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f26822a.equals(((C1253os) obj).f26822a);
    }

    public final int hashCode() {
        return this.f26822a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f26822a + "}";
    }
}
