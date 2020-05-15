package p000;

import java.util.regex.Pattern;

/* renamed from: beax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beax {

    /* renamed from: a */
    private final beaw f106856a = new beaw();

    /* renamed from: a */
    public final Pattern mo58514a(String str) {
        Pattern pattern = (Pattern) this.f106856a.mo58512a(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.f106856a.mo58513a(str, compile);
        return compile;
    }
}
