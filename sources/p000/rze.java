package p000;

import java.util.regex.Pattern;

/* renamed from: rze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rze {

    /* renamed from: a */
    public static final Pattern f43884a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");

    /* renamed from: b */
    private static int f43885b;

    /* renamed from: a */
    public static synchronized int m34698a() {
        int i;
        synchronized (rze.class) {
            i = f43885b + 1;
            f43885b = i;
            f43885b = i % 3;
        }
        return i;
    }
}
