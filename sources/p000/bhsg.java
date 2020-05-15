package p000;

import java.util.Collections;

/* renamed from: bhsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhsg implements bhqx {

    /* renamed from: a */
    private bhqz f119438a;

    /* renamed from: b */
    private bhqz f119439b;

    /* renamed from: c */
    private long f119440c;

    /* renamed from: d */
    private final bhsf f119441d;

    /* renamed from: e */
    private final int f119442e;

    /* renamed from: f */
    private final double f119443f;

    public bhsg(bhsf bhsf, int i, double d) {
        this.f119441d = bhsf;
        this.f119442e = i;
        this.f119443f = d;
    }

    /* renamed from: a */
    private static final int m101444a(bhqz bhqz, bhqz bhqz2) {
        int i = 0;
        if (bhqz != null) {
            int i2 = bhqz2.f119359a;
            if (i2 == 1 && bhqz.f119359a == 2) {
                i = 9;
            }
            if (i2 == 2 && bhqz.f119359a == 1) {
                i = 6;
            }
            if (i2 == 1 && bhqz.f119359a == 1 && bhqz.f119360b != bhqz2.f119360b) {
                return i | 3;
            }
        } else {
            int i3 = bhqz2.f119359a;
            if (i3 == 1) {
                i = 1;
            }
            if (i3 == 2) {
                return i | 4;
            }
        }
        return i;
    }

    /* renamed from: a */
    private final void m101445a(int i, bhqz bhqz, bhqz bhqz2) {
        long j = bhqz2.f119360b;
        long j2 = this.f119440c;
        if (j2 > j) {
            j = j2;
        }
        if ((i & this.f119442e) != 0) {
            this.f119441d.mo64216a(bhqz, j2, bhqz2, j);
        }
        this.f119438a = bhqz2;
        this.f119439b = null;
        this.f119440c = j;
    }

    /* renamed from: a */
    public final void mo64174a(bhqz bhqz) {
        bhqz bhqz2 = bhqz;
        if (bhqz2.f119365g != 0) {
            return;
        }
        if (bhqz2.f119359a != 0) {
            bhqz bhqz3 = this.f119439b;
            if (!(bhqz3 == null || bhqz3.f119360b == bhqz2.f119360b)) {
                m101445a(m101444a(this.f119438a, bhqz3), this.f119438a, this.f119439b);
            }
            int a = m101444a(this.f119438a, bhqz2);
            if (a != 0) {
                if ((a & 1) != 0) {
                    double d = this.f119443f;
                    if (bhqz2.f119361c.f119318b.isEmpty() || ((double) ((bhqh) bhqz2.f119361c.f119318b.get(0)).f119312f) <= d) {
                        bhqi bhqi = bhqz2.f119361c;
                        this.f119439b = new bhqz(bhqz2.f119359a, bhqi.m101332a(Collections.emptyList(), bhqi.f119320d, bhqi.f119321e, bhqi.f119322f, bhqi.f119323g, bhqi.f119325i, bhqi.f119327k, bhqi.f119319c, bhqi.f119326j), bhqz2.f119362d, bhqz2.f119363e, bhqz2.f119360b, bhqz2.f119364f, bhqz2.f119365g, bhqz2.f119366h);
                        return;
                    }
                }
                m101445a(a, this.f119438a, bhqz2);
                return;
            }
            bhuj.m101555a();
            return;
        }
        bhuj.m101555a();
    }
}
