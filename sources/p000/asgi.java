package p000;

import java.util.regex.Pattern;

/* renamed from: asgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgi {

    /* renamed from: a */
    public static final Pattern f88918a = Pattern.compile("\\n");

    /* renamed from: b */
    public static final Pattern f88919b = Pattern.compile(".*\\sname:(\\S+).*");

    /* renamed from: c */
    public final asgj f88920c;

    protected asgi(asgj asgj) {
        this.f88920c = asgj;
    }

    /* renamed from: a */
    protected static String m74037a(String str) {
        if (str.contains("GLOBAL SETTINGS")) {
            return "GLOBAL";
        }
        if (str.contains("SECURE SETTINGS")) {
            return "SECURE";
        }
        if (str.contains("SYSTEM SETTINGS")) {
            return "SYSTEM";
        }
        return null;
    }
}
