package p000;

/* renamed from: bhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhg extends Exception {
    private static final long serialVersionUID = -7880698968187728547L;

    /* renamed from: a */
    private final int f3226a;

    /* renamed from: b */
    private final Object f3227b;

    /* renamed from: c */
    private final int f3228c;

    public bhg(int i, int i2, Object obj) {
        this.f3228c = i;
        this.f3226a = i2;
        this.f3227b = obj;
    }

    public final String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.f3226a;
        if (i == 0) {
            stringBuffer.append("Unexpected character (");
            stringBuffer.append(this.f3227b);
            stringBuffer.append(") at position ");
            stringBuffer.append(this.f3228c);
            stringBuffer.append(".");
        } else if (i != 1) {
            stringBuffer.append("Unexpected exception at position ");
            stringBuffer.append(this.f3228c);
            stringBuffer.append(": ");
            stringBuffer.append(this.f3227b);
        } else {
            stringBuffer.append("Unexpected token ");
            stringBuffer.append(this.f3227b);
            stringBuffer.append(" at position ");
            stringBuffer.append(this.f3228c);
            stringBuffer.append(".");
        }
        return stringBuffer.toString();
    }
}
