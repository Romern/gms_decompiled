package p000;

/* renamed from: acbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbg extends Exception {

    /* renamed from: a */
    private final int f59432a;

    /* renamed from: b */
    private final String f59433b;

    public acbg(int i, String str, String str2) {
        super(str2);
        this.f59432a = i;
        this.f59433b = str;
    }

    /* renamed from: a */
    public final String mo32605a() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMessage());
        sb.append("\n");
        sb.append(this.f59433b);
        sb.append("\n");
        for (int i = 0; i < this.f59432a; i++) {
            sb.append(" ");
        }
        sb.append("^");
        return sb.toString();
    }
}
