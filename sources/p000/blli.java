package p000;

/* renamed from: blli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blli extends blme {

    /* renamed from: a */
    private final String f126794a;

    /* renamed from: b */
    private final int f126795b;

    public blli(String str, int i) {
        if (str != null) {
            this.f126794a = str;
            this.f126795b = i;
            return;
        }
        throw new NullPointerException("Null regex");
    }

    /* renamed from: a */
    public final String mo66650a() {
        return this.f126794a;
    }

    /* renamed from: b */
    public final int mo66651b() {
        return this.f126795b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blme) {
            blme blme = (blme) obj;
            return this.f126794a.equals(blme.mo66650a()) && this.f126795b == blme.mo66651b();
        }
    }

    public final int hashCode() {
        return ((this.f126794a.hashCode() ^ 1000003) * 1000003) ^ this.f126795b;
    }

    public final String toString() {
        String str = this.f126794a;
        int i = this.f126795b;
        StringBuilder sb = new StringBuilder(str.length() + 37);
        sb.append("PatternKey{regex=");
        sb.append(str);
        sb.append(", flags=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
