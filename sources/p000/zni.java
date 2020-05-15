package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: zni */
public final /* synthetic */ class zni implements bmxj {

    /* renamed from: a */
    public static final bmxj f55550a = new zni();

    private zni() {
    }

    public final Object apply(Object obj) {
        long j;
        cadz cadz = (cadz) obj;
        long nanos = TimeUnit.MILLISECONDS.toNanos(cadz.f172779e);
        if (cadz.f172780f != 0) {
            j = TimeUnit.MILLISECONDS.toNanos(cadz.f172780f);
        } else {
            j = Long.MAX_VALUE;
        }
        return yfv.m44005a(nanos, j);
    }
}
