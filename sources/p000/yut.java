package p000;

import java.util.regex.Pattern;

/* renamed from: yut */
final /* synthetic */ class yut implements bmxz {

    /* renamed from: a */
    private final Pattern f54656a;

    public yut(Pattern pattern) {
        this.f54656a = pattern;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        return this.f54656a.matcher((String) obj).find();
    }
}
