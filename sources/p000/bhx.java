package p000;

/* renamed from: bhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhx extends bia {

    /* renamed from: a */
    public String f3259a = "";

    /* renamed from: b */
    public String f3260b = null;

    public final String toString() {
        String str = this.f3260b;
        String str2 = this.f3259a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }
}
