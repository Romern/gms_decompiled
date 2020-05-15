package p000;

/* renamed from: bzpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzpv implements bxvp {
    HELP_CONSOLE(0),
    HELP_SUB_CONSOLE(1),
    HELP_ANSWER_FRAGMENT(2),
    CONTACT_US_FRAGMENT(3);
    

    /* renamed from: e */
    public final int f170966e;

    private bzpv(int i) {
        this.f170966e = i;
    }

    /* renamed from: a */
    public static bzpv m126025a(int i) {
        if (i == 0) {
            return HELP_CONSOLE;
        }
        if (i == 1) {
            return HELP_SUB_CONSOLE;
        }
        if (i == 2) {
            return HELP_ANSWER_FRAGMENT;
        }
        if (i != 3) {
            return null;
        }
        return CONTACT_US_FRAGMENT;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f170966e;
    }

    public final String toString() {
        return Integer.toString(this.f170966e);
    }
}
