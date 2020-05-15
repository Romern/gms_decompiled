package p000;

/* renamed from: bjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjl extends Exception {
    private static final long serialVersionUID = -7880698968187728547L;

    /* renamed from: a */
    private final int f3369a;

    /* renamed from: b */
    private final Object f3370b;

    /* renamed from: c */
    private final int f3371c;

    public bjl(int i, int i2, Object obj) {
        this.f3371c = i;
        this.f3369a = i2;
        this.f3370b = obj;
    }

    public final String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.f3369a;
        if (i == 0) {
            stringBuffer.append("Unexpected character (");
            stringBuffer.append(this.f3370b);
            stringBuffer.append(") at position ");
            stringBuffer.append(this.f3371c);
            stringBuffer.append(".");
        } else if (i != 1) {
            stringBuffer.append("Unexpected exception at position ");
            stringBuffer.append(this.f3371c);
            stringBuffer.append(": ");
            stringBuffer.append(this.f3370b);
        } else {
            stringBuffer.append("Unexpected token ");
            stringBuffer.append(this.f3370b);
            stringBuffer.append(" at position ");
            stringBuffer.append(this.f3371c);
            stringBuffer.append(".");
        }
        return stringBuffer.toString();
    }
}
