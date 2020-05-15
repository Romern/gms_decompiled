package p000;

import java.util.List;

/* renamed from: bxwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxwo extends bxwp {
    /* renamed from: c */
    static bxwc m124115c(Object obj, long j) {
        return (bxwc) bxyx.m124518f(obj, j);
    }

    /* renamed from: a */
    public final List mo74195a(Object obj, long j) {
        int i;
        bxwc c = m124115c(obj, j);
        if (c.mo73666a()) {
            return c;
        }
        int size = c.size();
        if (size != 0) {
            i = size + size;
        } else {
            i = 10;
        }
        bxwc c2 = c.mo73731c(i);
        bxyx.m124506a(obj, j, c2);
        return c2;
    }

    /* renamed from: b */
    public final void mo74197b(Object obj, long j) {
        m124115c(obj, j).mo73671b();
    }

    /* renamed from: a */
    public final void mo74196a(Object obj, Object obj2, long j) {
        bxwc c = m124115c(obj, j);
        bxwc c2 = m124115c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo73666a()) {
                c = c.mo73731c(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        bxyx.m124506a(obj, j, c2);
    }
}
