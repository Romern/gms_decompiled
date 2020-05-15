package p000;

/* renamed from: anfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfx extends Exception {

    /* renamed from: a */
    public final int f76790a;

    /* renamed from: b */
    public final String f76791b;

    /* JADX WARNING: Illegal instructions before constructor call */
    public anfx(String str) {
        super(r0, null);
        String str2;
        if (str != null) {
            StringBuilder sb = new StringBuilder(str.length() + 13);
            sb.append("29512: ");
            sb.append(str);
            str2 = sb.toString();
        } else {
            str2 = "29512";
        }
        this.f76790a = 29512;
        this.f76791b = str;
    }
}
