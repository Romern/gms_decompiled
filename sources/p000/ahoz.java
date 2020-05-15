package p000;

import java.util.regex.Pattern;

/* renamed from: ahoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahoz {

    /* renamed from: a */
    public static final Pattern f67684a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    /* renamed from: b */
    public static final Pattern f67685b = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    /* renamed from: c */
    public static final Pattern f67686c = Pattern.compile("^DIRECT-[a-zA-Z0-9]{2}.*$");

    /* renamed from: d */
    public static final Pattern f67687d = Pattern.compile("^[a-zA-Z0-9]{16}.*$");

    /* renamed from: a */
    public static void m56311a(boolean z, String str) {
        if (z) {
            throw new bxwf(str);
        }
    }
}
