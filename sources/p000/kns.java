package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: kns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kns extends knz {

    /* renamed from: b */
    private final Pattern f24543b;

    public kns(int i, String str) {
        super(i);
        this.f24543b = blmg.m107362a(str, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14728a(kom kom) {
        bmxv bmxv = kom.f24624w;
        if (bmxv.mo66813a()) {
            String str = ((koq) bmxv.mo66814b()).f24633a;
            if (str == null) {
                return false;
            }
            Matcher a = blmg.m107361a(this.f24543b, str);
            boolean find = a.find();
            blmg.m107363a(a);
            return find;
        } else if (kom.f24625x.mo66813a()) {
            return mo14729b((kom) kom.f24625x.mo66814b());
        } else {
            return false;
        }
    }
}
