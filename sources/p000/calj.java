package p000;

/* renamed from: calj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum calj implements bxvp {
    START_MILLIS(1),
    REPORT_LENGTH_HOURS(2);
    

    /* renamed from: c */
    private final int f175133c;

    private calj(int i) {
        this.f175133c = i;
    }

    /* renamed from: a */
    public static calj m126754a(int i) {
        if (i == 1) {
            return START_MILLIS;
        }
        if (i != 2) {
            return null;
        }
        return REPORT_LENGTH_HOURS;
    }

    /* renamed from: b */
    public static bxvr m126755b() {
        return cali.f175129a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f175133c;
    }

    public final String toString() {
        return Integer.toString(this.f175133c);
    }
}
