package p000;

/* renamed from: ahgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahgu {

    /* renamed from: a */
    public final String f67190a;

    /* renamed from: b */
    public final String f67191b;

    public ahgu(String str, String str2) {
        this.f67190a = str;
        this.f67191b = str2;
    }

    public final String toString() {
        String str = this.f67190a;
        String str2 = this.f67191b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
