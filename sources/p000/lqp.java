package p000;

/* renamed from: lqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lqp {

    /* renamed from: a */
    private static final srn f26606a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private static final String[] f26607b;

    /* renamed from: c */
    private static String[] f26608c;

    static {
        String[] strArr = new String[0];
        f26607b = strArr;
        f26608c = strArr;
    }

    /* renamed from: a */
    private static synchronized void m19537a(String[] strArr) {
        synchronized (lqp.class) {
            f26608c = strArr;
        }
    }

    /* renamed from: a */
    public static boolean m19538a(String str) {
        boolean z;
        if (!ccim.f179064a.mo6606a().mo76030d()) {
            return false;
        }
        if (f26608c == f26607b) {
            String b = ccim.f179064a.mo6606a().mo76028b();
            if (!bmxx.m108577a(b)) {
                m19537a(b.split("\\|"));
            } else {
                m19537a(new String[0]);
            }
        }
        String[] strArr = f26608c;
        for (String str2 : strArr) {
            if (!bmxx.m108577a(str) && !str2.isEmpty()) {
                if (str2.endsWith("*")) {
                    String replace = str2.replace("*", "");
                    if (replace.length() < str2.length() - 1) {
                        bnsl bnsl = (bnsl) f26606a.mo68388c();
                        bnsl.mo68432a("lqp", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("glob[ %s ] is malformed", str2);
                    }
                    z = str.startsWith(replace);
                } else {
                    z = str.equals(str2);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m19539a(String str, String str2) {
        if (bmxx.m108577a(str) || str2.isEmpty()) {
            return false;
        }
        if (!str2.endsWith("*")) {
            return str.equals(str2);
        }
        String replace = str2.replace("*", "");
        if (replace.length() < str2.length() - 1) {
            bnsl bnsl = (bnsl) f26606a.mo68388c();
            bnsl.mo68432a("lqp", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("glob[ %s ] is malformed", str2);
        }
        return str.startsWith(replace);
    }
}
