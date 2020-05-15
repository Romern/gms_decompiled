package p000;

/* renamed from: bnva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnva extends bnsc {

    /* renamed from: b */
    private final StackTraceElement f132214b;

    public bnva(StackTraceElement stackTraceElement) {
        bnuy.m110474a(stackTraceElement, "stack element");
        this.f132214b = stackTraceElement;
    }

    /* renamed from: a */
    public final String mo68449a() {
        return this.f132214b.getClassName();
    }

    /* renamed from: b */
    public final String mo68450b() {
        return this.f132214b.getMethodName();
    }

    /* renamed from: c */
    public final int mo68451c() {
        return Math.max(this.f132214b.getLineNumber(), 0);
    }

    /* renamed from: d */
    public final String mo68452d() {
        return this.f132214b.getFileName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bnva) && this.f132214b.equals(((bnva) obj).f132214b);
    }

    public final int hashCode() {
        return this.f132214b.hashCode();
    }
}
