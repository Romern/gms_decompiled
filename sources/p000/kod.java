package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: kod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kod extends knx {

    /* renamed from: b */
    private final Pattern f24570b;

    public kod(int i, String str) {
        super(i);
        this.f24570b = blmg.m107362a(str, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14730a(kok kok) {
        String a = kok.mo14744a();
        String b = kok.mo14745b();
        if (!"name".equals(a) && !"id".equals(a)) {
            return false;
        }
        Matcher a2 = blmg.m107361a(this.f24570b, b);
        boolean find = a2.find();
        blmg.m107363a(a2);
        return find;
    }
}
