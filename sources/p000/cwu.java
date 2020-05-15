package p000;

/* renamed from: cwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwu {

    /* renamed from: a */
    public final byte f12279a;

    /* renamed from: b */
    public final int f12280b;

    private cwu(byte b, int i) {
        this.f12279a = b;
        this.f12280b = i;
    }

    /* renamed from: a */
    public static cwu m7793a(byte b, int i) {
        return new cwu(b, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cwu cwu = (cwu) obj;
            return this.f12279a == cwu.f12279a && this.f12280b == cwu.f12280b;
        }
    }

    public final int hashCode() {
        return (this.f12279a * 31) + this.f12280b;
    }
}
