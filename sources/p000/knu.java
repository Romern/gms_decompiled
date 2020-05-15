package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: knu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class knu extends knz {

    /* renamed from: b */
    private final Pattern f24545b;

    /* renamed from: c */
    private final boolean f24546c;

    public knu(int i, String str, boolean z) {
        super(i);
        this.f24545b = blmg.m107362a(str, 2);
        this.f24546c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14728a(kom kom) {
        boolean z;
        String str = kom.f24603b;
        if (str != null) {
            Matcher a = blmg.m107361a(this.f24545b, str);
            z = a.find();
            blmg.m107363a(a);
        } else {
            z = false;
        }
        if (!z && kom.f24625x.mo66813a()) {
            kom kom2 = (kom) kom.f24625x.mo66814b();
            if (kom2.mo14754a() == 1 || !this.f24546c) {
                return mo14729b(kom2);
            }
        }
        return z;
    }
}
