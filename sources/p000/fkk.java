package p000;

/* renamed from: fkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fkk {

    /* renamed from: a */
    public static final String f16781a;

    /* renamed from: b */
    public static final String f16782b;

    static {
        String replaceAll = String.valueOf(rfj.f42871c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        f16781a = replaceAll;
        String valueOf = String.valueOf(replaceAll);
        f16782b = valueOf.length() == 0 ? new String("ma") : "ma".concat(valueOf);
    }
}
