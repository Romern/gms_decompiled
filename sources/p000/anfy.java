package p000;

/* renamed from: anfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfy extends RuntimeException {

    /* renamed from: a */
    public final int f76792a;

    /* renamed from: b */
    public final String f76793b;

    public anfy(int i) {
        this(i, null);
    }

    public anfy(int i, String str) {
        this(i, str, null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public anfy(int i, String str, Throwable th) {
        super(r0, th);
        String str2;
        if (str != null) {
            StringBuilder sb = new StringBuilder(str.length() + 13);
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            str2 = sb.toString();
        } else {
            str2 = String.valueOf(i);
        }
        this.f76792a = i;
        this.f76793b = str;
    }
}
