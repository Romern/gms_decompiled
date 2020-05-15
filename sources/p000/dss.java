package p000;

import android.util.Log;

/* renamed from: dss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dss {

    /* renamed from: a */
    public static final srn f13961a = srn.m36126a("ctxmgr", sgj.CONTEXT_MANAGER);

    /* renamed from: b */
    private static final Boolean f13962b = Boolean.valueOf(cdhi.f180909a.mo6606a().mo77618a());

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r4 != 6) goto L_0x00e1;
     */
    /* renamed from: a */
    private static String m9248a(int i, String str, String str2, Throwable th, Object... objArr) {
        String str3;
        String str4 = "";
        if (i != 0 && !m9250a(i)) {
            return str4;
        }
        if (objArr == null || objArr.length == 0) {
            str3 = String.format("[%s]%s", str, str2);
        } else {
            String valueOf = String.valueOf(String.format("[%s]", str));
            String valueOf2 = String.valueOf(String.format(str2, objArr));
            str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        if (f13962b.booleanValue()) {
            if (i != 0) {
                if (i == 4) {
                    bnsl bnsl = (bnsl) f13961a.mo68390d();
                    bnsl.mo68437a(th);
                    bnsl.mo68432a("dss", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("%s", str3);
                } else if (i == 5) {
                    bnsl bnsl2 = (bnsl) f13961a.mo68388c();
                    bnsl2.mo68437a(th);
                    bnsl2.mo68432a("dss", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("%s", str3);
                }
            }
            bnsl bnsl3 = (bnsl) f13961a.mo68387b();
            bnsl3.mo68437a(th);
            bnsl3.mo68432a("dss", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("%s", str3);
        } else {
            String valueOf3 = String.valueOf(str3);
            if (th == null) {
                String stackTraceString = Log.getStackTraceString(null);
                StringBuilder sb = new StringBuilder(String.valueOf(stackTraceString).length() + 1);
                sb.append(10);
                sb.append(stackTraceString);
                str4 = sb.toString();
            }
            String valueOf4 = String.valueOf(str4);
            Log.println(i, "ctxmgr", valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4));
        }
        return str3;
    }

    /* renamed from: b */
    public static void m9251b(String str, String str2, Object... objArr) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            m9248a(2, str, str2, e, objArr);
        }
    }

    /* renamed from: a */
    public static void m9249a(String str, String str2, Object... objArr) {
        m9248a(6, str, str2, null, objArr);
    }

    /* renamed from: a */
    public static boolean m9250a(int i) {
        return Log.isLoggable("ctxmgr", i);
    }
}
