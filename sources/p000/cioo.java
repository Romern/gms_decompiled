package p000;

/* renamed from: cioo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cioo implements bxvp {
    UNKNOWN(0),
    PRIMES_INITIALIZED(1),
    PRIMES_CRASH_MONITORING_INITIALIZED(2),
    PRIMES_FIRST_ACTIVITY_LAUNCHED(3),
    PRIMES_CUSTOM_LAUNCHED(4);
    

    /* renamed from: f */
    public final int f191102f;

    private cioo(int i) {
        this.f191102f = i;
    }

    /* renamed from: a */
    public static cioo m150669a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PRIMES_INITIALIZED;
        }
        if (i == 2) {
            return PRIMES_CRASH_MONITORING_INITIALIZED;
        }
        if (i == 3) {
            return PRIMES_FIRST_ACTIVITY_LAUNCHED;
        }
        if (i != 4) {
            return null;
        }
        return PRIMES_CUSTOM_LAUNCHED;
    }

    /* renamed from: b */
    public static bxvr m150670b() {
        return cion.f191095a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f191102f;
    }

    public final String toString() {
        return Integer.toString(this.f191102f);
    }
}
