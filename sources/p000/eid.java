package p000;

/* renamed from: eid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eid {

    /* renamed from: a */
    private final String f15031a;

    private eid(String str) {
        this.f15031a = str;
    }

    /* renamed from: a */
    public static eid m10480a(String str) {
        return new eid(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eid) {
            return this.f15031a.equals(((eid) obj).f15031a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15031a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f15031a;
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("Encoding{name=\"");
        sb.append(str);
        sb.append("\"}");
        return sb.toString();
    }
}
