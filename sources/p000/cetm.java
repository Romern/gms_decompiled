package p000;

/* renamed from: cetm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cetm implements cetk {
    public static final bdyx chreCcConfig;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        try {
            chreCcConfig = bdyx.m91608a(a, "chre_cc_config", (bybx) bxvk.m124014a(bybx.f165606a, new byte[0]), cetl.f183424a);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"chre_cc_config\"");
        }
    }

    public bybx chreCcConfig() {
        return (bybx) chreCcConfig.mo58455c();
    }

    public boolean compiled() {
        return true;
    }
}
