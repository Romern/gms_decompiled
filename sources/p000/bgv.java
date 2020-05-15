package p000;

/* renamed from: bgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgv {

    /* renamed from: a */
    public String f3194a;

    /* renamed from: b */
    public short f3195b;

    /* renamed from: c */
    public String f3196c;

    /* renamed from: d */
    public short f3197d;

    /* renamed from: e */
    public boolean f3198e;

    /* renamed from: f */
    public int f3199f;

    public final String toString() {
        String str = this.f3194a;
        short s = this.f3195b;
        String str2 = this.f3196c;
        short s2 = this.f3197d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69 + String.valueOf(str2).length());
        sb.append("PDOL{tagName='");
        sb.append(str);
        sb.append("', tagLength='");
        sb.append((int) s);
        sb.append("', tagValue='");
        sb.append(str2);
        sb.append("', tagOffset='");
        sb.append((int) s2);
        sb.append("'}");
        return sb.toString();
    }
}
