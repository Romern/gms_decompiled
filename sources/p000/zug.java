package p000;

import java.util.regex.Pattern;

/* renamed from: zug */
final /* synthetic */ class zug implements bmxz {

    /* renamed from: a */
    private final Pattern f55922a;

    public zug(Pattern pattern) {
        this.f55922a = pattern;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        int i = zui.f55923e;
        return this.f55922a.matcher((String) obj).find();
    }
}
