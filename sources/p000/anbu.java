package p000;

/* renamed from: anbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbu {

    /* renamed from: a */
    public static final anbu f76598a = new anbu(false, -1);

    /* renamed from: b */
    public final boolean f76599b;

    /* renamed from: c */
    public final int f76600c;

    public anbu(boolean z, int i) {
        this.f76599b = z;
        this.f76600c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anbu) {
            anbu anbu = (anbu) obj;
            if (this.f76599b == anbu.f76599b && this.f76600c == anbu.f76600c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f76600c;
        return (i + i) | this.f76599b ? 1 : 0;
    }
}
