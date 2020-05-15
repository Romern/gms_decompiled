package p000;

/* renamed from: bnuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnuk extends bntc {

    /* renamed from: a */
    public static final bntc f132164a = new bnuk();

    private bnuk() {
    }

    /* renamed from: a */
    public final bnsc mo68472a(Class cls, int i) {
        StackTraceElement a = bnux.m110472a(cls, new Throwable(), i + 1);
        return a != null ? new bnva(a) : bnsc.f132067a;
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }

    /* renamed from: a */
    public final String mo68473a(Class cls) {
        StackTraceElement a = bnux.m110472a(cls, new Throwable(), 1);
        if (a != null) {
            return a.getClassName();
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() == 0 ? new String("no caller found on the stack for: ") : "no caller found on the stack for: ".concat(valueOf));
    }
}
