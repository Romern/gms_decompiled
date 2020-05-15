package p000;

import android.content.Context;
import android.util.LruCache;

/* renamed from: ahyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyp extends LruCache {

    /* renamed from: a */
    private final sqv f68363a;

    public ahyp(Context context) {
        super((int) cfog.m141292t());
        this.f68363a = (sqv) ahgz.m55754a(context, sqv.class);
    }

    /* renamed from: a */
    public final void mo37298a(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        ahwv ahwv = (ahwv) get(valueOf);
        if (ahwv == null || ahwu.m56809a(i2, ahwv.f68259a) || mo37300a(ahwv)) {
            put(valueOf, new ahwv(i2, this.f68363a.mo20505a()));
        }
    }

    /* renamed from: b */
    public final void mo37301b(int i) {
        ahwv ahwv = (ahwv) remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final boolean mo37299a(int i) {
        int i2;
        ahwv ahwv = (ahwv) get(Integer.valueOf(i));
        return ahwv != null && !mo37300a(ahwv) && (!((i2 = ahwv.f68259a + -1) == 1 || i2 == 2) || this.f68363a.mo20505a() < ahwv.mo37245a().longValue() + cfog.m141279g());
    }

    /* renamed from: a */
    public final boolean mo37300a(ahwv ahwv) {
        int i = ahwv.f68259a - 1;
        return i != 1 ? i != 2 ? i == 4 && this.f68363a.mo20505a() > ahwv.mo37245a().longValue() + cfog.f184854a.mo6606a().mo82037o() : this.f68363a.mo20505a() > ahwv.mo37245a().longValue() + cfog.f184854a.mo6606a().mo82036n() : this.f68363a.mo20505a() > ahwv.mo37245a().longValue() + cfog.m141279g();
    }
}
