package p000;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: yuq */
public final /* synthetic */ class yuq {
    /* renamed from: a */
    static /* synthetic */ bmxz m44879a(String str) {
        if (!str.isEmpty()) {
            try {
                return new yut(Pattern.compile(str));
            } catch (PatternSyntaxException e) {
            }
        }
        return bmyd.ALWAYS_FALSE;
    }

    /* renamed from: a */
    public static yuw m44880a(bmzi bmzi) {
        return m44881a(bmzi, yur.f54654a);
    }

    /* renamed from: a */
    public static yuw m44881a(bmzi bmzi, yuu yuu) {
        return new yuv(bmzi, yuu);
    }
}
