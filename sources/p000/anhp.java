package p000;

/* renamed from: anhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhp {

    /* renamed from: a */
    static final String[] f76889a = {"flagType", "name", "intVal", "boolVal", "floatVal", "stringVal", "extensionVal", "packageName", "user", "committed"};

    /* renamed from: b */
    public String f76890b;

    /* renamed from: c */
    public final String f76891c;

    /* renamed from: d */
    public final String f76892d;

    /* renamed from: e */
    public final String f76893e;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public anhp(String str, String str2, String str3, String str4) {
        this.f76890b = str;
        this.f76891c = str2;
        this.f76892d = str3;
        this.f76893e = str4;
    }

    /* renamed from: a */
    static boolean m64420a(String str, String str2) {
        if (str.endsWith("*")) {
            return str2.startsWith(str.substring(0, str.length() - 1));
        }
        return str.equals(str2);
    }
}
