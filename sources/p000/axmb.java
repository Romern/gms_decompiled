package p000;

/* renamed from: axmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axmb {
    /* renamed from: a */
    public static String m82712a() {
        String a = chkl.f188713a.mo6606a().mo85302a();
        return ("SANDBOX".equals(a) || "DEVELOPMENT".equals(a) || "LOCAL".equals(a)) ? a : "PROD";
    }

    /* renamed from: a */
    public static boolean m82713a(String str) {
        return "PROD".equals(str);
    }
}
