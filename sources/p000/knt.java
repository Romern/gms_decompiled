package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: knt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class knt extends kny {

    /* renamed from: b */
    private final Pattern f24544b;

    public knt(int i, String str) {
        super(i);
        this.f24544b = blmg.m107362a(str, 2);
    }

    /* renamed from: b */
    public final boolean mo14729b(kom kom) {
        String str = kom.f24605d;
        if (str == null) {
            return false;
        }
        Matcher a = blmg.m107361a(this.f24544b, str);
        boolean find = a.find();
        blmg.m107363a(a);
        return find;
    }
}
