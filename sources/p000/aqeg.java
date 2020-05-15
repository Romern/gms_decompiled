package p000;

/* renamed from: aqeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqeg extends aqej {

    /* renamed from: a */
    private final String f85864a;

    /* renamed from: b */
    private final int f85865b;

    public aqeg(String str, int i) {
        if (str != null) {
            this.f85864a = str;
            this.f85865b = i;
            return;
        }
        throw new NullPointerException("Null activityName");
    }

    /* renamed from: a */
    public final String mo47771a() {
        return this.f85864a;
    }

    /* renamed from: b */
    public final int mo47772b() {
        return this.f85865b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqej) {
            aqej aqej = (aqej) obj;
            return this.f85864a.equals(aqej.mo47771a()) && this.f85865b == aqej.mo47772b();
        }
    }

    public final int hashCode() {
        return ((this.f85864a.hashCode() ^ 1000003) * 1000003) ^ this.f85865b;
    }

    public final String toString() {
        String str = this.f85864a;
        int i = this.f85865b;
        StringBuilder sb = new StringBuilder(str.length() + 68);
        sb.append("BlockedActivityDetails{activityName=");
        sb.append(str);
        sb.append(", activityFrequency=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
