package p000;

/* renamed from: brsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brsg {

    /* renamed from: a */
    public final Class f143300a;

    /* renamed from: b */
    private final int f143301b;

    /* renamed from: c */
    private final int f143302c = 0;

    private brsg(Class cls, int i) {
        brsh.m114532a(cls, "Null dependency anInterface.");
        this.f143300a = cls;
        this.f143301b = i;
    }

    /* renamed from: a */
    public static brsg m114530a(Class cls) {
        return new brsg(cls, 0);
    }

    /* renamed from: b */
    public static brsg m114531b(Class cls) {
        return new brsg(cls, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof brsg) {
            brsg brsg = (brsg) obj;
            if (this.f143300a == brsg.f143300a && this.f143301b == brsg.f143301b) {
                int i = brsg.f143302c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f143300a.hashCode() ^ 1000003) * 1000003) ^ this.f143301b) * 1000003;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f143300a);
        sb.append(", type=");
        if (this.f143301b != 1) {
            str = "optional";
        } else {
            str = "required";
        }
        sb.append(str);
        sb.append(", direct=true}");
        return sb.toString();
    }
}
