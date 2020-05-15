package p000;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;

/* renamed from: jll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jll {

    /* renamed from: a */
    private static final sek f22759a = jsy.m17256a("GcmMessageSender");

    /* renamed from: a */
    public static Bundle m16881a(Context context, String str) {
        String str2;
        Bundle bundle = new Bundle();
        try {
            str2 = gie.m13189a(context, str, "oauth2:email https://www.googleapis.com/auth/firebase.messaging");
        } catch (gid | IOException e) {
            f22759a.mo25418e("Unable to get oauth token for %s", str);
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        String c = cchx.m129771c();
        bundle.putString("Authorization", str2.length() == 0 ? new String("Bearer ") : "Bearer ".concat(str2));
        bundle.putString("SenderId", c);
        bundle.putString("gcmb", "auth.proximity");
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d A[RETURN] */
    /* renamed from: a */
    private static String m16882a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 3124) {
            if (hashCode != 3199) {
                if (hashCode != 3322) {
                    if (hashCode != 3365) {
                        if (hashCode != 3635) {
                            if (hashCode == 3666 && str.equals("se")) {
                                c = 5;
                                return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? "unknown" : "session" : "respond" : "initiate" : "heartbeat" : "disconnect" : "auth";
                            }
                        } else if (str.equals("re")) {
                            c = 4;
                            if (c != 0) {
                            }
                        }
                    } else if (str.equals("in")) {
                        c = 3;
                        if (c != 0) {
                        }
                    }
                } else if (str.equals("hb")) {
                    c = 2;
                    if (c != 0) {
                    }
                }
            } else if (str.equals("dc")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (str.equals("au")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: b */
    public static void m16886b(Context context, String str, String str2, String str3) {
        Bundle a = m16881a(context, str);
        if (a == null) {
            m16885a(str, "dc");
            return;
        }
        a.putString("mt", "dc");
        a.putString("fDi", str3);
        a.putString("ptn", jma.m16891a(str2));
        m16884a(context, str2, str, str3, a);
    }

    /* renamed from: a */
    public static void m16883a(Context context, String str, String str2, String str3) {
        Bundle a = m16881a(context, str);
        if (a == null) {
            m16885a(str, "hb");
            return;
        }
        a.putString("mt", "hb");
        a.putString("fDi", str3);
        a.putString("ptn", jma.m16891a(str2));
        m16884a(context, str2, str, str3, a);
    }

    /* renamed from: a */
    public static void m16884a(Context context, String str, String str2, String str3, Bundle bundle) {
        long b = cchx.f179022a.mo6606a().mo75991b();
        String valueOf = String.valueOf(str);
        String str4 = valueOf.length() == 0 ? new String("/topics/private/") : "/topics/private/".concat(valueOf);
        String valueOf2 = String.valueOf(str2);
        String valueOf3 = String.valueOf(str3);
        try {
            aakz.m21424a(context).mo16961a(str4, String.valueOf((valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3)).hashCode()) + "@" + System.currentTimeMillis(), b, bundle);
        } catch (IOException e) {
            f22759a.mo25418e("Error sending upstream %s message to %s", m16882a(bundle.getString("mt")), str4);
        }
    }

    /* renamed from: a */
    public static void m16885a(String str, String str2) {
        f22759a.mo25418e("Failure authenticating %s for sending %s message.", str, m16882a(str2));
    }
}
