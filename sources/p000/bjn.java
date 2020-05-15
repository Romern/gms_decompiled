package p000;

/* renamed from: bjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjn {

    /* renamed from: a */
    public final int f3390a;

    /* renamed from: b */
    public final Object f3391b;

    public bjn(int i, Object obj) {
        this.f3390a = i;
        this.f3391b = obj;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f3390a) {
            case -1:
                stringBuffer.append("END OF FILE");
                break;
            case 0:
                stringBuffer.append("VALUE(");
                stringBuffer.append(this.f3391b);
                stringBuffer.append(")");
                break;
            case 1:
                stringBuffer.append("LEFT BRACE({)");
                break;
            case 2:
                stringBuffer.append("RIGHT BRACE(})");
                break;
            case 3:
                stringBuffer.append("LEFT SQUARE([)");
                break;
            case 4:
                stringBuffer.append("RIGHT SQUARE(])");
                break;
            case 5:
                stringBuffer.append("COMMA(,)");
                break;
            default:
                stringBuffer.append("COLON(:)");
                break;
        }
        return stringBuffer.toString();
    }
}
