package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yrp */
public final /* synthetic */ class yrp implements Callable {

    /* renamed from: a */
    private final yrz f54497a;

    /* renamed from: b */
    private final Iterable f54498b;

    public yrp(yrz yrz, Iterable iterable) {
        this.f54497a = yrz;
        this.f54498b = iterable;
    }

    public final Object call() {
        yrz yrz = this.f54497a;
        Iterable iterable = this.f54498b;
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        bxvd da = caca.f172499e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caca caca = (caca) da.f164949b;
        "me".getClass();
        caca.f172501a |= 1;
        caca.f172504d = "me";
        bxvd da2 = cabz.f172496b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cabz cabz = (cabz) da2.f164949b;
        if (!cabz.f172498a.mo73666a()) {
            cabz.f172498a = bxvk.m124021a(cabz.f172498a);
        }
        bxsy.m123078a(iterable, cabz.f172498a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caca caca2 = (caca) da.f164949b;
        cabz cabz2 = (cabz) da2.mo74062i();
        cabz2.getClass();
        caca2.f172503c = cabz2;
        caca2.f172502b = 2;
        return yrb.mo30683a(clientContext, (caca) da.mo74062i());
    }
}
