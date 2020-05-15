package p000;

/* renamed from: cixg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixg extends cixh {

    /* renamed from: a */
    public static final cixg f191671a = new cixg();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f191671a;
    }

    /* renamed from: a */
    public final boolean mo86624a() {
        return false;
    }

    /* renamed from: b */
    public final Object mo86625b() {
        throw new IllegalStateException("value is absent");
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 1502476572;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
