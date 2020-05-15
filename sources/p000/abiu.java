package p000;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: abiu */
final /* synthetic */ class abiu implements Callable {

    /* renamed from: a */
    private final List f57553a;

    /* renamed from: b */
    private final bslx f57554b;

    /* renamed from: c */
    private final String f57555c;

    public abiu(List list, bslx bslx, String str) {
        this.f57553a = list;
        this.f57554b = bslx;
        this.f57555c = str;
    }

    public final Object call() {
        List list = this.f57553a;
        bslx bslx = this.f57554b;
        String str = this.f57555c;
        bngs j = bngx.m109377j();
        int size = list.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            abjc abjc = (abjc) ((bqgg) list.get(i)).get();
            if (abjc.mo32132a()) {
                j2++;
            }
            j.mo67666b((Iterable) abjc.mo32133b());
        }
        bslz bslz = bslx.f144978b;
        if (bslz == null) {
            bslz = bslz.f144984c;
        }
        if (abjd.m47787a(bslz).mo6527a(Long.valueOf(j2))) {
            return abjc.m47783c();
        }
        return abjc.m47782a(str, j);
    }
}
