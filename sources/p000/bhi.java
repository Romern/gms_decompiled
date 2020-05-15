package p000;

/* renamed from: bhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhi {

    /* renamed from: a */
    public final int f3247a;

    /* renamed from: b */
    public final Object f3248b;

    public bhi(int i, Object obj) {
        this.f3247a = i;
        this.f3248b = obj;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f3247a) {
            case -1:
                stringBuffer.append("END OF FILE");
                break;
            case 0:
                stringBuffer.append("VALUE(");
                stringBuffer.append(this.f3248b);
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
