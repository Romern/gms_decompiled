package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yhf */
public final /* synthetic */ class yhf {
    /* renamed from: a */
    public static long m44092a(yhg yhg) {
        return yhg.mo30387b() - yhg.mo30385a();
    }

    /* renamed from: b */
    public static long m44094b(yhg yhg) {
        return yhg.mo30386a(TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static long m44096c(yhg yhg) {
        return yhg.mo30388b(TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static long m44093a(yhg yhg, TimeUnit timeUnit) {
        return timeUnit.convert(yhg.mo30385a(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public static long m44095b(yhg yhg, TimeUnit timeUnit) {
        return timeUnit.convert(yhg.mo30387b(), TimeUnit.NANOSECONDS);
    }
}
