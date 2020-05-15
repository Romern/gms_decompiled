package p000;

import java.util.regex.Pattern;

/* renamed from: bicl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicl {

    /* renamed from: a */
    public static final Pattern f120218a;

    /* renamed from: b */
    public static final String[] f120219b = {"WEP", "WPA", "WPA2", "IEEE8021X"};

    /* renamed from: c */
    private static final String f120220c;

    static {
        String format = String.format("%1$s:%1$s:%1$s:%1$s:%1$s:%1$s", "(\\p{XDigit}{2})");
        f120220c = format;
        f120218a = Pattern.compile(format);
    }
}
