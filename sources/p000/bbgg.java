package p000;

import android.util.Pair;
import java.util.concurrent.TimeUnit;

/* renamed from: bbgg */
final /* synthetic */ class bbgg implements bmxj {

    /* renamed from: a */
    private final bbgi f102586a;

    public bbgg(bbgi bbgi) {
        this.f102586a = bbgi;
    }

    public final Object apply(Object obj) {
        bbgi bbgi = this.f102586a;
        bxtx bxtx = (bxtx) obj;
        bbgh bbgh = (bbgh) bbgi.f102588b.get(bxtx);
        if (bbgh != null) {
            long a = bbgi.f102587a.mo54417a();
            long b = bbgh.mo56126b();
            Pair create = Pair.create(1L, TimeUnit.HOURS);
            if (a < b + ((TimeUnit) create.second).toMillis(((Long) create.first).longValue())) {
                return bbgh.mo56125a();
            }
        }
        bbgi.f102588b.remove(bxtx);
        bbfx d = bbfz.m87976d();
        d.f102572a = 3;
        return d.mo56122a();
    }
}
