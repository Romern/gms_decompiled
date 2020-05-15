package p000;

/* renamed from: aaly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaly {

    /* renamed from: a */
    public static final aaly f28427a = new aaly(0);

    /* renamed from: b */
    public final int f28428b;

    /* renamed from: c */
    private final int f28429c = 30;

    /* renamed from: d */
    private final int f28430d = 3600;

    static {
        new aaly(1);
    }

    private aaly(int i) {
        this.f28428b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaly) {
            aaly aaly = (aaly) obj;
            if (aaly.f28428b == this.f28428b) {
                int i = aaly.f28429c;
                int i2 = aaly.f28430d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f28428b + 1) ^ 1000003) * 1000003) ^ 30) * 1000003) ^ 3600;
    }

    public final String toString() {
        int i = this.f28428b;
        StringBuilder sb = new StringBuilder(74);
        sb.append("policy=");
        sb.append(i);
        sb.append(" initial_backoff=30 maximum_backoff=3600");
        return sb.toString();
    }
}
