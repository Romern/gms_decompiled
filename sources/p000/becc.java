package p000;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: becc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class becc {

    /* renamed from: b */
    private static final bnsp f106894b = bnsp.m110328a("GlobMatcher");

    /* renamed from: a */
    public final Pattern f106895a;

    private becc(String str, Pattern pattern) {
        bmxy.m108581a(str);
        this.f106895a = pattern;
    }

    /* renamed from: a */
    public static bmxv m91759a(String str) {
        becb becb = new becb();
        StringBuilder sb = new StringBuilder();
        if (becb.mo58544a(str.toCharArray(), sb, false)) {
            try {
                return bmxv.m108566b(new becc(str, Pattern.compile(sb.toString(), 2)));
            } catch (PatternSyntaxException e) {
                bnsl bnsl = (bnsl) f106894b.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("becc", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Internal error. Generated regex is invalid: %s", sb);
                return bmvz.f131120a;
            }
        } else {
            bnsl bnsl2 = (bnsl) f106894b.mo68387b();
            bnsl2.mo68432a("becc", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Internal error. Can't parse glob-pattern: %s", str);
            return bmvz.f131120a;
        }
    }
}
