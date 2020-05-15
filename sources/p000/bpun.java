package p000;

/* renamed from: bpun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpun implements bxvp {
    UNKNOWN(0),
    STARTUP(1),
    UNCAUGHT_EXCEPTION_HANDLER(2),
    PHENOTYPE_UPDATE(3),
    SAFEBOOT_STARTUP(4),
    TIMED_OUT_BACKGROUND_TASK_HANDLER(5),
    PERIODIC_CHECKUP(6),
    SCHEDULED_IDLE(7),
    SCHEDULED_NOT_IDLE_DURING_WINDOW(8);
    

    /* renamed from: j */
    public final int f139268j;

    private bpun(int i) {
        this.f139268j = i;
    }

    /* renamed from: a */
    public static bpun m112298a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return STARTUP;
            case 2:
                return UNCAUGHT_EXCEPTION_HANDLER;
            case 3:
                return PHENOTYPE_UPDATE;
            case 4:
                return SAFEBOOT_STARTUP;
            case 5:
                return TIMED_OUT_BACKGROUND_TASK_HANDLER;
            case 6:
                return PERIODIC_CHECKUP;
            case 7:
                return SCHEDULED_IDLE;
            case 8:
                return SCHEDULED_NOT_IDLE_DURING_WINDOW;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112299b() {
        return bpum.f139257a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f139268j;
    }

    public final String toString() {
        return Integer.toString(this.f139268j);
    }
}
