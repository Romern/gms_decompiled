package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: chsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chsl {

    /* renamed from: a */
    public final List f189097a;

    /* renamed from: b */
    private final chqh f189098b;

    /* renamed from: c */
    private final Object[][] f189099c;

    public chsl(List list, chqh chqh, Object[][] objArr) {
        bmxy.m108582a(list, "addresses are not set");
        this.f189097a = list;
        bmxy.m108582a(chqh, "attrs");
        this.f189098b = chqh;
        this.f189099c = (Object[][]) bmxy.m108582a(objArr, "customOptions");
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("addrs", this.f189097a);
        a.mo66885a("attrs", this.f189098b);
        a.mo66885a("customOptions", Arrays.deepToString(this.f189099c));
        return a.toString();
    }
}
