package p000;

import android.content.Context;
import android.util.LruCache;
import java.util.concurrent.TimeUnit;

/* renamed from: ahyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyf extends LruCache {

    /* renamed from: a */
    private final sqv f68342a;

    public ahyf(Context context) {
        super((int) cfog.m141292t());
        this.f68342a = (sqv) ahgz.m55754a(context, sqv.class);
    }

    /* renamed from: a */
    private final boolean m56871a(ahwv ahwv) {
        return this.f68342a.mo20505a() > ahwv.mo37245a().longValue() + cfog.f184854a.mo6606a().mo82035m();
    }

    /* renamed from: a */
    public final boolean mo37287a(int i) {
        ahwv ahwv = (ahwv) get(Integer.valueOf(i));
        if (ahwv != null) {
            int i2 = ahwv.f68259a;
            return i2 == 3 ? this.f68342a.mo20505a() < ahwv.mo37245a().longValue() + TimeUnit.SECONDS.toMillis(cfog.f184854a.mo6606a().mo81952N()) : i2 != 2 && !m56871a(ahwv);
        }
    }

    /* renamed from: a */
    public final boolean mo37288a(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        ahwv ahwv = (ahwv) get(valueOf);
        if (ahwv != null && !ahwu.m56809a(i2, ahwv.f68259a) && !m56871a(ahwv)) {
            return false;
        }
        put(valueOf, new ahwv(i2, this.f68342a.mo20505a()));
        return true;
    }
}
