package p000;

import java.time.YearMonth;
import java.util.function.Function;

/* renamed from: lpw */
final /* synthetic */ class lpw implements Function {

    /* renamed from: a */
    private final lpy f26565a;

    public lpw(lpy lpy) {
        this.f26565a = lpy;
    }

    public final Object apply(Object obj) {
        String str;
        lpy lpy = this.f26565a;
        kdb kdb = (kdb) ((kct) obj).mo14368a();
        kcz b = lra.m19566b(lpy.f26159a, kdb.f23848c);
        YearMonth yearMonth = kdb.f23849d;
        if (yearMonth != null) {
            str = String.format("%d/%d", Integer.valueOf(yearMonth.getMonthValue()), Integer.valueOf(yearMonth.getYear()));
        } else {
            str = null;
        }
        lqg f = lql.m19524f();
        f.mo15376b(String.format("%s •••• %s", lra.m19564a(lpy.f26159a, kdb.f23848c), kdb.f23847b));
        f.mo15374a(str);
        f.mo15375a(new lqj(b.mo14380b()));
        f.mo15373a(new lpu(lpy, kdb));
        return f.mo15372a();
    }
}
