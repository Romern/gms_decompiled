package p000;

/* renamed from: fio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fio {
    /* renamed from: a */
    public static String m11763a(int i) {
        return m11764a("pi", i);
    }

    /* renamed from: a */
    public static String m11764a(String str, int i) {
        if (i > 0) {
            StringBuilder sb = new StringBuilder(str.length() + 11);
            sb.append(str);
            sb.append(i);
            return sb.toString();
        }
        fnq.m12017a("index out of range for prefix", str);
        return "";
    }
}
